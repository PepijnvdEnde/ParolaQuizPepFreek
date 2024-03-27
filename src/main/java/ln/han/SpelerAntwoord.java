package ln.han;

public record SpelerAntwoord(String antwoord, int vraagId, Speler speler) {

    @Override
    public String toString() {
        return antwoord();
    }


}


