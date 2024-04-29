
package Servlet;

import Dao.loginclass;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author Danuka
 */
@WebServlet(name = "Signupservlet", urlPatterns = {"/Signupservlet"})
public class Signupservlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        
        
    String username = request.getParameter("username");
    String firstname = request.getParameter("firstname");
    String lastname = request.getParameter("lastname");
    String email = request.getParameter("email");
    String password = request.getParameter("password");
    
    boolean isUnique = loginclass.isUsernameEmailUnique(username, email);
    
    if(isUnique)
    {
    
    boolean insertuser = loginclass.insertuser(username, firstname, lastname, email, password);

    if (insertuser) {
        // User registration successful, redirect to login page
        response.sendRedirect("login.jsp");
    } 
    
    else 
    {
        // Display error message indicating duplicate username or email
        response.setContentType("register.jsp"); //index mean register page
    }
    
    } 
    else
    {  
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
            out.println("Duplicate username or email. Please try again.");
            out.println("</body></html>");
            out.close(); // Close PrintWriter
        
    }
    
}

    private boolean isUsernameEmailUnique(String username, String email) {
       return true;
    }
}
