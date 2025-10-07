package src.pizza_builder;

import java.util.ArrayList;

public class Pizza {
    private String chainName;
    private String size;
    private ArrayList<String> toppings;

    public Pizza(String chainName, String size, ArrayList<String> toppings) {
        this.chainName = chainName;
        this.size = size;
        this.toppings = toppings;
    }

    public void eat() {
        System.out.println(chainName + " " + size + " pizza with toppings: " + String.join(", ", toppings));
    }
}
