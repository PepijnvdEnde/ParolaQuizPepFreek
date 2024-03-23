package ln.han;

import java.util.ArrayList;

public class MeerkeuzeQuizVraag extends QuizVraag {

    private ArrayList<String> antwoorden = new ArrayList<>();

    public MeerkeuzeQuizVraag(String vraagTekst, boolean isActueel, int vraagId, Categorie categorie, ArrayList<String> antwoorden) {
        super(vraagTekst, isActueel, vraagId, categorie);
        this.antwoorden = antwoorden;
    }

    public void addAntwoord(String antwoord) {
        antwoorden.add(antwoord);
    }

    public void removeAntwoord(String antwoord) {
        antwoorden.remove(antwoord);
    }

    public ArrayList<String> getAntwoorden() {
        return antwoorden;
    }

    public void setAntwoorden(ArrayList<String> antwoorden) {
        this.antwoorden = antwoorden;
    }

    @Override
    public String getVraagTekst() {
        return super.getVraagTekst() + "\n" + getAntwoordenString();
    }

    private String getAntwoordenString() {
        StringBuilder sb = new StringBuilder();
        if (antwoorden.size() > 0) {
            sb.append("A: ").append(antwoorden.get(0)).append("\n");
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