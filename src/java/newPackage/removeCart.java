
package newPackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author dillo
 */
@WebServlet(name = "removeCart", urlPatterns = {"/removeCart"})
public class removeCart extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
       int index = Integer.parseInt(request.getParameter("index"));

        // Retrieve the product list from the session
        HttpSession session = request.getSession();
        List<Cart> cartList = (List<Cart>) session.getAttribute("cartList");

        // Remove the item from the list
        if ( cartList != null && index >= 0 && index < cartList.size()) {
            cartList.remove(index);
            // Update the session attribute
            session.setAttribute("cartList", cartList);
        }

        // Redirect back to the original page
        
        response.sendRedirect("Cart.jsp");
    }
    


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
