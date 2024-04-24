/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecompackage;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;





public class loginclass 
{
    
   
    public static void insertuser(String Fname,String Lastname,String emai,String psw)
    {
        
        String Driver="com.mysql.jdbc.Driver"; //jdbc driver
        String url="jdbc:mysql://localhost:3306/sky"; //db url
        String query2 = "SELECT * FROM information WHERE username = '"+ Fname +"'";
        String query="INSERT INTO information (username,lastname,email,password) VALUES ('"+ Fname + "','"+ Lastname +"','" + emai +"','"+ psw + "')"; //data insert query
    
        try {
            Class.forName(Driver); //load driver
            Connection conn = (Connection) DriverManager.getConnection(url,"root",""); //make connection
            Statement st = conn.createStatement(); //create statement objct to execute query
            st.executeQuery(query2);
            
           
            
            st.executeUpdate(query); //insert data with query executing
            
            conn.close(); //close connection
        } 

        catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(loginclass.class.getName()).log(Level.SEVERE, null, ex);
     
        }
    }
    
        

       public static boolean validateCus (String name,String password)
        {
            
            String Driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/sky";
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




