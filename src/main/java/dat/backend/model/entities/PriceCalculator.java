package dat.backend.model.entities;

import dat.backend.model.Order;
import dat.backend.model.persistence.ConnectionPool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PriceCalculator {

    private static double Pris;
    private static double Pris_spær;
    private static double Pris_rem;

    public static Materialer getMaterialer(int materiale_id, ConnectionPool connectionPool)
    {
        String sql = "select * from materialer where price_per_unit = ?";

        try (Connection connection = connectionPool.getConnection())
        {
            try (PreparedStatement ps = connection.prepareStatement(sql))
            {
                ps.setInt(1, materiale_id);
                ResultSet rs = ps.executeQuery();
                if (rs.next())
                {

                    return new Order(rs.getInt("price_per_unit"));


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

    public static double totalPris(){

       Pris_spær = LengthCalculator.SpærBeregning()*getMaterialer(int materiale_id,ConnectionPool,connectionPool);
       Pris_rem = LengthCalculator.RemBeregning()*getMaterialer();
       Pris_Stolpe=LengthCalculator.StolpeBeregning()*getMaterialer()

}

    private static double getMaterialer() {


    }
