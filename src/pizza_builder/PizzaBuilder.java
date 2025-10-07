package src.pizza_builder;

import java.util.ArrayList;

public class PizzaBuilder {
    protected String chainName;
    protected String size;
    protected ArrayList<String> toppings = new ArrayList<>();

    public PizzaBuilder setChainName(String chainName) {
        this.chainName = chainName;
        return this;
    }

    public PizzaBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    public PizzaBuilder addTopping(String topping) {
        toppings.add(topping);
        return this;
    }

    public Pizza build() {
        return new Pizza(chainName, size, toppings);
    }
}
