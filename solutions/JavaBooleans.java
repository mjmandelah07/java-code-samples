public class JavaBooleans {
    public static void main(String[] args) {
        // Boolean Values
        // A boolean type is declared with the boolean keyword and can only take the values true or false
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);     // Outputs true
        System.out.println(isFishTasty);    // Outputs false

        // Boolean Expression
        // A Boolean expression returns a boolean value: true or false
        // you can use a comparison operator, such as the greater than (>) operator,
        // to find out if an expression (or a variable) is true or false
        int x = 10;
        int y = 9;
        System.out.println(x > y); // returns true, because 10 is higher than 9

        // OR
        System.out.println(10 > 9); // returns true, because 10 is higher than 9

        // using the equal to (==) operator to evaluate an expression
        int xx = 10;
        System.out.println(xx == 10); // returns true, because the value of x is equal to 10
        System.out.println(10 == 15); // returns false, because 10 is not equal to 15

        // Example
        int myAge = 25;
        int votingAge = 18;

        // Will print out "Old enough to vote!"
        if (myAge >= votingAge) {
            System.out.println("Old enough to vote!");
        } else {
            System.out.println("Not old enough to vote.");
        }
    }
}
