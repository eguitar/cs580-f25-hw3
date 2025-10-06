package src.macronutrient_factory;

import java.util.ArrayList;
import java.util.Random;

public class FatFactory {
    private static FatFactory instance; // Singleton
    private Random rand = new Random();

    private FatFactory() {}

    public static FatFactory getInstance() {
        if (instance == null) {
            instance = new FatFactory();
        }
        return instance;
    }

    public Fat createFat(String dietPlan) {
        ArrayList<String> fats = new ArrayList<>();
        fats.add("Avocado");
        fats.add("Sour cream");
        fats.add("Tuna");
        fats.add("Peanuts");

        if (dietPlan.equalsIgnoreCase("Paleo")) {
            fats.remove("Sour cream");
        } else if (dietPlan.equalsIgnoreCase("Vegan")) {
            fats.remove("Sour cream");
            fats.remove("Tuna");
        } else if (dietPlan.equalsIgnoreCase("Nut Allergy")) {
            fats.remove("Peanuts");
        }

        String choice = fats.get(rand.nextInt(fats.size()));
        return new Fat(choice);
    }
}
