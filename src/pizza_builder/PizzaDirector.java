package src.pizza_builder;

public class PizzaDirector {

    public Pizza makePizza(PizzaBuilder builder, String size, String[] toppings) {
        builder.setSize(size);
        for (String topping : toppings) {
            builder.addTopping(topping);
        }
        return builder.build();
    }
}
