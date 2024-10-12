package ln.han.repo.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import ln.han.*;
import org.json.JSONArray;
import org.json.JSONObject;

public class JsonData {
    private final File vragen = new File("src/main/resources/vragen.json");

    public JSONObject getJsonData(File file) {
        try {
            String jsonData = new String(Files.readAllBytes(Paths.get(file.getAbsolutePath())));
            return new JSONObject(jsonData);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return null;
    }

    public QuizVraag getVraagByIdEnCategorie(Categorie categorie, int vraagId) {
        JSONArray data = getJsonData(vragen)
                .getJSONObject("vragen")
                .getJSONArray(String.valueOf(categorie));

        for (int i = 0; i < data.length(); i++) {
            JSONObject item = data.getJSONObject(i);
            int repoVraagId = item.getInt("vraagId");
            if (repoVraagId == vraagId) {
                List<String> antwoorden = getAntwoorden(item, "antwoord");
                if (item.get("type").equals("meerkeuze")) {
                    List<String> antwoordenLijst = getAntwoorden(item, "antwoorden");
                    return new MeerkeuzeQuizVraag(repoVraagId, item.getString("vraag"),
                            Categorie.valueOf(item.getString("categorie")),
                            antwoordenLijst, antwoorden, Letter.valueOf(item.getString("letter")));
                } else if (item.get("type").toString().equals("open")) {
                    return new OpenQuizVraag(repoVraagId, item.getString("vraag"),
                            Categorie.valueOf(item.getString("categorie")), antwoorden, Letter.valueOf(item.getString("letter")));
                }
            }
        }
        return null;
    }

    public List<QuizVraag> getVragenVanCategorie(Categorie categorie) {
        JSONArray data = getJsonData(vragen)
                .getJSONObject("vragen")
                .getJSONArray(String.valueOf(categorie));

        List<QuizVraag> quizVragenLijst = new ArrayList<>();

        for (int i = 0; i < data.length(); i++) {
            int vraagId = data.getJSONObject(i).getInt("vraagId");

            QuizVraag vraag = getVraagByIdEnCategorie(categorie, vraagId);

            if (vraag != null) {
                quizVragenLijst.add(vraag);
            }
        }

        return quizVragenLijst;
    }

    private static List<String> getAntwoorden(JSONObject item, String tag) {
        Object antwoordenObj = item.get(tag);
        if (antwoordenObj instanceof JSONArray jsonArray) {
            return IntStream.range(0, jsonArray.length())
                    .mapToObj(jsonArray::getString)
                    .toList();
        } else {
            return List.of(antwoordenObj.toString());
        }
    }


}
