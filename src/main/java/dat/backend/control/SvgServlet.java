package dat.backend.control;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SvgServlet", value = "/svg")
public class SvgServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String svg = "<svg  xmlns=\"http://www.w3.org/2000/svg\"\n" +
                "      xmlns:xlink=\"http://www.w3.org/1999/xlink\"\n" +
                "      width=\"127\" height=\"105\"  viewBox=\"0 0 255 210\">\n" +
                "    <rect x=\"0\" y=\"0\" height=\"90\" width=\"90\"\n" +
                "          style=\"stroke:#6dab6e; fill: #004B87\"/>\n" +
                "\n" +
                "    <rect x=\"120\" y=\"0\" height=\"90\" width=\"135\"\n" +
                "          style=\"stroke:#000000; fill: #004B87\"/>\n" +
                "    <rect x=\"0\" y=\"120\" height=\"90\" width=\"90\"\n" +
                "          style=\"stroke:#000000; fill: #004B87\"/>\n" +
                "    <rect x=\"120\" y=\"120\" height=\"90\" width=\"135\"\n" +
                "          style=\"stroke:#000000; fill: #004B87\"/>\n" +
                "</svg>";
        request.setAttribute("svg",svg);
        request.getRequestDispatcher("WEB-INF/svgdrawing.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
