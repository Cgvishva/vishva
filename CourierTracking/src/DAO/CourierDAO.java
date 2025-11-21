package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import model.Courier;
import connection.DBConnections;
import quereis.CourierQuery;
public class CourierDAO {

    public void addCourier(Courier c) throws SQLException {
        try (Connection cn = DBConnections.getConnection();
             PreparedStatement ps = cn.prepareStatement(CourierQuery.ADD)) {
            ps.setString(1, c.getSenderName());
            ps.setString(2, c.getReceiverName());
            ps.setString(3, c.getsource());
            ps.setString(4, c.getdestination());
            ps.setString(5, c.getStatus());
            ps.executeUpdate();
        }
    }

    public List<Courier> getAllCouriers() throws SQLException {
        List<Courier> list = new ArrayList<>();
        try (Connection cn = DBConnections.getConnection();
             Statement st = cn.createStatement();
             ResultSet rs = st.executeQuery(CourierQuery.ALL_COURIERS)) {
            while (rs.next()) {
                Courier c = new Courier(rs.getInt("id"),rs.getString("sender_name"),rs.getString("receiver_name"),rs.getString("source"),rs.getString("destination"),rs.getString("status"));
                list.add(c);
            }
        }
        return list;
    }

    public boolean updateStatus(int id, String status) throws SQLException {
        try (Connection cn = DBConnections.getConnection();
             PreparedStatement ps = cn.prepareStatement(CourierQuery.UPDATE)) {
            ps.setString(1, status);
            ps.setInt(2, id);
            int rows = ps.executeUpdate();
            return rows > 0;
        }
    }

    public boolean deleteCourier(int id) throws SQLException {
        try (Connection cn = DBConnections.getConnection();
             PreparedStatement ps = cn.prepareStatement(CourierQuery.DELETE)) {
            ps.setInt(1, id);
            int rows = ps.executeUpdate();
            return rows > 0;
        }
    }
}
