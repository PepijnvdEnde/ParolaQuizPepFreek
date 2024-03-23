package ln.han.repo;

import ln.han.Antwoord;
import ln.han.Categorie;

import java.util.ArrayList;

import static ln.han.Letter.*;
public class AntwoordenRepo {
    private ArrayList<Antwoord> muziekAntwoorden = new ArrayList<>();
    private ArrayList<Antwoord> sportAntwoorden = new ArrayList<>();
    private ArrayList<Antwoord> taalAntwoorden = new ArrayList<>();
    private ArrayList<Antwoord> geografieAntwoorden = new ArrayList<>();

    public AntwoordenRepo() {
        // muziek antwoorden
        muziekAntwoorden.add(new Antwoord(new ArrayList<String>() {{add("Trompet"); add("c");}}, 1, T));
        muziekAntwoorden.add(new Antwoord("Eminem", 2, E));
        muziekAntwoorden.add(new Antwoord(new ArrayList<String>() {{add("Freddie Mercury"); add("a");}}, 3, F));
        muziekAntwoorden.add(new Antwoord("Thriller", 4, M));
        muziekAntwoorden.add(new Antwoord(new ArrayList<String>() {{add("Lindsey Stirling"); add("d");}}, 5, L));
        muziekAntwoorden.add(new Antwoord("Mick Jagger", 6, M));
        muziekAntwoorden.add(new Antwoord(new ArrayList<String>() {{add("Saxofoon"); add("a");}}, 7, S));
        muziekAntwoorden.add(new Antwoord("Kurt Cobain", 8, K));
        // sport antwoorden
        sportAntwoorden.add(new Antwoord(new ArrayList<String>() {{add("Golf"); add("B");}}, 9, G));
        sportAntwoorden.add(new Antwoord("9", 10, N));
        sportAntwoorden.add(new Antwoord(new ArrayList<String>() {{add("Verenigde Staten"); add("C");}}, 11, V));
        sportAntwoorden.add(new Antwoord("3", 12, D));
        sportAntwoorden.add(new Antwoord(new ArrayList<String>() {{add("5"); add("D");}}, 13, V));
        sportAntwoorden.add(new Antwoord("Usain Bolt", 14, U));
        sportAntwoorden.add(new Antwoord(new ArrayList<String>() {{add("Zwemmen"); add("d");}}, 15, Z));
        sportAntwoorden.add(new Antwoord("11", 16, E));
        // taal antwoorden
        taalAntwoorden.add(new Antwoord(new ArrayList<String>() {{add("India"); add("a");}}, 17, I));
        taalAntwoorden.add(new Antwoord(new ArrayList<String>() {{add("Waar"); add("a");}}, 18, W));
        taalAntwoorden.add(new Antwoord(new ArrayList<String>() {{add("Portugees"); add("c");}}, 19, P));
        taalAntwoorden.add(new Antwoord("29", 20, N));
        taalAntwoorden.add(new Antwoord(new ArrayList<String>() {{add("Mandarijn"); add("b");}}, 21, M));
        taalAntwoorden.add(new Antwoord(new ArrayList<String>() {{add("Grieks"); add("a");}}, 22, G));
        taalAntwoorden.add(new Antwoord(new ArrayList<String>() {{add("dan"); add("b");}}, 23, D));
        taalAntwoorden.add(new Antwoord(new ArrayList<String>() {{add("Niet waar"); add("b");}}, 24, N));
        // geografie antwoorden
        geografieAntwoorden.add(new Antwoord(new ArrayList<String>() {{add("Rusland"); add("c");}}, 25, R));
        geografieAntwoorden.add(new Antwoord(new ArrayList<String>() {{add("beijing"); add("peking");}}, 26, P));
        geografieAntwoorden.add(new Antwoord(new ArrayList<String>() {{add("Canberra"); add("d");}}, 27, C));
        geografieAntwoorden.add(new Antwoord("7", 28, Z));
        geografieAntwoorden.add(new Antwoord(new ArrayList<String>() {{add("Stille Oceaan"); add("b");}}, 29, S));
        geografieAntwoorden.add(new Antwoord("195", 30, N));
        geografieAntwoorden.add(new Antwoord(new ArrayList<String>() {{add("Reykjavik"); add("c");}}, 31, R));
        geografieAntwoorden.add(new Antwoord("3", 32, D));
    }

    public ArrayList<Antwoord> getMuziekAntwoorden() {
        return muziekAntwoorden;
    }

    public ArrayList<Antwoord> getSportAntwoorden() {
        return sportAntwoorden;
    }

    public ArrayList<Antwoord> getTaalAntwoorden() {
        return taalAntwoorden;
    }

    public ArrayList<Antwoord> getGeografieAntwoorden() {
        return geografieAntwoorden;
    }

    public ArrayList<Antwoord> getAntwoordenByCategorie(Categorie categorie) {
        switch (categorie) {
            case MUZIEK:
                return muziekAntwoorden;
            case SPORT:
                return sportAntwoorden;
            case TAAL:
                return taalAntwoorden;
            case GEOGRAFIE:
                return geografieAntwoorden;
            default:
                return null;
        }
    }


}
