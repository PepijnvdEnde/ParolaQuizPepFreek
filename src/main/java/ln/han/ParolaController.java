package ln.han;

import ln.han.repo.QuizRepo;

import java.util.*;

public class ParolaController {

    private final QuizRepo quizRepo = new QuizRepo();

    private final PuntenTelling puntenTelling = new NormalePuntenTelling();

    private final Map<String, SpelerStatus> spelerStatusMap = new HashMap<>();


    public static ParolaController getInstance() {
        return new ParolaController();
    }

    public void startQuiz(String playerName) {
        Speler speler = new Speler(playerName);
        Categorie categorie = getRandomCategorie();
        Quiz quiz = quizRepo.getQuizByCategorie(categorie);
        System.out.println("Gekozen categorie: " + categorie.toString().toLowerCase());
        SpelerStatus spelerStatus = new SpelerStatus(speler, quiz);
        spelerStatusMap.put(playerName, spelerStatus);

    }

    public String nextQuestion(String playerName) {
        SpelerStatus spelerStatus = spelerStatusMap.get(playerName);
        QuizVraag quizVraag = spelerStatus.getQuiz().getQuizVraag(spelerStatus.getBeantwoordeVragen().size());
        spelerStatus.addBeantwoordeVraag(quizVraag);
        return quizVraag.getVraagTekst();

    }

    public void processAnswer(String playerName, String answer) {
        SpelerStatus spelerStatus = spelerStatusMap.get(playerName);
        Antwoord antwoord = spelerStatus.getQuiz().getQuizVraag(spelerStatus.getBeantwoordeVragen().size() - 1).getAntwoorden();
        if (antwoord.isCorrect(answer)) {
            spelerStatus.incrementScore(1);
            spelerStatus.addLetter(antwoord.getLetter());

        }
    }

    public boolean quizFinished(String playerName) {
        return spelerStatusMap.get(playerName).getBeantwoordeVragen().size() == 8;
    }

    public String getLettersForRightAnswers(String playerName) {
        return spelerStatusMap.get(playerName).getLetters().toString();
    }

    public int calculateScore(String playerName, String word) {
        SpelerStatus spelerStatus = spelerStatusMap.get(playerName);
        return puntenTelling.berekenScore(spelerStatus.getScore(), word, spelerStatus.getElapsedTime());
    }


    private Categorie getRandomCategorie() {
        Categorie[] categories = Categorie.values();
        Random random = new Random();
        return categories[random.nextInt(categories.length)];
    }

}
