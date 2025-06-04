package CakeOvenManagementSystem;
import java.util.*;

// Class implementing CakeInterface to manage cake operations
public class MyCake implements CakeInterface {
    // ArrayList to store cakes (acts as a stack)
    private ArrayList<Cake> theStack;
    // Constant defining maximum oven capacity
    private final int MAX_CAPACITY = 5;

    // Constructor initializes an empty ArrayList for cakes
    public MyCake() {
        theStack = new ArrayList<Cake>();
    }

    // Checks if the oven is empty
    @Override
    public boolean isEmpty() {
        return theStack.isEmpty();
    }

    // Checks if the oven has reached maximum capacity
    @Override
    public boolean isFull() {
        return theStack.size() >= MAX_CAPACITY;
    }

    // Adds a new cake to the oven (at the front/top of stack)
    @Override
    public void push(Object newItem) {
        if (!isFull()) {
            theStack.add(0, (Cake) newItem); // Insert at index 0
        }
    }

    // Removes and returns the most recently added cake (LIFO)
    @Override
    public Object pop() {
        if (!isEmpty()) {
            return theStack.remove(0); // Remove from index 0
        }
        return null; // Return null if oven is empty
    }

    // Removes cake from the opposite end (FIFO behavior)
    @Override
    public Object removeFromOppositeDoor() {
        if (!isEmpty()) {
            return theStack.remove(theStack.size() - 1); // Remove last element
        }
        return null;
    }

    // Returns the most recently added cake without removing it
    @Override
    public Object peek() {
        if (!isEmpty()) {
            return theStack.get(0); // Get from index 0
        }
        return null;
    }

    // Empties the oven completely
    @Override
    public void emptyStack() {
        theStack.clear();
    }

    // Returns a string representation of all cakes in the oven
    @Override
    public String displayStack() {
        if (isEmpty()) {
            return "OVEN IS EMPTY!";
        }
        StringBuilder str = new StringBuilder();
        for (Cake cake : theStack) {
            str.append(cake.toString()).append("\n"); // Add each cake's string representation
        }
        return str.toString();
    }

    // Returns current number of cakes in the oven
    @Override
    public int size() {
        return theStack.size();
    }
}