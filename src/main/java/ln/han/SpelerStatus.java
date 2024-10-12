package ln.han;

import java.util.ArrayList;
import java.util.List;

public class SpelerStatus {
    private final Speler speler;
    private final Quiz quiz;
    private int score;
    private final List<QuizVraag> beantwoordeVragen;
    private final long startTime;
    private final List<Letter> letters;


    public SpelerStatus(Speler speler, Quiz quiz) {
        this.speler = speler;
        this.quiz = quiz;
        this.score = 0;
        this.beantwoordeVragen = new ArrayList<>();
        this.startTime = System.currentTimeMillis();
        this.letters = new ArrayList<>();
    }

    public Speler getSpeler() {
        return speler;
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public int getScore() {
        return score;
    }

    public void incrementScore(int increment) {
        this.score += increment;
    }

    public List<QuizVraag> getBeantwoordeVragen() {
        return beantwoordeVragen;
    }

    public void addBeantwoordeVraag(QuizVraag vraag) {
        this.beantwoordeVragen.add(vraag);
    }

    public long getElapsedTime() {
        return System.currentTimeMillis() - startTime;
    }

    public List<Letter> getLetters() {
        return letters;
    }

    public void addLetter(Letter letter) {
        this.letters.add(letter);
    }
}
