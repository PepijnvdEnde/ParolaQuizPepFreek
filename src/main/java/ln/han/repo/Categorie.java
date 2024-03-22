package ln.han.repo;

public enum Categorie {
    MUZIEK("Muziek"),
    SPORT("Sport"),
    TAAL("Taal"),
    GEOGRAFIE("Geografie");

    private String naam;

    Categorie(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }
}
