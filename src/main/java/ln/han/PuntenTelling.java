package ln.han;

import java.util.ArrayList;

public abstract class PuntenTelling {
    public int score;

    public ArrayList<SpelerAntwoord> spelerAntwoorden = new ArrayList<>();
    public ArrayList<Letter> letters = new ArrayList<>();

    public String gevormdWoord;
    public PuntenTelling(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public int berekenScore(int score, ArrayList<SpelerAntwoord> spelerAntwoorden, ArrayList<Letter> letters, String gevormdWoord) {
        return score;
    }

}