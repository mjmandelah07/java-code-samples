import java.util.Scanner;

// Write a Java program to concatenate a given string to the end of another string.
public class StringConcatenation {
    public static void main(String[] args) {
        // create a scanner object
        Scanner myobj = new Scanner(System.in);

        // Ask user for the first string
        System.out.println("Enter the first string: ");
        String firstString = myobj.nextLine();

        // Ask user for the second string
        System.out.println("Enter the second string: ");
        String secondString = myobj.nextLine();

        // Concatenate the second string to the first string
        String result = firstString + " " + secondString;

        // Display result
        System.out.println("String 1: " + firstString);
        System.out.println("String 2: " + secondString);
        System.out.println("Result: " + result);
    }
}
