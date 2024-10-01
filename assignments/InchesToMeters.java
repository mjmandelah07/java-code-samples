import java.util.Scanner;

public class InchesToMeters {
    // Write a Java program that reads a number in inches and converts it to meters.
    public static void main(String[] args) {
        // Prompt User to enter the number in inches to convert to meter
        // Store the input in a variable called inches
        // Convert the input to meter using the conversion factor:  1 inch = 0.0254 meters
        // display result to user

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter a number in inches: ");
        double inches = myScanner.nextDouble();

        double meters = inches * 0.0254;

        // Display the result in meters
        System.out.println(inches + " inches is equal to " + meters + " meters.");

        // close the scanner
        myScanner.close();
    }
}
