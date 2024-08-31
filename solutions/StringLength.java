import java.util.Scanner;

// Write a Java program to get the length of a given string.
public class StringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for the string
        System.out.println("Enter the string to get it's length: ");
        String userInput = scanner.nextLine();

        // Get the string length
        int result =  userInput.length();

        // Display result
        System.out.println("The string length of " + "'" +userInput + "'" + " is: " + result);
    }
}
