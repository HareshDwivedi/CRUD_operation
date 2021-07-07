<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="style.css">
<title>Add Student page</title>
</head>
<body>
	<header>
		<%@include file="Navbar.jsp"%>
	</header>
	<main>
		<section id="section_Id">
			<form id="form_Id" action="AddStudent" method="post">
				<table>
					<tr>
						<td>Student No</td>
						<td><input type="number" name="student_no" required="required" /></td>
					</tr>
					<tr>
						<td>Student Name</td>
						<td><input type="text" name="student_name" required="required" /></td>
					</tr>

					<tr>
						<td>Student_DOB</td>
						<td><input type="date" name="student_dob" required="required"></td>
					</tr>
					<tr>
						<td>Student_DOJ</td>
						<td><input type="date" name="student_doj" required="required"></td>
					</tr>

					<tr>
						<td></td>
						<td >
							<button type="submit">Add</button> &nbsp;&nbsp;&nbsp;&nbsp;
							<button type="reset">reset</button>
						</td>
					</tr>
				</table>
			</form>
		</section>
	</main>
	<footer></footer>
	<script src="https://code.jquery.com/jquery-3.6.0.js"
		integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk="
		crossorigin="anonymous"></script>
	<script>
		$(document).ready(function() {
			$("#form_Id").on('submit', function(event) {

				event.preventDefault();
				let formData = $(this).serialize();
				console.log(formData);

				$.ajax({
					url : "AddStudent",
					data : formData,
					type : 'POST',

					success : function(data, textStatus, jqXHR) {

						if (data != null) {
							$("#section_Id")
							alert("Data has been added successfully");
							window.location.href = "allStudents.jsp";
						} else {
							alert("Something went worng!");
						}
					},
					error : function(jqXHR, textStatus, errorThrown) {
						alert("Something went worng!");

					}

				})
			})

		})
	</script>
</body>
</html>