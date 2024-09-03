public class JavaArray {
    public static void main(String[] args) {
        // Java Arrays
        // are used to store multiple values in a single variable,
        // instead of declaring separate variables for each value.
      // To declare an array, define the variable type with square brackets:

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        // To create an array of integers
        int[] myNum = {10, 20, 30, 40};

        // Access the Elements of an Array
        // Use index to access elements in an array
        System.out.println(cars[0]); // Outputs Volvo

        // Change an Array Element
        //To change the value of a specific element, refer to the index number:
        cars[0] = "Opel";
        System.out.println(cars[0]); // Now outputs Opel instead of Volvo


        // Array Length
        System.out.println(cars.length); // Outputs 4

        // Loop Through an Array
        // You can loop through the array elements with the for loop,
        // and use the length property to specify how many times the loop should run
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        // Loop Through an Array with For-Each
        // There is also a "for-each" loop, which is used exclusively to loop through elements in arrays
        for (String i : cars) {
            System.out.println(i);
        }

        // Multidimensional Arrays
        //A multidimensional array is an array of arrays.
        //
        // Multidimensional arrays are useful when you want to store data as a tabular form,
        // like a table with rows and columns

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };

        // Access Elements
        // To access the elements of the myNumbers array,
        // specify two indexes: one for the array, and one for the element inside that array.

        System.out.println(myNumbers[1][2]); // Outputs 7
        System.out.println(myNumbers[0][0]); // Outputs 1

        // Change Element Values
        myNumbers[1][2] = 9;
        System.out.println(myNumbers[1][2]); // Outputs 9 instead of 7

        // Loop Through a Multi-Dimensional Array
        // Using for loop
        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }

        // using for-each loop
        for (int[] row : myNumbers) {
            for (int i : row) {
                System.out.println(i);
            }
        }
    }
}
