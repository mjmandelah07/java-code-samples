public class JavaClassAtributes {
    // class attributes are variables within a class
    int x = 5;
    int y = 3;

    // Multiple Attributes
    // You can specify as many attributes as you want
    String fname = "John";
    String lname = "Doe";
    int age = 24;

    public static void main(String[] args) {
    // Accessing Attributes
        // Create an object called "myObj" and print the value of x:
        JavaClassAtributes myObj = new JavaClassAtributes();
        System.out.println(myObj.x);

        // Modify Attributes

        // Set the value of x to 40
        myObj.x = 40;
        System.out.println(myObj.x);

        // If you don't want the ability to override existing values, declare the attribute as final

        // Multiple Objects
        // If you create multiple objects of one class, you can change the attribute values in one object,
        // without affecting the attribute values in the other

        // Change the value of x to 25 in myObj2, and leave x in myObj1 unchanged
        JavaClassAtributes myObj1 = new JavaClassAtributes();  // Object 1
        JavaClassAtributes myObj2 = new JavaClassAtributes(); // Object 2

        myObj2.x = 25;
        System.out.println(myObj1.x);  // Outputs 5
        System.out.println(myObj2.x);  // Outputs 25

        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Age: " + myObj.age);
    }
}
