public class JavaConstructors {
    // A constructor in Java is a special method that is used to initialize objects.
    // The constructor is called when an object of a class is created.
    // It can be used to set initial values for object attributes
    int x;  // Create a class attribute

    // Create a class constructor for the Main class
    // Constructors can also take parameters, which is used to initialize attributes.

    public JavaConstructors(int y) {
        x = y;  // Set the initial value for the class attribute x
    }

    public static void main(String[] args) {
        JavaConstructors myObj = new JavaConstructors(5); // Create an object of class JavaConstructors (This will call the constructor)
        System.out.println(myObj.x); // Print the value of x // Outputs 5
    }
}
