package dat.backend.control;

import dat.backend.model.config.ApplicationStart;
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
public class Order extends HttpServlet {
    private ConnectionPool connectionPool;

    @Override
    public void init() throws ServletException {
        this.connectionPool = ApplicationStart.getConnectionPool();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        ShoppingCart cart = (ShoppingCart) session.getAttribute("cart");
        User user = (User) session.getAttribute("user");


        CarportFacade.creatOrder(user, cart, connectionPool);


        Map<Integer, Materialer> materialerMap = (Map<Integer, Materialer>) getServletContext().getAttribute("materialeMap");
        Calculator calculator = new Calculator(materialerMap);
        int value = calculator.udregnStolpeAntal(cart.getLastCarport().getLenghte());
        System.out.println(value);
        int value2 = calculator.udregnStolpePrice();
        System.out.println(value2);
        //System.out.println(calculator);
        // calculator.antalSkruer();


        request.getRequestDispatcher("WEB-INF/order.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");

        request.getRequestDispatcher("WEB-INF/order.jsp").forward(request,response);

    }
}
