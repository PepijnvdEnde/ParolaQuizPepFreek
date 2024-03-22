package ln.han;

import ln.han.repo.Categorie;

public class OpenQuizVraag extends QuizVraag {
    public OpenQuizVraag(String vraagTekst, boolean isActueel, int vraagId, Categorie categorie) {
        super(vraagTekst, isActueel, vraagId, categorie);
    }

    @Override
    public String toString() {
        return getVraagTekst();
    }
}
