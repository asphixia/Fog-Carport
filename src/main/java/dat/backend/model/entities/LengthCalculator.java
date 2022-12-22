package dat.backend.model.entities;

import dat.backend.model.Order;
import dat.backend.model.persistence.ConnectionPool;

public class LengthCalculator {

    public static double StolpeBeregning (int ordre_id) {

      Order order = new MaterialMapper().getOrder(ordre_id, new ConnectionPool());
      int TotalLængde = Calculator.StolpeAntal( order.getLængde(), order.getBredde()).size() *Calculator.stolpeLængder();

      return TotalLængde;


    }

    public static double RemBeregning(int ordre_id){

        Order order = new MaterialMapper().getOrder(ordre_id,new ConnectionPool());
        int TotalLængde = (2*(Calculator.remSideLængder(order.getLængde())+2*Calculator.RemFrontOgBag(order.getBredde())));

        return TotalLængde;
    }

    public static double SpærBeregning(int ordre_id){

       Order order = new MaterialMapper().getOrder(ordre_id,new ConnectionPool());

       int TotalLængde = Calculator.spærLængder(order.getLængde()) * Calculator.spærAntal(order.getBredde()).size();

       return TotalLængde;
    }




}
