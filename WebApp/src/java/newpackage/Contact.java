
package Dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dillo
 */
public class Contact {
    
     private Connection connection;
    
    public void connectDB() throws SQLException {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/store";
        
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, "root", "");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Contact.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void Contact(String Name ,String LName, String Email, String Message)
    {
       
           try {
               connectDB();
               String sql = "INSERT INTO contacts (first name, last name, email, message) VALUES (?, ?, ?, ?)";
           
            
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, Name);
            statement.setString(2, LName);
            statement.setString(3, Email);
            statement.setString(4, Message);
            statement.executeUpdate();
               
           } catch (SQLException ex) {
               Logger.getLogger(Contact.class.getName()).log(Level.SEVERE, null, ex);
           }
            
    }
    
}
