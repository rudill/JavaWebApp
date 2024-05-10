<%-- 
    Document   : product
    Created on : Apr 20, 2024, 11:31:23 PM
    Author     : Uvini kawya
--%>

<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<%@ page import="javax.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <%@include file="Components/common_css_js.jsp"%>
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
    width: calc(25% - 20px); 
}
.main {
    margin-top: 50px;    
    margin-right: 20px;  
    margin-bottom: 15px; 
    margin-left: 25px;  
}


        </style>

</head>
<body>
    <html data-theme="nord"></html>
    <%@include file="Components/navbar.jsp"%>
    <div class="main">
        

<div class="card-container">
    <% 
        List data = (List) request.getAttribute("Product");
        
        if(data != null)
        {
            for(int i=0; i< data.size();i+= 7)
            {
    %>
 <div class="card card-compact bg-base-100 shadow-xl">
        <figure><img src="images/<%= data.get(i) %>" width="180" height="180" alt="image"/></figure>
        <div class="card-body">
            <h2 class="card-title"><%= data.get(i + 1) %></h2>
            <p><%= data.get(i + 2) %></p>
            <p>Category: <%= data.get(i + 3) %></p>
            <p><b>Price: <%= data.get(i + 4) %></b></p>
            <p><%= data.get(i + 5) %></p>
            <div class="card-actions justify-end">
                <form action="addToCart" method="post"> 
                    <input type="hidden" name="productId" value="<%= data.get(i + 6) %>"> 
                    <input type="hidden" name="productName" value="<%= data.get(i + 1) %>"> 
                    <input type="hidden" name="Category" value="<%= data.get(i + 3) %>">
                    <input type="hidden" name="Price" value="<%= data.get(i + 4) %>">
                    <input type="hidden" name="Image" value="<%= data.get(i) %>">
                    <button type="submit" class="btn btn-primary">ADD CART</button>
                </form>
           </div>
        </div>  
    </div>
    <% 
            } 
        }
    %>

</div>
    </div>
<jsp:include page="Components/Footer.jsp" />
</body>
</html>