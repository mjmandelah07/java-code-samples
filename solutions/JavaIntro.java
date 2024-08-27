public class JavaIntro {
    // What is java
    //  is a popular programming language, created in 1995.
    // It is used for:
    //
    // Mobile applications (specially Android apps)
    // Desktop applications
    // Web
    //  servers and application servers
    // Games
    // Database connection
    // And much, much more!

    // Why Use Java?
    // Java works on different platforms (Windows, Mac, Linux, Raspberry Pi, etc.)
    // It is one of the most popular programming languages in the world
    // It has a large demand in the current job market
    // It is easy to learn and simple to use
    // It is open-source and free
    // It is secure, fast and powerful
    // It has huge community support (tens of millions of developers)
    // Java is an object-oriented language which gives a clear structure to programs
    // and allows code to be reused, lowering development costs

    // Java Syntax
    // Every line of code that runs in Java must be inside a class.
    // A class should always start with an uppercase first letter.
    // The name of the java file must match the class name.
    /* public class Main {
      public static void main(String[] args) {
        System.out.println("Hello World");
     }
     }
     */

    // The main Method
    // The main() method is required, and you will see it in every Java program
    // Any code inside the main() method will be executed.
    public static void main(String[] args) {
        // System.out.println()
        // Inside the main() method, we can use the println() method to print a line of text to the screen
        System.out.println("Hello World");

        // Print Text
        // You can add as many println() methods as you want.
        // ALso insert a new line at the end of the output
        System.out.println("Hello World!");
        System.out.println("I am learning Java.");
        System.out.println("It is awesome!");

        // Double Quotes
        // When working with text, it must be wrapped inside double quotations marks "".
        System.out.println("This sentence will work!");

        // The Print() Method
        // There is also a print() method, which is similar to println();
        //The only difference is that it does not insert a new line at the end of the output
        System.out.print("Hello World! ");
        System.out.print("I will print on the same line.");

        // Print Numbers
        // println() method can be used to print numbers.
        // Unlike text, we don't put numbers inside double quotes
        System.out.println(3);
        System.out.println(358);
        System.out.println(50000);

        // Can also perform mathematical calculations inside the println() method
        System.out.println(3 + 3);

        // Java Comments
        //  can be used to explain Java code, and to make it more readable.
        // It can also be used to prevent execution when testing alternative code.

        // Single-line Comments
        // Single-line comments start with two forward slashes (//).
        // This is a comment
        System.out.println("Hello World");

        // Java Multi-line Comments
        // Multi-line comments start with /* and ends with */.
        /* The code below will print the words Hello World
to the screen, and it is amazing */
        System.out.println("Hello World");
    }


}

