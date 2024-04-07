<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<style>
  body {
    font-family: Arial, sans-serif;
    background-color: #f4f4f4;
    margin: 0;
    padding: 0;
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
  }

  form {
    background-color: #fff;
    padding: 20px;
    border-radius: 8px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    width: 300px;
  }

  label {
    display: block;
    margin-bottom: 8px;
    font-weight: bold;
  }

  input {
    width: 100%;
    padding: 8px;
    margin-bottom: 16px;
    box-sizing: border-box;
    border: 1px solid #ccc;
    border-radius: 4px;
  }

  input[type="submit"] {
    background-color: #007bff;
    color: #fff;
    cursor: pointer;
  }

  input[type="reset"] {
    background-color: #ff2f2f;
    color: #fff;
    cursor: pointer;
  }

  input[type="submit"]:hover {
    background-color: #0056b3;
  }
  input[type="reset"]:hover {
    background-color: #ff0000;
  }
</style>
<body>




  <form method="post" action="hello-servlet">
    <h1>Create login</h1>
    <p>Username :</p>
      <input type="text" name="userName"><br>
    <p>Password :</p>
    <input type="password" name="password"><br>

    <input type="submit" value="Create">
    <input type="reset" value="Clear">

  </form>

</body>
</html>