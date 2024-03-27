package ln.han;

import java.util.ArrayList;
import java.util.List;

public class Speler {
    private int score;

    private List<SpelerAntwoord> antwoordList;

    public Speler() {
        this.score = 0;
        antwoordList = new ArrayList<>();
    }

    public void addAntwoord(SpelerAntwoord antwoord) {
        antwoordList.add(antwoord);
    }

    public List<SpelerAntwoord> getAntwoordList() {
        return antwoordList;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
