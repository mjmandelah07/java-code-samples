import java.util.Scanner;

public class MinutesToDays {
    // Write a Java program to convert minutes into days.

    public static void main(String[] args) {
        // Prompt the user to enter the number of minutes
        // Calculate how many minutes in a day using 24 hours multiply 60 minutes
        // Divide user input minutes by minutesInADay

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of minutes: ");
        long minutes = scanner.nextLong();

        // Conversion factors
        long minutesInADay = 24 * 60; // 24 hours * 60 minutes

        // Convert minutes to days
        long days = minutes / minutesInADay;  // no float
        // Get the remaining minutes left
        long remainingMinutes = minutes % minutesInADay;

        // Display the result
        System.out.println(minutes + " minutes is  " + days + " days and " + remainingMinutes + " minutes.");

        // Close the scanner
        scanner.close();
    }
}
