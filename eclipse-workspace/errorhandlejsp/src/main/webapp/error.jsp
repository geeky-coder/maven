<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>error</title>
</head>
<body>
<%@ page isErrorPage = "true" %>
 
    <h1> Oops! An Exception is caught </h1><br><br>
 
        <h2>The exception is : <%= exception %>   </h2>

</body>
</html>