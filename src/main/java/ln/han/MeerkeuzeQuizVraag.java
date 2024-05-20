package ln.han;

import java.util.List;

public class MeerkeuzeQuizVraag extends QuizVraag {

    private final List<String> keuzes;

    public MeerkeuzeQuizVraag(String vraagTekst, Categorie categorie, List<String> keuzes, Antwoord antwoord) {
        super(vraagTekst, categorie, antwoord);
        this.keuzes = keuzes;
    }

    @Override
    public String getVraagTekst() {
        return super.getVraagTekst() + "\n" + getkeuzesString();
    }

    private String getkeuzesString() {
        StringBuilder sb = new StringBuilder();
        if (!keuzes.isEmpty()) {
            sb.append("A: ").append(keuzes.getFirst()).append("\n");
        }
        if (keuzes.size() > 1) {
            sb.append("B: ").append(keuzes.get(1)).append("\n");
        }
        if (keuzes.size() > 2) {
            sb.append("C: ").append(keuzes.get(2)).append("\n");
        }
        if (keuzes.size() > 3) {
            sb.append("D: ").append(keuzes.get(3));
        }
        return sb.toString();
    }

}