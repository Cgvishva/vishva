package Main;

import service.CourierService;
import java.security.Provider.Service;

import controller.CourierController;

public class App {
    public static void main(String[] args) {
        try {
            CourierController controller = new CourierController();
            controller.start();
        } 
        catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    
        CourierService cs = new CourierService();
    
    }
}
   