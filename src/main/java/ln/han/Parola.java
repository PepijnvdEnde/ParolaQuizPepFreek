package ln.han;

import ln.han.repo.QuizRepo;

import java.util.Scanner;

public class Parola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Speler speler = new Speler();
        QuizRepo quizRepo = new QuizRepo();


        System.out.println("Welkom bij de quiz! Kies een thema bij nummer:");
        System.out.println("1. Muziek");
        System.out.println("2. Sport");
        System.out.println("3. Taal");
        System.out.println("4. Geografie");
        String Categorie = scanner.nextLine();
        switch (Categorie) {
            case "1":
                Quiz muziekQuiz = quizRepo.getMuziekQuiz();
                muziekQuiz.setSpeler(speler);
                muziekQuiz.speelQuiz();
                break;
            case "2":
                Quiz sportQuiz = quizRepo.getSportQuiz();
                sportQuiz.setSpeler(speler);
                sportQuiz.speelQuiz();
                break;
            case "3":
                Quiz taalQuiz = quizRepo.getTaalQuiz();
                taalQuiz.setSpeler(speler);
                taalQuiz.speelQuiz();
                break;
            case "4":
                Quiz geografieQuiz = quizRepo.getGeografieQuiz();
                geografieQuiz.setSpeler(speler);
                geografieQuiz.speelQuiz();
                break;
            default:
                System.out.println("Ongeldige keuze");
        }
    }
}