package ln.han;

import java.util.ArrayList;
import java.util.List;

public class Antwoord {
    private List<String> antwoorden;

    private final int id;

    private final Letter letter;

    public Antwoord(String antwoordTekst, int id, Letter letter) {
        this.antwoorden = new ArrayList<>();
        this.antwoorden.add(antwoordTekst);
        this.id = id;
        this.letter = letter;
    }

    public Antwoord(List<String> antwoorden, int vraagId, Letter letter) {
        this.antwoorden = new ArrayList<>();
        this.antwoorden.addAll(antwoorden);
        this.id = vraagId;
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

    public Letter getLetter() {
        return letter;
    }

    public int getId() {
        return id;
    }

}
