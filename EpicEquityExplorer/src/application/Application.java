package application;

import config.ConfigLoader;  // Import this if ConfigLoader is in the 'config' package
import controller.DashboardController;  // Import this if DashboardController is in the 'controller' package

public class Application {
    public static void main(String[] args) {
        DatabaseConnector.initializeConnection();  // No need to import since it's in the same package
        ConfigLoader.loadConfigurations();  // Make sure this method is correctly defined in ConfigLoader
        new DashboardController().displayDashboard();  // Ensure DashboardController is accessible and has displayDashboard()
    }
}
