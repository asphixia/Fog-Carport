package dat.backend.control;

import dat.backend.model.config.ApplicationStart;
import dat.backend.model.entities.*;
import dat.backend.model.persistence.ConnectionPool;
import dat.backend.model.persistence.CarportFacade;
import dat.backend.model.persistence.CarportMapper;
import dat.backend.model.persistence.UserFacade;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "AddToCart", value = "/addtocart")
public class AddToCart extends HttpServlet
{

    private ConnectionPool connectionPool;


    @Override
    public void init() throws ServletException
    {
        this.connectionPool = ApplicationStart.getConnectionPool();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        HttpSession session = request.getSession();
        ShoppingCart cart = (ShoppingCart) session.getAttribute("cart");
        User user = (User) session.getAttribute("user");

        int width = Integer.parseInt(request.getParameter("width"));
        int length = Integer.parseInt(request.getParameter("length"));
        int r_width = Integer.parseInt(request.getParameter("r_width"));
        int r_length = Integer.parseInt(request.getParameter("r_length"));

        CarportFacade.Carport(width,length,r_width,r_length,connectionPool);
        Carport carport = new Carport(width,length,r_width,r_length);
        cart.add(carport);
        session.setAttribute("cart",cart);
        request.setAttribute("cartsize",cart.getNumberOfCarport());

        request.getRequestDispatcher("WEB-INF/welcome.jsp").forward(request,response);

    }
}
