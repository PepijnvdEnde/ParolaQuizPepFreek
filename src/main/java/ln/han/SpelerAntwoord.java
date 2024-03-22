package ln.han;

public class SpelerAntwoord {
    private String antwoord;

    private Speler speler;

    public SpelerAntwoord(String antwoord, Speler speler) {
        this.antwoord = antwoord;
        this.speler = speler;
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
}
