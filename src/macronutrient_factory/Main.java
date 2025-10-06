package src.macronutrient_factory;

public class Main {
    public static void main(String[] args) {
        MacronutrientFactory mealFactory = MacronutrientFactory.getInstance();

        Customer[] customers = {
            new Customer("Alice", "No Restriction"),
            new Customer("Bob", "Paleo"),
            new Customer("Charlie", "Vegan"),
            new Customer("Diana", "Nut Allergy"),
            new Customer("Ethan", "No Restriction"),
            new Customer("Fiona", "Paleo")
        };

        for (Customer c : customers) {
            Carb carb = mealFactory.createCarbFactory().createCarb(c.getDietPlan());
            Protein protein = mealFactory.createProteinFactory().createProtein(c.getDietPlan());
            Fat fat = mealFactory.createFatFactory().createFat(c.getDietPlan());

            Meal meal = new Meal(carb, protein, fat);

            System.out.println("Customer: " + c);
            System.out.println("Generated Meal → " + meal + "\n");
        }
    }
}
