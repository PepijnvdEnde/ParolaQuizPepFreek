package ln.han.repo;

import ln.han.Categorie;
import ln.han.Quiz;

import static ln.han.Categorie.*;

public class QuizRepo {

    private final Quiz muziekQuiz = new Quiz();

    private final Quiz sportQuiz = new Quiz();

    private final Quiz taalQuiz = new Quiz();

    private final Quiz geografieQuiz = new Quiz();

    private final VraagRepo vraagRepo = new VraagRepo();


    public QuizRepo() {
        // set muziek vragen en antwoorden
        muziekQuiz.setQuizVragen(vraagRepo.getWillkeurigeVragenVanCategorie(MUZIEK));
        // set sport vragen en antwoorden
        sportQuiz.setQuizVragen(vraagRepo.getWillkeurigeVragenVanCategorie(SPORT));
        // set taal vragen en antwoorden
        taalQuiz.setQuizVragen(vraagRepo.getWillkeurigeVragenVanCategorie(TAAL));
        // set geografie vragen en antwoorden
        geografieQuiz.setQuizVragen(vraagRepo.getWillkeurigeVragenVanCategorie(GEOGRAFIE));
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
