<%@page import="model.Cart"%>
<%@page import="java.util.List"%>
<style>
    .navbar {
        font-weight: 500;
    }

    .nav-link {
        color: rgb(255 255 255/ 100%) !important;
    }

    .dropdown-menu {
        background-color: #ffffff !important;
        border-color: #949494;
    }

    .dropdown-menu li a:hover {
        background-color: #808080 !important;
        color: white;
    }
</style>

<nav class="navbar navbar-expand-lg custom-color" data-bs-theme="dark">
    <!-- User navigation bar -->
    <div class="container">
        <a class="navbar-brand" href="index.jsp"><i class="fa-sharp fa-solid fa-house" style="color: #ffffff;"></i>&ensp;TechGadgets</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <!-- Products link -->
                <li class="nav-item">
                    <a class="nav-link" href="#" role="button" aria-expanded="false"> Products </a>
                </li>
                <!-- Category dropdown -->
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false"> Category </a>
                    <ul class="dropdown-menu">
                        <!-- All Products -->
                        <li><a class="dropdown-item" href="./All.jsp">All Products</a></li>
                        <!-- Hardcoded categories -->
                        <li><a class="dropdown-item" href="./phone.jsp">Smart phones</a></li>
                        <li><a class="dropdown-item" href="./headphones.jsp">Headphones/Earbuds</a></li>
                        <li><a class="dropdown-item" href="./smartwatches.jsp">Smart watches</a></li>
                        <li><a class="dropdown-item" href="./chargers.jsp">Chargers & Cables</a></li>
                        <li><a class="dropdown-item" href="./powerbanks.jsp">Power banks</a></li>
                    </ul>
                </li>
            </ul>
           
            
            <!-- User actions -->
            <ul class="navbar-nav ml-auto">
                <!-- Cart link -->
                <li class="nav-item active pe-3">
   <%
    // Retrieve product list from session
    List<Cart> CL = (List<Cart>) session.getAttribute("cartList");
    // Get size of the product list
    int cartSize = (CL != null) ? CL.size() : 0;

  %>
                    
                   <span class="badge badge-sm indicator-item"><%= cartSize  %></span> <a class="nav-link position-relative" aria-current="page" href="Cart.jsp">
                        <i class="fa-solid fa-cart-shopping" style="color: #ffffff;"></i> &nbsp;Cart
                        
                    </a>
                </li>
               
               
            </ul>
                        
            <ul class="navbar-nav ml-auto" style="padding-left: 10px">
                <!-- Cart link -->
                <li class="nav-item active pe-3">
   
                    
                   <a class="nav-link position-relative" aria-current="page" href="login.jsp"> 
<!--                    <i class="fa-solid fa-user fa-lg" style="color: white"></i>-->
                    <i class="fa-solid fa-right-to-bracket fa-lg" style="color: white"></i>
                   </a>
                        
                    </a>
                </li>
               
               
            </ul>
         
          
      </div>
        </div>
    </div>
    <!-- End of User navigation bar -->
</nav>
