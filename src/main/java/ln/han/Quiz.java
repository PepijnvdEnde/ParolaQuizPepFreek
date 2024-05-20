package ln.han;

import java.util.ArrayList;
import java.util.List;

public class Quiz {

    private List<QuizVraag> quizVragen;

    public Quiz() {
        quizVragen = new ArrayList<>();
    }

    public void setQuizVragen(List<QuizVraag> quizVragen) {
        this.quizVragen = quizVragen;
    }


    public QuizVraag getQuizVraag(int index) {
        return quizVragen.get(index);
    }

    public Antwoord getAntwoord(int index) {
        return quizVragen.get(index).getAntwoorden();
    }
}
