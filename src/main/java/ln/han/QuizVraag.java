package ln.han;

public abstract class QuizVraag {

    private final String vraagTekst;
    private final int vraagId;
    private final Categorie categorie;
    private final boolean isActueel;

    public QuizVraag(String vraagTekst, boolean isActueel, int vraagId, Categorie categorie) {
        this.vraagTekst = vraagTekst;
        this.vraagId = vraagId;
        this.categorie = categorie;
        this.isActueel = isActueel;
    }


    // getters and setters
    public String getVraagTekst() {
        if (isActueel) {
            return vraagTekst;
        }
        return null;
    }

    public int getVraagId() {
        return vraagId;
    }

    public Categorie getCategorie() {
        return categorie;
    }


}
