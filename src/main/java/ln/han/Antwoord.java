package ln.han;

public class Antwoord {
    private String antwoordTekst;
    private int vraagId;

    public Antwoord(String antwoordTekst, int vraagId) {
        this.antwoordTekst = antwoordTekst;
        this.vraagId = vraagId;
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
}
