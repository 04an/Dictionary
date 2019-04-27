import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Countriess countriess = new Countriess();
        Country country = new Country("Polska", "Warszawa", 38000000);
        countriess.addCountry(country);
        countriess.addCountry(new Country("Niemcy", "Berlin", 89000000));
        countriess.addCountry(new Country("Spain", "Real Madryd", 6000000));

//        System.out.println(countriess.getAll());

     System.out.println(countriess.get("Polska"));
//        System.out.println(countriess.get("Mork"));


        /** Zadanie z Set
         *  Countries panstwo = new Countries();
         panstwo.add("Polska");
         panstwo.add("Polska");
         panstwo.add("Niemcy");
         panstwo.add("Albanija");
         panstwo.add("");

         System.out.println(panstwo.get());

         panstwo.remove("Polska");

         panstwo.update("Niemcy", "POLSKA");
         System.out.println(panstwo.get());
         */


    }
}


/**
 * ZAdanie  Interfejsem MAP:
 * Scanner sc = new Scanner(System.in);
 * Dictionary slownik = new Dictionary();
 * <p>
 * slownik.add("Jeden", Arrays.asList("One", "first"));
 * <p>
 * // inna metoda dodania jeden do wielu:
 * List<String> translatotr = new ArrayList<>();
 * translatotr.add("Second");
 * translatotr.add("Two");
 * translatotr.add("2");
 * slownik.add("dwa", translatotr);
 * <p>
 * slownik.add("dom",Arrays.asList("houese"));
 * slownik.add("donkument",Arrays.asList("dokument"));
 * slownik.add("dominacja",Arrays.asList("domination"));
 * <p>
 * System.out.println(slownik.wyszukiwania("do"));
 * <p>
 * /*sposob dodania jeden do jeden
 * slownik.add("Witaj", "Hello");
 * slownik.add("Witaj", "Hello");
 * slownik.add("Pies", "Doggg");
 * slownik.add("Osoba", "Person");
 * slownik.add("Kot", "Cat");
 * slownik.add("", "Ball");
 * <p>
 * <p>
 * <p>
 * System.out.println(slownik.getTranslation("Pies"));
 * slownik.edit("Pies", "Dog");
 * System.out.println(slownik.getTranslation("Pies"));
 * slownik.remove("Kot");
 * System.out.println(slownik.getAllPl());
 * System.out.println(slownik.getAllAng());
 * <p>
 * System.out.println(slownik.getTranslation("Jeden"));
 * for (String i : slownik.getAllPl()) {
 * System.out.println(i + ": " + slownik.getTranslation(i));
 * }
 */




