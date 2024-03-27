package ln.han;

import java.util.ArrayList;

public class MeerkeuzeQuizVraag extends QuizVraag {

    private final ArrayList<String> antwoorden;

    public MeerkeuzeQuizVraag(String vraagTekst, int vraagId, Categorie categorie, ArrayList<String> antwoorden) {
        super(vraagTekst, vraagId, categorie);
        this.antwoorden = antwoorden;
    }

    @Override
    public String getVraagTekst() {
        return super.getVraagTekst() + "\n" + getAntwoordenString();
    }

    private String getAntwoordenString() {
        StringBuilder sb = new StringBuilder();
        if (!antwoorden.isEmpty()) {
            sb.append("A: ").append(antwoorden.getFirst()).append("\n");
        }
        if (antwoorden.size() > 1) {
            sb.append("B: ").append(antwoorden.get(1)).append("\n");
        }
        if (antwoorden.size() > 2) {
            sb.append("C: ").append(antwoorden.get(2)).append("\n");
        }
        if (antwoorden.size() > 3) {
            sb.append("D: ").append(antwoorden.get(3));
        }
        return sb.toString();
    }

}