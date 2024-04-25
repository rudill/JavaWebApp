package com.example.webapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class userTableConnection {

    public static void deleteFromUsers(String UID) {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/webapp";
        String query = "DELETE FROM users WHERE UID = '"+ UID +"'";

        userDriver(driver, url, query);
    }

    private static void userDriver(String driver, String url, String query) {
        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url,"root","");
            Statement st = con.createStatement();
            st.executeUpdate(query);
            System.out.println("MySQL Operation Success !");

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("MySQL Operation Failed !");
            throw new RuntimeException(e);
        }
    }

    }
