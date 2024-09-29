import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner myNum = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int userInput = myNum.nextInt();

        if (userInput % 2 == 0){
            System.out.println(userInput + " is an even number");
        }else {
            System.out.println(userInput + " is an odd number");
        }
    }
}
