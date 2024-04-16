<%-- 
    Document   : Nav
    Created on : Apr 12, 2024, 11:04:29 PM
    Author     : dillo
--%>

<%@page import="java.util.List"%>
<%@page import="newPackage.Cart"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <link href="https://cdn.jsdelivr.net/npm/daisyui@4.10.1/dist/full.min.css" rel="stylesheet" type="text/css" />
<script src="https://cdn.tailwindcss.com"></script>

    </head>
    <body>
        <div class="navmain">
         <html data-theme="nord"></html>   
             <%
    // Retrieve product list from session
    List<Cart> cartList = (List<Cart>) session.getAttribute("cartList");
    // Get size of the product list
    int cartSize = (cartList != null) ? cartList.size() : 0;

%>
            <div class="navbar bg-base-100">
  <div class="flex-1">
      <a  href="Products.jsp"class="btn btn-ghost text-xl">DEA SHOP</a>
  </div>
  <div class="flex-none">
    <div class="dropdown dropdown-end">
      <div tabindex="0" role="button" class="btn btn-ghost btn-circle">
        <div class="indicator">
          <svg xmlns="http://www.w3.org/2000/svg" class="h-5 w-5" fill="none" viewBox="0 0 24 24" stroke="currentColor"><path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M3 3h2l.4 2M7 13h10l4-8H5.4M7 13L5.4 5M7 13l-2.293 2.293c-.63.63-.184 1.707.707 1.707H17m0 0a2 2 0 100 4 2 2 0 000-4zm-8 2a2 2 0 11-4 0 2 2 0 014 0z" /></svg>
          <span class="badge badge-sm indicator-item"><%= cartSize %></span>
        </div>
      </div>
        <%
    double subtotal = (Double) session.getAttribute("subtotal");
     %>
        
      <div tabindex="0" class="mt-3 z-[1] card card-compact dropdown-content w-52 bg-base-100 shadow">
        <div class="card-body">
          <span class="font-bold text-lg"><%= cartSize %> Items</span>
          <span class="text-info">Subtotal: Rs.<%=subtotal%></span>
          <div class="card-actions">
              <a href="Cart.jsp">
            <button class="btn btn-primary btn-block">View cart</button>
            </a>
          </div>
        </div>
      </div>
    </div>
    <div class="dropdown dropdown-end">
      <div tabindex="0" role="button" class="btn btn-ghost btn-circle avatar">
        <div class="w-10 rounded-full">
          <img alt="Tailwind CSS Navbar component" src="https://daisyui.com/images/stock/photo-1534528741775-53994a69daeb.jpg" />
        </div>
      </div>
      <ul tabindex="0" class="menu menu-sm dropdown-content mt-3 z-[1] p-2 shadow bg-base-100 rounded-box w-52">
        <li>
          <a class="justify-between">
            Profile
            <span class="badge">New</span>
          </a>
        </li>
        <li><a>Settings</a></li>
        <li><a>Logout</a></li>
      </ul>
    </div>
  </div>
</div>
        </div>
    </body>
</html>
