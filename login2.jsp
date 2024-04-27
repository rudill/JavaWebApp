<%-- 
    Document   : login2
    Created on : Apr 18, 2024, 9:32:33 PM
    Author     : singer
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" type="text/css" href="bootstrap.css">
    <link rel="stylesheet" type="text/css" href="newstyle.css">
    <link rel="stylesheet" type="text/css" href="newstyle2.css">
</head>
<body>
        <div class="row">
            <div class="img-holder">
                <div class="bg"></div>
                <div class="info-holder">

                </div>
            </div>
            <div class="form-holder">
                <div class="form-content">
                    <div class="form-items">
                        <h3>Get more things done with Loggin Our Site.</h3>
                        <div class="page-links">
                            <a href="login2.jsp" class="active">Login</a><a href="register2.jsp">Register</a>
                        </div>
                        
                        <form method="POST" action="signinservlet">
                            
                            <input class="form-control" type="text" name="fname" placeholder="User Name" required>
                            <input class="form-control" type="password" name="passw" placeholder="Password" required>
                            <input type="checkbox" id="chk1" name="remember"><label for="chk1">Remember me</label>
                            <div class="form-button">
                            <button id="submit" type="submit" class="ibtn">Login</button>
                        </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
</body>
</html>
