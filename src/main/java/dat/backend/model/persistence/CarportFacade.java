package dat.backend.model.persistence;


import dat.backend.model.entities.Carport;
import dat.backend.model.entities.Order;
import dat.backend.model.entities.ShoppingCart;
import dat.backend.model.entities.User;

import java.util.List;

public class CarportFacade
{

    public static List<Carport> Carport(ConnectionPool connectionPool)
    {
     return CarportMapper.Carport(connectionPool);
    }

    public static void creatOrder(User user,ShoppingCart cart,ConnectionPool connectionPool)
    {
        CarportMapper.creatOrder(user,cart,connectionPool);
    }


}
