import java.util.ArrayList;
import java.util.Iterator;

public class JavaIterator {
    // An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet.
    // It is called an "iterator" because "iterating" is the technical term for looping

    public static void main(String[] args) {
        // Getting an Iterator
        //The iterator() method can be used to get an Iterator for any collection

        // Make a collection
        ArrayList<String> cars = new ArrayList<String>();
        ArrayList<Integer> numbers = new ArrayList<Integer>();


        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Get the iterator
        Iterator<String> it = cars.iterator();

        System.out.println(it.next());

        // Looping Through a Collection
        //To loop through a collection, use the hasNext() and next() methods of the Iterator:
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        // Removing Items from a Collection
        //Iterators are designed to easily change the collections that they loop through.
        // The remove() method can remove items from a collection while looping.

        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);

        Iterator<Integer> num = numbers.iterator();
        while (num.hasNext()){
            Integer i = num.next();
            if (i < 10){
                it.remove();
            }
        }
    }
}
