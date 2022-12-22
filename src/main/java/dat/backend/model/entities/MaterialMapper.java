package dat.backend.model.entities;

import dat.backend.model.Order;
import dat.backend.model.persistence.ConnectionPool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MaterialMapper {


    public static Order getOrder(int ordre_id, ConnectionPool connectionPool)
    {
        String sql = "select * from ordre where ordre_id = ?";

        try (Connection connection = connectionPool.getConnection())
        {
            try (PreparedStatement ps = connection.prepareStatement(sql))
            {
                ps.setInt(1, ordre_id);
                ResultSet rs = ps.executeQuery();
                if (rs.next())
                {

                    return new Order(rs.getInt("ordre_id"),rs.getString("username"),rs.getInt("total price"),
                                     rs.getInt("produkt_id"),
                                     rs.getTimestamp("ordredate").toLocalDateTime(),rs.getInt("længde"),rs.getInt("bredde"),
                                     rs.getInt("skur_længde"),rs.getInt("skur_bredde"),rs.getInt("status_id"));
                }
                else
                {
                    return null;
                }
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    }






}
