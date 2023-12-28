package Practice2;

import java.util.Scanner;

public class DayOfWeekConverter {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number between 1 and 7
        System.out.print("Enter a number between 1 and 7: ");

        // Read the user's input
        int dayNumber = scanner.nextInt();

        // Close the scanner to avoid resource leaks
        scanner.close();

        // Determine the day of the week based on the input
        String dayOfWeek = convertToDayOfWeek(dayNumber);

        // Print the result
        System.out.println("The corresponding day of the week is: " + dayOfWeek);
    }

    // Method to convert a number to the corresponding day of the week
    private static String convertToDayOfWeek(int dayNumber) {
        String dayOfWeek;

        switch (dayNumber) {
            case 1:
                dayOfWeek = "Sunday";
                break;
            case 2:
                dayOfWeek = "Monday";
                break;
            case 3:
                dayOfWeek = "Tuesday";
                break;
            case 4:
                dayOfWeek = "Wednesday";
                break;
            case 5:
                dayOfWeek = "Thursday";
                break;
            case 6:
                dayOfWeek = "Friday";
                break;
            case 7:
                dayOfWeek = "Saturday";
                break;
            default:
                dayOfWeek = "Invalid day number. Please enter a number between 1 and 7.";
        }

        return dayOfWeek;
    }
}
