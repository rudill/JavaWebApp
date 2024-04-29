<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Home</title>
    <!-- Include common CSS and JS files -->
    <%@include file="Components/common_css_js.jsp"%>
  
</head>
<body>
    <!-- Navbar -->
    <%@include file="Components/navbar.jsp"%>

   
    <!-- Carousel -->
    <div id="carouselAutoplaying" class="carousel slide carousel-dark  mb-1" data-bs-ride="carousel">
        <div class="carousel-inner">
            
            <div class="carousel-item active">
                <img src="images/banner1.jpg" class="d-block w-100" alt="...">
            </div>
            <div class="carousel-item">
                
                <img src="images/banner2.png" class="d-block w-100" alt="...">
            </div>
            <div class="carousel-item">
                <img src="images/banner3.jpg" class="d-block w-100" alt="...">
                
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
					<img src="images\product.png" class="card-img-top"
						style="max-width: 100%; max-height: 200px; width: auto;">
				</div>
			</div>
			
			<div class="col">
				
					<div class="card h-100">
						<div class="container text-center">
							<img
								src="images/Smartwatch.jpg"
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
								src="images/headphones.png"
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
								src="images/charger.png"
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
          <jsp:include page="Components/Footer.jsp" />

   
</body>
</html>
