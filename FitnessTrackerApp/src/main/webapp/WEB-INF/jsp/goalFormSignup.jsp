<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Goal Signup</title>
<style>
	.error{
		color:#ff0000;
		border:1px solid #ff000;
	}
</style>
</head>
<body>
	<form:form method="POST" commandName="signup">
		<table>
			<tr>
				<td>Goal</td>
				<td><form:input path="goal" cssErrorClass="error"/></td>
	
			</tr>
			<tr>
				<td>FirstName</td>
				<td><form:input path="firstName" cssErrorClass="error"/></td>
			</tr>
			<tr>
				<td>LastName</td>
				<td><form:input path="lastName" cssErrorClass="error"/></td>
			</tr>
			<tr>
				<td>Date</td>
				<td><form:input path="dateEntry" cssErrorClass="error"/></td>
			</tr>
			
			 <tr>
				<td>Profession</td>
				<td><form:select path="Department" multiple="" items="${designations}" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="register"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>