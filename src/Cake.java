package CakeOvenManagementSystem;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Represents a cake in the oven management system.
 * Tracks cake properties including name, weight, expiration date, 
 * and time placed in the oven.
 */
public class Cake {
    // Instance variables
    private String name;            // Name/type of the cake
    private int weight;             // Weight in grams
    private LocalDate bestBeforeDate; // Expiration date
    private LocalTime timePlaced;    // Time when cake was placed in oven

    /**
     * Constructs a new Cake object with current placement time.
     * @param name The name/type of the cake (e.g., "Chocolate Fudge")
     * @param weight Weight of the cake in grams (must be positive)
     * @param bestBeforeDate Expiration date of the cake
     */
    public Cake(String name, int weight, LocalDate bestBeforeDate) {
        this.name = name;
        this.weight = weight;
        this.bestBeforeDate = bestBeforeDate;
        this.timePlaced = LocalTime.now(); // Sets to current time automatically
    }

    /**
     * @return The name/type of the cake
     */
    public String getName() {
        return name;
    }

    /**
     * @return The weight of the cake in grams
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @return The expiration date of the cake
     */
    public LocalDate getBestBeforeDate() {
        return bestBeforeDate;
    }

    /**
     * @return The time when the cake was placed in the oven
     */
    public LocalTime getTimePlaced() {
        return timePlaced;
    }

    /**
     * Returns a formatted string representation of the cake.
     * @return String in format: "Name (weight)g, Best Before: date, Placed at: time"
     */
    @Override
    public String toString() {
        return name + " (" + weight + "g), Best Before: " + bestBeforeDate 
               + ", Placed at: " + timePlaced;
    }
}
