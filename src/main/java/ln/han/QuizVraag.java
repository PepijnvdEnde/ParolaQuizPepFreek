package ln.han;

public abstract class QuizVraag {

    public String vraagTekst;
    public boolean isActueel;
    public int vraagId;

    public QuizVraag(String vraagTekst, boolean isActueel, int vraagId) {
        this.vraagTekst = vraagTekst;
        this.isActueel = isActueel;
        this.vraagId = vraagId;
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



}
