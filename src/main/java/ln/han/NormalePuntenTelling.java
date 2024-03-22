package ln.han;

import java.util.ArrayList;

public class NormalePuntenTelling extends PuntenTelling {
    public NormalePuntenTelling() {
        super();
    }

    @Override
    public int berekenScore(ArrayList<SpelerAntwoord> spelerAntwoorden, String gevormdWoord, long tijd) {
        return spelerAntwoorden.size() + gevormdWoord.length() + (int) tijd / 1000;
    }
}
