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

        if (deliveryStrategy != null) {
            System.out.println(deliveryStrategy.getDeliveryMessage(pizza));
        } else {
            System.out.println("No delivery strategy set!");
        }
    }

}