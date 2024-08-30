<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>College X Student Registry</title>
</head>
<body>
<h1>Login or SignUp</h1>
    <div th:if="${errorMessage}" style="color: red;">
        <p th:text="${errorMessage}"></p>
    </div>
    <form action = "login">
        Enter username : <input type="text" name="username">
        Enter password : <input type="text" name="password">
        <input type="submit" value="Login">
    </form>
    <form action = "signUp">
        Dont have an account ?
        <input type="submit" value="SignUp">
    </form>
</body>
</html>