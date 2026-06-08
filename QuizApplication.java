import java.util.Scanner;

public class QuizApplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] questions = {
                "1. What is the capital of India?",
                "2. Which planet is known as the Red Planet?",
                "3. Which language is used for Android development?"
        };

        String[][] options = {
                {"A. Mumbai", "B. Delhi", "C. Chennai", "D. Kolkata"},
                {"A. Earth", "B. Mars", "C. Venus", "D. Jupiter"},
                {"A. Java", "B. Python", "C. C", "D. HTML"}
        };

        char[] answers = {'B', 'B', 'A'};

        int score = 0;

        System.out.println("===== QUIZ APPLICATION =====");

        for (int i = 0; i < questions.length; i++) {

            System.out.println("\n" + questions[i]);

            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }

            System.out.print("Enter your answer: ");
            char userAnswer = Character.toUpperCase(sc.next().charAt(0));

            if (userAnswer == answers[i]) {
                score++;
            }
        }

        System.out.println("\n===== RESULT =====");
        System.out.println("Total Questions : " + questions.length);
        System.out.println("Correct Answers : " + score);
        System.out.println("Score           : " + score + "/" + questions.length);

        sc.close();
    }
}
