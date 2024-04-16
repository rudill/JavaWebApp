<%-- 
    Document   : Cart
    Created on : Apr 12, 2024, 11:03:15 PM
    Author     : dillo
--%>
<%@page import="newPackage.Cart"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" />
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <style>
            .carttable {
    margin-top: 30px;    /* Adds 10 pixels of margin to the top */
    margin-right: 40px;  /* Adds 20 pixels of margin to the right */
    margin-bottom: 15px; /* Adds 15 pixels of margin to the bottom */
    margin-left: 40px;   /* Adds 25 pixels of margin to the left */
}

        </style>
    </head>
    <body>
         <jsp:include page="Nav.jsp" />
        <div class="cart">
            
    <% if (session.getAttribute("cartList") == null) { %>
        <p>No products available.</p>
    <% } else { %>
    <%
    double subtotal = (Double) session.getAttribute("subtotal");
     %>
    <div class="stat">
    <div class="stat-title">SUB TOTAL</div>
    <div class="stat-value">Rs<%= subtotal %>  <button class="btn btn-sm">Check Out</button> </div>  
   
  </div>
 <div class="carttable">  
<div class="overflow-x-auto">
  <table class="table">
    <thead>
      <tr>
        <th>Product</th>
        <th>Quantity</th>
        <th>Total</th>
        <th></th>
      </tr>
    </thead>
            <% 
               List<Cart> cartList = (List<Cart>) session.getAttribute("cartList");
                for (int i = 0; i < cartList.size(); i++) {
                    Cart cart = cartList.get(i);
            %>
            <tbody>
      <tr>
        <td>
          <div class="flex items-center gap-3">
            <div class="avatar">
              <div class="mask mask-squircle w-20 h-20">
                <img src="images/<%= cart.getImage() %>" alt="Avatar Tailwind CSS Component" />
              </div>
            </div>
            <div>
              <div class="font-bold"><%= cart.getProductName() %></div>
              <div class="text-sm opacity-50"><%= cart.getCategory() %></div>
            </div>
  
            
            
          <td>
    <form action="" method="" class="form-inline">
        
        <div class="form-group d-flex justify-content-between">
            <a class="btn btn-sm btn-decre" href="addToCart?action=decrease&id=<%= cart.getID() %>" style="background-color: transparent; border: none;"><i class="fas fa-minus-square"></i></a>
            <input type="text" name="quantity" class="form-control" value="<%= cart.getQuantity() %>"> 
            <a class="btn bnt-sm btn-incre" href="addToCart?action=increase&id=<%= cart.getID() %>" style="background-color: transparent; border: none;"><i class="fas fa-plus-square"></i></a> 
        </div>
    </form>
</td>
          
          
        <td><%= cart.getPrice()* cart.getQuantity() %></td>
        <th>
            <form action="removeCart" method="post">
                        <input type="hidden" name="index" value="<%= i %>">
                        <button type="submit" class="btn btn-error btn-xs">Remove</button>
             </form>
        </th>      
       </td>
     </div>
      </tr>
    </tbody>
            <% } %>
        </table>
</div>
</div>
    <% } %>
        </div>
        
    
    </body>
</html>
