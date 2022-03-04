<%@ page import="java.util.*"%>
<%@ page import="bank.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>allcustomers</title>
<link rel="stylesheet" type="text/css" href="StyleSheet.css">
</head>
<body>

<a href="AddCustomer.jsp">add customer</a>

<table>
<tr>
<th>CustomerID</th><th>Name</th><th>Address</th><th>Mobile Number</th><th>Status</th>

</tr>

<%
Map<Integer,CustomerInfo> cusDetailsMap=(Map<Integer,CustomerInfo>)request.getAttribute("cusDetailsMap");
for(Object key:cusDetailsMap.keySet())
{
	CustomerInfo customerInfo=cusDetailsMap.get(key);
%>
   <tr>
   
   <td> <%out.print(customerInfo.getCustomerId()); %>  </td>
   <td> <%out.print(customerInfo.getName());%>         </td>
   <td> <%out.print(customerInfo.getAddress()); %>      </td>
   <td> <%out.print(customerInfo.getMobileNo()); %></td>
   <td> <%out.print(customerInfo.getStatus()); %></td>
   </tr>

<%
} 
%>


</table>


</body>
</html>