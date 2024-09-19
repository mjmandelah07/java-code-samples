import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class JavaArrayList {
    // The ArrayList class is a resizable array, which can be found in the java.util package.
    //
    //The difference between a built-in array and an ArrayList in Java,
    // is that the size of an array cannot be modified (if you want to add or remove elements to/from an array,
    // you have to create a new one).
    // While elements can be added and removed from an ArrayList whenever you want
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();

        // Add to arraylist
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        // You can also add an item at a specified position by referring to the index number:
        cars.add(0, "Mazda");
        System.out.println(cars);

        // Access an Item
        // To access an element in the ArrayList, use the get() method and refer to the index number:
        System.out.println(cars.get(0));

        // Change an Item
        // To modify an element, use the set() method and refer to the index number
        cars.set(0, "Opel");
        System.out.println(cars);

        // Remove an Item
        //To remove an element, use the remove() method and refer to the index number
        cars.remove(0);
        System.out.println(cars);

        // ArrayList Size
        // To find out how many elements an ArrayList have, use the size method
        System.out.println(cars.size());


        // Loop Through an ArrayList
        //Loop through the elements of an ArrayList with a for loop,
        // and use the size() method to specify how many times the loop should run

        for(int i = 0; i < cars.size(); i++){
            System.out.println(cars.get(i));
        }
        // Sort an ArrayList
        Collections.sort(cars);

        // You can also loop through an ArrayList with the for-each loop:
        for( String i:  cars){
            System.out.println(i);
        }

        // To remove all the elements in the ArrayList, use the clear() method
        cars.clear();
        System.out.println(cars);

        // Other Types
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);
        for (int i : myNumbers) {
            System.out.println(i);
        }
    }

}
