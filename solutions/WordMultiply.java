import java.util.Scanner;

public class WordMultiply {

    // create a method to multiply the word the user gave by the times they wanted
    static void wordy(String word, int num){

        for (int i = 0; i < num; i++) {
            System.out.println(word);
        }
    }
    public static void main(String[] args) {
        // Read input from users
        Scanner WordData = new Scanner(System.in);
        String word;
        int num;

        // Prompt the user to enter a word
        System.out.println("Enter the word you want to see it multipled: ");
        word = WordData.nextLine();

        // Prompt the user to enter a number
        System.out.println("Enter the number you want to see the word multiplied with ");
        num = WordData.nextInt();

        // call the method
        wordy(word, num);

        WordData.close();
    }
}

