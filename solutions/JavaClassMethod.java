public class JavaClassMethod {
    // methods are declared within a class, and they are used to perform certain actions
    // Create a method named myMethod()

    // Static vs. Public
    // we created a static method, which means that it can be accessed without creating an object of the class,
    // unlike public, which can only be accessed by objects
    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    // Create a fullThrottle() method
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    // Create a speed() method and add a parameter
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }

    public static void main(String[] args) {
        myStaticMethod(); // Call the static method
        // myPublicMethod(); This would compile an error

        JavaClassMethod myObj = new JavaClassMethod(); // Create an object of JavaClassMethod
        myObj.myPublicMethod(); // Call the public method on the object

        // Access Methods With an Object
        JavaClassMethod myCar = new JavaClassMethod();   // Create a myCar object
        myCar.fullThrottle();      // Call the fullThrottle() method
        myCar.speed(200);          // Call the speed() method
    }


}
