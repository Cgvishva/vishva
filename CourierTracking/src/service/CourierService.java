package service;

import java.sql.SQLException;
import java.util.List;

import DAO.CourierDAO;
import exception.CourierNotFoundException;
import model.Courier;

public class CourierService {

    private CourierDAO dao = new CourierDAO();

    public void addCourier(Courier courier) {
        try {
            dao.addCourier(courier);
        } catch (SQLException e) {
            throw new RuntimeException("Error adding courier: " + e.getMessage());
        }
    }

    public List<Courier> getAllCouriers() {
        try {
            return dao.getAllCouriers();
        } catch (SQLException e) {
            throw new RuntimeException("Error while getting couriers: " + e.getMessage());
        }
    }

    public void updateCourierStatus(int id, String status) throws CourierNotFoundException {
        try {
            boolean updated = dao.updateStatus(id, status);
            if (!updated) throw new CourierNotFoundException("Courier ID " + id + " not found!");
        } catch (SQLException e) {
            throw new RuntimeException("Error updating status: " + e.getMessage());
        }
    }

    public void deleteCourier(int id) throws CourierNotFoundException {
        try {
            boolean deleted = dao.deleteCourier(id);
            if (!deleted) throw new CourierNotFoundException("Courier ID " + id + " not found!");
        } catch (SQLException e) {
            throw new RuntimeException("Error deleting courier: " + e.getMessage());
        }
    }

}
