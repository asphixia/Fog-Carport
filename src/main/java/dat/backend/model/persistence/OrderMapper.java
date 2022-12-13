package dat.backend.model.persistence;

import dat.backend.model.entities.Order;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OrderMapper {

    static ConnectionPool connectionPool;

    public OrderMapper(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }

    public static Order createOrder(int orderId, int userId, int price, int producktId, int orderDate, int length, int width) {
        Logger.getLogger("web").log(Level.INFO, "");
        Order order = null;
        String sql = "INSERT INTO `order` (orderId, userId, price, productId, ordreDate, length , width) VALUES (?,?,?,?,?,?,?)";
        try (Connection connection = connectionPool.getConnection()) {
            try (PreparedStatement ps = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
                ps.setInt(1, order.getOrderId());
                ps.setInt(2, order.getUserId());
                ps.setInt(3, order.getPrice());
                ps.setInt(4, order.getProducktId());
                ps.setInt(5, order.getOrderDate());
                ps.setInt(6, order.getLength());
                ps.setInt(7, order.getWidth());
                ResultSet rs = ps.getGeneratedKeys();
                rs.next();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return order;


    }
}
