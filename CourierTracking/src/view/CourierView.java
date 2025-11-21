package view;

import java.util.List;
import java.util.Scanner;

import model.Courier;
import util.Validator;

public class CourierView {
    private Scanner sc = new Scanner(System.in);

    public int showMenu() {
        int choice;
        while (true) {
            System.out.println("\n===== COURIER TRACKING SYSTEM =====");
            System.out.println("1. Add Courier");
            System.out.println("2. View All Couriers");
            System.out.println("3. Update Courier Status");
            System.out.println("4. Delete Courier");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            String input = sc.nextLine();
            if (Validator.isNumeric(input)) {
                choice = Integer.parseInt(input);
                break;
            } else {
                System.out.println("Enter a valid number!");
            }
        }
        return choice;
    }

    public Courier getCourierDetails() {
  
     String sender,receiver,source,destination,status;
    	
    	do {
            System.out.print("Sender Name: ");
             sender = sc.nextLine();
            if (!Validator.isNotEmpty(sender)) 
            	System.out.println("Sender name cannot be empty!");
            else if (!Validator.isAlpha(sender)) 
            	System.out.println("Sender name cannot contain numbers!");
            else break;
        } while (true);

        do {
            System.out.print("Receiver Name: ");
             receiver = sc.nextLine();
            if (!Validator.isNotEmpty(receiver)) 
            	System.out.println("Receiver name cannot be empty!");
            else if (!Validator.isAlpha(receiver)) 
            	System.out.println("Receiver name cannot contain numbers!");
            else break;
        } while (true);

        do {
            System.out.print("From: ");
            source = sc.nextLine();
            if (!Validator.isNotEmpty(source)) 
            	System.out.println("Source cannot be empty!");
            else if (!Validator.isAlpha(source)) 
            	System.out.println("Source name cannot contain numbers!");

            else break;
        } while (true);

        do {
            System.out.print("To: ");
            destination = sc.nextLine();
            if (!Validator.isNotEmpty(destination)) 
            	System.out.println("Destination cannot be empty!");
            else if (!Validator.isAlpha(destination)) 
            	System.out.println("Destination name cannot contain numbers!");

            else break;
        } while (true);

        do {
            System.out.print("Current Status (Accepted/Rejected): ");
            status = sc.nextLine();
            if (!Validator.isValidStatus(status)) {
                System.out.println("Invalid status! Only 'Accepted' or 'Rejected' allowed.");
            } else break;
        } while (true);

        if (status.equalsIgnoreCase("Rejected")) {
            System.out.println("Your Courier Rejected! Try again.");
            return null;
        }

        return new Courier(sender, receiver, source, destination, status);
    }

    public void showAllCouriers(List<Courier> couriers) {
        if (couriers.isEmpty()) 
        	System.out.println("No couriers available.");
        else {
            System.out.println("\n--- All Couriers ---");
            for (Courier c : couriers) 
            	System.out.println(c);
        }
    }

    public int getCourierId(String action) {
        int id;
        while (true) {
            System.out.print("Enter Courier ID to " + action + ": ");
            String input = sc.nextLine();
            if (Validator.isNumeric(input)) {
                id = Integer.parseInt(input);
                break;
            } else System.out.println("Enter a valid number!");
        }
        return id;
    }

    public int getStatusChoice() {
        int choice;
        while (true) {
            System.out.println("Select New Status:");
            System.out.println("1. Picked Up");
            System.out.println("2. Shipped");
            System.out.println("3. Out for Delivery");
            System.out.println("4. Delivered");
            System.out.println("5. Delivery Failed");
            System.out.println("6. Returned to Sender");
            System.out.println("7. Cancelled");
            System.out.print("Enter your choice: ");
            String input = sc.nextLine();
            if (Validator.isNumeric(input)) {
                choice = Integer.parseInt(input);
                break;
            } 
            else {
            	System.out.println("Enter a valid number!");
            }
            
        }
        return choice;
    }

    public void showMessage(String msg) { 
    	System.out.println(msg); 
    	}
    
    public void showError(String msg) { 
    	System.out.println(msg); 
    	}
}
