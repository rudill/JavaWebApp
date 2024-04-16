
package newPackage;

import java.io.IOException;
import java.util.ArrayList;
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
@WebServlet(name = "addToCart", urlPatterns = {"/addToCart"})
public class addToCart extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
       int ID = Integer.parseInt(request.getParameter("id"));
       String action = request.getParameter("action");
       
       //PrintWriter out = response.getWriter();
        List<Cart> cartList = (List<Cart>) request.getSession().getAttribute("cartList");

       for (Cart cart : cartList) {
        if (cart.getID() == ID) {
            // Update quantity based on the action
            if ("increase".equals(action)) {
                cart.setQuantity(cart.getQuantity() + 1);
            } else if ("decrease".equals(action)) {
                // Ensure quantity doesn't go negative
                if (cart.getQuantity() > 0) {
                    cart.setQuantity(cart.getQuantity() - 1);
                }
            }
            break;
        }
    }
       
    Subtotal(cartList, request.getSession());

        response.sendRedirect("Cart.jsp");
    }
    

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        int ID = Integer.parseInt(request.getParameter("productId"));
        String ProductName = request.getParameter("productName");
        double Price = Double.parseDouble(request.getParameter("Price"));
        String Category = request.getParameter("Category");
        String Image = request.getParameter("Image");
        int Quantity=1;
        
       Cart cart = new Cart(ID,ProductName,Price,Category,Image,Quantity);
        
         HttpSession session = request.getSession();
// Retrieve or create the list in session
         List<Cart> cartList = (List<Cart>) session.getAttribute("cartList");
           if (cartList == null) {
           cartList = new ArrayList<>();
           }else {
    // Check if the product already exists in the list
    for (Cart existingCart : cartList) {
        if (existingCart.getID() == cart.getID()) {
          
            response.sendRedirect("Cart.jsp");
            return; 
        }
    }
    }

// Add the product to the list
         cartList.add(cart);
         

// Store the list in session

     session.setAttribute("cartList", cartList);
     Subtotal(cartList, request.getSession());
     response.sendRedirect("Products.jsp");
    }
    
     private void Subtotal(List<Cart> cartList, HttpSession session) {
        // Recalculate subtotal
        double subtotal = 0;
        for (Cart cart : cartList) {
            subtotal += cart.getPrice() * cart.getQuantity();
        }
   
    
    // Update session with formatted subtotal
    session.setAttribute("subtotal",subtotal);
    }
        
 
      
    

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
