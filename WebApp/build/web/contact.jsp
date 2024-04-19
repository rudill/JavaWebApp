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
            #main-title{
                color:#222831;
                font-family: arial;
                text-align: center;
                font-size: 40px;
            }   
            
            #sub-title{
                text-align: center;
                color: #73777B;
                font-family: arial;
                font-weight: 500;
            }
            
            #section-one{
                padding-top: 100px;
                padding-left: 200px;
                padding-right: 200px;
            }
            
            #phone{
                color: black;
                font-family: arial;
                size: 18px;
            }
            
            #mail{
               color: black;
                font-family: arial;
                size: 18px; 
            }
            
            #address{
                color: black;
                font-family: arial;
                size: 18px;
            }
        </style>
    </head>
    <body>
        
        <h1 id="main-title"> Contact Us</h1>
            <p id="sub-title">Welcome to WebApp contact us section. If you need any help please reach out to us. Our 24/7 suport team is here to answer your all the questions.</p>
            <div id="section-one"> 
            
            <div id="contact-section"> 
                <p id="phone">Phone Number : (+94) 764648419</p>
                <p id="mail">Email : webapp@example.com</p>
                <p id="address">Address : 147, pitipana Road, Kottawa, Homagama</p>
            </div>
          
            <div id="form-section"> 
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
