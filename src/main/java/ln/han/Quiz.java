package ln.han;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {

    private final PuntenTelling puntenTelling;

    private List<QuizVraag> quizVragen = new ArrayList<>();

    private List<Antwoord> antwoorden = new ArrayList<>();

    private final List<SpelerAntwoord> spelerAntwoorden = new ArrayList<>();

    private final List<Letter> letters = new ArrayList<>();

    private final List<Boolean> correcteVragen = new ArrayList<>();

    private long beginTijd;

    private long eindTijd;

    private final Speler speler;


    public Quiz(PuntenTelling puntenTelling, Speler speler) {
        this.puntenTelling = puntenTelling;
        this.speler = speler;
    }

    public void speelQuiz() {
        beginTijd = System.currentTimeMillis();
        beantwoordVragen();
        eindTijd = System.currentTimeMillis();
        controleerAntwoorden(spelerAntwoorden);
        woordMaken();
        System.out.println("Je score is: " + speler.getScore());


    }

    private void beantwoordVragen() {
        Scanner scanner = new Scanner(System.in);
        for (QuizVraag quizVraag : quizVragen) {
            System.out.println(quizVraag.getVraagTekst());
            SpelerAntwoord spelerAntwoord = new SpelerAntwoord(scanner.nextLine(), quizVraag.getVraagId());
            beantwoordVraag(spelerAntwoord);
        }
    }

    private void woordMaken() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Je behaalde letters zijn: " + letters);
        System.out.println("Vorm een woord met de letters: ");
        String gevormdWoord = scanner.nextLine();
        if (!controleerWoord(gevormdWoord)) {
            System.out.println("Het gevormde woord is niet correct.");
            woordMaken();
        }
        speler.setScore(berekenScore(gevormdWoord));

    }


    private void controleerAntwoorden(List<SpelerAntwoord> spelerAntwoorden) {
        for (SpelerAntwoord spelerAntwoord : spelerAntwoorden) {
            for (Antwoord antwoord : antwoorden) {
                if (antwoord.getVraagId() == spelerAntwoord.vraagId()) {
                    if (antwoord.isCorrect(spelerAntwoord.antwoord())) {
                        correcteVragen.add(true);
                        letters.add(antwoord.getLetter());
                    }
                }
            }
        }
    }

    private boolean controleerWoord(String gevormdWoord) {
        char[] karakters = gevormdWoord.toLowerCase().toCharArray();

        for (char karakter : karakters) {
            Letter letter = Letter.getLetter(karakter);
            if (!letters.contains(letter)) {
                System.out.println("Letter '" + karakter + "' komt niet voor in de lijst letters.");
                return false;
            }
        }
        return true;
    }


    public int berekenScore(String gevormdWoord) {
        return puntenTelling.berekenScore(correcteVragen, gevormdWoord, berekenTijd());
    }

    public void beantwoordVraag(SpelerAntwoord antwoord) {
        spelerAntwoorden.add(antwoord);
    }

    private long berekenTijd() {
        return eindTijd - beginTijd;
    }


    // Getters and Setters

    public void setQuizVragen(ArrayList<QuizVraag> quizVragen) {
        this.quizVragen = quizVragen;
    }

    public void setAntwoorden(ArrayList<Antwoord> antwoorden) {
        this.antwoorden = antwoorden;
    }


}
