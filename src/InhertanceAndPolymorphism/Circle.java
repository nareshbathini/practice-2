package InhertanceAndPolymorphism;

class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override calculateArea() method for circles
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
