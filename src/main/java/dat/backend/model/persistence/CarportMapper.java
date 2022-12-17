package dat.backend.model.persistence;

import dat.backend.model.entities.Carport;
import dat.backend.model.entities.ShoppingCart;
import dat.backend.model.entities.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CarportMapper {

    public static List<Carport> Carport(ConnectionPool connectionPool) {
        List<Carport> carportList = new ArrayList<>();
        String sql = "SELECT * FROM carport.ordres";

        try (Connection connection = connectionPool.getConnection()) {
            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
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

    public static int creatOrder(User user, ConnectionPool connectionPool) {
        String sql = "insert into orders (username) value (?)";

        try (Connection connection = connectionPool.getConnection()) {
            try (PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                ps.setString(1, user.getUsername());
                ps.executeUpdate();
                ResultSet rs = ps.getGeneratedKeys();
                rs.next();
                return rs.getInt(1);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static void insertOrderLines(int order_id, ShoppingCart cart, ConnectionPool connectionPool)
    {
        String sql = "insert into order_lines (order_id,carport_id,User_id,Carport_price) value (?,?,?,?)";

        try (Connection connection = connectionPool.getConnection())
        {
            for (Carport carport : cart.getCarportList() )
            {
                try (PreparedStatement ps = connection.prepareStatement(sql))
                {
                    ps.setInt(1,order_id);
                    ps.setInt(2,carport.getWidth());
                    ps.setInt(3,carport.getLenght());
                    ps.setInt(3,carport.getR_lenght());
                    ps.setInt(4,carport.getR_width());
                    ps.executeUpdate();
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void Carport(int width, int length, int r_width, int r_length, ConnectionPool connectionPool)
    {

    }
}
