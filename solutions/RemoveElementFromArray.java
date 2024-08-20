import java.util.Arrays;
import java.util.Scanner;

// Java Array Program to Remove All Occurrences of an Element in an Array
public class RemoveElementFromArray {

    // Method to remove all occurrences of an element from an array
    public static int[] removeElement(int[] myArray, int elementToRemove) {
        int count = 0;

        // Count occurrences of the element to remove
        for (int i : myArray) {
            if (i == elementToRemove) {
                count++;
            }
        }

        // Create a new array of size original array length minus the count of the element to remove
        int[] newArray = new int[myArray.length - count];
        int j = 0;

        // Copy elements except the element to remove into the new array
        for (int i : myArray) {
            if (i != elementToRemove){
                newArray[j++] = i;
            }
        }

        return newArray;
    }


    // Main method to execute the program
    public static void main(String[] args) {
        // Define the array
        int[] numbers = {3, 5, 7, 3, 8, 9, 1, 8, 5, 10, 6, 9, 7, 7};

        // Display the available array to the user
        System.out.println("Available array: " + Arrays.toString(numbers));

        Scanner myUserNum = new Scanner(System.in);
        int elementToRemove;
        boolean isValid;

        // Loop until a valid number is entered by user
        do{
            // Ask the user to enter a number to remove
            System.out.print("Enter the number you want to remove from the array: ");
            elementToRemove = myUserNum.nextInt();

            // Check if the entered number exists in the array
            isValid = false;
            for (int num : numbers) {
                if (num == elementToRemove) {
                    isValid = true;
                    break;
                }
            }

            // If the number is not found, prompt the user to enter another number
            if (!isValid) {
                System.out.println("The number " + elementToRemove + " is not in the array. Please enter another number.");
            }
        } while (!isValid);

        // Call the method to remove all occurrences of the element and store the result
        int[] resultArray = removeElement(numbers, elementToRemove);

        // Print the array with the element removed
        System.out.println("Array after removing " + elementToRemove + ": " + Arrays.toString(resultArray));

    }
}
