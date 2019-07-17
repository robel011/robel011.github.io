import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/support")
public class Lab11 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        //String supportEmail= this.getServletContext().getInitParameter("support-Email");

        ServletContext ctxt= req.getServletContext();
        String supportEmail=ctxt.getInitParameter("support-Email");

        long ticketNumber = Math.round(Math.random()*10000);
        resp.getWriter().println("Thank you!  "+ name + " for contacting us." +
                "We should receive reply from us with in 24 hrs in your email address " + email + "."+
                        "Let us know in our support email " + supportEmail + " if you do not receive reply within 24 hrs." +
                "Please be sure to attach your reference  " + ticketNumber + " in your email." );

    }
}
