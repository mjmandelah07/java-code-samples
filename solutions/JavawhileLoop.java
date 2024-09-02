public class JavawhileLoop {
    public static void main(String[] args) {
        // Loops
        // can execute a block of code as long as a specified condition is reached.
        //Loops are handy because they save time, reduce errors, and they make code more readable.

        // Java While Loop
        //The while loop loops through a block of code as long as a specified condition is true

        // the loop will run, over and over again, as long as a variable (i) is less than 5
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        // The Do/While Loop
        // The do/while loop is a variant of the while loop. This loop will execute the code block once,
        // before checking if the condition is true, then it will repeat the loop as long as the condition is true

        int num = 0;
        do {
            System.out.println(i);
            num++;
        }
        while (num < 5);
    }
}
