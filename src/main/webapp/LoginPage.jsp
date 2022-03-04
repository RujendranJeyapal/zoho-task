<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bank Login</title>
<link rel="stylesheet" type="text/css" href="StyleSheet.css" > 
</head>
<body>
<div>
<br>
<br>
<br>
<br>
<form action="LogInServlet" method="post">

<label for="UserID">UserID</label>
<input type="text" placeholder="userId" name="UserID" required><br><br>

<label for="password">Password</label>
<input type="password" placeholder="password" name="password" required><br><br>

<button>submit</button>
</form>
<br>
<br>
<br>
<br>
</div>
</body>
</html>