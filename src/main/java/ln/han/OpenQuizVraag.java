package ln.han;


import java.util.List;

public class OpenQuizVraag extends QuizVraag {
    public OpenQuizVraag(int vraagId, String vraagTekst, Categorie categorie, List<String> antwoorden, Letter letter) {
        super(vraagId, vraagTekst, categorie, antwoorden, letter);
    }

    @Override
    public String toString() {
        return getVraagTekst();
    }
}
