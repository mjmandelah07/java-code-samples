import java.util.HashMap;

public class JavaHashMap {
    // A HashMap however, store items in "key/value" pairs, and you can access them by an index of another type (e.g. a String).
    //
    //One object is used as a key (index) to another object (value). It can store different types:
    // String keys and Integer values, or the same type, like: String keys and String values
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        // Create a HashMap object called people
        HashMap<String, Integer> people = new HashMap<String, Integer>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);

        // Access an Item
        //To access a value in the HashMap, use the get() method and refer to its key:
        System.out.println(capitalCities.get("England"));

        // Remove an Item
        //To remove an item, use the remove() method and refer to the key
        capitalCities.remove("England");

        // Loop Through a HashMap
        //Loop through the items of a HashMap with a for-each loop.
        //
        //Note: Use the keySet() method if you only want the keys,
        // and use the values() method if you only want the values
        // Print keys
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }

        // Print values
        for (String i : capitalCities.values()) {
            System.out.println(i);
        }

        // Other types
        // Add keys and values (Name, Age)
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);

        for (String i : people.keySet()) {
            System.out.println("key: " + i + " value: " + people.get(i));
        }


        // To remove all items, use the clear() method:
        capitalCities.clear();
    }
}
