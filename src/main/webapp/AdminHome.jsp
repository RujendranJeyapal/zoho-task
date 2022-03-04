<%@ page import="java.util.*"%>
<%@ page import="accounts.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>admin</title>
<link rel="stylesheet" type="text/css" href="StyleSheet.css" > 
</head>
<body>
<form action="Customer" method="post">
<button>Customer</button><br><br>
</form>
<a href="AdminHome.jsp">Account</a><br><br>
<a href="TransferMoney.jsp">Money Transfer</a>
<br>
<br>
<a href="AddAccount.jsp">Add Account</a>
<br>
<br>
<table>

<tr>
<th>CustomerID</th><th>AccountID</th><th>Branch</th><th>Available Balance</th><th>Status</th>
</tr>

<%Map<Integer,Map<Integer,AccountInfo>> accDetailsMap=(Map<Integer,Map<Integer,AccountInfo>>) request.getAttribute("accDetailsMap");

for(Object key:accDetailsMap.keySet())
{
	Map<Integer,AccountInfo> accDetails=accDetailsMap.get(key);
	        for(Object key1:accDetails.keySet())
	        {
                 AccountInfo accountInfo=accDetails.get(key1);
%>
      <tr>
      <td><% out.print(accountInfo.getCustomerId()); %></td>
      <td><% out.print(accountInfo.getAccountId()); %></td>
      <td><% out.print(accountInfo.getBranch()); %></td>
      <td><% out.print(accountInfo.getAvailableBalance()); %></td>
      <td><% out.print(accountInfo.getStatus()); %></td>
      </tr>
<%
	        }
}
%>

</table>





</body>
</html>