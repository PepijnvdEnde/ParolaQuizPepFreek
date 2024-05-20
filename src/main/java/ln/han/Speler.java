package ln.han;



public record Speler(String naam) {
    public Speler {
        if (naam == null || naam.isBlank()) {
            throw new IllegalArgumentException("Naam mag niet leeg zijn");
        }
    }
}

//public class Speler {
//
//    String naam;
//
//    public Speler(String naam) {
//        if (naam == null || naam.isBlank()) {
//            throw new IllegalArgumentException("Naam mag niet leeg zijn");
//        }
//        this.naam = naam;
//    }
//}

