package ln.han.repo;

import ln.han.Categorie;
import ln.han.QuizVraag;
import ln.han.repo.util.JsonData;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class VraagRepo {

    private final JsonData jsonData = new JsonData();

    public List<QuizVraag> getVragenByCategorie(Categorie categorie) {
      return jsonData.getVragenVanCategorie(categorie);
    }

    public List<QuizVraag> getWillkeurigeVragenVanCategorie(Categorie categorie) {
        List<QuizVraag> quizVragen = jsonData.getVragenVanCategorie(categorie);
        List<QuizVraag> willkeurigeVragen = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            Random r = new Random();
            int randomIndex = r.nextInt(quizVragen.size());
            willkeurigeVragen.add(quizVragen.get(randomIndex));
            if (quizVragen.size() == 1) {
                break;
            }
            quizVragen.remove(randomIndex);
        }
        return willkeurigeVragen;
    }

}
