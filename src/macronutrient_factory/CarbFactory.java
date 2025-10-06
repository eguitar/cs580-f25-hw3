package src.macronutrient_factory;

import java.util.ArrayList;
import java.util.Random;

public class CarbFactory {
    private static CarbFactory instance; // Singleton
    private Random rand = new Random();

    private CarbFactory() {}

    public static CarbFactory getInstance() {
        if (instance == null) {
            instance = new CarbFactory();
        }
        return instance;
    }

    public Carb createCarb(String dietPlan) {
        ArrayList<String> carbs = new ArrayList<>();
        carbs.add("Cheese");
        carbs.add("Bread");
        carbs.add("Lentils");
        carbs.add("Pistachio");

        if (dietPlan.equalsIgnoreCase("Paleo")) {
            carbs.remove("Cheese");
            carbs.remove("Bread");
            carbs.remove("Lentils");
        } else if (dietPlan.equalsIgnoreCase("Vegan")) {
            carbs.remove("Cheese");
        } else if (dietPlan.equalsIgnoreCase("Nut Allergy")) {
            carbs.remove("Pistachio");
        }

        String choice = carbs.get(rand.nextInt(carbs.size()));
        return new Carb(choice);
    }
}
