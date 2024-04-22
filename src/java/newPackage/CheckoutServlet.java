
package newPackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
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
        
        PrintWriter out = response.getWriter();
        
        String url = "jdbc:mysql://localhost:3306/store";

// SQL statement for updating the Information table
String updateSql = "UPDATE information " +
                        "SET UName=?, Address=?, City=?, Zipcode=?, PhoneNO=?, OEmail=? " +
                        "WHERE UserID=?";

// SQL statement for inserting values into the Order table
String insertSql = "INSERT INTO orders (UserID, PID, Quantity, Subtotal, Date) " +
                        "VALUES (?, ?, ?, ?, ?)";

try (
    
    Connection conn = DriverManager.getConnection(url, "root", "");
    // Create prepared statements
    PreparedStatement pstmt1 = conn.prepareStatement(updateSql);
    PreparedStatement pstmt2 = conn.prepareStatement(insertSql)
) {
    
    pstmt1.setString(1, name);
    pstmt1.setString(2, address);
    pstmt1.setString(3, city);
    pstmt1.setString(4, zipcode);
    pstmt1.setString(5, phoneno);
    pstmt1.setString(6, email);
    pstmt1.setInt(7, uid);

    
    int rowsAffected = pstmt1.executeUpdate();
    System.out.println("Rows affected in Information table: " + rowsAffected);
            
    
    for (int i = 0; i < productIds.length; i++) {
        pstmt2.setInt(1, uid);
        pstmt2.setInt(2, Integer.parseInt(productIds[i]));
        pstmt2.setInt(3, Integer.parseInt(quantities[i]));
        pstmt2.setDouble(4, subtotal);
        pstmt2.setString(5, date);
        pstmt2.addBatch();
    }
    int[] rowsAffectedBatch = pstmt2.executeBatch();
    System.out.println("Rows affected in Order table: " + rowsAffectedBatch.length);
} catch (SQLException e) {
    e.printStackTrace();
}
  
        response.sendRedirect("Products.jsp");
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
