<%-- 
    Document   : Orders
    Created on : Apr 23, 2024, 9:07:38 PM
    Author     : dillo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   
    <title>JSP Page</title>
        
</head>
<body>
    <jsp:include page="Nav.jsp"/>
      <h1>Order History</h1>
    
    <table border="1">
        <thead>
            <tr>
                <th>Product Name</th>
                <th>Product Price</th>
                <th>Date</th>
                <th>Subtotal</th>
                <th>Image</th>
                <th>Address</th>
                <th>PhoneNo</th>
            </tr>
        </thead>
        <tbody>
            <%  int userid = (Integer) session.getAttribute("auth");%>
            <% 
            try {
                Order order = new Order();
                List<OrderDetails> orders = order.getOrders(userid); 
                for (OrderDetails D : orders) {
            %>
            <tr>
                <td><%= D.getProductName() %></td>
                <td><%= D.getQuantity()%></td>
                <td><%= D.getProductPrice() %></td>
                <td><%= D.getDate() %></td>
                <td><%= D.getSubtotal() %></td>
                <td><%= D.getAddress() %></td>
                <td><%= D.getPhoneno() %></td>
                
                
            </tr>
            <% 
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            %>
        </tbody>
    </table>
      
  
            
</body>
</html>


