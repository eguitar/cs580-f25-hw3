package src.macronutrient_factory;

public class Meal {
    private Carb carb;
    private Protein protein;
    private Fat fat;

    public Meal(Carb carb, Protein protein, Fat fat) {
        this.carb = carb;
        this.protein = protein;
        this.fat = fat;
    }

    @Override
    public String toString() {
        return "Carb: " + carb + " | Protein: " + protein + " | Fat: " + fat;
    }
}
