package ln.han;

import java.util.ArrayList;

public class Antwoord {
    private ArrayList<String> antwoorden = new ArrayList<>();
    private int vraagId;

    private Letter letter;

    public Antwoord(String antwoordTekst, int vraagId, Letter letter) {
        this.antwoorden.add(antwoordTekst);
        this.vraagId = vraagId;
        this.letter = letter;
    }

    public Antwoord(ArrayList<String> antwoorden, int vraagId, Letter letter) {
        this.antwoorden = antwoorden;
        this.vraagId = vraagId;
        this.letter = letter;
    }

    public boolean isCorrect(String antwoord) {
        for (String s : antwoorden) {
            if (s.equalsIgnoreCase(antwoord)) {
                return true;
            }
        }
        return false;
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
