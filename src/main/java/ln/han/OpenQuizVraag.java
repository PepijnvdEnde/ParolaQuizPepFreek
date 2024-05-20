package ln.han;


public class OpenQuizVraag extends QuizVraag {
    public OpenQuizVraag(String vraagTekst, Categorie categorie, Antwoord antwoorden) {
        super(vraagTekst, categorie, antwoorden);
    }

    @Override
    public String toString() {
        return getVraagTekst();
    }
}
