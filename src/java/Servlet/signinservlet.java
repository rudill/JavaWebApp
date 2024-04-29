
package Servlet;

import Dao.loginclass;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Danuka
 */
@WebServlet(name = "signinservlet", urlPatterns = {"/signinservlet"})
public class signinservlet extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
          
        }
    }

   
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
            
    {
        String name = request.getParameter("fname");
        String password = request.getParameter("passw");
       
        loginclass login = new loginclass();
        
        boolean isValid = login.validateCus(name,password);
        
        if (isValid)
        {
            HttpSession session = request.getSession();
            session.setAttribute("auuth",name);
            
            Cookie cookie = new Cookie("name",name);
            cookie.setMaxAge(60*60*60);
            
            response.getWriter();
            response.sendRedirect("index.jsp");
        }
        
        else
        {
            PrintWriter out = response.getWriter();
            out.println("Login Faild, Please Check Your Username and Password");
            
            //response.sendRedirect("index.jsp");
    }
    }
}
        
      


