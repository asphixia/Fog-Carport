package dat.backend.model.persistence;

import dat.backend.model.entities.*;


import javax.servlet.ServletContext;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CarportMapper {

    public CarportMapper(ConnectionPool connectionPool) {
    }


    public static List<Carport> Carport(ConnectionPool connectionPool) {
        List<Carport> carportList = new ArrayList<>();

        String sql = "SELECT * FROM carport.ordres";

        try (Connection connection = connectionPool.getConnection()) {

            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    int ordre_id = rs.getInt("ordre_id");
                    String username = rs.getString("username");
                    Timestamp ordredate = rs.getTimestamp("ordredate");
                    int width = rs.getInt("width");
                    int length = rs.getInt("length");
                    int r_width = rs.getInt("r_width");
                    int r_length = rs.getInt("r_length");
                    Carport newCarport = new Carport(width, length, r_width, r_length);
                    carportList.add(newCarport);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return carportList;
    }

    public static void creatOrder(User user, ShoppingCart cart, double price, ConnectionPool connectionPool) {

        String sql = "insert into carport.ordres (username,width,lengthe,r_width,r_length,price) values (?,?,?,?,?,?)";

        try (Connection connection = connectionPool.getConnection()) {
            for (Carport carport : cart.getCarportList()) {

                try (PreparedStatement ps = connection.prepareStatement(sql)) {

                    ps.setString(1, user.getUsername());
                    ps.setInt(2, carport.getWidth());
                    ps.setInt(3, carport.getLenghte());
                    ps.setInt(4, carport.getR_width());
                    ps.setInt(5, carport.getR_lenght());
                    ps.setDouble(6,price);
                    ps.executeUpdate();

                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static Map<Integer, Materialer> getMaterialMap(ConnectionPool connectionPool) {
        Map<Integer, Materialer> materialerMap = new HashMap<>();

        String sql = "select * from carport.materialer";

        try (PreparedStatement ps = connectionPool.getConnection().prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int materiale_id = rs.getInt("materiale_id");
                String name = rs.getString("name");
                String unit = rs.getString("unit");
                int price_per_unit = rs.getInt("price_per_unit");
                Materialer materialer = new Materialer(name, unit, price_per_unit);
                materialerMap.put(materiale_id, materialer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return materialerMap;
    }
}
