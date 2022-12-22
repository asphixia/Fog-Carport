package dat.backend.control;

import dat.backend.model.config.ApplicationStart;
import dat.backend.model.entities.*;
import dat.backend.model.persistence.*;
import dat.backend.model.services.Calculator;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

@WebServlet(name = "AddToCart", value = "/addtocart")
public class AddToCart extends HttpServlet {

    private ConnectionPool connectionPool;


    @Override
    public void init() throws ServletException
    {
        this.connectionPool = ApplicationStart.getConnectionPool();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        ShoppingCart cart = (ShoppingCart) session.getAttribute("cart");
        if (cart == null) {
            cart = new ShoppingCart();
        }
        PrintWriter pw = response.getWriter();
        response.setContentType("text/html");


        int width = Integer.parseInt(request.getParameter("width"));
        int lengthe = Integer.parseInt(request.getParameter("lengthe"));
        int r_width = Integer.parseInt(request.getParameter("r_width"));
        int r_length = Integer.parseInt(request.getParameter("r_length"));



        Carport carport = new Carport(width, lengthe, r_width, r_length);
        cart.add(carport);
        session.setAttribute("cart", cart);
        request.setAttribute("cartsize",cart.getNumberOfCarport());

        request.getRequestDispatcher("WEB-INF/welcome.jsp").forward(request, response);

        //Map<Integer, Materialer> materialerMap = (Map<Integer, Materialer>) getServletContext().getAttribute("materialeMap");
        //Calculator calculator = new Calculator(materialerMap);
       // calculator.antalSkruer();

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        doGet(request, response);

    }
}
