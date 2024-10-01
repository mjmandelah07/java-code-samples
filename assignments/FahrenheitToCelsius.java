import java.util.Scanner;

public class FahrenheitToCelsius {
    // Write a Java program to convert temperature from Fahrenheit to Celsius degrees.
    public static void main(String[] args) {

        // Prompt the user to enter the temperature in Fahrenheit.
        // Store the input in a variable called Fahrenheit
        // Use the formula Celsius = (Fahrenheit - 32) * 5/9 to convert  to Celsius
        // Display the result to user

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the temperature in Fahrenheit to convert to Celsius: ");
        double fahrenheit = myScanner.nextDouble();

        // convert fahrenheit to celsius
        double celsius = (fahrenheit - 32) * 5/9;


        // Display the result
        System.out.println("Temperature in Celsius: " + celsius);

        // Close the scanner
        myScanner.close();
    }
}
