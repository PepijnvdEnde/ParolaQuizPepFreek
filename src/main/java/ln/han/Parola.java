package ln.han;

import ln.han.repo.QuizRepo;

import java.util.Scanner;

public class Parola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Speler speler = new Speler();



        System.out.println("Welkom bij de quiz! Kies een categorie:");
        System.out.println("Muziek");
        System.out.println("Sport");
        System.out.println("Taal");
        System.out.println("Geografie");
        Categorie categorie = Categorie.valueOf(scanner.nextLine().toUpperCase());
        System.out.println("Kies een puntentelling methode:");
        System.out.println("1. Strenge punten telling");
        System.out.println("2. Normale punten telling");
        PuntenTelling puntenTelling = scanner.nextLine().equals("1") ? new StrengePuntenTelling() : new NormalePuntenTelling();
        QuizRepo quizRepo = new QuizRepo(speler, puntenTelling);
        quizRepo.getQuizByCategorie(categorie).speelQuiz();


    }
}