<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>account_adding</title>
<link rel="stylesheet" type="text/css" href="StyleSheet.css" >
</head>
<body>
<div>
<form action="AddAccount" method="post"> 
<label>CustomerID</label>
<input type="text" placeholder="customerid" name="cusID" required><br><br>
<label>Branch</label>
<input type="text" placeholder="branch" name="branch" required><br><br>
<button>add</button>
</form>
</div>
</body>
</html>