import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Removing spaces and punctuation, and converting to lowercase
        String cleanedInput = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Checking if the cleaned string is a palindrome
        boolean isPalindrome = checkPalindrome(cleanedInput);

        // Displaying the result to the user
        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }

        scanner.close();
    }

    // Function to check if a string is a palindrome
    public static boolean checkPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
