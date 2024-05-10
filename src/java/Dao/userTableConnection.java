package Dao;

import model.userData;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class userTableConnection {


    private static Connection connection;


    public static void dbConnection(){
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/store";

        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, "root", "");
            System.out.println("MySQL Connection Success !");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("MySQL Connection Failed !");
            throw new RuntimeException(e);
        }
    }

    public static void deleteFromUsers(String UID) {
        dbConnection();
        String query = "DELETE FROM information WHERE UserID = '"+ UID +"'";


        try {

            Statement st = connection.createStatement();
            st.executeUpdate(query);
            System.out.println("MySQL Operation Success !");

        } catch (SQLException e) {
            System.out.println("MySQL Operation Failed !");
            throw new RuntimeException(e);
        }
    }

    public static List<userData> fetchFromInformation() {

        dbConnection();
        String query = "SELECT * FROM information";

        List <userData> userList = new ArrayList<>();

        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()){
                userData users = new userData();

                users.setUID(rs.getString("UserID"));
                users.setUsername(rs.getString("username"));
                users.setFirstName(rs.getString("firstname"));
                users.setLastName(rs.getString("lastname"));
                users.setEmail(rs.getString("email"));

                userList.add(users);

            }
            System.out.println("MySQL Operation Success !");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return userList;
    }

}

