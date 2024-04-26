<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Home</title>
    <!-- Include common CSS and JS files -->
    <%@include file="Components/common_css_js.jsp"%>
    <style type="text/css">
        /* Custom CSS styles */
        .cus-card {
            border-radius: 50%;
            border-color: transparent;
            max-height: 200px;
            max-width: 200px;
            max-height: 200px;
        }

        .real-price {
            font-size: 20px !important;
            font-weight: 600;
        }

        .product-price {
            font-size: 17px !important;
            text-decoration: line-through;
        }

        .product-discount {
            font-size: 15px !important;
            color: #027a3e;
        }
        
        .site-footer
{
  background-color:#26272b;
  padding:45px 0 20px;
  font-size:15px;
  line-height:24px;
  color:#737373;
}
.site-footer hr
{
  border-top-color:#bbb;
  opacity:0.5
}
.site-footer hr.small
{
  margin:20px 0
}
.site-footer h6
{
  color:#fff;
  font-size:16px;
  text-transform:uppercase;
  margin-top:5px;
  letter-spacing:2px
}
.site-footer a
{
  color:#737373;
}
.site-footer a:hover
{
  color:#3366cc;
  text-decoration:none;
}
.footer-links
{
  padding-left:0;
  list-style:none
}
.footer-links li
{
  display:block
}
.footer-links a
{
  color:#737373
}
.footer-links a:active,.footer-links a:focus,.footer-links a:hover
{
  color:#3366cc;
  text-decoration:none;
}
.footer-links.inline li
{
  display:inline-block
}
.site-footer .social-icons
{
  text-align:right
}
.site-footer .social-icons a
{
  width:40px;
  height:40px;
  line-height:40px;
  margin-left:6px;
  margin-right:0;
  border-radius:100%;
  background-color:#33353d
}
.copyright-text
{
  margin:0
}
@media (max-width:991px)
{
  .site-footer [class^=col-]
  {
    margin-bottom:30px
  }
}
@media (max-width:767px)
{
  .site-footer
  {
    padding-bottom:0
  }
  .site-footer .copyright-text,.site-footer .social-icons
  {
    text-align:center
  }
}

    </style>
</head>
<body>
    <!-- Navbar -->
    <%@include file="Components/navbar.jsp"%>

   
    

    <!-- Carousel -->
    <div id="carouselAutoplaying" class="carousel slide carousel-dark  mb-1" data-bs-ride="carousel">
        <div class="carousel-inner">
            
            <div class="carousel-item active">
                <img src="Images/banner1.jpg" class="d-block w-100" alt="...">
            </div>
            <div class="carousel-item">
                
                <img src="Images/banner2.png" class="d-block w-100" alt="...">
            </div>
            <div class="carousel-item">
                <img src="Images/banner3.jpg" class="d-block w-100" alt="...">
                
            </div>
        </div>
        <button class="carousel-control-prev" type="button" data-bs-target="#carouselAutoplaying" data-bs-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true" style="color: black;"></span>
            <span class="visually-hidden">Previous</span>
        </button>
        <button class="carousel-control-next" type="button" data-bs-target="#carouselAutoplaying" data-bs-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Next</span>
        </button>
    </div>
    <!-- End of carousel -->

  <!-- latest product listed -->
	<div class="container-fluid py-3 px-3" style="background: #f2f2f2;">
		<div class="row row-cols-1 row-cols-md-4 g-3">
			<div class="col">
				<div class="container text-center px-5 py-5">
					<h1>Latest Products</h1>
					<img src="Images\product.png" class="card-img-top"
						style="max-width: 100%; max-height: 200px; width: auto;">
				</div>
			</div>
			
			<div class="col">
				
					<div class="card h-100">
						<div class="container text-center">
							<img
								src="Images/Smartwatch.jpg"
								class="card-img-top m-2"
								style="max-width: 100%; max-height: 200px; width: auto;">
						</div>
						<div class="card-body">
							<h5 class="card-title text-center">Smartwatch</h5>

							<div class="container text-center">
								<span class="real-price">Rs.5000></span>
								&ensp;<span class="product-price">Rs.4000
								</span>
							</div>
						</div>
					</div>
				</a>
			</div>
			
			<div class="col">
				
					<div class="card h-100">
						<div class="container text-center">
							<img
								src="Images/headphones.png"
								class="card-img-top m-2"
								style="max-width: 100%; max-height: 200px; width: auto;">
						</div>
						<div class="card-body">
							<h5 class="card-title text-center">Headphones</h5>

							<div class="container text-center">
								<span class="real-price">Rs.4500></span>
								&ensp;<span class="product-price">Rs.4000
								</span>
							</div>
						</div>
					</div>
				</a>
			</div>
			
			<div class="col">
				
					<div class="card h-100">
						<div class="container text-center">
							<img
								src="Images/charger.png"
								class="card-img-top m-2"
								style="max-width: 100%; max-height: 200px; width: auto;">
						</div>
						<div class="card-body">
							<h5 class="card-title text-center">Charger</h5>

							<div class="container text-center">
								<span class="real-price">Rs.1100></span>
								&ensp;<span class="product-price">Rs.1000
								</span>
							</div>
						</div>
					</div>
				</a>
			</div>
			
			

	
		</div>
	</div>
	
	  <!-- Site footer -->
    <footer class="site-footer">
      <div class="container">
        <div class="row">
          <div class="col-sm-12 col-md-6">
            <h6>About</h6>
            <p class="text-justify">Discover the future at our tech gadgets E-commerce store. From smartphones to smartwatches, we offer cutting-edge devices to elevate your lifestyle. Stay ahead of the curve with our curated selection of innovative products. Shop securely and conveniently for the latest tech essentials. Experience convenience, quality, and innovation in every purchase.</p>
          </div>

          <div class="col-xs-6 col-md-3">
            <h6>Categories</h6>
            <ul class="footer-links">
              <li><a href="#">Smartphones</a></li>
              <li><a href="#">Headphones/Earbuds</a></li>
              <li><a href="#">Smartwatches</a></li>
              <li><a href="#">Chargers & Cables</a></li>
              <li><a href="#">Power banks</a></li>
              
            </ul>
          </div>

          <div class="col-xs-6 col-md-3">
            <h6>Quick Links</h6>
            <ul class="footer-links">
              <li><a href="http://scanfcode.com/about/">About Us</a></li>
              <li><a href="http://scanfcode.com/contact/">Contact Us</a></li>
              <li><a href="http://scanfcode.com/privacy-policy/">Privacy Policy</a></li>
              
            </ul>
          </div>
        </div>
        <hr>
      </div>
      <div class="container">
        <div class="row">
          <div class="col-md-8 col-sm-6 col-xs-12">
            <p class="copyright-text">Copyright &copy; 2024 All Rights Reserved by 
         <a href="#">TechGadgets</a>.
            </p>
          </div>

      
        </div>
      </div>
</footer>

   
</body>
</html>
