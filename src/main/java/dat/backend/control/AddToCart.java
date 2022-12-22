package dat.backend.control;

import dat.backend.model.config.ApplicationStart;
import dat.backend.model.entities.*;
import dat.backend.model.persistence.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

@WebServlet(name = "AddToCart", value = "/addtocart")
public class AddToCart extends HttpServlet
{

    private static final String INSERT_QUERY ="INSERT INTO carport.ordres( username,width,lengthe ,r_width,r_length) VALUES(?,?,?,?,?)";
    private ConnectionPool connectionPool;


    @Override
    public void init() throws ServletException
    {
        this.connectionPool = ApplicationStart.getConnectionPool();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        HttpSession session = request.getSession();
        ShoppingCart cart = (ShoppingCart) session.getAttribute("cart");
        if (cart == null)
        {
            cart = new ShoppingCart();
        }
        Basket basket1 = (Basket) session.getAttribute("basket");
        User user = (User) session.getAttribute("user");
        PrintWriter pw = response.getWriter();
        response.setContentType("text/html");





        int width = Integer.parseInt(request.getParameter("width"));
        int lengthe = Integer.parseInt(request.getParameter("lengthe"));
        int r_width = Integer.parseInt(request.getParameter("r_width"));
        int r_length = Integer.parseInt(request.getParameter("r_length"));

       /* try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carport","root","root");
             PreparedStatement ps = con.prepareStatement(INSERT_QUERY);) {
           ps.setString(1, user.getUsername());
            ps.setInt(2,width);
            ps.setInt(3,lengthe);
            ps.setInt(4,r_width);
            ps.setInt(5,r_length);

            int count = ps.executeUpdate();

            if (count == 0) {
                pw.println("Record not stored into database");
            } else {
                pw.println("Record Stored into Database");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        pw.close();*/
       // order = CarportMapper.creatOrder(user.getUsername(), width,lengthe,r_width,r_length);
        Basket basket = new Basket(width,lengthe,r_width,lengthe);
        basket.add(basket1);
       Carport carport = new Carport(width,lengthe,r_width,r_length);
        cart.add(carport);
        //session.setAttribute("basket1",basket1);
       session.setAttribute("cart",cart);
        //request.setAttribute("cartsize",cart.getNumberOfCarport());


        Map<Integer, Materialer> materialerMap = (Map<Integer,Materialer>) getServletContext().getAttribute("materialeMap");


        Calculator calculator = new Calculator(materialerMap);
        calculator.antalSkruer();


        request.getRequestDispatcher("WEB-INF/welcome.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

       /*HttpSession session = request.getSession();
        ShoppingCart cart = (ShoppingCart) session.getAttribute("cart");
        User user = (User) session.getAttribute("user");
        PrintWriter pw = response.getWriter();
        response.setContentType("text/html");




        int width = Integer.parseInt(request.getParameter("width"));
        int length = Integer.parseInt(request.getParameter("length"));
        int r_width = Integer.parseInt(request.getParameter("r_width"));
        int r_length = Integer.parseInt(request.getParameter("r_length"));

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carport","root","root");
        PreparedStatement ps = con.prepareStatement(INSERT_QUERY);) {
            ps.setInt(1,width);
            ps.setInt(2,length);
            ps.setInt(3,r_width);
            ps.setInt(4,r_length);

            int count = ps.executeUpdate();

            if (count == 0) {
                pw.println("Record not stored into database");
            } else {
                pw.println("Record Stored into Database");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        pw.close();

        Carport carport = new Carport(width,length,r_width,r_length);
        cart.add(carport);
        session.setAttribute("cart",cart);
        request.setAttribute("cartsize",cart.getNumberOfCarport());*/

        doGet(request,response);

    }
}
