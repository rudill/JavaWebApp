package Dao;

import model.orders;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class fetchOrder {


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

    public static List<orders> fetchFromOrders() {
        dbConnection();
        String query = "SELECT orders.orderID, information.username, product.ProductName, product.Price , orders.Quantity " +
                "FROM orders INNER JOIN information ON orders.UserID = information.UserID INNER JOIN product ON orders.productID = product.productID";

        List<orders> orderList = new ArrayList<>();

        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                orders showOrder = new orders();


                showOrder.setOrderUserName(rs.getString("username"));
                showOrder.setOrderProductName(rs.getString("ProductName"));
                showOrder.setOrderPrice(rs.getString("Price"));
                showOrder.setOrderQuantity(rs.getString("Quantity"));

                orderList.add(showOrder);
            }

            System.out.println("MySQL Operation Success !");

        } catch (SQLException e) {
            System.out.println("MySQL Operation Failed !");
            throw new RuntimeException(e);
        }
        return orderList;
    }



}
