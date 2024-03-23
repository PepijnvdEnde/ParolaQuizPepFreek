package ln.han.repo;

import ln.han.Categorie;
import ln.han.MeerkeuzeQuizVraag;
import ln.han.OpenQuizVraag;
import ln.han.QuizVraag;

import java.util.ArrayList;

import static ln.han.Categorie.*;

public class VraagRepo {

    private final ArrayList<QuizVraag> vragen = new ArrayList<>();

    public VraagRepo() {
        // 8 Muziek vragen
        // antwoord: Trompet
        vragen.add(new MeerkeuzeQuizVraag("Welke van de volgende instrumenten behoort tot de koperblazers?", true, 1, MUZIEK,
                new ArrayList<>() {{
                    add("Viool");
                    add("Fluit");
                    add("Trompet");
                    add("Gitaar");
                }}));
        // antwoord:Eminem
        vragen.add(new OpenQuizVraag("Wat is de artiestnaam van de rapper Marshall Bruce Mathers III?", true, 2, MUZIEK));
        // antwoord: Freddie Mercury
        vragen.add(new MeerkeuzeQuizVraag("Wie is de leadzanger van de band \"Queen\"?", true, 3, MUZIEK,
                new ArrayList<>() {{
                    add("Freddie Mercury");
                    add("John Lennon");
                    add("Mick Jagger");
                    add("Elton John");
                }}));
        // antwoord: Thriller
        vragen.add(new OpenQuizVraag("Wat is de naam van het iconische album van Michael Jackson uit 1982 dat meer dan 65 miljoen exemplaren heeft verkocht wereldwijd?", true, 4, MUZIEK));
        // antwoord: Lindsey Stirling
        vragen.add(new MeerkeuzeQuizVraag("Welke muzikant staat bekend om het spelen van een viool met een oranje haarstijl en elektronische muziek te combineren?", true, 5, MUZIEK,
                new ArrayList<>() {{
                    add("David Garrett");
                    add("Vanessa Mae");
                    add("Nigel Kennedy");
                    add("Lindsey Stirling");
                }}));
        // antwoord: Mick Jagger
        vragen.add(new OpenQuizVraag("Hoe heet de zanger van de band \"The Rolling Stones\"?", true, 6, MUZIEK));
        // antwoord: Saxofoon
        vragen.add(new MeerkeuzeQuizVraag("Welk instrument wordt bespeeld door Kenny G, een van de meest succesvolle smooth jazz-artiesten?", true, 7, MUZIEK,
                new ArrayList<>() {{
                    add("Saxofoon");
                    add("Trompet");
                    add("Klarinet");
                    add("Fluit");
                }}));
        // antwoord: Kurt Cobain
        vragen.add(new OpenQuizVraag("Hoe heet de zanger van de band \"Nirvana\"?", true, 8, MUZIEK));

        // 8 Sport vragen
        // antwoord: Golf
        vragen.add(new MeerkeuzeQuizVraag("In welke sport wordt de term \"Birdie\" gebruikt?", true, 9, SPORT,
                new ArrayList<>() {{
                    add("Tennis");
                    add("Golf");
                    add("Voetbal");
                    add("Basketbal");
                }}));
        // antwoord: 9
        vragen.add(new OpenQuizVraag("Hoeveel spelers zijn er in een baseball team?", true, 10, SPORT));
        // antwoord: verenigde staten
        vragen.add(new MeerkeuzeQuizVraag("Welk land heeft de meeste medailles gewonnen in de geschiedenis van de Olympische Zomerspelen?", true, 11, SPORT,
                new ArrayList<>() {{
                    add("China");
                    add("Rusland");
                    add("Verenigde Staten");
                    add("Duitsland");
                }}));
        // antwoord: 3
        vragen.add(new OpenQuizVraag("Hoeveel punten is een basketbalveld waard als de speler buiten de driepuntslijn scoort?", true, 12, SPORT));
        // antwoord: 5
        vragen.add(new MeerkeuzeQuizVraag("Hoeveel spelers zijn er in een standaard basketbalteam op het veld tijdens een wedstrijd?", true, 13, SPORT,
                new ArrayList<>() {{
                    add("6");
                    add("7");
                    add("8");
                    add("5");
                }}));
        // antwoord: usain bolt
        vragen.add(new OpenQuizVraag("Wie heeft het wereldrecord op de 100 meter sprint?", true, 14, SPORT));
        // antwoord: Zwemmen
        vragen.add(new MeerkeuzeQuizVraag("In welke sport heeft Michael Phelps de meeste Olympische medailles gewonnen?", true, 15, SPORT,
                new ArrayList<>() {{
                    add("Atletiek");
                    add("Turnen");
                    add("Wielrennen");
                    add("Zwemmen");
                }}));
        // antwoord: 11
        vragen.add(new OpenQuizVraag("Hoeveel spelers zijn er in een voetbalteam?", true, 16, SPORT));

        // 8 Taal vragen
        // antwoord: India
        vragen.add(new MeerkeuzeQuizVraag("Welk land heeft de meeste officiële talen?", true, 17, TAAL,
                new ArrayList<>() {{
                    add("India");
                    add("China");
                    add("Verenigde Staten");
                    add("Rusland");
                }}));
        // antwoord: waar
        vragen.add(new MeerkeuzeQuizVraag("Waar of niet waar: \"Buffalo buffalo Buffalo buffalo buffalo buffalo Buffalo buffalo\" is een correcte zin in het Engels.", true, 18, TAAL,
                new ArrayList<>() {{
                    add("Waar");
                    add("Niet waar");
                }}));
        // antwoord: Portugees
        vragen.add(new MeerkeuzeQuizVraag("Wat is de officiële taal van Brazilië?", true, 19, TAAL,
                new ArrayList<>() {{
                    add("Spaans");
                    add("Engels");
                    add("Portugees");
                    add("Frans");
                }}));
        // antwoord: 29
        vragen.add(new OpenQuizVraag("Hoeveel letters heeft het Zweeds alfabet?", true, 20, TAAL));
        // antwoord: Mandarijn
        vragen.add(new MeerkeuzeQuizVraag("Wat is de meest gesproken taal ter wereld?", true, 21, TAAL,
                new ArrayList<>() {{
                    add("Engels");
                    add("Mandarijn");
                    add("Hindi");
                    add("Spaans");
                }}));
        // antwoord: Grieks
        vragen.add(new MeerkeuzeQuizVraag("Waar komt de naam alfabet vandaan?", true, 22, TAAL,
                new ArrayList<>() {{
                    add("Grieks");
                    add("Latijn");
                    add("Arabisch");
                    add("Hebreeuws");
                }}));
        // antwoord: dan
        vragen.add(new MeerkeuzeQuizVraag("In de zin \"Ik ben groter ___ jij\", welk woord moet er op de plek van de streepjes komen?", true, 23, TAAL,
                new ArrayList<>() {{
                    add("als");
                    add("dan");
                    add("dan als");
                    add("als dan");
                }}));
        // antwoord: Niet Waar
        vragen.add(new MeerkeuzeQuizVraag("Fries is ontstaan uit het Nederlands.", true, 24, TAAL,
                new ArrayList<>() {{
                    add("Waar");
                    add("Niet waar");
                }}));

        // 8 Geografie vragen
        // antwoord: Rusland
        vragen.add(new MeerkeuzeQuizVraag("Welk land heeft de meeste tijdzones ter wereld?", true, 25, GEOGRAFIE,
                new ArrayList<>() {{
                    add("Verenigde Staten");
                    add("China");
                    add("Rusland");
                    add("Australië");
                }}));
        // antwoord: peking of beijing
        vragen.add(new OpenQuizVraag("Hoe heet de hoofdstad van China?", true, 26, GEOGRAFIE));
        // antwoord: Canberra
        vragen.add(new MeerkeuzeQuizVraag("Wat is de hoofdstad van Australië?", true, 27, GEOGRAFIE,
                new ArrayList<>() {{
                    add("Sydney");
                    add("Melbourne");
                    add("Perth");
                    add("Canberra");
                }}));
        // antwoord: 7
        vragen.add(new OpenQuizVraag("Hoeveel continenten zijn er op aarde?", true, 28, GEOGRAFIE));
        // antwoord: Stille Oceaan
        vragen.add(new MeerkeuzeQuizVraag("Wat is de grootste oceaan ter wereld?", true, 29, GEOGRAFIE,
                new ArrayList<>() {{
                    add("Atlantische Oceaan");
                    add("Stille Oceaan");
                    add("Arctische Oceaan");
                    add("Indische Oceaan");
                }}));
        // antwoord: 195
        vragen.add(new OpenQuizVraag("Hoeveel landen zijn er op aarde? Volgens de VN", true, 30, GEOGRAFIE));
        // antwoord: Reykjavik
        vragen.add(new MeerkeuzeQuizVraag("Wat is de meest noordelijke hoofdstad ter wereld?", true, 31, GEOGRAFIE,
                new ArrayList<>() {{
                    add("Oslo");
                    add("Helsinki");
                    add("Reykjavik");
                    add("Tallinn");
                }}));

        // antwoord: 3
        vragen.add(new OpenQuizVraag("Hoeveel landen delen het eiland Borneo?", true, 32, GEOGRAFIE));
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
