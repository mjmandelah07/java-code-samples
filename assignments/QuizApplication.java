import java.util.Scanner;

public class QuizApplication {

    public static void main(String[] args) {
        // initialize score to 0
        // create 5 array of questions
        // create 5 array of correct answers for the questions
        // For each question 1 to 5
        // display the question and option
        // prompt user to select option btw a, b, c for their answer

        // if user answer matches the correct answer for the current question
        // add 1 to our score

        // display the completion of quiz and score

        Scanner scanner = new Scanner(System.in);
        int score = 0;

        // Array of questions
        String[] questions = {
                "1. What is the capital of Nigeria?\n a) Abuja\n b) Lagos\n c) Calabar",
                "2. Which planet is known as the Red Planet?\n a) Venus\n b) Mars\n c) Jupiter",
                "3. Who is the president of Nigeria at  '2024'?\n a) Tinubu\n b) Buhari\n c) Mark",
                "4. What is the largest ocean on Earth?\n a) Atlantic Ocean\n b) Indian Ocean\n c) Pacific Ocean",
                "5. Which element has the chemical symbol 'O'?\n a) Oxygen\n b) Hydrogen\n c) Nitrogen"
        };

        // Array of correct answers
        char[] answers = {'a', 'b', 'a', 'c', 'a'};

        // Loop through each question
        for (int i = 0; i < questions.length; i++) {
            System.out.println("\n--- Welcome to All purpose quiz competition ---");
            System.out.println(questions[i]);
            System.out.print("Enter your answer (a | b | c): ");

            // read user input
            char userAnswer = scanner.next().charAt(0);

            // Check if answer is correct
            if (userAnswer == answers[i]) {
                score++;
            }


        }
        // Display final score
        System.out.println("\nQuiz Complete!");
        System.out.println("Your final score is: " + score + " out of " + questions.length + " questions");

        scanner.close();

    }


}
