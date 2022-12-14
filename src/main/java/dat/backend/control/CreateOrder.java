package dat.backend.control;

import dat.backend.model.config.ApplicationStart;
import dat.backend.model.entities.Order;
import dat.backend.model.entities.User;
import dat.backend.model.exceptions.DatabaseException;
import dat.backend.model.persistence.ConnectionPool;
import dat.backend.model.persistence.OrderMapper;
import dat.backend.model.persistence.UserFacade;
import dat.backend.model.persistence.UserMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.*;

@WebServlet(name = "createOrder", urlPatterns = {"/createOrder"} )
public class CreateOrder extends HttpServlet {
    private ConnectionPool connectionPool;
    @Override
    public void init() throws ServletException
    {
        this.connectionPool = ApplicationStart.getConnectionPool();
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        response.setContentType("text/html");
        HttpSession session = request.getSession();
        session.setAttribute("user", null); // invalidating user object in session scope
        OrderMapper orderMapper = new OrderMapper(connectionPool);
        Order order;
        int orderId = Integer.parseInt(request.getParameter("orderId"));
        int userId = Integer.parseInt(request.getParameter("userId"));
        int price = Integer.parseInt(request.getParameter("price"));
        int productId = Integer.parseInt(request.getParameter("produckid"));
        Timestamp timeStamp = new Timestamp(System.currentTimeMillis());
        int length = Integer.parseInt(request.getParameter("length"));
        int width = Integer.parseInt(request.getParameter("width"));
        order = OrderMapper.createOrder(orderId, userId, price, productId, timeStamp, length, width);

        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }


}