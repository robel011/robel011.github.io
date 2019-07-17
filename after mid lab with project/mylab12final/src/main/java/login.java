import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(" ")
public class login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp);

        String uname=req.getParameter("username");
        String pass=req.getParameter("password");

        HttpSession session=req.getSession();
        session.setAttribute("username",uname);
        session.setAttribute("password",pass);

        RequestDispatcher dispatcher=req.getRequestDispatcher("index.jsp");
        dispatcher.forward(req,resp);
    }
}
