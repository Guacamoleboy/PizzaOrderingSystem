package pizza;

public class HomeDelivery implements DeliveryStrategy {

    // Attributes

    // _______________________________________________

    @Override
    public String getDeliveryMessage(Pizza pizza) {
        return "Delivery method: Home Delivery selected. Your pizza will arrive soon!";
    }

}