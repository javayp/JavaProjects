<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Exercise Tracker</title>
</head>
<body>
	<form:form commandName="exercise">
		<table>
			<tr>
				<td>Name</td>
				<td><form:input path="name" /></td>
				<td>Employee ID</td>
				<td><form:input path="employeeId" /></td>
				<td>Age</td>
				<td><form:input path="age" /></td>
				<td>Department</td>
				<td><form:input path="department" /></td>
			</tr>
			<tr>
				<br>
				<td><input type="submit" value="ClickTo Save"></td>
			</tr>
		</table>
	</form:form>
	<h2>${info }</h2>
</body>
</html>