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
    </head>
    <body>
        <div> 
            <h1> Contact Us</h1>
            <p>Welcome to WebApp contact us section. If you need any help please reach out to us. Our 24/7 suport team is here to answer your all the questions.</p>
            <div> 
            <p>Phone Number : (+94) 764648419</p>
            <p>Email : webapp@example.com</p>
           <p>Address : 147, pitipana Road, Kottawa, Homagama</p>
            </div>
            <div> 
            <form name="Contact Form" action="contact.jsp" method="GET">
            Fist Name :<input type="text" name="First Name " value="Ruvinda" /><br><br>
            Last Name : <input type="text" name="Last Name " value="Dilshan" /><br><br>
            Email : <input type="text" name="email" value="email" /><br><br>
            
            Message : <textarea name="text"> </textarea><br><br>

<button type ="submit">Submit</button>
            </div>
        </div>
    </body>
</html>
