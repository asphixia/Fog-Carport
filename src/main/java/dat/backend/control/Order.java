package dat.backend.control;

import dat.backend.model.config.ApplicationStart;
import dat.backend.model.entities.Carport;
import dat.backend.model.entities.Materialer;
import dat.backend.model.entities.ShoppingCart;
import dat.backend.model.entities.User;
import dat.backend.model.persistence.CarportFacade;
import dat.backend.model.persistence.ConnectionPool;
import dat.backend.model.services.Calculator;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Map;

@WebServlet(name = "Order", value = "/order")
public class Order extends HttpServlet
{
    private ConnectionPool connectionPool;




    @Override
    public void init() throws ServletException {
        this.connectionPool = ApplicationStart.getConnectionPool();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        ShoppingCart cart1 = (ShoppingCart) session.getAttribute("cart");
        if (cart1 == null) {
            cart1 = new ShoppingCart();
        }

        ShoppingCart cart = (ShoppingCart) session.getAttribute("cart");

        User user = (User) session.getAttribute("user");

        Map<Integer, Materialer> materialerMap = (Map<Integer, Materialer>) getServletContext().getAttribute("materialeMap");
        if (materialerMap == null)
        {
            materialerMap = CarportFacade.getMaterialMap(connectionPool);
            getServletContext().setAttribute("materialerMap",materialerMap);
        }
        Calculator calculator = new Calculator(materialerMap);


        double value = calculator.udregnStolpeAntal(cart.getLastCarport().getLenghte());
        double value1 = calculator.udregnStolpePrice();
        double value2 = calculator.udregnSpærAntal(cart.getLastCarport().getLenghte());
        double value3 = calculator.udregnSpærPrice(cart.getLastCarport().getLenghte());
        double value4 = calculator.frontAndBackRemAntal();
        double value5 = calculator.remFrontogBackPrice(cart.getLastCarport().getWidth());
        double value6 = calculator.remSidePrice(cart.getLastCarport().getLenghte());
        double value7 = calculator.remSpærPrice(cart.getLastCarport().getLenghte());
        double value8 = calculator.antalHulband(cart.getLastCarport().getLenghte());
        double price = (value1 + value3 + value5 + value6 + value7 + value8 + calculator.totalCarportPrice());

        CarportFacade.creatOrder(user, cart,price, connectionPool);

        session.setAttribute("price",price);

        getServletContext().setAttribute("materialerMap",materialerMap);

        request.getRequestDispatcher("WEB-INF/order.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");


        request.getRequestDispatcher("WEB-INF/order.jsp").forward(request, response);

    }
}
