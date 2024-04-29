<%-- 
    Document   : Checkout
    Created on : Apr 21, 2024, 8:48:13 PM
    Author     : dillo
--%>


<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@page import="model.Cart"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="Components/common_css_js.jsp"%>
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <%@include file="Components/navbar.jsp"%>
         <div class="container wrapper">
        <div class="row cart-head">
            <div class="container">
                <div class="row">
                    <p></p>
                </div>
               
                <div class="row">
                    <p></p>
                </div>
            </div>
        </div>    
        <div class="row cart-body">
            <form class="form-horizontal" method="post" action="CheckoutServlet">
                <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12 col-md-push-6 col-sm-push-6">
                    <!-- REVIEW ORDER -->
                    <div class="panel panel-info">
                        <div class="panel-heading">
                            Your Order <div class="pull-right"><small><a class="afix-1" href="Cart.jsp">Edit Cart</a></small></div>
                        </div>
                        <div class="panel-body">
                            <% 
                               List<Cart> cartList = (List<Cart>) session.getAttribute("cartList");
                               double subtotal = (Double) session.getAttribute("subtotal");
                              
                               if (cartList != null && !cartList.isEmpty()) {
                                   for (Cart cart : cartList) {
                                       
                            %>
                            <div class="form-group">
                                <!-- Your Order details go here -->
                                <div class="col-sm-3 col-xs-3">
                                    <img class="img-responsive" src="images/<%= cart.getImage() %>" />
                                </div>
                                <div class="col-sm-6 col-xs-6">
                                    <div class="col-xs-12"><%= cart.getProductName() %></div>
                                    <div class="col-xs-12"><small>Quantity:<span><%= cart.getQuantity() %></span></small></div>
                                </div>
                                <div class="col-sm-3 col-xs-3 text-right">
                                    <h6><span>Rs </span><%= cart.getPrice() %></h6>
                                </div>
                            </div>
                                <input type="hidden" name="productIds" value="<%= cart.getID() %>">
                                <input type="hidden" name="quantities" value="<%= cart.getQuantity() %>">
                                
                            <div class="form-group"><hr /></div>
                            <% 
                                   }
                               }
                            %>
                            <div class="form-group">
                                <div class="col-xs-12">
                                    <strong>Subtotal</strong>
                                    <div class="pull-right"><span>Rs </span><span><%= subtotal %></span></div>
                                    <input type="hidden" name="subtotal" value="<%= subtotal %>">
                                    
                                </div>
                            </div>
                            <div class="form-group"><hr /></div>
                        </div>
                    </div>
                    <!-- REVIEW ORDER END -->
                </div>
                <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12 col-md-pull-6 col-sm-pull-6">
                    <!-- SHIPPING METHOD -->
                    <div class="panel panel-info">
                        <div class="panel-heading">Address</div>
                        <div class="panel-body">
                            
                         
                            <div class="form-group">
                                <div class="col-md-12">
                                    <strong> Name:</strong>
                                    <input type="text" name="name" class="form-control" value="" />
                                </div>
                                
                            </div>
                            <div class="form-group">
                                <div class="col-md-12"><strong>Address:</strong></div>
                                <div class="col-md-12">
                                    <input type="text" name="address" class="form-control" value="" />
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-md-12"><strong>City:</strong></div>
                                <div class="col-md-12">
                                    <input type="text" name="city" class="form-control" value="" />
                                </div>
                            </div>
                            
                            
                            <div class="form-group">
                                <div class="col-md-12"><strong>Zip / Postal Code:</strong></div>
                                <div class="col-md-12">
                                    <input type="text" name="zipcode" class="form-control" value="" />
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-md-12"><strong>Phone Number:</strong></div>
                                <div class="col-md-12"><input type="text" name="phoneno" class="form-control" value="" /></div>
                            </div>
                            <div class="form-group">
                                <div class="col-md-12"><strong>Email Address:</strong></div>
                                <div class="col-md-12"><input type="text" name="email" class="form-control" value="" /></div>
                            </div>
                            <input type="hidden" name="date" value="<%= new java.util.Date() %>">
                            <% 
                                  Integer useridObj = (Integer) session.getAttribute("auth");
                                  int userid = (useridObj != null) ? useridObj : 0; // default value is 0 if useridObj is null
                            %>
                            
                            
                            <input type="hidden" name="userid" value="<%= userid %>">
                        </div>
                    </div>
                    <div class="form-group">
                                <div class="col-md-6 col-sm-6 col-xs-12">
                                    <button type="submit" class="btn btn-primary btn-submit-fix">Place Order</button>
                                </div>
                                </div>
                    <!-- SHIPPING METHOD END -->
                </div>
                                
                                
            </form>
        </div>
        <div class="row cart-footer"></div>
    </div>
                        <jsp:include page="Components/Footer.jsp" />
    </body>
</html>
