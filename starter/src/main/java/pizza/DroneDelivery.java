package pizza;

public class DroneDelivery implements DeliveryStrategy {

    // Attributes

    // _______________________________________________

    @Override
    public String getDeliveryMessage(Pizza pizza) {
        return "Delivery method: Drone Delivery selected. Your pizza is flying to you!";
    }

}

