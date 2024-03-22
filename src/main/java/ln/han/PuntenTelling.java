package ln.han;

import java.util.ArrayList;

public abstract class PuntenTelling {

    public ArrayList<SpelerAntwoord> spelerAntwoorden = new ArrayList<>();
    public ArrayList<Letter> letters = new ArrayList<>();

    public String gevormdWoord;
    public PuntenTelling() {}



    public int berekenScore(ArrayList<SpelerAntwoord> spelerAntwoorden, ArrayList<Letter> letters, String gevormdWoord, long tijd) {
        return 0;
    }

}
