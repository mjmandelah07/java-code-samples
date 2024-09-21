import java.util.HashSet;

public class JavaHashSet {
    // A HashSet is a collection of items where every item is unique, and it is found in the java.util package
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);
        // Note: In the example above,
        // even though BMW is added twice it only appears once in the set because every item in a set has to be unique.


        //  Check If an Item Exists
        // To check whether an item exists in a HashSet, use the contains() method:
        System.out.println(cars.contains("Mazda"));

        // Remove an Item
        //To remove an item, use the remove() method:
        cars.remove("Volvo");

        // HashSet Size
        //To find out how many items there are, use the size method
        System.out.println(cars.size());

        // Loop Through a HashSet
        //Loop through the items of an HashSet with a for-each loop
        for (String i : cars) {
            System.out.println(i);
        }

        // To remove all items, use the clear() method:
        cars.clear();
    }
}
