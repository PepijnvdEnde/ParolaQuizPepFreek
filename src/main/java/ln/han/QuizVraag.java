package ln.han;

import ln.han.repo.Categorie;

public abstract class QuizVraag {

    public String vraagTekst;
    public boolean isActueel;
    public int vraagId;

    public Categorie categorie;

    public QuizVraag(String vraagTekst, boolean isActueel, int vraagId, Categorie categorie) {
        this.vraagTekst = vraagTekst;
        this.isActueel = isActueel;
        this.vraagId = vraagId;
        this.categorie = categorie;
    }

    public String getVraagTekst() {
        return vraagTekst;
    }

    public void setVraagTekst(String vraagTekst) {
        this.vraagTekst = vraagTekst;
    }

    public boolean isActueel() {
        return isActueel;
    }

    public void setActueel(boolean actueel) {
        isActueel = actueel;
    }

    public int getVraagId() {
        return vraagId;
    }

    public void setVraagId(int vraagId) {
        this.vraagId = vraagId;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }



}
