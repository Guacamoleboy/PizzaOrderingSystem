// Package
package pizza;

// Imports

public class Order {

    // Attributes
    private DeliveryStrategy deliveryStrategy;
    private Pizza pizza;

    // ________________________________________________________

    public Order(Pizza pizza) {
        this.pizza = pizza;
    }

    // ________________________________________________________

    public void setDeliveryStrategy(DeliveryStrategy deliveryStrategy) {
        this.deliveryStrategy = deliveryStrategy;
    }

    // ________________________________________________________

    public void processOrder() {
        System.out.println("Order: " + pizza.getDescription() + " $" + pizza.getCost());

    }

}
