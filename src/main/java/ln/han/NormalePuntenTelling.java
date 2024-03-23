package ln.han;

import java.util.List;

public class NormalePuntenTelling implements PuntenTelling {
    public NormalePuntenTelling() {
        super();
    }

    @Override
    public int berekenScore(List<Boolean> correcteVragen, String gevormdWoord, long tijd) {
        return correcteVragen.size() + gevormdWoord.length() + (int) tijd / 1000;
    }
}
