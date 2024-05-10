
package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dillo
 */
public class Product {
    
    Statement st;
    
    public void Connectdb() throws SQLException{
        String driver ="com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/store";
        
        try {
            Class.forName(driver);
            Connection con =DriverManager.getConnection(url, "root", "");
            st =con.createStatement();   
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
    public List Chargers() 
    {
       List<String> rlist = new ArrayList<>();
        try {
            Connectdb();
            String query= "SELECT * FROM product where Category='chargers&cables'";
            ResultSet rs =st.executeQuery(query);
            
            while(rs.next()){
                rlist.add(rs.getString("Image"));
                rlist.add(rs.getString("ProductName"));
                rlist.add(rs.getString("Brand"));
                rlist.add(rs.getString("Category"));
                rlist.add(rs.getString("Price"));
                rlist.add(rs.getString("Description"));
                rlist.add(rs.getString("ProductID"));   
            }
        } catch (SQLException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        }
       return rlist;
    }
     
      public List All() 
    {
       List<String> alllist = new ArrayList<>();
        try {
            Connectdb();
            String query= "SELECT * FROM product";
            ResultSet rs =st.executeQuery(query);
            
            while(rs.next()){
                alllist.add(rs.getString("Image"));
                alllist.add(rs.getString("ProductName"));
                alllist.add(rs.getString("Brand"));
                alllist.add(rs.getString("Category"));
                alllist.add(rs.getString("Price"));
                alllist.add(rs.getString("Description"));
                alllist.add(rs.getString("ProductID"));    
            }  
        } catch (SQLException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        }
       return alllist;
    }
    
     public List Headphones() 
    {
       List<String> rlist = new ArrayList<>();
        try {
            Connectdb();
            String query= "SELECT * FROM product WHERE Category='Earphones And Headphones'";
            ResultSet rs =st.executeQuery(query);
            
            while(rs.next()){
                rlist.add(rs.getString("Image"));
                rlist.add(rs.getString("ProductName"));
                rlist.add(rs.getString("Brand"));
                rlist.add(rs.getString("Category"));
                rlist.add(rs.getString("Price"));
                rlist.add(rs.getString("Description"));
                rlist.add(rs.getString("ProductID"));   
            }   
        } catch (SQLException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        }
       return rlist;
    }
     
     
      public List Phone() 
    {
       List<String> rlist = new ArrayList<>();
        try {
            Connectdb();
            String query= "SELECT * FROM product where Category='smartphone'";
            ResultSet rs =st.executeQuery(query);
            
            while(rs.next()){
                rlist.add(rs.getString("Image"));
                rlist.add(rs.getString("ProductName"));
                rlist.add(rs.getString("Brand"));
                rlist.add(rs.getString("Category"));
                rlist.add(rs.getString("Price"));
                rlist.add(rs.getString("Description"));
                rlist.add(rs.getString("ProductID"));   
            }   
        } catch (SQLException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        }
       return rlist;
    }
      
       public List powerbanks() 
    {
       List<String> rlist = new ArrayList<>();
        try {
            Connectdb();
            String query= "SELECT * FROM product where Category='powerbanks'";
            ResultSet rs =st.executeQuery(query);
            
            while(rs.next()){
                rlist.add(rs.getString("Image"));
                rlist.add(rs.getString("ProductName"));
                rlist.add(rs.getString("Brand"));
                rlist.add(rs.getString("Category"));
                rlist.add(rs.getString("Price"));
                rlist.add(rs.getString("Description"));
                rlist.add(rs.getString("ProductID"));  
            }   
        } catch (SQLException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        }
       return rlist;
    }
       
        public List smartwatches() 
    {
       List<String> rlist = new ArrayList<>();
        try {
            Connectdb();
            String query= "SELECT * FROM product where Category='Smartwatch'";
            ResultSet rs =st.executeQuery(query);
            
            while(rs.next()){
                rlist.add(rs.getString("Image"));
                rlist.add(rs.getString("ProductName"));
                rlist.add(rs.getString("Brand"));
                rlist.add(rs.getString("Category"));
                rlist.add(rs.getString("Price"));
                rlist.add(rs.getString("Description"));
                rlist.add(rs.getString("ProductID"));   
            }  
        } catch (SQLException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        }
       return rlist;
    }   
}
