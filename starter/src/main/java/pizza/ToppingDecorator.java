// Package
package pizza;

// Imports

public abstract class ToppingDecorator implements Pizza {

    // Attributes
    protected Pizza pizza;

    // _______________________________________________

    public ToppingDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

}
