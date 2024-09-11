public class JavaEncapsulation {
    // The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users.
    // To achieve this, you must:
    //
    //declare class variables/attributes as private
    //provide public get and set methods to access and update the value of a private variable

    // Get and Set
    // Private variables can only be accessed within the same class (an outside class has no access to it).
    // However, it is possible to access them if we provide public get and set methods.
    // The get method returns the variable value, and the set method sets the value.

    private String name; // private = restricted access

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }

    // The get method returns the value of the variable name.
    //
    //The set method takes a parameter (newName) and assigns it to the name variable.
    // The keyword is used to refer to the current object.
    //
    //However, as the name variable is declared as private, we cannot access it from outside this class

    public static void main(String[] args) {
        // we use the getName() and setName() methods to access and update the variable
        JavaEncapsulation myObj = new JavaEncapsulation();
        myObj.setName("John"); // Set the value of the name variable to "John"
        System.out.println(myObj.getName()); // Outputs "John"
    }
}
