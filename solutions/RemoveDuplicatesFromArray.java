import java.util.LinkedHashSet;

public class RemoveDuplicatesFromArray {

    // Method to remove duplicates from an array
    public LinkedHashSet<Integer> removeDuplicates(int[] myArray) {

        LinkedHashSet<Integer> hs = new LinkedHashSet<>();

        // Iterate through the array and add each element to the LinkedHashSet
        for (int i: myArray){
            hs.add(i);
        }

        return hs;
    }

    // Main method to execute the program
    public static void main(String[] args) {
        // An instance of RemoveDuplicatesFromArray
        RemoveDuplicatesFromArray myRemoveDuplicates = new RemoveDuplicatesFromArray();

        // Define the array with duplicate elements
        int[] numbers = {3, 5, 7, 3, 8, 9, 1, 8, 5, 10, 6, 9, 7, 7};

        // Call the method to remove duplicates and store the result
        LinkedHashSet<Integer> uniqueNumbers = myRemoveDuplicates.removeDuplicates(numbers);

        // Print the array with duplicates removed
        System.out.println("Array with duplicates removed: " + uniqueNumbers);
    }
}
