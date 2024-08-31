import java.util.Scanner;

// Write a Java program to replace a specified character with another character.
public class ReplaceCharacter {
    public static void main(String[] args) {
        // Create a scanner object
        Scanner scanner = new Scanner(System.in);

        // Ask user for the original string
        System.out.println("Enter the original string: ");
        String originalString = scanner.nextLine();

        // Ask the user to enter the character to replace
        System.out.println("Enter the character to replace: ");
        char oldChar = scanner.next().charAt(0);

        // Ask the user to enter the replacement character
        System.out.println("Enter the replacement character: ");
        char newChar = scanner.next().charAt(0);


        // Replace the specified character with the new character
        String newString = originalString.replace(oldChar, newChar);

        // Display the results
        System.out.println("Original string: " + originalString);
        System.out.println("New String: " + newString);
    }
}
