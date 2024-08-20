// Write a Java Program to Compute the Sum of Array Elements.
public class SumOfArray2 {

    // Method to return the sum of array elements
    public int sumOfArrayElements(int[] myArray ) {
        int sum = 0;

        // Iterate through the array and sum the elements
        for (int j : myArray) {
            sum += j;
        }

        return sum;
    }

    // Main method to execute the program
    public static void main(String[] args){
        SumOfArray2 mySumOfArray = new SumOfArray2(); // An instance of SumOfArray2

        // Define the array
        int[] numbers = {1,2,3,4,5};

        // Call the method and print the result
        int result = mySumOfArray.sumOfArrayElements(numbers);

        System.out.println(result);
    }
}
