public class AverageOfAnArray {
    public static void main(String[] args) {
        // An array storing different ages
        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};

        // find the length of the area
        // find the sum of the array
        // divide the sum of the array by the length

        // Use float since the result might be having decimal
        float avg = 0;
        float sum = 0;

        int agesLength = ages.length;

        for(int i = 0; i < agesLength; i++){
            sum += ages[i];
        }

        avg = sum / agesLength;

        System.out.println("The average is: " + avg);
    }
}
