import java.util.Scanner;

public class MultiTable {
    public static void main(String[] args) {
        // Read input from users
        Scanner inputData = new Scanner(System.in);

        // Declare a variable for the input
        int num;

        // Prompt the user to enter a number
        System.out.println("Enter the number you want to see its multiplication table: ");
        num = inputData.nextInt();

        // Multiplication Table Generation
        for (int i = 1; i <= 12; i++) {
            int product = num * i;
            System.out.println(num + " x " + i + " = " + product);
        }
        inputData.close();
    }
}