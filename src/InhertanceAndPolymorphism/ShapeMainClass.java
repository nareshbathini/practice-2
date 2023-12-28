package InhertanceAndPolymorphism;

public class ShapeMainClass {
    public static void main(String[] args) {
        // Creating objects of Circle and Rectangle
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        // Calling calculateArea() for each object
        double circleArea = circle.calculateArea();
        double rectangleArea = rectangle.calculateArea();

        // Displaying the results
        System.out.println("Area of the Circle: " + circleArea);
        System.out.println("Area of the Rectangle: " + rectangleArea);
    }
}
