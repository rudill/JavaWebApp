<%-- 
    Document   : Products
    Created on : Apr 12, 2024, 11:03:49 PM
    Author     : dillo
--%>

<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<%@ page import="javax.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Product List</title>
     <link href="https://cdn.jsdelivr.net/npm/daisyui@4.10.1/dist/full.min.css" rel="stylesheet" type="text/css" />
<script src="https://cdn.tailwindcss.com"></script>
        <style>
.card-container {
    display: flex;
    flex-wrap: wrap;
    justify-content: space-between;
    gap: 20px;
}

.card {
    width: calc(25% - 20px); /* 25% width for each card with 20px gap */
    /* Adjust the width and other styles of each card as needed */
}
.main {
    margin-top: 50px;    /* Adds 10 pixels of margin to the top */
    margin-right: 20px;  /* Adds 20 pixels of margin to the right */
    margin-bottom: 15px; /* Adds 15 pixels of margin to the bottom */
    margin-left: 25px;   /* Adds 25 pixels of margin to the left */
}


        </style>

</head>
<body>
    <html data-theme="nord"></html>
    <jsp:include page="Nav.jsp" />
    <div class="main">
        <h1>Product List</h1>

<div class="card-container">
    <% 
        try {
            // Establish database connection
            String url = "jdbc:mysql://localhost:3306/store";
            String driver = "com.mysql.jdbc.Driver";
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, "root", "");
            
            // Prepare SQL query
            String query = "SELECT * FROM product";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            
            // Execute query
            ResultSet rs = preparedStatement.executeQuery();
            
            // Iterate over result set and display data
            while (rs.next()) { 
    %>
    <div class="card card-compact bg-base-100 shadow-xl">
        <figure><img src="images/<%= rs.getString("Image") %>" width="180" height="180" alt="image"/></figure>
        <div class="card-body">
            <h2 class="card-title"><%= rs.getString("ProductName") %></h2>
            <p><%= rs.getString("Brand") %></p>
            <p>Category: <%= rs.getString("Category") %></p>
            <p><b>Price: <%= rs.getDouble("Price") %></b></p>
            <div class="card-actions justify-end">
                
             
                <form action="addToCart" method="post"> 
                        <input type="hidden" name="productId" value="<%= rs.getInt("ID") %>"> 
                        <input type="hidden" name="productName" value="<%= rs.getString("ProductName") %>"> 
                        <input type="hidden" name="Category" value="<%= rs.getString("Category") %>">
                        <input type="hidden" name="Price" value="<%= rs.getDouble("Price") %>">
                        <input type="hidden" name="Image" value="<%= rs.getString("Image") %>">
                        <button type="submit" class="btn btn-primary">ADD CART</button>
                    </form>
                <button class="btn btn-primary">Buy Now</button>
            </div>
        </div>
    </div>
    <% 
            }
            
            // Close resources
            rs.close();
            preparedStatement.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    %>
</div>

    </div>
</body>
</html>
