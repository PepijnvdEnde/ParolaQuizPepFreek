package ln.han;

import java.util.ArrayList;

public class Quiz {
    public String quizNaam;
    public int quizId;

    public ArrayList<QuizVraag> quizVragen = new ArrayList<QuizVraag>();

    public Quiz(String quizNaam, int quizId) {
        this.quizNaam = quizNaam;
        this.quizId = quizId;
    }

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
