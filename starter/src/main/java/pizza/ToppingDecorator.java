package pizza;

public abstract class ToppingDecorator extends Pizza {

    // Attributes
    protected Pizza pizza;

    // _______________________________________________

    public ToppingDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

}