<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>Employee Id</td>
			<td>${SignupData.id}</td>
		</tr>
		<tr>
			<td>First Name</td>
			<td>${SignupData.firstname}</td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td>${SignupData.lastname}</td>
		</tr>
		<tr>
			<td>Phone Number</td>
			<td>${SignupData.phoneNumber}</td>
		</tr>
		<tr>
			<td>Profession</td>
			<td>${SignupData.profeession}</td>
		</tr>
	</table>
</body>
</html>