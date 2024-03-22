package ln.han;

import java.util.ArrayList;

public class Speler {
    private int score;

    public Speler() {
        this.score = 0;
    }



    public int getScore() {
        return score;
    }

    public void verhoogScore() {
        score++;
    }
}
