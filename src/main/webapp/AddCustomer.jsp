<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>customer_adding</title>
</head>
<body>
<form action="AddCustomer" method="post">

<label>Name</label>
<input type="text" placeholder="name" name="name" required><br><br>
<label>Address</label>
<input type="text" placeholder="address" name="address" required><br><br>
<label>MobileNumber</label>
<input type="text" placeholder="mobilenumber" name="mobilenumber" required><br><br>
<button>add</button>

</form>
</body>
</html>