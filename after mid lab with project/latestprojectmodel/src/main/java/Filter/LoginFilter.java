package Filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

//@WebFilter("/checkout","/admin")
public class LoginFilter implements Filter {


    public void init(FilterConfig filterConfig) throws ServletException {

    }


    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) servletRequest;
        PrintWriter out = servletResponse.getWriter();

        HttpSession session = req.getSession();

        if ((session.getAttribute("username") == null) || (session.getAttribute("password") == null)) {


            req.getRequestDispatcher("login").forward(servletRequest, servletResponse);
            String error = " Wrong user name or Password";
            req.setAttribute("errorMessage", "userName or Password is Wrong");


        } else {

            filterChain.doFilter(servletRequest, servletResponse);
            System.out.println(" old User,filter forward");

        }


    }

    public void destroy() {

    }
}