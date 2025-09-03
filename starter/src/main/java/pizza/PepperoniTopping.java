// Package
package pizza;

// Imports

public class PepperoniTopping extends ToppingDecorator {

    // Attributes

    // _______________________________________________

    public PepperoniTopping(Pizza pizza) {
        super(pizza);
    }

    // _______________________________________________

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + Pepperoni";
    }

    // _______________________________________________

    @Override
    public double getCost() {
        return pizza.getCost() + 20;
    }

}