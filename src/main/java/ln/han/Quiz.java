package ln.han;

import java.util.ArrayList;

public class Quiz {

    public String quizNaam;

    public int quizId;

    public ArrayList<QuizVraag> quizVragen = new ArrayList<>();

    public ArrayList<SpelerAntwoord> spelerAntwoorden = new ArrayList<>();

    public ArrayList<Letter> letters = new ArrayList<>();

    public long beginTijd;

    public long eindTijd;

    public Quiz(String quizNaam, int quizId) {
        this.quizNaam = quizNaam;
        this.quizId = quizId;
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

    public String getStelling(int i) {
        QuizVraag quizVraag = quizVragen.get(i);
        return quizVraag.getVraagTekst();
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

}
