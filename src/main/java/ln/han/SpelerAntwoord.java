package ln.han;

public record SpelerAntwoord(String antwoord, int vraagId) {

    @Override
    public String toString() {
        return antwoord();
    }


}
