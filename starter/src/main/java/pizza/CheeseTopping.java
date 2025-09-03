// Package
package pizza;

// Imports

public class CheeseTopping extends ToppingDecorator {

    // Attributes

    // _______________________________________________

    public CheeseTopping(Pizza pizza) {
        super(pizza);
    }

    // _______________________________________________

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + Cheese";
    }

    // _______________________________________________

    @Override
    public double getCost() {
        return pizza.getCost() + 15;
    }

}