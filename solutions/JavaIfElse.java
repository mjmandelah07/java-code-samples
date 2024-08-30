public class JavaIfElse {
    public static void main(String[] args) {
        // Java Conditions and If Statements

        // Java supports the usual logical conditions from mathematics:
        // You can use these conditions to perform different actions for different decisions.

        //Less than: a < b
        //Less than or equal to: a <= b
        //Greater than: a > b
        //Greater than or equal to: a >= b
        //Equal to a == b
        //Not Equal to: a != b

        // Java has the following conditional statements:
        //
        //Use if to specify a block of code to be executed, if a specified condition is true
        //Use else to specify a block of code to be executed, if the same condition is false
        //Use else if to specify a new condition to test, if the first condition is false
        //Use switch to specify many alternative blocks of code to be executed

        // The if Statement
        // Use the if statement to specify a block of Java code to be executed if a condition is true
        if (20 > 18) {
            // block of code to be executed if the condition is true
            System.out.println("20 is greater than 18");
        }

        // We can also test variables
        int x = 20;
        int y = 18;
        if (x > y) {
            System.out.println("x is greater than y");
        }

        // The else Statement
        // Use the else statement to specify a block of code to be executed if the condition is false

        //        if (condition) {
        //            // block of code to be executed if the condition is true
        //        } else {
        //            // block of code to be executed if the condition is false
        //        }

        // Example
        int time = 20;
        // Outputs "Good evening."
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        // The else if Statement
        //Use the else if statement to specify a new condition if the first condition is false

        /*
            if (condition1) {
              // block of code to be executed if condition1 is true
            } else if (condition2) {
              // block of code to be executed if the condition1 is false and condition2 is true
            } else {
              // block of code to be executed if the condition1 is false and condition2 is false
            }
            * */

        // example
        int time1 = 22;
        // Outputs "Good evening."
        if (time1 < 10) {
            System.out.println("Good morning.");
        } else if (time1 < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        // Short Hand If...Else (Ternary Operator)
        // There is also a shorthand if else, which is known as the ternary operator
        // because it consists of three operands.
        //It can be used to replace multiple lines of code with a single line,
        // and is most often used to replace simple if else statements

        // variable = (condition) ? expressionTrue :  expressionFalse;

        // Instead of writing:
        int time2 = 20;
        if (time2 < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        // Can simply write this:
        int time3 = 20;
        String result = (time3 < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
    }
}
