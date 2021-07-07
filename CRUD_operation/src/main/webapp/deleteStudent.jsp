<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="style.css">
<title>delete student</title>
</head>
<body>
	<header><%@include file="Navbar.jsp"%></header>
	<main>
		<section id="section_Id">
			<form id="form_Id" action="DeleteStudent" method="post">
				<h3 style="text-align: center;">Enter the student number which you
					want to delete</h3>
				<table>
					<tr>
						<td>Student No</td>
						<td><input type="number" name="student_no" required="required"
							style="width: 180px;" /></td>
					</tr>

					<tr>
						<td></td>
						<td>
							<button type="submit">Delete</button>&nbsp;&nbsp;&nbsp;&nbsp; <a
							href="allStudents.jsp"><button type="button">Back</button></a>
						</td>
					</tr>
				</table>
			</form>
		</section>
	</main>
	<footer></footer>
</body>
</html>