package controller;

import java.sql.SQLException;
import java.util.List;

import DAO.CourierDAO;
import model.Courier;
import view.CourierView;

public class CourierController {
    private CourierDAO dao = new CourierDAO();
    private CourierView view = new CourierView();

    public void start() throws SQLException {
        int choice;
        do {
            choice = view.showMenu();
            switch (choice) {
                case 1:
                    addCourier();
                    break;
                case 2:
                    viewAllCouriers();
                    break;
                case 3:
                    updateCourierStatus();
                    break;
                case 4:
                    deleteCourier();
                    break;
                case 0:
                    view.showMessage("Exited!");
                    break;
                default:
                    view.showError("Invalid choice!");
                    break;
            }
        } while (choice != 0);
    }

    private void addCourier() throws SQLException {
        Courier c = view.getCourierDetails();
        if (c != null) {
            dao.addCourier(c);
            view.showMessage("Courier added successfully!");
        }
    }

    private void viewAllCouriers() throws SQLException {
        List list = dao.getAllCouriers();
        view.showAllCouriers(list);
    }

    private void updateCourierStatus() throws SQLException {
        List<Courier> list = dao.getAllCouriers();
        if (list.isEmpty()) {
            view.showMessage("No couriers available!");
            return;
        }
        view.showAllCouriers(list);

        int id = view.getCourierId("update");
        int statusChoice = view.getStatusChoice();
        String newStatus = null;

        switch (statusChoice) {
            case 1:
                newStatus = "Picked Up";
                break;
            case 2:
                newStatus = "Shipped";
                break;
            case 3:
                newStatus = "Out for Delivery";
                break;
            case 4:
                newStatus = "Delivered";
                break;
            case 5:
                newStatus = "Delivery Failed";
                break;
            case 6:
                newStatus = "Returned to Sender";
                break;
            case 7:
                newStatus = "Cancelled";
                break;
            default:
                newStatus = null;
                break;
        }

        if (newStatus != null) {
            dao.updateStatus(id, newStatus);
            view.showMessage("Status updated successfully to: " + newStatus);
        } 
        else {
            view.showError("Invalid status choice!");
        }
    }

    private void deleteCourier() throws SQLException {
        int id = view.getCourierId("delete");
        dao.deleteCourier(id);
        view.showMessage("Courier deleted successfully!");
    }
}
