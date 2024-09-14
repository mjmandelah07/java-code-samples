// Interface
interface AnimalOne {
    public void animalSound(); // interface method (does not have a body)
    public void sleep(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class PigOne implements AnimalOne {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }
}

// Java does not support "multiple inheritance" (a class can only inherit from one superclass).
// However, it can be achieved with interfaces, because the class can implement multiple interfaces. Note:
// To implement multiple interfaces, separate them with a comma
interface FirstInterface {
    public void myMethod(); // interface method
}

interface SecondInterface {
    public void myOtherMethod(); // interface method
}

class DemoClass implements FirstInterface, SecondInterface {
    public void myMethod() {
        System.out.println("Some text..");
    }
    public void myOtherMethod() {
        System.out.println("Some other text...");
    }
}

public class JavaInterface {
    // An interface is a completely "abstract class" that is used to group related methods with empty bodies:

    // To access the interface methods, the interface must be "implemented"
    // (kinda like inherited) by another class with the implements keyword (instead of extends).
    // The body of the interface method is provided by the "implement" class:



    public static void main(String[] args) {
        PigOne myPig = new PigOne();
        myPig.animalSound();
        myPig.sleep();

        DemoClass myObj = new DemoClass();
        myObj.myMethod();
        myObj.myOtherMethod();
    }
}
