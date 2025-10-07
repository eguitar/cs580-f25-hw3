package src.pizza_builder;

public class Main {
    public static void main(String[] args) {
        PizzaDirector director = new PizzaDirector();

        System.out.println("\n-------------- Pizza Hut Example  -------------------------------");
        Pizza pizza1 = director.makePizza(new PizzaHutBuilder(), "Small", new String[]{"Pepperoni", "Mushrooms", "Extra Cheese"});
        Pizza pizza2 = director.makePizza(new PizzaHutBuilder(), "Medium", new String[]{"Sausage", "Bacon", "Onions", "Chicken", "Peppers", "Olives"});
        Pizza pizza3 = director.makePizza(new PizzaHutBuilder(), "Large", new String[]{"Spinach", "Tomato and Basil", "Beef", "Ham", "Pesto", "Spicy Pork", "Ham and Pineapple", "Mushrooms", "Extra Cheese"});
        pizza1.eat();
        pizza2.eat();
        pizza3.eat();

        System.out.println("\n-------------- Multiple Chains Example -------------------------------");
        Pizza pizza4 = director.makePizza(new PizzaHutBuilder(), "Large", new String[]{"Pepperoni", "Mushrooms", "Extra Cheese"});
        Pizza pizza5 = director.makePizza(new PizzaHutBuilder(), "Small", new String[]{"Spinach", "Olives"});
        Pizza pizza6 = director.makePizza(new LittleCaesarsBuilder(), "Medium", new String[]{"Bacon", "Chicken", "Onions", "Spinach", "Peppers", "Tomato and Basil", "Beef", "Ham"});
        Pizza pizza7 = director.makePizza(new LittleCaesarsBuilder(), "Small", new String[]{"Pepperoni", "Sausage", "Mushrooms", "Bacon", "Onions", "Extra Cheese"});
        Pizza pizza8 = director.makePizza(new DominosBuilder(), "Small", new String[]{"Pesto"});
        Pizza pizza9 = director.makePizza(new DominosBuilder(), "Large", new String[]{"Ham and Pineapple", "Tomato and Basil", "Olives"});
        System.out.println("--- Pizza Hut ---");
        pizza4.eat();
        pizza5.eat();
        System .out.println("--- Little Caesars ---");
        pizza6.eat();
        pizza7.eat();
        System.out.println("--- Dominos ---");
        pizza8.eat();
        pizza9.eat();
    }
}
