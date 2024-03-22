package ln.han;

import java.util.ArrayList;

public class Quiz {

    public String quizNaam;

    public int quizId;

    public ArrayList<QuizVraag> quizVragen = new ArrayList<>();

    public ArrayList<SpelerAntwoord> spelerAntwoorden = new ArrayList<>();

    public ArrayList<Letter> letters = new ArrayList<>();

    public Quiz(String quizNaam, int quizId) {
        this.quizNaam = quizNaam;
        this.quizId = quizId;
    }

    public int berekenScore( ArrayList<Letter> letters, String gevormdWoord, long tijd) {
        PuntenTelling puntenTelling = new NormalePuntenTelling();
        return puntenTelling.berekenScore(spelerAntwoorden, letters, gevormdWoord ,tijd);
    }

    public void beantwoordVraag(SpelerAntwoord antwoord) {
        QuizVraag quizVraag = quizVragen.get(antwoord.getVraagId());
        SpelerAntwoord spelerAntwoord = new SpelerAntwoord(antwoord.getAntwoord(), antwoord.getSpeler(), quizVraag.getVraagId());
        spelerAntwoorden.add(spelerAntwoord);
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

}
