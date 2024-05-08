import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a positive integer N
        System.out.println("Enter a positive number N: ");
        int N = input.nextInt();

        // Calculate the sum of integers from 1 to N
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }

        // Display the sum to user
        System.out.println("The sum of integers from 1 to " + N + " is: " + sum);

        input.close();
    }

}
