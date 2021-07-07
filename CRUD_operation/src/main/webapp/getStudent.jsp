
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.haresh.model.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="style.css">
<title>get Student</title>
</head>
<body>
	<header>
		<%@include file="Navbar.jsp"%>
	</header>
	<main>
		<section id="section_Id">
			<form id="form_Id" action="GetStudent" method="post">
			<h3 style="text-align:center;">Enter Student Number </h3>
				<table>
					<tr>
						<td>Student No</td>
						<td><input type="number" name="student_no" required="required"
							style="width: 180px;" /></td>
					</tr>

					<tr>
						<td></td>
						<td>
							<button type="submit">Search</button>&nbsp;&nbsp;&nbsp;&nbsp;
							<button type="reset">reset</button>
						</td>
					</tr>
				</table>
			</form>
		</section>


	</main>
	<footer></footer>
</body>
</html>