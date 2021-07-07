<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="style.css">
<title>All students list</title>
</head>
<body>
	<header>
		<%@include file="Navbar.jsp"%>
	</header>
	<main>
		<section id="section_Id"
			style="border: none; font-size: 20px; background-color: grey; color: white; border-radius: 5px; width: 80%; border: 1px solid black; text-align: center;"></section>

	</main>
	<footer></footer>
	<script type="text/javascript">
		window.addEventListener("load",
						function() {

							let xhr = new XMLHttpRequest();
							xhr.open('GET', 'AllStudents', true);
							xhr.send();
							xhr.onreadystatechange = function() {
								if (xhr.readyState == 4 && xhr.status == 200) {
									document.getElementById('section_Id').innerHTML = xhr.responseText;
								}

							}
						})
	</script>
</body>
</html>