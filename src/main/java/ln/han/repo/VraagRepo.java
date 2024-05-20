package ln.han.repo;

import ln.han.Categorie;
import ln.han.MeerkeuzeQuizVraag;
import ln.han.OpenQuizVraag;
import ln.han.QuizVraag;

import java.util.ArrayList;

import static ln.han.Categorie.*;

public class VraagRepo {

    private final ArrayList<QuizVraag> vragen = new ArrayList<>();
    AntwoordenRepo antwoordenRepo = new AntwoordenRepo();

    public VraagRepo() {
        // 8 Muziek vragen
        // antwoord: Trompet
        vragen.add(new MeerkeuzeQuizVraag("Welke van de volgende instrumenten behoort tot de koperblazers?", MUZIEK,
                new ArrayList<>() {{
                    add("Viool");
                    add("Fluit");
                    add("Trompet");
                    add("Gitaar");
                }},  antwoordenRepo.getAntwoordenById(1)));
        // antwoord:Eminem
        vragen.add(new OpenQuizVraag("Wat is de artiestnaam van de rapper Marshall Bruce Mathers III?", MUZIEK, antwoordenRepo.getAntwoordenById(2)));
        // antwoord: Freddie Mercury
        vragen.add(new MeerkeuzeQuizVraag("Wie is de leadzanger van de band \"Queen\"?", MUZIEK,
                new ArrayList<>() {{
                    add("Freddie Mercury");
                    add("John Lennon");
                    add("Mick Jagger");
                    add("Elton John");
                }}, antwoordenRepo.getAntwoordenById(3)));
        // antwoord: Thriller
        vragen.add(new OpenQuizVraag("Wat is de naam van het iconische album van Michael Jackson uit 1982 dat meer dan 65 miljoen exemplaren heeft verkocht wereldwijd?", MUZIEK, antwoordenRepo.getAntwoordenById(4)));
        // antwoord: Lindsey Stirling
        vragen.add(new MeerkeuzeQuizVraag("Welke muzikant staat bekend om het spelen van een viool met een oranje haarstijl en elektronische muziek te combineren?", MUZIEK,
                new ArrayList<>() {{
                    add("David Garrett");
                    add("Vanessa Mae");
                    add("Nigel Kennedy");
                    add("Lindsey Stirling");
                }}, antwoordenRepo.getAntwoordenById(5)));
        // antwoord: Mick Jagger
        vragen.add(new OpenQuizVraag("Hoe heet de zanger van de band \"The Rolling Stones\"?", MUZIEK, antwoordenRepo.getAntwoordenById(6)));
        // antwoord: Saxofoon
        vragen.add(new MeerkeuzeQuizVraag("Welk instrument wordt bespeeld door Kenny G, een van de meest succesvolle smooth jazz-artiesten?", MUZIEK,
                new ArrayList<>() {{
                    add("Saxofoon");
                    add("Trompet");
                    add("Klarinet");
                    add("Fluit");
                }}, antwoordenRepo.getAntwoordenById(7)));
        // antwoord: Kurt Cobain
        vragen.add(new OpenQuizVraag("Hoe heet de zanger van de band \"Nirvana\"?", MUZIEK, antwoordenRepo.getAntwoordenById(8)));

        // 8 Sport vragen
        // antwoord: Golf
        vragen.add(new MeerkeuzeQuizVraag("In welke sport wordt de term \"Birdie\" gebruikt?", SPORT,
                new ArrayList<>() {{
                    add("Tennis");
                    add("Golf");
                    add("Voetbal");
                    add("Basketbal");
                }}, antwoordenRepo.getAntwoordenById(9)));
        // antwoord: 9
        vragen.add(new OpenQuizVraag("Hoeveel spelers zijn er in een baseball team?", SPORT, antwoordenRepo.getAntwoordenById(10)));
        // antwoord: verenigde staten
        vragen.add(new MeerkeuzeQuizVraag("Welk land heeft de meeste medailles gewonnen in de geschiedenis van de Olympische Zomerspelen?", SPORT,
                new ArrayList<>() {{
                    add("China");
                    add("Rusland");
                    add("Verenigde Staten");
                    add("Duitsland");
                }}, antwoordenRepo.getAntwoordenById(11)));
        // antwoord: 3
        vragen.add(new OpenQuizVraag("In basketbal, hoeveel punten is een treffer waard als de speler buiten de buitenste lijn bij de hoop scoort?", SPORT, antwoordenRepo.getAntwoordenById(12)));
        // antwoord: 5
        vragen.add(new MeerkeuzeQuizVraag("Hoeveel spelers zijn er in een standaard basketbalteam op het veld tijdens een wedstrijd?", SPORT,
                new ArrayList<>() {{
                    add("6");
                    add("7");
                    add("8");
                    add("5");
                }}, antwoordenRepo.getAntwoordenById(13)));
        // antwoord: usain bolt
        vragen.add(new OpenQuizVraag("Wie heeft het wereldrecord op de 100 meter sprint?", SPORT, antwoordenRepo.getAntwoordenById(14)));
        // antwoord: Zwemmen
        vragen.add(new MeerkeuzeQuizVraag("In welke sport heeft Michael Phelps de meeste Olympische medailles gewonnen?", SPORT,
                new ArrayList<>() {{
                    add("Atletiek");
                    add("Turnen");
                    add("Wielrennen");
                    add("Zwemmen");
                }}, antwoordenRepo.getAntwoordenById(15)));
        // antwoord: 11
        vragen.add(new OpenQuizVraag("Hoeveel spelers zijn er in een voetbalteam?", SPORT, antwoordenRepo.getAntwoordenById(16)));

        // 8 Taal vragen
        // antwoord: India
        vragen.add(new MeerkeuzeQuizVraag("Welk land heeft de meeste officiële talen?", TAAL,
                new ArrayList<>() {{
                    add("India");
                    add("China");
                    add("Verenigde Staten");
                    add("Rusland");
                }}, antwoordenRepo.getAntwoordenById(17)));
        // antwoord: waar
        vragen.add(new MeerkeuzeQuizVraag("Waar of niet waar: \"Buffalo buffalo Buffalo buffalo buffalo buffalo Buffalo buffalo\" is een correcte zin in het Engels.", TAAL,
                new ArrayList<>() {{
                    add("Waar");
                    add("Niet waar");
                }}, antwoordenRepo.getAntwoordenById(18)));
        // antwoord: Portugees
        vragen.add(new MeerkeuzeQuizVraag("Wat is de officiële taal van Brazilië?", TAAL,
                new ArrayList<>() {{
                    add("Spaans");
                    add("Engels");
                    add("Portugees");
                    add("Frans");
                }}, antwoordenRepo.getAntwoordenById(19)));
        // antwoord: 29
        vragen.add(new OpenQuizVraag("Hoeveel letters heeft het Zweeds alfabet?", TAAL, antwoordenRepo.getAntwoordenById(20)));
        // antwoord: Mandarijn
        vragen.add(new MeerkeuzeQuizVraag("Wat is de meest gesproken taal ter wereld?", TAAL,
                new ArrayList<>() {{
                    add("Engels");
                    add("Mandarijn");
                    add("Hindi");
                    add("Spaans");
                }}, antwoordenRepo.getAntwoordenById(21)));
        // antwoord: Grieks
        vragen.add(new MeerkeuzeQuizVraag("Waar komt de naam alfabet vandaan?", TAAL,
                new ArrayList<>() {{
                    add("Grieks");
                    add("Latijn");
                    add("Arabisch");
                    add("Hebreeuws");
                }}, antwoordenRepo.getAntwoordenById(22)));
        // antwoord: dan
        vragen.add(new MeerkeuzeQuizVraag("In de zin \"Ik ben groter ___ jij\", welk woord moet er op de plek van de streepjes komen?", TAAL,
                new ArrayList<>() {{
                    add("als");
                    add("dan");
                    add("dan als");
                    add("als dan");
                }}, antwoordenRepo.getAntwoordenById(23)));
        // antwoord: Niet Waar
        vragen.add(new MeerkeuzeQuizVraag("Fries is ontstaan uit het Nederlands.", TAAL,
                new ArrayList<>() {{
                    add("Waar");
                    add("Niet waar");
                }}, antwoordenRepo.getAntwoordenById(24)));

        // 8 Geografie vragen
        // antwoord: Rusland
        vragen.add(new MeerkeuzeQuizVraag("Welk land heeft de meeste tijdzones ter wereld?", GEOGRAFIE,
                new ArrayList<>() {{
                    add("Verenigde Staten");
                    add("China");
                    add("Rusland");
                    add("Australië");
                }}, antwoordenRepo.getAntwoordenById(25)));
        // antwoord: peking of beijing
        vragen.add(new OpenQuizVraag("Hoe heet de hoofdstad van China?", GEOGRAFIE, antwoordenRepo.getAntwoordenById(26)));
        // antwoord: Canberra
        vragen.add(new MeerkeuzeQuizVraag("Wat is de hoofdstad van Australië?", GEOGRAFIE,
                new ArrayList<>() {{
                    add("Sydney");
                    add("Melbourne");
                    add("Perth");
                    add("Canberra");
                }}, antwoordenRepo.getAntwoordenById(27)));
        // antwoord: 7
        vragen.add(new OpenQuizVraag("Hoeveel continenten zijn er op aarde?", GEOGRAFIE, antwoordenRepo.getAntwoordenById(28)));
        // antwoord: Stille Oceaan
        vragen.add(new MeerkeuzeQuizVraag("Wat is de grootste oceaan ter wereld?", GEOGRAFIE,
                new ArrayList<>() {{
                    add("Atlantische Oceaan");
                    add("Stille Oceaan");
                    add("Arctische Oceaan");
                    add("Indische Oceaan");
                }}, antwoordenRepo.getAntwoordenById(29)));
        // antwoord: 195
        vragen.add(new OpenQuizVraag("Hoeveel landen zijn er op aarde? Volgens de VN", GEOGRAFIE, antwoordenRepo.getAntwoordenById(30)));
        // antwoord: Reykjavik
        vragen.add(new MeerkeuzeQuizVraag("Wat is de meest noordelijke hoofdstad ter wereld?", GEOGRAFIE,
                new ArrayList<>() {{
                    add("Oslo");
                    add("Helsinki");
                    add("Reykjavik");
                    add("Tallinn");
                }}, antwoordenRepo.getAntwoordenById(31)));

        // antwoord: 3
        vragen.add(new OpenQuizVraag("Hoeveel landen delen het eiland Borneo?", GEOGRAFIE, antwoordenRepo.getAntwoordenById(32)));
    }

    public ArrayList<QuizVraag> getVragenByCategorie(Categorie categorie) {
        ArrayList<QuizVraag> vragenByCategorie = new ArrayList<>();
        for (QuizVraag vraag : vragen) {
            if (vraag.getCategorie() == categorie) {
                vragenByCategorie.add(vraag);
            }
        }
        return vragenByCategorie;
    }

}
