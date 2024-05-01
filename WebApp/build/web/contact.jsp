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
        <style>
          body {
  font-family: Arial, sans-serif;
  margin: 0;
  padding: 0;
  background-color: #f5f5f5;
}

.contact-us {
  background-color: #fff;
  padding: 80px 0;
  text-align: center;
}

.contact-us h1 {
  font-size: 2.5em;
  margin-bottom: 20px;
  color: #333;
}

.contact-us p {
  font-size: 18px;
  color: #666;
  line-height: 1.5;
}

.contact-info-form {
  display: flex;
  justify-content: space-between;
  padding: 50px 0;
}

.contact-info-form .container {
  width: 50%;
  margin: 0 auto; /* Center the content within the container */
}

.contact-info {
  background-color: #f0f0f0;
  border-radius: 5px;
  padding: 30px;
}

.contact-info h2 {
  font-size: 1.8em;
  margin-bottom: 15px;
  color: #333;
}

.contact-info p {
  font-size: 16px;
  color: #666;
  line-height: 1.5;
}

.contact-info ul {
  list-style: none;
  padding: 0;
  margin: 20px 0;
}

.contact-info li {
  margin-bottom: 10px;
}

.contact-info li i {
  margin-right: 10px;
  color: #333;
  font-size: 18px;
}

.contact-form {
  background-color: #fff;
  border-radius: 5px;
  padding: 30px;
}

.contact-form h2 {
  font-size: 1.8em;
  margin-bottom: 15px;
  color: #333;
}

.form-group {
  margin-bottom: 15px;
}

.form-group label {
  display: block;
  margin-bottom: 5px;
  font-size: 16px;
  color: #333;
}

.form-group input,
.form-group textarea {
  width: 100%;
  padding: 12px 15px;
  border: 1px solid #ccc;
  border-radius: 3px;
  box-sizing: border-box;
  font-size: 16px;
}

.form-group textarea {
  height: 100px;
  resize: vertical;
}

.contact-form button {
  background-color: #333;
  color: #fff;
  padding: 12px 20px;
  border: none;
  border-radius: 3px;
  cursor: pointer;
  font-size: 16px;
  transition: background-color 0.2s ease-in-out;
}

.contact-form button:hover {
  background-color: #222;
}


        </style>
        
        <script src="https://kit.fontawesome.com/your_fontawesome_kit_id.js" crossorigin="anonymous"></script>

    </head>
    <body>
        
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
        <form action="contact.jsp" method="POST">
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

  <script src="https://kit.fontawesome.com/your_fontawesome_kit_id.js" crossorigin="anonymous"></script>
    </body>
</html>
