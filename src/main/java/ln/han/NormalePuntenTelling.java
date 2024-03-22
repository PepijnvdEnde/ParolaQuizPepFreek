package ln.han;

import java.util.ArrayList;

public class NormalePuntenTelling extends PuntenTelling {
    public NormalePuntenTelling(int score) {
        super(score);
    }

    @Override
    public int berekenScore(int score, ArrayList<SpelerAntwoord> spelerAntwoorden, ArrayList<Letter> letters, String gevormdWoord) {
        return score;
    }
}
