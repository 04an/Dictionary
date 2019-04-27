import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dictionary {


    private Map<String, List<String>> dictionary = new HashMap<>();

    public void add(String klucz, List<String> wartosc) {
        dictionary.put(klucz, wartosc);

//     sposob na jedno slowo do jednego
//    public void add(String klucz, String wartosc) {
//        if (klucz != "" && wartosc != "") {
//            if (dictionary.equals(klucz)) {
//                System.out.println("Slowo juz isnieje");
//            } else
//                dictionary.put(klucz, wartosc);
//        } else System.out.println("Nie wprowadziles zadnego slowa");


    }

    public List<String> getTranslation(String klucz) {
        return dictionary.get(klucz);
    }

    public void edit(String klucz, List<String> wartosc) {
        if (dictionary.containsKey(klucz)) {
            dictionary.put(klucz, wartosc);
            // dictionary.replace(klucz,wartosc) ; inny sposob
        }
    }

    public void remove(String klucz) {
        if (dictionary.containsKey(klucz)) {
            dictionary.remove(klucz);
        }
    }


    public List<String> getAllPl() {
        return new ArrayList<>(dictionary.keySet());

    }

    public List<String> wyszukiwania(String slowo) {
        List<String> temp = new ArrayList<>();
        for (String klucz : dictionary.keySet()) {
            if (klucz.startsWith(slowo)) {
                temp.add(klucz);
            }
//             if (klucz.contains(slowo));
//             if (klucz.endsWith(slowo))""

        }return temp;


    }


}

//    public List<String> getAllAng() {
//        return new ArrayList<>(dictionary.values());
//    }


