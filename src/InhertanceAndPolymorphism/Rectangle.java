package InhertanceAndPolymorphism;

class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override calculateArea() method for rectangles
    @Override
    public double calculateArea() {
        return length * width;
    }
}
