public class JavaClassesObjects {
    int x = 5;
    public static void main(String[] args) {
        // Java Classes/Objects

        // Create a Class
        //To create a class, use the keyword class

        // Create a class named "JavaClassesObjects" with a variable x:
        // public class JavaClassesObjects {
        //  int x = 5;
        //}

        // Create an Object
        //   is created from a class.
        //  We have already created the class named JavaClassesObjects,
        //  so now we can use this to create objects
        JavaClassesObjects myObj = new JavaClassesObjects();
        System.out.println(myObj.x);


        // Multiple Objects
        JavaClassesObjects myObj1 = new JavaClassesObjects();
        JavaClassesObjects myObj2 = new JavaClassesObjects();

        System.out.println(myObj1.x);
        System.out.println(myObj2.x);

        // Using Multiple Classes
        // You can also create an object of a class and access it in another class
        // This is often used for better organization of classes (one class has all the attributes and methods
        // while the other class holds the main() method (code to be executed)).
    }
}
