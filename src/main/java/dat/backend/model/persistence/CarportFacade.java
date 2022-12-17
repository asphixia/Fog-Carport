package dat.backend.model.persistence;


import dat.backend.model.entities.Carport;
import dat.backend.model.entities.ShoppingCart;
import dat.backend.model.entities.User;

import java.util.List;

public class CarportFacade
{

    public static List<Carport> Carport(ConnectionPool connectionPool)
    {
     return CarportMapper.Carport(connectionPool);
    }

    public static int creatOrder(User user, ConnectionPool connectionPool)
    {
        return CarportMapper.creatOrder(user,connectionPool);
    }

    public static void insertOrdderLines(int order_id, ShoppingCart cart, ConnectionPool connectionPool)
    {
        CarportMapper.insertOrderLines(order_id,cart,connectionPool);
    }

    public static void Carport(int width, int length, int r_width, int r_length, ConnectionPool connectionPool)
    {
        CarportMapper.Carport(width,length,r_width,r_length,connectionPool);
    }
}
