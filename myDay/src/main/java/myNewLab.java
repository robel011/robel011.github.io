import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static java.awt.Color.cyan;

//@WebServlet("/hello");
public class myNewLab extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        //resp.getWriter().println("Hello,World How are you doing. I hope u r doing great but you are not treating me well!!!");
        PrintWriter out = resp.getWriter();
        out.print("<html><head><title>Test</title></head><body>");
        out.print("<form method='post'>");
        out.print("<p>Please click the button</p>");
        out.print("<input type='submit' value='Click me'/>");
        out.print("</form>");
        out.print("</body></html>");

   }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp);
        PrintWriter out = resp.getWriter();
        out.print("<html><head><title>Test</title></head><body background-color='cyan' >");
        out.print("<p>Postback received I feel lonely, and with Wap course also makes my life miserable</p>");
        out.print("</body></html>");
    }
}
