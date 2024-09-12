import java.util.Scanner;

public class JavaPackagesAndApi {
    // A package in Java is used to group related classes. Think of it as a folder in a file directory.
    // Packages are used to avoid name conflicts, and to write a better maintainable code.
    // Packages are divided into two categories:
    //
    //Built-in Packages (packages from the Java API)
    //User-defined Packages (create your own packages)

    // Built-in Packages
    // The Java API is a library of prewritten classes,
    // that are free to use, included in the Java Development Environment.

    // The library contains components for managing input, database programming, and much, much more.
    // The library is divided into packages and classes.
    // Meaning you can either import a single class (along with its methods and attributes),
    // or a whole package that contain all the classes that belong to the specified package.

    // import package.name.Class;   // Import a single class
    //import package.name.*;   // Import the whole package

    // Import a Class
    //   import java.util.Scanner;
    // java.util is a package, while Scanner is a class of the java.util package

    // To use the Scanner class, create an object of the class and
    // use any of the available methods found in the Scanner class documentation.


    // Import a Package
    // To import a whole package, end the sentence with an asterisk sign (*).
    // import java.util.*;

    // User-defined Packages
    // To create your own package, you need to understand that Java uses a file system directory to store them

    // └── root
    //  └── mypack
    //    └── MyPackageClass.java

    // To create a package, use the package keyword

    // inside  MyPackageClass.java
    // package mypack;
    //class MyPackageClass {
    //  public static void main(String[] args) {
    //    System.out.println("This is my package!");
    //  }
    //}

    // When we compiled the package in the example above, a new folder was created, called "mypack"

    public static void main(String[] args) {
        // Using the Scanner class to get user input
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");

        String userName = myObj.nextLine();
        System.out.println("Username is: " + userName);
    }
}
