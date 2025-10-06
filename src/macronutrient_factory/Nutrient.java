package src.macronutrient_factory;

public abstract class Nutrient {
    protected String name;

    public Nutrient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
