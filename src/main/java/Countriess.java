import java.util.HashSet;
import java.util.Set;
import java.util.zip.CheckedOutputStream;

public class Countriess {
    private Set<Country> countries = new HashSet<>();

    public void addCountry(Country country) {
        countries.add(country);

    }

    public Country get(String name) {
        for (Country country : countries) {
            if (country.getName().equals(name))
            return country;
        }
        return null;
    }
    public Set<Country> getAll(){
        return countries;
    }

}
