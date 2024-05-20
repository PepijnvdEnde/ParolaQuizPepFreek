package ln.han.repo;

import ln.han.Categorie;
import ln.han.Quiz;

import static ln.han.Categorie.*;

public class QuizRepo {

    private final Quiz muziekQuiz = new Quiz();

    private final Quiz sportQuiz = new Quiz();

    private final Quiz taalQuiz = new Quiz();

    private final Quiz geografieQuiz = new Quiz();

    VraagRepo vraagRepo = new VraagRepo();


    public QuizRepo() {
        // set muziek vragen en antwoorden
        muziekQuiz.setQuizVragen(vraagRepo.getVragenByCategorie(MUZIEK));
        // set sport vragen en antwoorden
        sportQuiz.setQuizVragen(vraagRepo.getVragenByCategorie(SPORT));
        // set taal vragen en antwoorden
        taalQuiz.setQuizVragen(vraagRepo.getVragenByCategorie(TAAL));
        // set geografie vragen en antwoorden
        geografieQuiz.setQuizVragen(vraagRepo.getVragenByCategorie(GEOGRAFIE));
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
