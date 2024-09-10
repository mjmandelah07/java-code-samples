public class JavaModifiers {
    // The public keyword is an access modifier, meaning that it is used to set the access level for classes,
    // attributes, methods and constructors.

    // We divide modifiers into two groups:
    //
    //Access Modifiers - controls the access level
    //Non-Access Modifiers - do not control access level, but provides other functionality

    //Access Modifiers
    //For classes, you can use either public or default:

    // public	The class is accessible by any other class
    // default	The class is only accessible by classes in the same package.

    // For attributes, methods and constructors, you can use the one of the following
    // public	The code is accessible for all classes
    // private	The code is only accessible within the declared class
    // default	The code is only accessible in the same package.
    // protected	The code is accessible in the same package and subclasses.

    // Non-Access Modifiers
    //For classes, you can use either final or abstract

    // final	The class cannot be inherited by other classes
    // abstract	The class cannot be used to create objects -
    // To access an abstract class, it must be inherited from another class.

    // For attributes and methods, you can use the one of the following:
    // final	Attributes and methods cannot be overridden/modified
    // static	Attributes and methods belongs to the class, rather than an object
    // abstract Can only be used in an abstract class, and can only be used on methods.
    // transient	Attributes and methods are skipped when serializing the object containing them
    // synchronized	Methods can only be accessed by one thread at a time
    // volatile	The value of an attribute is not cached thread-locally, and is always read from the "main memory"

    // Final
    //If you don't want the ability to override existing attribute values, declare attributes as final:
    final int x = 10;
    final double PI = 3.14;

    // Static
    //A static method means that it can be accessed without creating an object of the class, unlike public

    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    // Abstract
    //An abstract method belongs to an abstract class, and it does not have a body.
    // The body is provided by the subclass


    public static void main(String[] args) {
        JavaModifiers myObj = new JavaModifiers();
//        myObj.x = 50; // will generate an error: cannot assign a value to a final variable
//        myObj.PI = 25; // will generate an error: cannot assign a value to a final variable

        myStaticMethod(); // Call the static method
        // myPublicMethod(); This would output an error

        myObj.myPublicMethod(); // Call the public method
    }
}
