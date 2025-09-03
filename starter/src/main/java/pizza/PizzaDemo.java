// Package
package pizza;

// Imports
import java.util.Scanner;

// ________________________________________________________

public class PizzaDemo {

    // Attributes
    private static Scanner scanner = new Scanner(System.in);

    // ________________________________________________________

    public static void main(String[] args) {

        System.out.println("Welcome to Diddys Pizza!");
        System.out.println("Which pizza would you like? (Margherita / Veggie)");
        String pizzaType = scanner.nextLine();

        Pizza pizza = PizzaFactory.createPizza(pizzaType);

        boolean addingToppings = true;
        while (addingToppings) {
            System.out.println("Do you want to add a topping? (Cheese / Pepperoni / No)");
            String topping = scanner.nextLine();

            switch (topping.toLowerCase()) {
                case "cheese":
                    pizza = new CheeseTopping(pizza);
                    break;
                case "pepperoni":
                    pizza = new PepperoniTopping(pizza);
                    break;
                case "no":
                    addingToppings = false;
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        System.out.println("How would you like your pizza delivered? (Home / Drone / Pickup)");
        String delivery = scanner.nextLine();

        DeliveryStrategy strategy;
        switch (delivery.toLowerCase()) {
            case "home":
                strategy = new HomeDelivery();
                break;
            case "drone":
                strategy = new DroneDelivery();
                break;
            case "pickup":
                strategy = new Pickup();
                break;
            default:
                System.out.println("Invalid option. Defaulting to Pickup.");
                strategy = new Pickup();
        }

        Order order = new Order(pizza);
        order.setDeliveryStrategy(strategy);
        order.processOrder();

        System.out.println("Thank you for ordering!");

    }

}