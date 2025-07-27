import java.io.Serializable;

public class Species implements Serializable {
    private String name;
    private int population;
    private double growthRate;

    public Species(String name, int population, double growthRate) {
        this.name = name;
        this.population = population;
        this.growthRate = growthRate;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return "Species: " + name + ", Population: " + population + ", Growth Rate: " + growthRate;
    }
}
