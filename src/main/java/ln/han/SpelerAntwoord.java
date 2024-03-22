package ln.han;

public class SpelerAntwoord {
    private String antwoord;

    private Speler speler;

    private int vraagId;

    public SpelerAntwoord(String antwoord, Speler speler, int vraagId) {
        this.antwoord = antwoord;
        this.speler = speler;
        this.vraagId = vraagId;
    }

    @Override
    public String toString() {
        return getAntwoord();
    }

    public String getAntwoord() {
        return antwoord;
    }

    public Speler getSpeler() {
        return speler;
    }

    public boolean isCorrect(String correctAntwoord) {
        return antwoord.equals(correctAntwoord);
    }

    public void verhoogScore() {
        speler.verhoogScore();
    }

    public void setAntwoord(String antwoord) {
        this.antwoord = antwoord;
    }

    public void setSpeler(Speler speler) {
        this.speler = speler;
    }

    public int getVraagId() {
        return vraagId;
    }

    public void setVraagId(int vraagId) {
        this.vraagId = vraagId;
    }
}
