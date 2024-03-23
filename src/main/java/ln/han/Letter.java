package ln.han;

public enum Letter {
    A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z;


    public static Letter getLetter(char letter) {
        return Letter.valueOf(String.valueOf(letter).toUpperCase());
    }


}
