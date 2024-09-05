public class JavaRecursion {
    // Java Recursion
    // is the technique of making a function call itself.


    // Sum method
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

    // Halting Condition
    // Every recursive function should have a halting condition,
    // which is the condition where the function stops calling itself.
    public static int sum1(int start, int end) {
        if (end > start) {
            return end + sum1(start, end - 1);
        } else {
            return end;
        }
    }

    public static void main(String[] args) {

        // Use recursion to add all the numbers up to 10.
        int result = sum(10);
        System.out.println(result);

        //
        int result1 = sum1(5, 10);
        System.out.println(result);
    }
}
