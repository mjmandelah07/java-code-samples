public class JavaMath {
    public static void main(String[] args) {
        // Math.max(x,y)
        // The Math.max(x,y) method can be used to find the highest value of x and y
        System.out.println(Math.max(5, 10)); // 10 is the answer

        // Math.min(x,y)
        // The Math.min(x,y) method can be used to find the lowest value of x and y
        System.out.println(Math.min(5, 10)); // Answer is 5

        // Math.sqrt(x)
        // The Math.sqrt(x) method returns the square root of x
        System.out.println(Math.sqrt(64)); // Answer is 8.0

        // Math.abs(x)
        //The Math.abs(x) method returns the absolute (positive) value of x
        System.out.println(Math.abs(-4.7)); // Answer is 4.7

        // Random Numbers
        //Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive)
        System.out.println(Math.random());

        // To get more control over the random number,
        int randomNum = (int) (Math.random() * 101); // Get random number btw 0 and 100
        System.out.println(randomNum);


    }
}
