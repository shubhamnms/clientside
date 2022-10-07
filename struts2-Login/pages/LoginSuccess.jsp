<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<title>Login Success</title>

<body >
<h1>Login Success</h1>

<form action="Logout.action" >
    <button type="logout" id="logout"/>logout </button>
</form>
<form action="details.action" >
    <button  id="detail"/>view detail </button>
</form>

<style>
    button{
        width: auto;
        height: 20px;
        background-color: cyan;
    }

</style>
</body>
</html>