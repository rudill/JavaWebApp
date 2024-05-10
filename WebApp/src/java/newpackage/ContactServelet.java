
package Servlet;



import Dao.Contact;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ContactServelet", urlPatterns = {"/ContactServelet"})
public class ContactServelet extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
      
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
         String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String message = request.getParameter("message");

      

        try {
        Contact c = new Contact();
        c.Contact(firstName, lastName, email, message);

            response.getWriter().println("<p>Thank you for contacting us! Your message has been submitted.</p>");
        } catch (Exception e) {
            response.getWriter().println("<p>Error submitting message: " + e.getMessage() );
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
