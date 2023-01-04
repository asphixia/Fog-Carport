package dat.backend.control;

import dat.backend.model.config.ApplicationStart;
import dat.backend.model.entities.Carport;
import dat.backend.model.entities.Materialer;
import dat.backend.model.entities.ShoppingCart;
import dat.backend.model.entities.User;
import dat.backend.model.exceptions.DatabaseException;
import dat.backend.model.persistence.CarportFacade;
import dat.backend.model.persistence.UserFacade;
import dat.backend.model.persistence.ConnectionPool;
import dat.backend.model.services.Calculator;
import dat.backend.model.services.CarportSVG;
import dat.backend.model.services.SVG;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;

@WebServlet(name = "SvgServlet", urlPatterns = {"/svg"} )
public class SvgServlet extends HttpServlet
{

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        doPost(request,response);


    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        HttpSession session = request.getSession();

        request.getSession();
        ShoppingCart cart = (ShoppingCart) session.getAttribute("cart");



        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        Locale.setDefault(new Locale("US"));

        request.setAttribute("width", cart.getLastCarport().getWidth());
        request.setAttribute("length", cart.getLastCarport().getLenghte());
       int width = Integer.parseInt(String.valueOf(request.getAttribute("width")));
       int length = Integer.parseInt(String.valueOf(request.getAttribute("length")));




        SVG carport = CarportSVG.createNewSvg(0,0,100, 100, "0 0 855 690");
        SVG outerSvg = CarportSVG.createNewSvg(0,0,100, 100, "0 0 855 690");


        carport = CarportSVG.addBeams(carport,length, width);
        carport = CarportSVG.addSides(carport, length, width);
        carport = CarportSVG.addPoles(carport, length, width);

        outerSvg = CarportSVG.addLine(outerSvg, length, width);
        outerSvg = CarportSVG.addDashedLines(outerSvg, length, width);
        outerSvg = CarportSVG.addText(outerSvg, length/2, width+40, length);
        outerSvg = CarportSVG.addText(outerSvg, 15, length/2, width);
        carport.addInnerSvg(outerSvg);





        request.setAttribute("svg", carport.toString());
        session.setAttribute("svg", carport.toString());

        request.getRequestDispatcher("WEB-INF/svgdrawing.jsp").forward(request, response);


    }

}