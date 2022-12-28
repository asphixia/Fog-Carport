package dat.backend.model.persistence;


import dat.backend.model.entities.*;

import java.util.List;
import java.util.Map;

public class CarportFacade
{

    public static List<Carport> Carport(ConnectionPool connectionPool)
    {
     return CarportMapper.Carport(connectionPool);
    }

    public static void creatOrder(User user, ShoppingCart cart, double price, ConnectionPool connectionPool)
    {
        CarportMapper.creatOrder(user,cart, price,connectionPool);
    }

    public static Map<Integer, Materialer> getMaterialMap(ConnectionPool connectionPool)
    {
        return CarportMapper.getMaterialMap(connectionPool);

    }


}
