import java.util.Scanner;

public class JavaUserInput {
    // The Scanner class is used to get user input, and it is found in the java.util package.
    // To use the Scanner class, create an object of the class and use any of the available methods found in the Scanner
    // class documentation

    // Input Types
    // Method	    Description
    //nextBoolean()	Reads a boolean value from the user
    //nextByte()	Reads a byte value from the user
    //nextDouble()	Reads a double value from the user
    //nextFloat()	Reads a float value from the user
    //nextInt()	    Reads a int value from the user
    //nextLine()	Reads a String value from the user
    //nextLong()	Reads a long value from the user
    //nextShort()	Reads a short value from the use

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        // String input
        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input

        // Numerical input
        int age = myObj.nextInt();
        double salary = myObj.nextDouble();

        // Output input to user
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}
