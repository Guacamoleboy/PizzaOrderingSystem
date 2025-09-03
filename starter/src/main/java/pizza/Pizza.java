// Package
package pizza;

// Imports

public abstract class Pizza { // Changed to Abstract cuz Interface makes no sense

    // Attributes
    protected String description;
    protected double cost;

    // _____________________________________________

    public String getDescription() {
        return description;
    }

    // _____________________________________________

    public double getCost() {
        return cost;
    }

}