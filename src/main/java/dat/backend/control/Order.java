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



        double value1 = calculator.udregnStolpeAntal(cart.getLastCarport().getLenghte());
        double value2 = calculator.udregnStolpePrice();
        double value3 = calculator.udregnSpærAntal(cart.getLastCarport().getLenghte());
        double value4 = calculator.udregnSpærPrice(cart.getLastCarport().getLenghte());
        double value5 = calculator.remFrontogBackPrice(cart.getLastCarport().getWidth());
        double value6 = calculator.remSidePris(cart.getLastCarport().getLenghte());
        double value7 = calculator.remSpærPris(cart.getLastCarport().getLenghte());
        double value8 = calculator.tagpladePrice(cart.getLastCarport().getLenghte());
        double value9 = calculator.tagpladeSkruerPakkePris(cart.getLastCarport().getWidth());
        double value10 = calculator.universalBeslagPris();
        double value11 = calculator.hulbandPris();
        double value12 = calculator.prisSternOgVandbredSkruer();
        double value13 = calculator.skruerTilUniversalbeslagPris();
        double value14 = calculator.braeddeboltPris();
        double value15 = calculator.firkantSkiverPris();
        double value16 = calculator.tagpladeAntal(cart.getLastCarport().getLenghte(),cart.getLastCarport().getWidth());
        double price = (value1 + value2 + value3 + value4 + value5 +
                       value6 + value7 + value8+ value9 + value10 + value11 +
                       value12 + value13 + value14 + value15) * 1.25;


        CarportFacade.creatOrder(user, cart,price, connectionPool);

        session.setAttribute("price",price);

        getServletContext().setAttribute("materialerMap",materialerMap);
        session.setAttribute("stolpe",materialerMap.get(11).getName());
        session.setAttribute("stolpeAntal",calculator.udregnStolpeAntal(cart.getLastCarport().getLenghte()));

        session.setAttribute("spær",materialerMap.get(10).getName());
        session.setAttribute("spærAntal",calculator.udregnSpærAntal(cart.getLastCarport().getLenghte()));

        session.setAttribute("remAntal",materialerMap.get(1).getName());
        session.setAttribute("FBRemAntal",calculator.frontAndBackRemAntal());

        session.setAttribute("sRemAntal",materialerMap.get(2).getName());
        session.setAttribute("SideRemAntal",calculator.sideRemAntal());

        session.setAttribute("tagRemAntal",materialerMap.get(8).getName());
        session.setAttribute("RemPåTageAntal",calculator.remPåTagetAntal());

        session.setAttribute("pladeAntal",materialerMap.get(15).getName());
        session.setAttribute("tagpladeAntal",calculator.tagpladeAntal(cart.getLastCarport().getLenghte(),cart.getLastCarport().getWidth()));

        session.setAttribute("pakkeAntal",materialerMap.get(17).getName());
        session.setAttribute("tagpladeSkruerPakkeAntal",calculator.tagpladeSkruerPakkeAntal(cart.getLastCarport().getLenghte(),cart.getLastCarport().getWidth()));

        session.setAttribute("hulband",materialerMap.get(18).getName());
        session.setAttribute("antalHulband",calculator.antalHulband(cart.getLastCarport().getLenghte()));

        session.setAttribute("skruer",materialerMap.get(21).getName());
        session.setAttribute("SternOgVandbredSkruer",calculator.sternOgVandbredSkruer());

        session.setAttribute("beslag",materialerMap.get(22).getName());
        session.setAttribute("SkruerTilUniverSalBeslag",calculator.skruerTilUniversalbeslag(cart.getLastCarport().getLenghte()));

        session.setAttribute("bolt",materialerMap.get(23).getName());
        session.setAttribute("BraeddeBolt",calculator.braeddeBolt(cart.getLastCarport().getLenghte()));

        session.setAttribute("skiver",materialerMap.get(24).getName());
        session.setAttribute("FirkantSkiver",calculator.firkantSkiver(cart.getLastCarport().getLenghte()));










        request.getRequestDispatcher("WEB-INF/order.jsp").forward(request, response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");

        request.getRequestDispatcher("WEB-INF/order.jsp").forward(request, response);

    }
}
