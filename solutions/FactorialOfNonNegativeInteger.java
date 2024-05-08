import java.util.Scanner;

public class FactorialOfNonNegativeInteger {

    public static void main(String[] args) {
        // Read input from users
        Scanner inputData = new Scanner(System.in);



        // Prompt the user to enter a non-integer N
        System.out.println("Enter a non-integer N: ");

        int N = inputData.nextInt();

        // Validate input: Ensure N is non-negative
        if (N < 0) {
            System.out.println("Error: Please enter a non-negative integer.");
            return;
        }

        // Calculate the factorial of N
        int factorial = 1;

        for (int i = 1; i <= N; i++){
            factorial *= i;
        }

        // Display the factorial to the user
        System.out.println("The factorial of " + N + " is: " + factorial);

        // Close the scanner to release resources
        inputData.close();
    }
}
