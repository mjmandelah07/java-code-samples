public class SmallestElementInAnArray {
    public static void main(String[] args) {
        // An array storing different ages
        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};

        // create variable to hold the smallest Element
        // Loop through the array and compare the elements to each other

        int smallest = ages[0];

        for(int age: ages){
            if (smallest > age){
                smallest = age;
            }
        }

        System.out.println("The smallest in the array is: " + smallest);

    }
}
