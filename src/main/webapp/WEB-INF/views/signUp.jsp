<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
		<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">

<head>
<meta charset="utf-8">
<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-wEmeIV1mKuiNpC+IOBjI7aAzPcEZeedi5yW5f2yOq55WWLwNGmvvx4Um1vskeMj0"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
	integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx"
	crossorigin="anonymous"></script>

<title>SignUp</title>
</head>
<style>
table{
  border-radius: 10px;
  opacity: 10;
}

body{
  text-align: center;
  background-image: url('https://cdn.pixabay.com/photo/2017/06/25/21/12/background-2442009_1280.jpg');
  color:white;
}
h1{
  width:100%;
  padding-bottom:10px;
  margin-top: 50px;
  margin-bottom: 0;
  border-radius: 10px;
}
input{
  border-radius: 5px;
}
label{
  color:white;
  padding-left: 15px;
}
a{
  text-decoration: none;
  color: black;
}
a:hover{
  color:white;
}
.regForm{
  padding-top: 100px;
  width: 25%;
}

</style>
<body>
	<form action="home" method="post">
		<div class="container regForm">
			<h1>User Registration</h1>
			<table class="table table-hover table-borderless">
				<tr>
					<td><label>First name :</label></td>
					<td><input type="text" name="first_name"
						placeholder="Enter First Name Here" required></td>
				</tr>
				<tr>
					<td><label>Last name :</label></td>
					<td><input type="text" name="last_name"
						placeholder="Enter Last Name Here" required></td>
				</tr>
				<tr>
					<td><label>Password :</label></td>
					<td><input type="password" name="password"
						placeholder="Enter Password Here" required></td>
				</tr>
				<tr>
					<td><label>EmailId :</label></td>
					<td><input type="email" name="emailid"
						placeholder="Enter Email Id Here" required></td>
				</tr>
				<tr>
					<td><label>Phone_no :</label></td>
					<td><input type="text" name="phone_no"
						placeholder="Enter Mobile no. Here" required></td>
				</tr>
				<tr>
					<td><label>Gender :</label></td>
					<td><input type="text" name="gender"
						placeholder="Enter Gender Here" required></td>
				</tr>
				<tr>
					<td><label>Age :</label></td>
					<td><input type="text" name="age" placeholder="Enter Age Here"
						required></td>
				</tr>
				<tr>
					<td><label>Nationality :</label></td>
					<td><input type="text" name="nationality"
						placeholder="Enter Nationality Here" required></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" name="submit"
						value="Register" class="btn btn-outline-dark"></td>
				</tr>
				<tr>
					<td colspan="2"><a href="#">Already a user Login here</a></td>
				</tr>
			</table>
		</div>
	</form>
</body>

</html>
