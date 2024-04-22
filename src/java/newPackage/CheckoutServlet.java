/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newPackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "CheckoutServlet", urlPatterns = {"/CheckoutServlet"})
public class CheckoutServlet extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           
        }
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
        String fristname = request.getParameter("fname");
        String lastname = request.getParameter("lname");
        String address = request.getParameter("address");
        String city = request.getParameter("city");
        String zipcode = request.getParameter("zipcode");
        String phoneno = request.getParameter("phoneno");
        String email = request.getParameter("email");
        
        String[] productIds = request.getParameterValues("productIds");
        String[] quantities = request.getParameterValues("quantities");
        double subtotal = Double.parseDouble(request.getParameter("subtotal"));
        
        PrintWriter out = response.getWriter();
        
        out.print(fristname+lastname+address+city+zipcode+phoneno+email+subtotal);
        
        if (productIds != null && quantities != null && productIds.length == quantities.length) {
        for (int i = 0; i < productIds.length; i++) {
            String productId = productIds[i];
            String quantity = quantities[i];
            
            
            out.println("Product ID: " + productId + ", Quantity: " + quantity);
        }
    } else {
        
        System.out.println("Error:IDs and quantities are null ");
    }
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
