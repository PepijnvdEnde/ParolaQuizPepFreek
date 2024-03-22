package ln.han.repo;

import ln.han.Antwoord;

import java.util.ArrayList;

import static ln.han.Letter.*;

public class AntwoordenRepo {

    private ArrayList<Antwoord> antwoorden = new ArrayList<>();

    public AntwoordenRepo() {
        //Geografie vragen
        antwoorden.add(new Antwoord("Amsterdam", 1, A));
        antwoorden.add(new Antwoord("17 miljoen", 2, I));
        antwoorden.add(new Antwoord("12", 3, P));
        // Sport vragen
        antwoorden.add(new Antwoord("11", 4, V));
        antwoorden.add(new Antwoord("300", 5,M));
        antwoorden.add(new Antwoord("4", 6, E));
        // Muziek vragen
        antwoorden.add(new Antwoord("7", 7, M));
        antwoorden.add(new Antwoord("30", 8, U));
        antwoorden.add(new Antwoord("4", 9, E));
        // Taal vragen
        antwoorden.add(new Antwoord("26", 10, Z));
        antwoorden.add(new Antwoord("40.000", 11, N));
        antwoorden.add(new Antwoord("2", 12, W));
    }

    public ArrayList<Antwoord> getAntwoorden() {
        return antwoorden;
    }

    public void setAntwoorden(ArrayList<Antwoord> antwoorden) {
        this.antwoorden = antwoorden;
    }

    public void addAntwoord(Antwoord antwoord) {
        antwoorden.add(antwoord);
    }

    public void removeAntwoord(Antwoord antwoord) {
        antwoorden.remove(antwoord);
    }

    public Antwoord getAntwoordByVraagId(int vraagId) {
        for (Antwoord antwoord : antwoorden) {
            if (antwoord.getVraagId() == vraagId) {
                return antwoord;
            }
        }
        return null;
    }




}
