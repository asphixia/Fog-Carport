package dat.backend.model.persistence;

import dat.backend.model.entities.User;
import dat.backend.model.exceptions.DatabaseException;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserMapper
{
    static ConnectionPool connectionPool;
    public UserMapper(ConnectionPool connectionPool){
        this.connectionPool = connectionPool;
    }
    static User login(String email, String password, ConnectionPool connectionPool) throws DatabaseException
    {
        Logger.getLogger("web").log(Level.INFO, "");

        User user = null;

        String sql = "SELECT * FROM user WHERE email = ? AND password = ?";

        try (Connection connection = connectionPool.getConnection())
        {
            try (PreparedStatement ps = connection.prepareStatement(sql))
            {
                ps.setString(1, email);
                ps.setString(2, password);
                ResultSet rs = ps.executeQuery();
                if (rs.next())
                {
                    String userrole = rs.getString("userrole");
                    int balance = rs.getInt("balance");
                    String role = rs.getString("role");
                    String address = rs.getString("address");
                    int tlfNmr = rs.getInt("tlfNmr");
                    user = new User(email, password, role, balance, address, tlfNmr);
                } else
                {
                    throw new DatabaseException("Wrong username or password");
                }
            }
        } catch (SQLException ex)

        {
            throw new DatabaseException(ex, "Error logging in. Something went wrong with the database");
        }
        return user;
    }

    public static User createUser(String email, String password, int balance, String address, String role, int tlfNmr) throws DatabaseException
    {
        Logger.getLogger("web").log(Level.INFO, "");
        User user = null;
        String sql = "insert into user (username, password, role) values (?,?,?)";
        try (Connection connection = connectionPool.getConnection())
        {
            try (PreparedStatement ps = connection.prepareStatement(sql))
            {
                ps.setString(1, email);
                ps.setString(2, password);
                ps.setString(3, role);
                ps.setInt(4, balance);
                ps.setString(5, address);
                ps.setInt(6, tlfNmr);
                int rowsAffected = ps.executeUpdate();
                if(rowsAffected == 1){
                    user = new User(email, password, role, balance, address, tlfNmr);
                }else{
                    throw new DatabaseException("The user with username = " + email + " could not be inserted into the database");
                }


            }
        }
        catch (SQLException ex)
        {
            throw new DatabaseException(ex, "Could not insert username into database");
        }
        return user;
    }


}
