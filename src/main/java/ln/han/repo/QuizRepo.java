package ln.han.repo;

import ln.han.Categorie;
import ln.han.PuntenTelling;
import ln.han.Quiz;
import ln.han.Speler;

import static ln.han.Categorie.*;

public class QuizRepo {

    private final Quiz muziekQuiz;

    private final Quiz sportQuiz;

    private final Quiz taalQuiz;

    private final Quiz geografieQuiz;

    VraagRepo vraagRepo = new VraagRepo();

    AntwoordenRepo antwoordenRepo = new AntwoordenRepo();



    public QuizRepo(Speler speler, PuntenTelling puntenTelling) {
        muziekQuiz = new Quiz(puntenTelling, speler);
        sportQuiz = new Quiz(puntenTelling, speler);
        taalQuiz = new Quiz(puntenTelling, speler);
        geografieQuiz = new Quiz(puntenTelling, speler);
        muziekQuiz.setQuizVragen(vraagRepo.getVragenByCategorie(MUZIEK));
        muziekQuiz.setAntwoorden(antwoordenRepo.getAntwoordenByCategorie(MUZIEK));
        sportQuiz.setQuizVragen(vraagRepo.getVragenByCategorie(SPORT));
        sportQuiz.setAntwoorden(antwoordenRepo.getAntwoordenByCategorie(SPORT));
        taalQuiz.setQuizVragen(vraagRepo.getVragenByCategorie(TAAL));
        taalQuiz.setAntwoorden(antwoordenRepo.getAntwoordenByCategorie(TAAL));
        geografieQuiz.setQuizVragen(vraagRepo.getVragenByCategorie(GEOGRAFIE));
        geografieQuiz.setAntwoorden(antwoordenRepo.getAntwoordenByCategorie(GEOGRAFIE));

    }

    public Quiz getQuizByCategorie(Categorie categorie) {
        return switch (categorie) {
            case MUZIEK -> muziekQuiz;
            case SPORT -> sportQuiz;
            case TAAL -> taalQuiz;
            case GEOGRAFIE -> geografieQuiz;
        };
    }


}
