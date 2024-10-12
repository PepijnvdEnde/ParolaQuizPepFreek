package ln.han;

import java.util.ArrayList;
import java.util.List;

public abstract class QuizVraag {

    private final int vraagId;
    private final String vraagTekst;
    private final Categorie categorie;
    private final List<String> antwoorden = new ArrayList<>();
    private final Letter letter;

    protected QuizVraag(int vraagId, String vraagTekst, Categorie categorie, List<String> antwoorden, Letter letter) {
        this.vraagId = vraagId;
        this.vraagTekst = vraagTekst;
        this.categorie = categorie;
        this.antwoorden.addAll(antwoorden);
        this.letter = letter;
    }

    public String getVraagTekst() {
        return vraagTekst;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public int getVraagId() {
        return vraagId;
    }

    public List<String> getAntwoorden() {
        return antwoorden;
    }

    public Letter getLetter() {
        return letter;
    }

    @Override
    public String toString() {
        return vraagTekst;
    }


    public boolean isCorrect(String answer) {
        return antwoorden.contains(answer.toLowerCase());
    }
}
