package dat.backend.model.entities;


import dat.backend.control.Order;
import dat.backend.model.services.Calculator;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart
{
    private List<Carport> carportList = new ArrayList<>();

    public ShoppingCart()
    {
    }

    public void add(Carport carport)
    {
        carportList.add(carport);
    }

    public int getNumberOfCarport()
    {
        return carportList.size();
    }
    public List<Carport> getCarportList()
    {
        return carportList;
    }

    public void resetCart()
    {
        carportList.clear();
    }

    public Carport getLastCarport()
    {

        return carportList.get(carportList.size()-1);
    }


}
