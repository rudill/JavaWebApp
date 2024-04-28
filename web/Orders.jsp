<%-- 
    Document   : Orders
    Created on : Apr 23, 2024, 9:07:38 PM
    Author     : dillo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="mypackage.Order"%>
<%@page import="mypackage.OrderDetails"%>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
       <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.bundle.min.js"/>
       <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"/>
       <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.2/css/all.css"/>
       <link rel="stylesheet" href="style.css">

    <title>Order History</title>
        
</head>
<body>
    <jsp:include page="Nav.jsp"/>
            
   <div class="container">
    <article class="card">
        <header class="card-header"> My Orders  </header>
        <div class="card-body">
            
                <%
                   Integer userId = (Integer) session.getAttribute("auth");
                     if (userId == null) {
                out.println("You are not logged in. Please log in to view your orders. <a href=\"login.jsp\">LOGIN</a>");
       } else {
                %>
            
            <% 
            try {
                Order order = new Order();
                List<OrderDetails> orders = order.getOrders(userid); // Replace 2 with actual user ID
                for (OrderDetails D : orders) {
            %>
            
            
   
            <h1><b>Order ID: <%= D.getOrderID() %></b></h1>
            <article class="card">
                <div class="card-body row">
                    <table>
                    <tr>
                        <td> <strong>Ordered Date:</strong> <br><%= D.getDate() %> </td>
                         <td> <strong>Subtotal</strong> <br> Rs.<%= D.getSubtotal() %> </td>
                        <td> <strong>Customer PhoneNO:</strong> <br> <i class="fa fa-phone"></i> <%= D.getPhoneno() %> </td>
                        <td> <strong>Delivery Address</strong> <br> <%= D.getAddress() %></td>
                       
                    </tr>
                </table>
                </div>
            </article>
           
            <hr>
            <ul class="row">
                <li class="col-md-4">
                    <figure class="itemside mb-3">
                        <div class="aside"><img src="images/<%= D.getImage() %>" class="img-sm border"></div>
                        <figcaption class="info align-self-center">
                            <p class="title"><%= D.getProductName() %> </p>
                            <span class="text-muted">Quantity: <%= D.getQuantity() %></span><br>
                            <span class="text-muted">Rs. <%= D.getProductPrice() %></span>
                        </figcaption>
                    </figure>
                </li>
               
            </ul>
            <hr>
             <div class="track">
                <div class="step active"> <span class="icon"> <i class="fa fa-spinner"></i> </span> <span class="text">Processing</span> </div>
                <div class="step "> <span class="icon"> <i class="fa fa-check"></i> </span> <span class="text"> Order confirmed</span> </div>
                <div class="step"> <span class="icon"> <i class="fa fa-truck"></i> </span> <span class="text"> Shiping </span> </div>
                <div class="step"> <span class="icon"> <i class="fa fa-box"></i> </span> <span class="text">Delivered</span> </div>
            </div>
          
            
            <% 
                }
            } catch (Exception e) {
                e.printStackTrace();
         
            }
}
            %>
       <a href="Products.jsp" class="btn btn-warning" data-abc="true"> <i class="fa fa-chevron-left"></i> Back to Shoping</a>
        </div>
        
        
    </article>
</div>
            
</body>
</html>


