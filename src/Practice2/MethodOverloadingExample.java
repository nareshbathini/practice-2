package Practice2;

public class MethodOverloadingExample {

    // Method with two integer parameters
    public static int add(int a, int b) {
        return a + b;
    }

    // Method with three integer parameters
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with two double parameters
    public static double add(double a, double b) {
        return a + b;
    }

    // Method with a string parameter
    public static String concatenate(String str1, String str2) {
        return str1 + str2;
    }

    public static void main(String[] args) {
        // Using the overloaded methods in the main method
        int sum1 = add(5, 10);
        int sum2 = add(2, 4, 6);
        double sum3 = add(3.5, 2.5);

        String result = concatenate("Hello, ", "world!");

        // Displaying the results
        System.out.println("Sum 1: " + sum1);
        System.out.println("Sum 2: " + sum2);
        System.out.println("Sum 3: " + sum3);
        System.out.println("Concatenated String: " + result);

    }
}
