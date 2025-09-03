// Package
package pizza;

// Imports

public class PizzaFactory {

    // Attributes

    // _______________________________________________

    public static Pizza createPizza(String type) {

        switch (type.toLowerCase()) {
            case "margherita":
                return new MargheritaPizza();
            case "veggie":
                return new VeggiePizza();
            default:
                System.out.println("We couldn't find that pizza! .. Probably sucked anyways lol | Pizza: " + type);
                return null;
        }

    }

    // _______________________________________________
}