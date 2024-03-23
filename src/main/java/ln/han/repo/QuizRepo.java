package ln.han.repo;

import ln.han.Quiz;

import java.util.ArrayList;

import static ln.han.Categorie.*;

public class QuizRepo {

    private Quiz muziekQuiz;

    private Quiz sportQuiz;

    private Quiz taalQuiz;

    private Quiz geografieQuiz;

    VraagRepo vraagRepo = new VraagRepo();

    AntwoordenRepo antwoordenRepo = new AntwoordenRepo();



    public QuizRepo() {
        muziekQuiz = new Quiz("Muziek", 1);
        sportQuiz = new Quiz("Sport", 2);
        taalQuiz = new Quiz("Taal", 3);
        geografieQuiz = new Quiz("Geografie", 4);
        muziekQuiz.setQuizVragen(vraagRepo.getVragenByCategorie(MUZIEK));
        muziekQuiz.setAntwoorden(antwoordenRepo.getAntwoordenByCategorie(MUZIEK));
        sportQuiz.setQuizVragen(vraagRepo.getVragenByCategorie(SPORT));
        sportQuiz.setAntwoorden(antwoordenRepo.getAntwoordenByCategorie(SPORT));
        taalQuiz.setQuizVragen(vraagRepo.getVragenByCategorie(TAAL));
        taalQuiz.setAntwoorden(antwoordenRepo.getAntwoordenByCategorie(TAAL));
        geografieQuiz.setQuizVragen(vraagRepo.getVragenByCategorie(GEOGRAFIE));
        geografieQuiz.setAntwoorden(antwoordenRepo.getAntwoordenByCategorie(GEOGRAFIE));

    }

    public Quiz getMuziekQuiz() {
        return muziekQuiz;
    }

    public Quiz getSportQuiz() {
        return sportQuiz;
    }

    public Quiz getTaalQuiz() {
        return taalQuiz;
    }

    public Quiz getGeografieQuiz() {
        return geografieQuiz;
    }


}
