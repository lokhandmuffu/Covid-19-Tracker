<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Coronavirus Tracker Application</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h1>Coronavirus Tracker Application</h1>
		<p>This application lists the current number of cases reported
			across the globe</p>

		<div class="jumbotron">
			<h1 class="display-4" >${totalReportedCases}</h1>
			<p class="lead">Total cases reported as of today</p>
			<hr class="my-4">
			<p>
				<span>New cases reported since previous day:</span> 
				<span>${totalNewCases}</span>
			</p>

		</div>

		<table class="table">
			<tr>
				<th>State</th>
				<th>Country</th>
				<th>Total cases reported</th>
				<th>Changes since last day</th>
			</tr>
			
			<c:forEach items="${ locationStats}" var="locationStat">
			<tr>
				<td >${ locationStat.state}</td>
				<td >${locationStat.country}</td>
				<td>${ locationStat.latestTotalCases}</td>
				<td>${ locationStat.diffFromPrevDay}</td>
			</tr>
		</c:forEach>
		</table>
	</div>
</body>
</html>