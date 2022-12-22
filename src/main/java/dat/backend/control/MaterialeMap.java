package dat.backend.control;

import dat.backend.model.config.ApplicationStart;
import dat.backend.model.entities.*;
import dat.backend.model.persistence.ConnectionPool;
import dat.backend.model.services.Calculator;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "MaterialeMap", value = "/materialeMap")
public class MaterialeMap extends HttpServlet
{


    private ConnectionPool connectionPool;



    @Override
    public void init() throws ServletException
    {
        this.connectionPool = ApplicationStart.getConnectionPool();
    }




    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<Integer,Materialer> materialerMap = new HashMap<>();




        String sql = "select * from carport.materialer";

        try (PreparedStatement ps = connectionPool.getConnection().prepareStatement(sql);) {

            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                int materiale_id = rs.getInt("materiale_id");
                String name = rs.getString("name");
                String unit = rs.getString("unit");
                int price_per_unit = rs.getInt("price_per_unit");

                Materialer materialer = new Materialer(name,unit,price_per_unit);

                /*if (user.getRole().equals("admin")){
                    request.getRequestDispatcher("WEB-INF/admin.jsp").forward(request,response);*/



                materialerMap.put(materiale_id, materialer);







                /*System.out.println("materiale_id" + materiale_id);
                System.out.println("name" + name);
                System.out.println("unit" + unit);
                System.out.println("price_pr_unit" + price_per_unit);*/

            }
            getServletContext().setAttribute("materialerMap",materialerMap);

            System.out.println(materialerMap);
            request.getRequestDispatcher("WEB-INF/tags/matrialeMap.jsp").forward(request,response);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

        @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
