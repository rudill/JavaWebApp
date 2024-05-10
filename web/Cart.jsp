<%-- 
    Document   : Cart
    Created on : Apr 12, 2024, 11:03:15 PM
    Author     : dillo
--%>
<%@page import="model.Cart"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="Components/common_css_js.jsp"%>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" />
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
         <link href="https://cdn.jsdelivr.net/npm/daisyui@4.10.1/dist/full.min.css" rel="stylesheet" type="text/css" />
<script src="https://cdn.tailwindcss.com"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <style>
            .carttable {
    margin-top: 30px;    
    margin-right: 40px;  
    margin-bottom: 15px; 
    margin-left: 40px;   
}

        </style>
    </head>
    <body>
        <html data-theme="nord"></html>
          <%@include file="Components/navbar.jsp"%>
        <div class="cart">
            
    <% if (session.getAttribute("cartList") == null) { %>
        <p>No products available.</p>
    <% } else { %>
    <%
    double subtotal = (Double) session.getAttribute("subtotal");
     %>
    <div class="stat">
    <div class="stat-title">SUB TOTAL</div>
    <div class="stat-value">Rs<%= subtotal %>  
        
        <a href="Checkout.jsp">
        <button class="btn btn-sm">Check Out</button> </div>  
        </a>
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
        
   <jsp:include page="Components/Footer.jsp" /> 
    </body>
</html>
