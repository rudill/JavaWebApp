
package newPackage;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dillo
 */
public class addProduct 
{
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
    
    public void Insertdata(int ID, String ProductName, String Brand, double Price, String Category, String Description, String fileName) {
        try {
            connectDB();
            String Query = "INSERT INTO product VALUES (?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(Query)) {
                preparedStatement.setInt(1, ID);
                preparedStatement.setString(2, ProductName);
                preparedStatement.setString(3, Brand);
                preparedStatement.setDouble(4, Price);
                preparedStatement.setString(5, Category);
                preparedStatement.setString(6, Description);
                preparedStatement.setString(7, fileName);
                preparedStatement.executeUpdate();
                System.out.println("Data inserted successfully.");
            }
            //connection.close(); // Close the connection after usage
        } catch (SQLException ex) {
            Logger.getLogger(addProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
