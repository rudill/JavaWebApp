<%-- 
    Document   : register2
    Created on : Apr 18, 2024, 9:31:15 PM
    Author     : singer
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register</title>
    <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="css/newstyle.css">
    <link rel="stylesheet" type="text/css" href="css/newstyle2.css">
</head>
<body>
    <div class="row">
        <div class="img-holder">
            <div class="bg"></div>
            <div class="info-holder"></div>
        </div>
        <div class="form-holder">
            <div class="form-content">
                <div class="form-items">
                    <h3>Get more things done with Loggin Our Site.</h3>
                    <div class="page-links">
                        <a href="login.jsp">Login</a><a href="register.jsp" class="active">Register</a>
                    </div>
                    <form method="post" action="Signupservlet">
                        <input class="form-control" type="text" name="username" placeholder="User Name" required>
                        <input class="form-control" type="text" name="firstname" placeholder="First Name" required>
                        <input class="form-control" type="text" name="lastname" placeholder="Last Name" required>
                        <input class="form-control" type="text" name="email" placeholder="E-Mail" required>
                        <input class="form-control" type="password" name="password" placeholder="Password" required>
                        <input class="form-control" type="password" name="Retypepassword" placeholder="Retype Password" required>
                        <div class="form-button">
                            <button id="submit" type="submit" class="ibtn">Register</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</body>
</html>