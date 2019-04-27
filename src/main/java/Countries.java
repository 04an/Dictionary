import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
//Zadania z interfejsem Set

public class Countries {

    private Set<String> names = new TreeSet<>();

    public void add(String kraj) {

        if (kraj != "") {
            if (names.contains(kraj)) {
                System.out.println("Kraj juz isnieje");
            } else names.add(kraj);
        } else System.out.println("Nie wprowadzieles zadnego kraju");
    }

    public Set<String> get() {
        return names;

    }

    public void remove(String kraj) {
        names.remove(kraj);
    }

    public void update(String staraNazwa, String nowaNazwa) {
        if (names.contains(staraNazwa)) {
            names.remove(staraNazwa);
            names.add(nowaNazwa);
        }


    }
}
