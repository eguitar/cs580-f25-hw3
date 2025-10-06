package src.macronutrient_factory;

import java.util.ArrayList;
import java.util.Random;

public class ProteinFactory {
    private static ProteinFactory instance; // Singleton
    private Random rand = new Random();

    private ProteinFactory() {}

    public static ProteinFactory getInstance() {
        if (instance == null) {
            instance = new ProteinFactory();
        }
        return instance;
    }

    public Protein createProtein(String dietPlan) {
        ArrayList<String> proteins = new ArrayList<>();
        proteins.add("Fish");
        proteins.add("Chicken");
        proteins.add("Beef");
        proteins.add("Tofu");

        if (dietPlan.equalsIgnoreCase("Paleo")) {
            proteins.remove("Tofu");
        } else if (dietPlan.equalsIgnoreCase("Vegan")) {
            proteins.remove("Fish");
            proteins.remove("Chicken");
            proteins.remove("Beef");
        }

        String choice = proteins.get(rand.nextInt(proteins.size()));
        return new Protein(choice);
    }
}
