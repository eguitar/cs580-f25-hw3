package src.macronutrient_factory;

public class MacronutrientFactory {
    private static MacronutrientFactory instance;

    private MacronutrientFactory() {}

    public static MacronutrientFactory getInstance() {
        if (instance == null) {
            instance = new MacronutrientFactory();
        }
        return instance;
    }

    public CarbFactory createCarbFactory() {
        return CarbFactory.getInstance();
    }

    public ProteinFactory createProteinFactory() {
        return ProteinFactory.getInstance();
    }

    public FatFactory createFatFactory() {
        return FatFactory.getInstance();
    }
}
