public class JavaBreakAndContinue {
    public static void main(String[] args) {
        // Java Break
        //The break statement can also be used to jump out of a loop

        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i); // prints out 0 1,2,3
        }

        // Java Continue
        //The continue statement breaks one iteration (in the loop),
        // if a specified condition occurs, and continues with the next iteration in the loop

        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i); // prints out 0,1,2,3,5,6,7,8,9
        }

        // Break and Continue in While Loop

        // break example
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 4) {
                break;
            }
        }

        // continue example
        int ii = 0;
        while (ii < 10) {
            if (ii == 4) {
                ii++;
                continue;
            }
            System.out.println(ii);
            ii++;

        }
    }
}
