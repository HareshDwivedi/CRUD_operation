<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.haresh.model.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="style.css">
<title>Edit page</title>
</head>
<body>
	<header><%@include file="Navbar.jsp"%></header>
	<main>
		<%
			Student stu = (Student) request.getAttribute("student");
		%>
		<section id="section_Id" style="background-color: white">
			<form id="form_Id" action="EditStudent" method="post">
				<h3 style="text-align: center; font-size: 20px; color: black;">
					<strong>Note: </strong> Student number will not be changed.
				</h3>
				<table>
					<tr>
						<td>Student No</td>
						<td><input type="text" name="student_no"
							value="<%=stu.getStudent_no()%>" /></td>
					</tr>
					<tr>
						<td>Student Name</td>
						<td><input type="text" name="student_name"
							value="<%=stu.getStudent_name()%>" /></td>
					</tr>

					<tr>
						<td>Student_DOB</td>
						<td><input type="date" name="student_dob"
							value="<%=stu.getStudent_dob()%>"></td>
					</tr>
					<tr>
						<td>Student_DOJ</td>
						<td><input type="date" name="student_doj"
							value="<%=stu.getStudent_doj()%>"></td>
					</tr>

					<tr>
						<td></td>
						<td>
							<button type="submit">Save</button> &nbsp;&nbsp;&nbsp;&nbsp; <a
							href="allStudents.jsp"><button type="button">Exit</button></a>
						</td>
					</tr>
				</table>
			</form>
		</section>
	</main>
	<footer></footer>
</body>
</html>