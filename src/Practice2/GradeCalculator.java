package Practice2;

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the student's score
        System.out.print("Enter the student's score: ");

        // Read the user's input
        int score = scanner.nextInt();

        // Close the scanner to avoid resource leaks
        scanner.close();

        // Determine the grade based on the specified grading scale
        char grade = calculateGrade(score);

        // Print the result
        System.out.println("The student's grade is: " + grade);
    }

    // Method to calculate the grade based on the grading scale
    private static char calculateGrade(int score) {
        char grade;

        if (score >= 90 && score <= 100) {
            grade = 'A';
        } else if (score >= 80 && score <= 89) {
            grade = 'B';
        } else if (score >= 70 && score <= 79) {
            grade = 'C';
        } else if (score >= 60 && score <= 69) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        return grade;
    }
}
