package ln.han;

import java.util.Scanner;

public class Parola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ParolaController parola = ParolaController.getInstance();

        System.out.println("Enter your player name: ");
        String playerName = scanner.nextLine();

        System.out.println("Choose your scoring system (number):");
        System.out.println("1. Normale Punten Telling");
        System.out.println("2. Strenge Punten Telling");
        int choice = scanner.nextInt();
        scanner.nextLine();

        PuntenTelling puntenTelling;
        if (choice == 1) {
            puntenTelling = new NormalePuntenTelling();
        } else {
            puntenTelling = new StrengePuntenTelling();
        }

        System.out.println("The 8-question quiz starts. Good luck!");
        parola.startQuiz(playerName);
        do {
            System.out.println(parola.nextQuestion(playerName));
            System.out.println("Give your answer to this question:");
            String answer = scanner.nextLine();
            parola.processAnswer(playerName, answer);
        } while (!parola.quizFinished(playerName));

        System.out.println("You've earned the following letters: " + parola.getLettersForRightAnswers(playerName));
        System.out.print("Make a word, as long as possible, that contains these letters: ");
        String word = scanner.nextLine();

        int score = puntenTelling.berekenScore(parola.getCorrectAnswersCount(playerName), word, parola.getElapsedTime(playerName));
        System.out.println("Score: " + score);
    }
}
