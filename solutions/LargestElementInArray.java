public class LargestElementInArray {

    // Method to find the largest element in the array
    public int findLargestElement(int[] myArray) {
        int max = myArray[0]; // Assuming the first element is the largest

        // Iterating through the array to find the largest element
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }

        return max;
    }

    // Main method to execute the program
    public static void main(String[] args) {
        // Create an instance of LargestElementInArray
        LargestElementInArray myLargestElement = new LargestElementInArray();

        // Define the array
        int[] numbers = {3, 5, 7, 2, 8, 10, 6, 9};

        // Call the method and print the largest
        int largest = myLargestElement.findLargestElement(numbers);

        System.out.println(largest);

    }
}
