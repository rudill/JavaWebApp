
package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Checkout 

{
    private Connection connection;
    
    public void connectDB() throws SQLException {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/store";
        
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, "root", "");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Checkout.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void UpdateUser(int uID, String Name, String Address, String City, String Zipcode, String PhoneNo, String Email){
        
        try {
            connectDB();
            String updateSql = "UPDATE information " +
                        "SET UName=?, Address=?, City=?, Zipcode=?, PhoneNO=?, OEmail=? " +
                        "WHERE UserID=?";
            
            PreparedStatement pstmt1 = connection.prepareStatement(updateSql);
            
            pstmt1.setString(1, Name);
            pstmt1.setString(2, Address);
            pstmt1.setString(3, City);
            pstmt1.setString(4, Zipcode);
            pstmt1.setString(5, PhoneNo);
            pstmt1.setString(6, Email);
            pstmt1.setInt(7, uID);
            
            pstmt1.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Checkout.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void InsertOrder(int OrderId ,int uID, String[] productIds ,String[] quantities , double subtotal, String Date){
        
        try {
            connectDB();
            
            String insertSql = "INSERT INTO orders (OrderID, UserID, ProductID, Quantity, Subtotal, Date) " +
                        "VALUES (?, ?,?, ?, ?, ?)";
            
            PreparedStatement pstmt2 = connection.prepareStatement(insertSql);
            
            for (int i = 0; i < productIds.length; i++) {
                   pstmt2.setInt(1, OrderId);
                   pstmt2.setInt(2, uID);
                   pstmt2.setInt(3, Integer.parseInt(productIds[i]));
                   pstmt2.setInt(4, Integer.parseInt(quantities[i]));
                   pstmt2.setDouble(5, subtotal);
                   pstmt2.setString(6, Date);
                   pstmt2.addBatch();
         }
            pstmt2.executeBatch();
        
            
        } catch (SQLException ex) {
            Logger.getLogger(Checkout.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
