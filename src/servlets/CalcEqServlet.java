package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by ааааааааааеееееееее on 23.02.2017.
 */
@WebServlet(name = "CalcEqServlet")
public class CalcEqServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        int a = Integer.parseInt(request.getParameter("a"));
        int b = Integer.parseInt(request.getParameter("b"));
        int c = Integer.parseInt(request.getParameter("c"));
        int d = b * b - 4 * a * c;
        if (d < 0){
            out.print("No solutions");
        } else if (d == 0){
            double x = - b / (2*a);
            out.print(x);
        } else if (d > 0){
            double x1 = (Math.sqrt(d) - b)/(2*a);
            double x2 = (-Math.sqrt(d) - b)/(2*a);
            out.print("X1: " + x1 + "; X2: " + x2);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
