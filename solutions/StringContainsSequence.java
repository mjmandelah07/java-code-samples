import java.util.Scanner;

// Write a Java program to test if a given string contains the specified sequence of char values.
public class StringContainsSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the original string
        System.out.print("Enter the original string: ");
        String originalString = scanner.nextLine();

        // Ask the user to enter the sequence of characters
        System.out.print("Enter the sequence of characters to search for: ");
        String sequence = scanner.nextLine();

        // Check if the original contains the specified sequence
        boolean result = originalString.contains(sequence);

        // Display result to user
        System.out.println("Original String: " + originalString);
        System.out.println("Specified sequence of char values: " + sequence);
        if (result){
            System.out.println("Original string contains the given sequence of char values!");
        } else {
            System.out.println("Sorry, the original string does not contain the given sequence of char values!");
        }

    }
}
