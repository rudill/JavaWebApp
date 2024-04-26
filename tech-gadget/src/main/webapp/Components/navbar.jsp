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
                        <li><a class="dropdown-item" href="products.jsp?category=0">All Products</a></li>
                        <!-- Hardcoded categories -->
                        <li><a class="dropdown-item" href="products.jsp?category=1">Smartphones</a></li>
                        <li><a class="dropdown-item" href="products.jsp?category=2">Headphones/Earbuds</a></li>
                        <li><a class="dropdown-item" href="products.jsp?category=2">Smartwatches</a></li>
                        <li><a class="dropdown-item" href="products.jsp?category=2">Chargers & Cables</a></li>
                        <li><a class="dropdown-item" href="products.jsp?category=2">Power banks</a></li>
                    </ul>
                </li>
            </ul>
           
            <!-- User actions -->
            <ul class="navbar-nav ml-auto">
                <!-- Cart link -->
                <li class="nav-item active pe-3">
                    <a class="nav-link position-relative" aria-current="page" href="cart.jsp">
                        <i class="fa-solid fa-cart-shopping" style="color: #ffffff;"></i> &nbsp;Cart
                        
                    </a>
                </li>
               
               
            </ul>
        </div>
    </div>
    <!-- End of User navigation bar -->
</nav>
