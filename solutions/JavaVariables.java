public class JavaVariables {
    // Variables are containers for storing data values.
    //
    // There are different types of variables,
    //
    // String - stores text, such as "Hello". String values are surrounded by double quotes
    // int - stores integers (whole numbers), without decimals, such as 123 or -123
    // float - stores floating point numbers, with decimals, such as 19.99 or -19.99
    // char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
    // boolean - stores values with two states: true or false

    public static void main(String[] args) {
        // Declaring (Creating) Variables
        // To create a variable, you must specify the type and assign it a value

        // type variableName = value;
        String names = "John";
        System.out.println(names);

        // Variable that store number
        int myNum = 15;
        System.out.println(myNum);

        // Declaring variable and assigning later
        int myNum1;
        myNum1 = 15;
        System.out.println(myNum1);

        // Note that if you assign a new value to an existing variable, it will overwrite the previous value:
        // Change the value of myNum1 from 15 to 20:
        myNum1 = 20;  // myNum is now 20
        System.out.println(myNum1);

        // Final Variables
        // use the final keyword to avoid overwriting existing values
       // final int myNum1 = 15;
        //myNum1 = 20;

        // Other Types
        int myNum2 = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";

        // Java Print Variables
        // The println() method is often used to display variables.
        // To combine both text and a variable, use the + character:
        String name = "John";
        System.out.println("Hello " + name);

        // The + character can be used to add a variable to another variable
        String firstName = "John ";
        String lastName = "Doe";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        // For numeric values, the + character works as a mathematical operator
        int x = 5;
        int y = 6;
        System.out.println(x + y); // Print the value of 5 + 6 = 11

        // Java Declare Multiple Variables
        // Comma-separated list can be used to declare more than one variable of the same type
        int xx = 5, yy = 6, zz = 50;
        System.out.println(xx + yy + zz);

        // One Value to Multiple Variables
        int xxx, yyy, zzz;
        xxx = yyy = zzz = 50;
        System.out.println(xxx + yyy + zzz);

        // Java Identifiers
        // All Java variables must be identified with unique names.
        // These unique names are called identifiers.
        // Identifiers can be short names (like x and y) or more descriptive names (age, sum, totalVolume).

        // Good
        int minutesPerHour = 60;

        // OK, but not so easy to understand what m actually is
        int m = 60;
    }
}
