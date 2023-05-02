<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hospitals Data</title>
</head>
<body>
<div class="states">
<h1>Please Enter the State to search for the Hospitals at your location</h1>
<form action="hospitals" method="post">
<input type="text" name="statesearch">
<input type="submit" value="submit" name="submit">
</form>
</div>
<h1>${hospitalstate}</h1>
</body>
</html>