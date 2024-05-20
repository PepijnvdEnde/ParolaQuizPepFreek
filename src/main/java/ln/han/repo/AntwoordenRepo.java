package ln.han.repo;

import ln.han.Antwoord;

import java.util.ArrayList;

import static ln.han.Letter.*;

public class AntwoordenRepo {
    private final ArrayList<Antwoord> antwoorden = new ArrayList<>();

    public AntwoordenRepo() {
        // muziek antwoorden
        antwoorden.add(new Antwoord(new ArrayList<>() {{
            add("Trompet");
            add("c");
        }}, 1, T));
        antwoorden.add(new Antwoord("Eminem", 2, E));
        antwoorden.add(new Antwoord(new ArrayList<>() {{
            add("Freddie Mercury");
            add("a");
        }}, 3, F));
        antwoorden.add(new Antwoord("Thriller", 4, M));
        antwoorden.add(new Antwoord(new ArrayList<>() {{
            add("Lindsey Stirling");
            add("d");
        }}, 5, L));
        antwoorden.add(new Antwoord("Mick Jagger", 6, M));
        antwoorden.add(new Antwoord(new ArrayList<>() {{
            add("Saxofoon");
            add("a");
        }}, 7, S));
        antwoorden.add(new Antwoord("Kurt Cobain", 8, K));
        // sport antwoorden
        antwoorden.add(new Antwoord(new ArrayList<>() {{
            add("Golf");
            add("B");
        }}, 9, G));
        antwoorden.add(new Antwoord("9", 10, N));
        antwoorden.add(new Antwoord(new ArrayList<>() {{
            add("Verenigde Staten");
            add("C");
        }}, 11, E));
        antwoorden.add(new Antwoord("3", 12, D));
        antwoorden.add(new Antwoord(new ArrayList<>() {{
            add("5");
            add("D");
        }}, 13, I));
        antwoorden.add(new Antwoord("Usain Bolt", 14, U));
        antwoorden.add(new Antwoord(new ArrayList<>() {{
            add("Zwemmen");
            add("d");
        }}, 15, S));
        antwoorden.add(new Antwoord("11", 16, E));
        // taal antwoorden
        antwoorden.add(new Antwoord(new ArrayList<>() {{
            add("India");
            add("a");
        }}, 17, I));
        antwoorden.add(new Antwoord(new ArrayList<>() {{
            add("Waar");
            add("a");
        }}, 18, E));
        antwoorden.add(new Antwoord(new ArrayList<>() {{
            add("Portugees");
            add("c");
        }}, 19, P));
        antwoorden.add(new Antwoord("29", 20, N));
        antwoorden.add(new Antwoord(new ArrayList<>() {{
            add("Mandarijn");
            add("b");
        }}, 21, M));
        antwoorden.add(new Antwoord(new ArrayList<>() {{
            add("Grieks");
            add("a");
        }}, 22, G));
        antwoorden.add(new Antwoord(new ArrayList<>() {{
            add("dan");
            add("b");
        }}, 23, D));
        antwoorden.add(new Antwoord(new ArrayList<>() {{
            add("Niet waar");
            add("b");
        }}, 24, N));
        // geografie antwoorden
        antwoorden.add(new Antwoord(new ArrayList<>() {{
            add("Rusland");
            add("c");
        }}, 25, R));
        antwoorden.add(new Antwoord(new ArrayList<>() {{
            add("beijing");
            add("peking");
        }}, 26, P));
        antwoorden.add(new Antwoord(new ArrayList<>() {{
            add("Canberra");
            add("d");
        }}, 27, C));
        antwoorden.add(new Antwoord("7", 28, Z));
        antwoorden.add(new Antwoord(new ArrayList<>() {{
            add("Stille Oceaan");
            add("b");
        }}, 29, S));
        antwoorden.add(new Antwoord("195", 30, N));
        antwoorden.add(new Antwoord(new ArrayList<>() {{
            add("Reykjavik");
            add("c");
        }}, 31, R));
        antwoorden.add(new Antwoord("3", 32, D));
    }
    
    public Antwoord getAntwoordenById(int i) {
        for (Antwoord antwoord : antwoorden) {
            if (antwoord.getId() == i) {
                return antwoord;
            }
        }
        return null;
    }
}

