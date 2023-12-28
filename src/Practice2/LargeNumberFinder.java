package Practice2;

import java.util.Scanner;

public class LargeNumberFinder {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");

        // Read the user's input for the first number
        int number1 = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");

        // Read the user's input for the second number
        int number2 = scanner.nextInt();

        // Close the scanner to avoid resource leaks
        scanner.close();

        // Use the ternary operator to find and print the larger number
        int largerNumber = (number1 > number2) ? number1 : number2;
        System.out.println("The larger number is: " + largerNumber);
    }
}
