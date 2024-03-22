package ln.han;

import java.util.ArrayList;

public class StrengePuntenTelling extends PuntenTelling {
    public StrengePuntenTelling(int score) {
        super(score);
    }

    @Override
    public int berekenScore(int score, ArrayList<SpelerAntwoord> spelerAntwoorden, ArrayList<Letter> letters, String gevormdWoord) {
        return 0;
    }
}
