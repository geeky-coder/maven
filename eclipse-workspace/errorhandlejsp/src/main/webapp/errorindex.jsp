<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>errorindex</title>
</head>
<body>
<%@ page errorPage = "error.jsp" %>
 
<%                                      
String num1 = request.getParameter("first");
String num2 = request.getParameter("second");

int x = Integer.parseInt(num1);
int y = Integer.parseInt(num2);
int z = x / y; // dividing the numbers
out.print("division of numbers is: " + z); 
%>
</body>
</html>

