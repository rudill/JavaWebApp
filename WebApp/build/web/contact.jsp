<%-- 
    Document   : contact
    Created on : Apr 18, 2024, 11:26:15 AM
    Author     : myari
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact Page</title>
        <%@include file="Components/common_css_js.jsp"%>
        <link rel="stylesheet" href="css/contact.css">
        
        <script src="https://kit.fontawesome.com/your_fontawesome_kit_id.js" crossorigin="anonymous"></script>

    </head>
    <body>
        <%@include file="Components/navbar.jsp"%> 
     <section class="contact-us">
    <div class="container">
      <h1>Thanks for Connecting with Us!</h1>
      <p>Our 24/7 support service is always here to assist you with any questions or concerns you may have.</p>
    </div>
  </section>

  <section class="contact-info-form">
    <div class="container">
      <div class="contact-info">
        <h2>Contact Info</h2>
        <p>Feel free to reach out to us using the information below.</p>
        <ul>
          <li><i class="fas fa-envelope"></i> contact@webapp.com</li>
          <li><i class="fas fa-phone"></i> 0764648419</li>
          <li><i class="fas fa-map-marker-alt"></i> 147, Pitipana Road, Homagama</li>
        </ul>
      </div>

      <div class="contact-form">
        <h2>Contact Form</h2>
        <form action="ContactServelet" method="POST">
          <div class="form-group">
            <label for="firstName">First Name:</label>
            <input type="text" id="firstName" name="firstName" required>
          </div>
          <div class="form-group">
            <label for="lastName">Last Name:</label>
            <input type="text" id="lastName" name="lastName" required>
          </div>
          <div class="form-group">
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required>
          </div>
          <div class="form-group">
            <label for="message">Message:</label>
            <textarea id="message" name="message" required></textarea>
          </div>
          <button type="submit">Send Message</button>
        </form>
      </div>
    </div>
  </section>
 <jsp:include page="Components/Footer.jsp" />
  <script src="https://kit.fontawesome.com/your_fontawesome_kit_id.js" crossorigin="anonymous"></script>
    </body>
</html>
