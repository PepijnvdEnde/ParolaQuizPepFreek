package ln.han;

public class OpenQuizVraag extends QuizVraag {
    public OpenQuizVraag(String vraagTekst, int vraagId, Categorie categorie) {
        super(vraagTekst, vraagId, categorie);
    }

    @Override
    public String toString() {
        return getVraagTekst();
    }
}
