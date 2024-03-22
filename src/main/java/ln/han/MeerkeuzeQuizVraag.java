package ln.han;

import ln.han.repo.Categorie;

import java.util.ArrayList;

public class MeerkeuzeQuizVraag extends QuizVraag {

    public ArrayList<String> antwoorden = new ArrayList<>();

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

}
