package com.example.webapp;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class dbConnection {
    public static void insertToDb(String productName, String brand, String price, String category, String description, String fileName) {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/webapp";
        String query = "INSERT INTO product (ProductName, Brand, Price, Category, Description, Image) VALUES ('"+ productName +"', '"+ brand +"', '"+ price +"', '"+category+"' , '"+ description +"' , '"+ fileName +"')";

        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url,"root","");
            Statement st = con.createStatement();
            st.executeUpdate(query);
            System.out.println("MySQL JDBC Driver is in the classpath.");

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("MySQL JDBC Driver is not in the classpath.");
            throw new RuntimeException(e);
        }
    }

    public static List<Map<String, Object>> fetchAllFromDb() {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/webapp";
        String query = "SELECT * FROM product";

        List<Map<String, Object>> resultList = new ArrayList<>();

        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url,"root","");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                Map<String, Object> row = new HashMap<>();
                row.put("ID", rs.getString("ID"));
                row.put("ProductName", rs.getString("ProductName"));
                row.put("Brand", rs.getString("Brand"));
                row.put("Price", rs.getString("Price"));
                row.put("Category", rs.getString("Category"));
                row.put("Description", rs.getString("Description"));
                row.put("Image", rs.getString("Image"));

                resultList.add(row);
            }

            System.out.println("MySQL JDBC Driver is in the classpath.");

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("MySQL JDBC Driver is not in the classpath.");
            throw new RuntimeException(e);
        }

        return resultList;
    }
//
public static void updateToDb(String ID, String productName, String brand, String price, String category, String description, String fileName) {
    String driver = "com.mysql.cj.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/webapp";
    String query = "UPDATE product SET ProductName = ?, Brand = ?, Price = ?, Category = ?, Description = ?, Image = ? WHERE ID = ?";

    try {
        Class.forName(driver);
        Connection con = DriverManager.getConnection(url,"root","");
        PreparedStatement st = con.prepareStatement(query);
        st.setString(1, productName);
        st.setString(2, brand);
        st.setString(3, price);
        st.setString(4, category);
        st.setString(5, description);
        st.setString(6, fileName);
        st.setString(7, ID);

        st.executeUpdate();
        System.out.println("MySQL JDBC Driver is in the classpath.");

    }  catch (ClassNotFoundException | SQLException e) {
        System.out.println("MySQL JDBC Driver is not in the classpath.");
        throw new RuntimeException(e);
    }
}
//
    public static void deleteFromDb(String ID) {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/webapp";
        String query = "DELETE FROM product WHERE ID = '"+ ID +"'";

        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url,"root","");
            Statement st = con.createStatement();
            st.executeUpdate(query);
            System.out.println("MySQL JDBC Driver is in the classpath.");

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("MySQL JDBC Driver is not in the classpath.");
            throw new RuntimeException(e);
        }
    }
}
