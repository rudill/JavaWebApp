package newPackage;

import java.io.IOException;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "CheckoutServlet", urlPatterns = {"/CheckoutServlet"})
public class CheckoutServlet extends HttpServlet {

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String city = request.getParameter("city");
        String zipcode = request.getParameter("zipcode");
        String phoneno = request.getParameter("phoneno");
        String email = request.getParameter("email");
        String date = request.getParameter("date"); 
        int uid = Integer.parseInt(request.getParameter("userid"));
        
        String[] productIds = request.getParameterValues("productIds");
        String[] quantities = request.getParameterValues("quantities");
        double subtotal = Double.parseDouble(request.getParameter("subtotal"));
        
        Random random = new Random();
     
        int randomNo = random.nextInt(9000) + 1000;
        int orderID = Integer.parseInt( String.valueOf(randomNo)+String.valueOf(uid));
        
       
        
        Checkout checkout =new Checkout();
        
        checkout.UpdateUser(uid, name, address, city, zipcode, phoneno, email);
   
        checkout.InsertOrder(orderID, uid, productIds, quantities, subtotal, date);


  
        response.sendRedirect("Products.jsp");
    }
   
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
