public class JavaMethods {

    // A method is a block of code which only runs when it is called.
    //You can pass data, known as parameters, into a method.
    //Methods are used to perform certain actions, and they are also known as functions


    // Create a Method
    //  must be declared within a class
    static void myMethod() {
        // code to be executed
        System.out.println("I just got executed!");
    }

    // Parameters and Arguments
    // Information can be passed to methods as a parameter.
    // Parameters act as variables inside the method
    static void mySecondMethod(String fname) {
        System.out.println(fname + " Refsnes");
    }

    // Multiple Parameters
    static void myThirdMethod(String fname, int age) {
        System.out.println(fname + " is " + age);
    }

    // A Method with If...Else
    // Create a checkAge() method with an integer variable called age
    static void checkAge(int age) {

        // If age is less than 18, print "access denied"
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");

            // If age is greater than, or equal to, 18, print "access granted"
        } else {
            System.out.println("Access granted - You are old enough!");
        }

    }

    // Return Values
    // If you want the method to return a value, you can use a primitive data type (such as int, char, etc.)
    // instead of void, and use the return keyword inside the method
    static int myFourthMethod(int x) {
        return 5 + x;
    }

    // Method Overloading
    // With method overloading, multiple methods can have the same name with different parameters
    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        // Call a Method
        myMethod();   // Outputs "I just got executed!"

        // A method can also be called multiple times:
        myMethod();  // I just got executed!
        myMethod();  // I just got executed!
        myMethod();  // I just got executed!

        // Call mySecondMethod
        mySecondMethod("Liam");  // // Liam Refsnes

        // Call myThirdMethod
        myThirdMethod("Liam", 5);  // Liam is 5

        // Call the checkAge method and pass along an age of 20
        checkAge(20); // Outputs "Access granted - You are old enough!"

        // Print out the myFourthMethod
        System.out.println(myFourthMethod(3)); // Outputs 8 (5 + 3)

        //  You can also store the result in a variable
        int z = myFourthMethod(3);
        System.out.println(z); // Outputs 8 (5 + 3)

        //
        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);

        // Java Scope
        //In Java, variables are only accessible inside the region they are created.
        // This is called scope.

        // Code here CANNOT use x

        int x = 100;

        // Code here can use x
        System.out.println(x);

        // Block Scope
        // A block of code refers to all the code between curly braces {}
        // Variables declared inside blocks of code are only accessible by the code between the curly braces,

        // Code here CANNOT use xx

        { // This is a block

            // Code here CANNOT use xx

            int xx = 100;

            // Code here CAN use xx
            System.out.println(xx);

        } // The block ends here

        // Code here CANNOT use xx

    }
}
