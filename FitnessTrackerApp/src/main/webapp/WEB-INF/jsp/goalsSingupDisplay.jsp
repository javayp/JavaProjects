<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Signup date</title>
</head>
<body>
	<table>
		<tr>
			<td>Goal</td>
			<td>${signup.goal}</td>
		</tr>
		
		<tr>
			<td>FirstName</td>
			<td>${signup.firstName}</td>
		</tr>
		<tr>
			<td>LastName</td>
			<td>${signup.lastName}</td>
		</tr>
		<tr>
			<td>Date</td>
			<td>${signup.dateEntry}</td>
		</tr>
		<tr>
			<td>profession</td>
			<td>${signup.department}</td>
		</tr>
	</table>
</body>
</html>