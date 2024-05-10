package Dao;

import model.productData;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;



public class productTableConnection {


    private static Connection connection;


    public static void dbConnection(){
        String driver = "com.mysql.cj.jdbc.Driver";
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


    public static void insertTopProduct(String productName, String brand, String price, String category, String description, String fileName, String quantity)
            throws SQLException {
        dbConnection();

        String query = "INSERT INTO product (ProductName, Brand, Price, Category, Description, Image, quantity) VALUES " +
                "('"+ productName +"', '"+ brand +"', '"+ price +"', '"+category+"' , '"+ description +"' , '"+ fileName +"', '"+ quantity +"')";
        Statement st = connection.createStatement();
        st.executeUpdate(query);

    }



    public static List<productData> fetchFromProduct() {
        dbConnection();
        String query = "SELECT * FROM product";

        List<productData> resultList = new ArrayList<>();

        try {

            Statement st =connection.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                productData showProduct = new productData();

                showProduct.setID(rs.getString("ProductID"));
                showProduct.setProductName(rs.getString("ProductName"));
                showProduct.setBrand(rs.getString("Brand"));
                showProduct.setPrice(rs.getString("Price"));
                showProduct.setCategory(rs.getString("Category"));
                showProduct.setDescription(rs.getString("Description"));
                showProduct.setFileName(rs.getString("Image"));
                showProduct.setQuantity(rs.getString("quantity"));

                resultList.add(showProduct);
            }
            System.out.println("MySQL Operation Success !");

        } catch (SQLException e) {
            System.out.println("MySQL Operation Failed !");
            throw new RuntimeException(e);
        }
        return resultList;
    }









public static void updateToProduct(String ID, String productName, String brand, String price, String category, String description, String fileName) {

    dbConnection();
    String query = "UPDATE product SET ProductName = ?, Brand = ?, Price = ?, Category = ?, Description = ?, Image = ? WHERE productID = ?";

    try {

        PreparedStatement st = connection.prepareStatement(query);
        st.setString(1, productName);
        st.setString(2, brand);
        st.setString(3, price);
        st.setString(4, category);
        st.setString(5, description);
        st.setString(6, fileName);
        st.setString(7, ID);

        st.executeUpdate();
        System.out.println("MySQL Operation Success !");

    }  catch (SQLException e) {
        System.out.println("MySQL Operation Failed !");
        throw new RuntimeException(e);
    }
}

   public static void deleteFromProduct(String ID) {
       dbConnection();

        String deleteOrdersQuery = "DELETE FROM orders WHERE ProductID = ?";
        String deleteProductQuery = "DELETE FROM product WHERE ProductID= ?";

    try {


        // Delete referencing rows from orders table
        PreparedStatement deleteOrdersStmt =  connection.prepareStatement(deleteOrdersQuery);
        deleteOrdersStmt.setString(1, ID);
        deleteOrdersStmt.executeUpdate();

        // Delete product
        PreparedStatement deleteProductStmt = connection.prepareStatement(deleteProductQuery);
        deleteProductStmt.setString(1, ID);
        deleteProductStmt.executeUpdate();

        System.out.println("MySQL Operation Success !");
    } catch (SQLException e) {
        System.out.println("MySQL Operation Failed !");
        throw new RuntimeException(e);
    }
}

}
