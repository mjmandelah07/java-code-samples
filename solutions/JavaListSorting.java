import java.util.ArrayList;
import java.util.Collections;

public class JavaListSorting {
    // Another useful class in the java.util package is the Collections class,
    // which include the sort() method for sorting lists alphabetically or numerically

    // Sort an ArrayList
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        Collections.sort(cars);  // Sort cars

        for (String i : cars) {
            System.out.println(i);
        }

        // Sort an ArrayList of Integers numerically in ascending order:
        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);

        Collections.sort(myNumbers);  // Sort myNumbers

        for (int i : myNumbers) {
            System.out.println(i);
        }

        // Reverse the Order
        // You can also sort a list in reverse order, by using the reverseOrder() method
        Collections.sort(cars, Collections.reverseOrder()); // Sort myNumbers

        for (String i : cars) {
            System.out.println(i);
        }

        // Sort an ArrayList of Integers numerically in reverse/descending order
        Collections.sort(myNumbers, Collections.reverseOrder()); // Sort myNumbers

        for (int i : myNumbers) {
            System.out.println(i);
        }

    }
}
