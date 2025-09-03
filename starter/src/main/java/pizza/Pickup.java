package pizza;

public class Pickup implements DeliveryStrategy {

    // Attributes
    // _______________________________________________

    @Override
    public String getDeliveryMessage(Pizza pizza) {
        return "Delivery method: Pickup selected. Your pizza is ready at the counter.";
    }


}