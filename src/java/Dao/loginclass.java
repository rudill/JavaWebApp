/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class loginclass 
{
    

   
   public static boolean insertuser(String username, String firstname, String lastname, String email, String password) {
    String driver = "com.mysql.jdbc.Driver"; 
    String url = "jdbc:mysql://localhost:3306/store";
    String query = "INSERT INTO information (username, firstname, lastname, email, password) VALUES (?, ?, ?, ?, ?)";

     try {
        Class.forName(driver); // Load driver
        Connection conn = (Connection) DriverManager.getConnection(url, "root", ""); 
        
        PreparedStatement pt = (PreparedStatement) conn.prepareStatement(query); 

        
        pt.setString(1, username);
        pt.setString(2, firstname);
        pt.setString(3, lastname);
        pt.setString(4, email);
        pt.setString(5, password);

        
        int rowsInserted = pt.executeUpdate();
        
        // Close resources
        pt.close();
        conn.close();

        // Check if any rows were inserted
        return rowsInserted > 0;
    } catch (ClassNotFoundException | SQLException ex) {
        Logger.getLogger(loginclass.class.getName()).log(Level.SEVERE, null, ex);
        return false; // Error occurred during insertion
    }
}
   
   public static boolean isUsernameEmailUnique(String username, String email) {
        try {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/store";
            String query = "SELECT COUNT(*) FROM information WHERE username = ? OR email = ?";

            Class.forName(driver);
            Connection con = (Connection) DriverManager.getConnection(url, "root", "");
            PreparedStatement pst = (PreparedStatement) con.prepareStatement(query);

            pst.setString(1, username);
            pst.setString(2, email);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                int count = rs.getInt(1);
                return count == 0; // If count is 0, username and email are unique
            }

            rs.close();
            pst.close();
            con.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(loginclass.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false; // Error occurred or unable to determine uniqueness, consider it as not unique
    }



        public static boolean validateCus (String name,String password)
        {
            
            String Driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/store";
            String query = "SELECT * FROM information WHERE username = ? AND password = ?";
        
        try {
            Class.forName(Driver);
            Connection con = (Connection) DriverManager.getConnection(url,"root","");
            PreparedStatement pst = (PreparedStatement) con.prepareStatement(query);
            
            pst.setString(1, name);
            pst.setString(2, password);
            ResultSet rs = pst.executeQuery();
            
            boolean isValid = rs.next();
            
            rs.close();
            pst.close();
            con.close();
            
            return isValid;
            
        }
        
        catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(loginclass.class.getName()).log(Level.SEVERE,null, ex);
            return false;
        }
        
        }


    //void insertuser(String Fname, String emai, String psw) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

        //}




