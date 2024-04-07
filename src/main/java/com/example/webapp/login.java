package com.example.webapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class login {
    static void connectToDb(String uname, String pass) {

        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/admin";
        String query = "INSERT INTO adminlogin (username, password) VALUES ('"+ uname +"', '"+ pass +"')";

        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url,"root","");
            Statement st = con.createStatement();
            st.executeUpdate(query);
            System.out.println("MySQL JDBC Driver is in the classpath.");

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver is not in the classpath.");
            throw new RuntimeException(e);
        }
    }
}