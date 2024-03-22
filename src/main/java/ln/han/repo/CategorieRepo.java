package ln.han.repo;

import java.util.ArrayList;

public class CategorieRepo {

    private ArrayList<String> categorieen = new ArrayList<String>();

    public CategorieRepo() {
        categorieen.add("Geografie");
        categorieen.add("Muziek");
        categorieen.add("Sport");
        categorieen.add("Taal");
    }

    public ArrayList<String> getCategorieen() {
        return categorieen;
    }

    public void setCategorieen(ArrayList<String> categorieen) {
        this.categorieen = categorieen;
    }

    public void addCategorie(String categorie) {
        categorieen.add(categorie);
    }

    public void removeCategorie(String categorie) {
        categorieen.remove(categorie);
    }

    public void updateCategorie(String oudeCategorie, String nieuweCategorie) {
        categorieen.set(categorieen.indexOf(oudeCategorie), nieuweCategorie);
    }

    public String getCategorie(int index) {
        return categorieen.get(index);
    }
}
