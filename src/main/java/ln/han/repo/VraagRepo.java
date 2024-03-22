package ln.han.repo;

import ln.han.MeerkeuzeQuizVraag;
import ln.han.OpenQuizVraag;
import ln.han.QuizVraag;

import java.util.ArrayList;

import static ln.han.repo.Categorie.*;

public class VraagRepo {

    private ArrayList<QuizVraag> vragen = new ArrayList<>();

    public VraagRepo() {
        //Geografie vragen
        vragen.add(new MeerkeuzeQuizVraag("Wat is de hoofdstad van Nederland?", true, 1, GEOGRAFIE, new ArrayList<String>() {{
            add("Amsterdam");
            add("Rotterdam");
            add("Den Haag");
            add("Utrecht");
        }}));
        vragen.add(new OpenQuizVraag("Hoeveel inwoners heeft Nederland?", true, 2, GEOGRAFIE));
        vragen.add(new MeerkeuzeQuizVraag("Hoeveel provincies heeft Nederland?", true, 3, GEOGRAFIE, new ArrayList<String>() {{
            add("10");
            add("11");
            add("12");
            add("13");
        }}));
        // Sport vragen
        vragen.add(new OpenQuizVraag("Hoeveel spelers staan er in een voetbalteam?", true, 4, SPORT));
        vragen.add(new MeerkeuzeQuizVraag("Hoeveel medailles heeft Nederland gewonnen op de Olympische Spelen?", true, 5, SPORT, new ArrayList<String>() {{
            add("100");
            add("200");
            add("300");
            add("400");
        }}));
        vragen.add(new OpenQuizVraag("Hoeveel Grand Slam toernooien zijn er in het tennis?", true, 6, SPORT));
        // Muziek vragen
        vragen.add(new OpenQuizVraag("Hoeveel noten zijn er in een octaaf?", true, 7, MUZIEK));
        vragen.add(new MeerkeuzeQuizVraag("Hoeveel albums heeft de band The Beatles uitgebracht?", true, 8, MUZIEK, new ArrayList<String>() {{
            add("10");
            add("20");
            add("30");
            add("40");
        }}));
        vragen.add(new OpenQuizVraag("Hoeveel snaren heeft een viool?", true, 9, MUZIEK));
        // Taal vragen
        vragen.add(new MeerkeuzeQuizVraag("Hoeveel letters heeft het Nederlandse alfabet?", true, 10, TAAL, new ArrayList<String>() {{
            add("26");
            add("27");
            add("28");
            add("29");
        }}));
        vragen.add(new OpenQuizVraag("Hoeveel woorden heeft de gemiddelde Nederlander in zijn of haar vocabulaire?", true, 11, TAAL));
        vragen.add(new MeerkeuzeQuizVraag("Hoeveel talen worden er in Nederland gesproken?", true, 12, TAAL, new ArrayList<String>() {{
            add("1");
            add("2");
            add("3");
            add("4");
        }}));

    }

    public ArrayList<QuizVraag> getVragen() {
        return vragen;
    }

    public void setVragen(ArrayList<QuizVraag> vragen) {
        this.vragen = vragen;
    }

    public void addVraag(QuizVraag vraag) {
        vragen.add(vraag);
    }

    public void removeVraag(QuizVraag vraag) {
        vragen.remove(vraag);
    }

    public void updateVraag(QuizVraag oudeVraag, QuizVraag nieuweVraag) {
        vragen.set(vragen.indexOf(oudeVraag), nieuweVraag);
    }

    public QuizVraag getVraag(int index) {
        return vragen.get(index);
    }

    public QuizVraag getVraagById(int id) {
        for (QuizVraag vraag : vragen) {
            if (vraag.getVraagId() == id) {
                return vraag;
            }
        }
        return null;
    }
}
