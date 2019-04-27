public class Country {

    private String name;
    private String capitalName;
    private int population;

    public Country(String name, String capitalName, int population) {
        this.name = name;
        this.capitalName = capitalName;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public int getPopulation() {
        return population;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", capitalName='" + capitalName + '\'' +
                ", population=" + population +
                '}';
    }
}
