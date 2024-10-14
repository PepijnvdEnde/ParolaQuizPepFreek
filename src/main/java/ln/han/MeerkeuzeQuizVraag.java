package ln.han;

import java.util.List;

public class MeerkeuzeQuizVraag extends QuizVraag {

    private final List<String> keuzes;

    public MeerkeuzeQuizVraag(int vraagId, String vraagTekst, Categorie categorie, List<String> keuzes, List<String> antwoorden, Letter letter) {
        super(vraagId, vraagTekst, categorie, antwoorden, letter);
        this.keuzes = keuzes;
    }

    @Override
    public String getVraagTekst() {
        return super.getVraagTekst() + "\n" + getKeuzesString();
    }

    private String getKeuzesString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (!keuzes.isEmpty()) {
            stringBuilder.append("A: ").append(keuzes.get(0)).append("\n");
        }
        if (keuzes.size() > 1) {
            stringBuilder.append("B: ").append(keuzes.get(1)).append("\n");
        }
        if (keuzes.size() > 2) {
            stringBuilder.append("C: ").append(keuzes.get(2)).append("\n");
        }
        if (keuzes.size() > 3) {
            stringBuilder.append("D: ").append(keuzes.get(3));
        }
        return stringBuilder.toString();
    }
}
