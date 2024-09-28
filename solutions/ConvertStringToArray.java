public class ConvertStringToArray {
    public static void main(String[] args) {
        // Create a string
        String myStr = "Hello";

        // Convert to array
        char[] myArray = myStr.toCharArray();

        System.out.println(myArray[0]);  // prints H

        // Print array elements
        for (char i : myArray) {
            System.out.println(i); // Prints H, e, l, l, o
        }

    }
}
