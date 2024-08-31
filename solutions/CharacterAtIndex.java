// Write a Java program to get the character at the given index within the string

import java.util.Scanner;

public class CharacterAtIndex {
    public static void main(String[] args) {
        // Create a scanner object
        Scanner scanner = new Scanner(System.in);

        // Introduce the program
        System.out.println("Welcome to get the character of string at given index!");

        // Ask user to enter the string
        System.out.println("Enter a string: ");
        String userString = scanner.nextLine();

        // Ask user to enter the index
        System.out.println("Enter the index: ");
        int index = scanner.nextInt();

        // Check if the index in within the string valid length
        if (index >= 0 && index < userString.length()) {
            // Get the character at the specified index
            char charAtIndex = userString.charAt(index);

            // Print the result
            System.out.println("The character at position " + index + " is " + charAtIndex);
        } else {
            // If index is not within the given string range, inform user
            System.out.println("Index is out of range. Please enter a valid index.");
        }


    }
}
