public class JavaInheritance {

    // it is possible to inherit attributes and methods from one class to another.
    // We group the "inheritance concept" into two categories:
    //
    //subclass (child) - the class that inherits from another class
    //superclass (parent) - the class being inherited from

    //To inherit from a class, use the extends keyword.

    // In the example below, the Car class (subclass) inherits the attributes
    // and methods from the Vehicle class (superclass):

    // class Vehicle {
    //  protected String brand = "Ford";
    //  public void honk() {
    //    System.out.println("Tuut, tuut!");
    //  }
    //}
    //
    //class Car extends Vehicle {
    //  private String modelName = "Mustang";
    //  public static void main(String[] args) {
    //    Car myFastCar = new Car();
    //    myFastCar.honk();
    //    System.out.println(myFastCar.brand + " " + myFastCar.modelName);
    //  }
    //}

    // We set the brand attribute in Vehicle to a protected access modifier.
    // If it was set to private, the Car class would not be able to access it.

    // The final Keyword
    //If you don't want other classes to inherit from a class, use the final keyword

    // final class Vehicle {
    //  ...
    //}
}
