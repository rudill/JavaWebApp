package newPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import newPackage.OrderDetails;

/**
 *
 * @author dillo
 */

public class Order {
    private Connection connection;
    

    public void connectDB() throws SQLException {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/store";
        
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, "root", "");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(addProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<OrderDetails> getOrders(int userId) {
    List<OrderDetails> orders = new ArrayList<>(); 
    
    try {
        connectDB();
        String query = "SELECT p.ProductName, p.Price, p.Image, o.Date, o.Subtotal, o.OrderId, o.Quantity ,u.Address, u.PhoneNO " +
                           "FROM orders o " +
                           "JOIN information u ON o.UserID = u.UserID " +
                           "JOIN product p ON o.ProductID = p.ProductID " +
                           "WHERE o.UserID = ?";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, userId);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                String productName = rs.getString("ProductName");
                double productPrice = rs.getDouble("Price");
                String date = rs.getString("Date");
                double subtotal = rs.getDouble("Subtotal");
                int orderId = rs.getInt("OrderId");
                int quantity = rs.getInt("Quantity");
                String image = rs.getString("Image");
                String address = rs.getString("Address");
                String phoneno = rs.getString("PhoneNo");

                OrderDetails order = new OrderDetails(productName, productPrice, date, subtotal, orderId, quantity, image, address, phoneno);
                orders.add(order);
            }
        } 

    } catch (SQLException ex) {
        Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    return orders;  
}

    
    }



