package servlet;

import DoaDb.CustomerDao;
import model.Customer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class Login extends HttpServlet {
    private CustomerDao dao;
    @Override
    public void init() throws ServletException {
        dao= new CustomerDao();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
        dispatcher.forward(req,resp);




    }
//        RequestDispatcher dispatcher = req.getRequestDispatcher("checkout.jsp");
//        dispatcher.forward(req,resp);


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String username= req.getParameter("username");
        String password=req.getParameter("password");

        for(Customer c:dao.getAllCustomers()) {

            if((username.equals(c.getUsername()))  &&(password.equals(c.getPassword()))){

                HttpSession session = req.getSession();
                session.setAttribute("username", username);
                session.setAttribute("password", password);
                RequestDispatcher dispatcher = req.getRequestDispatcher("checkout.jsp");
                dispatcher.forward(req,resp);
            }

            else {
                RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
                dispatcher.forward(req,resp);
            }
        }


    }
}


