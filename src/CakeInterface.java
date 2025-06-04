package CakeOvenManagementSystem;

/**
 * Interface defining operations for a cake oven management system.
 * Supports both stack-like (LIFO) and queue-like (FIFO) operations
 * for managing cakes in an oven with limited capacity.
 */
public interface CakeInterface {
    /**
     * Checks if the oven contains no cakes
     * @return true if oven is empty, false otherwise
     */
    public boolean isEmpty();

    /**
     * Checks if the oven has reached maximum capacity
     * @return true if oven cannot accept more cakes, false otherwise
     */
    public boolean isFull();

    /**
     * Adds a new cake to the front of the oven (stack-like behavior)
     * @param newItem The cake object to be added to the oven
     * @throws ClassCastException if parameter is not a Cake object
     */
    public void push(Object newItem);

    /**
     * Removes and returns the cake from the front of the oven (LIFO)
     * @return The most recently added cake, or null if oven is empty
     */
    public Object pop();

    /**
     * Removes and returns the cake from the rear of the oven (FIFO)
     * @return The oldest cake in the oven, or null if oven is empty
     */
    public Object removeFromOppositeDoor();

    /**
     * Views the cake at the front of the oven without removing it
     * @return The most recently added cake, or null if oven is empty
     */
    public Object peek();

    /**
     * Gets the current number of cakes in the oven
     * @return Count of cakes currently in the oven
     */
    public int size();

    /**
     * Removes all cakes from the oven
     */
    public void emptyStack();

    /**
     * Generates a formatted string showing all cakes in the oven
     * @return Multi-line string representation of cakes, 
     *         or "OVEN IS EMPTY!" if empty
     */
    public String displayStack();
}
