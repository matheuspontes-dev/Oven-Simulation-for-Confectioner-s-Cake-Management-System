package CakeOvenManagementSystem;

/**
 * The main application class for the Cake Oven Management System.
 * This class serves as the entry point for launching the graphical user interface.
 */
public class CakeApp {
    
    /**
     * The main method that starts the application.
     * Creates and displays the main GUI window for the cake oven system.
     * 
     * @param args Command-line arguments (not used in this application)
     */
    public static void main(String[] args) {
        // Create an instance of the CakeGUI (graphical user interface)
        CakeGUI guicakeapp = new CakeGUI();
        
        // Make the GUI window visible to the user
        guicakeapp.setVisible(true);
    }
}