package ln.han;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    private String quizNaam;

    private int quizId;

    private ArrayList<QuizVraag> quizVragen = new ArrayList<>();

    private ArrayList<Antwoord> antwoorden = new ArrayList<>();

    private ArrayList<SpelerAntwoord> spelerAntwoorden = new ArrayList<>();

    private ArrayList<Letter> letters = new ArrayList<>();

    private long beginTijd;

    private long eindTijd;

    private Speler speler;

    public Quiz(String quizNaam, int quizId) {
        this.quizNaam = quizNaam;
        this.quizId = quizId;
    }

    public void speelQuiz() {
        beginTijd = System.currentTimeMillis();
        for (QuizVraag quizVraag : quizVragen) {
            System.out.println(quizVraag.getVraagTekst());
            Scanner scanner = new Scanner(System.in);
            SpelerAntwoord spelerAntwoord = new SpelerAntwoord(scanner.nextLine(), speler, quizVraag.getVraagId());
            beantwoordVraag(spelerAntwoord);
        }
        eindTijd = System.currentTimeMillis();
        controleerAntwoorden(spelerAntwoorden);
    }

    private void controleerAntwoorden(ArrayList<SpelerAntwoord> spelerAntwoorden) {
        for (SpelerAntwoord spelerAntwoord : spelerAntwoorden) {
            for (Antwoord antwoord : antwoorden) {
                if (antwoord.getVraagId() == spelerAntwoord.getVraagId()) {
                    if (antwoord.isCorrect(spelerAntwoord.getAntwoord())) {
                        System.out.println("Goed!");
                    } else {
                        System.out.println("Fout!");
                    }
                }
            }
        }
    }

    public int berekenScore(String gevormdWoord) {
        PuntenTelling puntenTelling = new NormalePuntenTelling();
        return puntenTelling.berekenScore(spelerAntwoorden, gevormdWoord , berekenTijd());
    }

    public void beantwoordVraag(SpelerAntwoord antwoord) {
        spelerAntwoorden.add(antwoord);
    }

    private long berekenTijd() {
        return eindTijd - beginTijd;
    }



    // Getters and Setters
    public void setQuizNaam(String quizNaam) {
        this.quizNaam = quizNaam;
    }

    public String getQuizNaam() {
        return quizNaam;
    }

    public void setQuizId(int quizId) {
        this.quizId = quizId;
    }

    public int getQuizId() {
        return quizId;
    }

    public void addQuizVraag(QuizVraag quizVraag) {
        quizVragen.add(quizVraag);
    }

    public void removeQuizVraag(QuizVraag quizVraag) {
        quizVragen.remove(quizVraag);
    }

    public ArrayList<QuizVraag> getQuizVragen() {
        return quizVragen;
    }

    public void setQuizVragen(ArrayList<QuizVraag> quizVragen) {
        this.quizVragen = quizVragen;
    }

    public void setAntwoorden(ArrayList<Antwoord> antwoorden) {
        this.antwoorden = antwoorden;
    }

    public ArrayList<Antwoord> getAntwoorden() {
        return antwoorden;
    }

    public void setBeginTijd(long beginTijd) {
        this.beginTijd = beginTijd;
    }

    public long getBeginTijd() {
        return beginTijd;
    }

    public void setEindTijd(long eindTijd) {
        this.eindTijd = eindTijd;
    }

    public long getEindTijd() {
        return eindTijd;
    }

    public void setSpeler(Speler speler) {
        this.speler = speler;
    }

    public Speler getSpeler() {
        return speler;
    }




}
