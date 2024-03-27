package ln.han;

public abstract class QuizVraag {

    private final String vraagTekst;
    private final int vraagId;
    private final Categorie categorie;

    public QuizVraag(String vraagTekst, int vraagId, Categorie categorie) {
        this.vraagTekst = vraagTekst;
        this.vraagId = vraagId;
        this.categorie = categorie;

    }

    public String getVraagTekst() {
        return vraagTekst;
    }

    public int getVraagId() {
        return vraagId;
    }

    public Categorie getCategorie() {
        return categorie;
    }


}
