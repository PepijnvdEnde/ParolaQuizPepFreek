package ln.han;

public class Antwoord {
    private String antwoordTekst;
    private int vraagId;

    private Letter letter;

    public Antwoord(String antwoordTekst, int vraagId, Letter letter) {
        this.antwoordTekst = antwoordTekst;
        this.vraagId = vraagId;
        this.letter = letter;
    }

    public boolean isCorrect(String antwoord) {
        return antwoordTekst.equalsIgnoreCase(antwoord);
    }
    public String getAntwoordTekst() {
        return antwoordTekst;
    }

    public void setAntwoordTekst(String antwoordTekst) {
        this.antwoordTekst = antwoordTekst;
    }

    public int getVraagId() {
        return vraagId;
    }

    public void setVraagId(int vraagId) {
        this.vraagId = vraagId;
    }

    public Letter getLetter() {
        return letter;
    }

    public void setLetter(Letter letter) {
        this.letter = letter;
    }
}
