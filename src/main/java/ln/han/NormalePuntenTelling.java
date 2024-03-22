package ln.han;

public class NormalePuntenTelling extends PuntenTelling {
    public NormalePuntenTelling(int score) {
        super(score);
    }

    @Override
    public int berekenScore(int score) {
        return score;
    }
}
