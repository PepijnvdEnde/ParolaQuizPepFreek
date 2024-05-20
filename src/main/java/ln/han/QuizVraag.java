package ln.han;

public abstract class QuizVraag {

    private final String vraagTekst;
    private final Categorie categorie;
    private final Antwoord antwoorden;


    public QuizVraag(String vraagTekst, Categorie categorie, Antwoord antwoorden) {
        this.vraagTekst = vraagTekst;
        this.categorie = categorie;
        this.antwoorden = antwoorden;

    }

    public String getVraagTekst() {
        return vraagTekst;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public Antwoord getAntwoorden() {
        return antwoorden;
    }



}
