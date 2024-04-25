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

   
    }



