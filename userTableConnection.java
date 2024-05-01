package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class userTableConnection {

    public static void deleteFromUsers(String UID) {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/store";
        String query = "DELETE FROM information WHERE UserID = '"+ UID +"'";

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

