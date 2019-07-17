package Filter;

import DoaDb.CustomerDao;
import model.Customer;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter("/login")
public class LoginFilter implements Filter {
    private CustomerDao dao=new CustomerDao();

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //super.doGet(req, resp);
        //System.out.println("hiiiiiiiiiiiiiiiiiiiii");

        HttpServletRequest req=(HttpServletRequest)servletRequest;
        HttpServletResponse resp= (HttpServletResponse) servletResponse;
        String username= req.getParameter("username");
        String password=req.getParameter("password");

        System.out.println("this is before the loop");

        for(Customer c:dao.getAllCustomers()) {
            System.out.println(c.getUsername());
            System.out.println("this is after the loop hhhiiiiiiiiiiiiiiiiii");
            //if ((c.getUsername().equals(username)) && (c.getPassword().equals(password))) {
            if((username.equals(c.getUsername()))  &&(password.equals(c.getPassword()))){
                System.out.println("this is after the loop hhhiiiiiiiiiiiiiiiiii welcomeemeemmem");
                HttpSession session = req.getSession();
                session.setAttribute("username", username);
                session.setAttribute("password", password);
                filterChain.doFilter(req,resp);
            }
        }
        RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
        dispatcher.forward(req,resp);

    }

    @Override
    public void destroy() {

    }
}