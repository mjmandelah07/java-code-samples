import java.util.Scanner;

public class OnlineBankingApp {
    // Initiate balance to 0.0
    private static double balance = 0.0;

    // while exit is not true, display actions to user to select between - withdraw, deposit, view balance or exit
    // Set exit flag to false
    // Prompt user to select their choice and read it
    // if choice is 1, call viewBalance function
    // else if choice is 2, call deposit function
    // else if choice is 3, call withdraw function
    // else if choice is 4, set exit flag to true and display message
    // else display invalid option message
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- Welcome to the Online Banking App ---");
            System.out.println("Select an option:");
            System.out.println("1: View Balance");
            System.out.println("2: Deposit");
            System.out.println("3: Withdraw");
            System.out.println("4: Exit");

            System.out.print("Enter your choice: ");
            int choice = myScanner.nextInt();

            switch (choice) {
                case 1:
                    viewBalance();
                    break;
                case 2:
                    deposit(myScanner);
                    break;
                case 3:
                    withdraw(myScanner);
                    break;
                case 4:
                    exit = true;
                    System.out.println("Bye Bye!");
                    break;
                default:
                    System.out.println("Please select a valid option.");
            }
        }
        myScanner.close();
    }


    // view balance method
    // display the balance
    private static void viewBalance() {
        System.out.println("Your current balance is: #" + balance);
    }

    // deposit function
    // Prompt user to enter the amount to deposit
    // Add deposit amount to balance if it is greater than 0 and success message
    // else display error message
    private static void deposit(Scanner myScanner) {
        System.out.print("Enter amount to deposit: #");
        double amount = myScanner.nextDouble();

        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited #" + amount + ". Your new balance is: #" + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // withdraw function
    //Prompt user to enter amount to withdraw
    // if amount is greater than 0 and less than the balance, subtract the withdrawAmount from the balance
    // display success
    // else if withdraw amount is greater than balance, display insufficient fund
    // else display error message
    private static void withdraw(Scanner myScanner) {
        System.out.print("Enter amount to withdraw: #");
        double amount = myScanner.nextDouble();

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew #" + amount + ". Your remaining balance is: #" + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Your current balance is: #" + balance);
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }

    }


}
