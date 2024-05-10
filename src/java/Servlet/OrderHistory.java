
package Servlet;

import Dao.Order;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.OrderDetails;

/**
 *
 * @author dillo
 */
@WebServlet(name = "OrderHistory", urlPatterns = {"/OrderHistory"})
public class OrderHistory extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
       HttpSession session = request.getSession();
       
       Integer userId = (Integer) session.getAttribute("auth");
        Order order =new Order();
        
        List <OrderDetails> history = order.getOrders(userId);
        request.setAttribute("orderhistory", history);
        RequestDispatcher rd =request.getRequestDispatcher("Orders.jsp");
        rd.forward(request, response);
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
