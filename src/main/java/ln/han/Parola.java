package ln.han;

import ln.han.repo.VraagRepo;
import java.util.Scanner;

public class Parola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Speler speler = new Speler();
        Quiz quiz = new Quiz("test", 1);
        VraagRepo vraagRepo = new VraagRepo();
        for (int i = 0; i < 3; i++) {
            quiz.addQuizVraag(vraagRepo.getVraag(i));
            System.out.println(vraagRepo.getVraag(i).toString());
            SpelerAntwoord spelerAntwoord = new SpelerAntwoord(scanner.nextLine(), speler, i);
            quiz.beantwoordVraag(spelerAntwoord);

        }
        System.out.println(quiz.spelerAntwoorden.toString());



    }
}