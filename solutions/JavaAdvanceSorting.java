import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Define a Car class
class Car {
    public String brand;
    public String model;
    public int year;

    public Car(String b, String m, int y) {
        brand = b;
        model = m;
        year = y;
    }
}

// Create a comparator
class SortByYear implements Comparator {
    public int compare(Object obj1, Object obj2) {
        // Make sure that the objects are Car objects
        Car a = (Car) obj1;
        Car b = (Car) obj2;

        // Compare the year of both objects
        if (a.year < b.year) return -1; // The first car has a smaller year
        if (a.year > b.year) return 1;  // The first car has a larger year
        return 0; // Both cars have the same year
    }
}

// Special Sorting Rules
//Comparators can also be used to make special sorting rules for strings and numbers.
// we use a comparator to list all the even numbers before the odd ones
class SortEvenFirst implements Comparator {
    public int compare(Object obj1, Object obj2) {
        // Make sure the objects are integers
        Integer a = (Integer)obj1;
        Integer b = (Integer)obj2;

        // Check each number to see if it is even
        // A number is even if the remainder when dividing by 2 is 0
        boolean aIsEven = (a % 2) == 0;
        boolean bIsEven = (b % 2) == 0;

        if (aIsEven == bIsEven) {

            // If both numbers are even or both are odd then use normal sorting rules
            if (a < b) return -1;
            if (a > b) return 1;
            return 0;

        } else {

            // If a is even then it goes first, otherwise b goes first
            if (aIsEven) {
                return -1;
            } else {
                return 1;
            }
        }
    }
}

// Define a Car class which is comparable
class Car1 implements Comparable {
    public String brand;
    public String model;
    public int year;

    public Car1(String b, String m, int y) {
        brand = b;
        model = m;
        year = y;
    }

    // Decide how this object compares to other objects
    public int compareTo(Object obj) {
        Car1 other = (Car1)obj;
        if(year < other.year) return -1; // This object is smaller than the other one
        if(year > other.year) return 1;  // This object is larger than the other one
        return 0; // Both objects are the same
    }
}

public class JavaAdvanceSorting {
    // To sort objects you need to specify a rule that decides how objects should be sorted. For example,
    // if you have a list of cars you might want to sort them by year,
    // the rule could be that cars with an earlier year go first.
    //
    //The Comparator and Comparable interfaces allow you to specify what rule is used to sort objects

    // Comparators
    //An object that implements the Comparator interface is called a comparator.
    //
    //The Comparator interface allows you to create a class with a compare() method that compares two objects to decide which one should go first in a list.
    //
    //The compare() method should return a number which is:
    //
    //Negative if the first object should go first in a list.
    //Positive if the second object should go first in a list.
    //Zero if the order does not matter.


    // The Comparable Interface
    //The Comparable interface allows an object to specify its own sorting rule with a compareTo() method.
    //
    //The compareTo() method takes an object as an argument and compares the comparable with the argument to
    // decide which one should go first in a list.
    //
    //Like the comparator, the compareTo() method returns a number which is:
    //
    //Negative if the comparable should go first in a list.
    //Positive if the other object should go first in a list.
    //Zero if the order does not matter.

    public static void main(String[] args) {
        // Create a list of cars
        ArrayList<Car> myCars = new ArrayList<Car>();
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        // Create a list of cars for comparable
        ArrayList<Car1> myCars1 = new ArrayList<Car1>();

        myCars.add(new Car("BMW", "X5", 1999));
        myCars.add(new Car("Honda", "Accord", 2006));
        myCars.add(new Car("Ford", "Mustang", 1970));

        // for comparable
        myCars1.add(new Car1("BMW", "X5", 1999));
        myCars1.add(new Car1("Honda", "Accord", 2006));
        myCars1.add(new Car1("Ford", "Mustang", 1970));

        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);

        // Use a comparator to sort the cars
        Comparator mycomparator = new SortByYear();
        Collections.sort(myCars, mycomparator);

        // use comparable to sort
        Collections.sort(myCars1);

        // Use a comparator to sort the numbers
        Comparator myComparator = new SortEvenFirst();
        Collections.sort(myNumbers, myComparator);

        // Using a Lambda Expression
        //To make the code shorter, the comparator can be replaced with a lambda expression which has the same arguments
        // and return value as the compare() method:

        // Use a lambda expression to sort the cars
        Collections.sort(myCars, (obj1, obj2) -> {
            Car a = (Car) obj1;
            Car b = (Car) obj2;
            if (a.year < b.year) return -1;
            if (a.year > b.year) return 1;
            return 0;
        });


        // Display the cars
        for (Car c : myCars) {
            System.out.println(c.brand + " " + c.model + " " + c.year);
        }

        // Display the cars
        for (Car1 c : myCars1) {
            System.out.println(c.brand + " " + c.model + " " + c.year);
        }

        // display the numbers
        for (int i : myNumbers) {
            System.out.println(i);
        }
    }
}
