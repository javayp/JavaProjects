<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SignUp Form</title>
</head>
<body>
	<form:form method="POST" action="/FitnessTracker/signupCompleted" commandName="SignupData">
		<table>
			<tr>
				<td>EmployeeId</td>
				<td><form:input  path="id"/>
			</tr>
			<tr>
				<td>FirstName</td>
				<td><form:input path="firstname"/>
			</tr>
			<tr>
				<td>LastName</td>
				<td><form:input path="lastname"/>
			</tr><tr>
				<td>PhoneNumber</td>
				<td><form:input path="phoneNumber"/>
			</tr>
			<tr>
				<td>Profession</td>
				<td>
					<form:select path="profeession" multiple="" items="${professionalList}"/>
				</td>
			</tr>
			<br/>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="register"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>