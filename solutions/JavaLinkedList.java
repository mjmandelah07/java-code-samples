import java.util.LinkedList;

public class JavaLinkedList {
    // The LinkedList class is almost identical to the ArrayList

    // ArrayList vs. LinkedList

    // The LinkedList class has all the same methods as the ArrayList class because they both implement the List interface.
    // This means that you can add items, change items, remove items and clear the list in the same way.
    //
    //However, while the ArrayList class and the LinkedList class can be used in the same way, they are built very differently

    //When To Use
    // an ArrayList for storing and accessing data, and LinkedList to manipulate data.

    // LinkedList Methods

    // Method	    Description
    //addFirst()	Adds an item to the beginning of the list
    //addLast()	    Add an item to the end of the list
    //removeFirst()	Remove an item from the beginning of the list
    //removeLast()	Remove an item from the end of the list
    //getFirst()	Get the item at the beginning of the list
    //getLast() 	Get the item at the end of the list

    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
    }
}
