<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:useBean id="employee" class="com.prowings.model.Employee"
	scope="request"></jsp:useBean>
<jsp:setProperty name="employee" property="*" />
<!DOCTYPE html>
<html>
<h1>Retrival completed</h1>
<head>
<%@ page isELIgnored="false"%>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
</head>
<body>
	<p>
		Employee id:
		<c:out value="${employee.id}" />
	</p>
	<p>
		Employee name:
		<c:out value="${employee.name}" />
	</p>
	<p>
		Employee phone:
		<c:out value="${employee.phone}" />
	</p>
</body>
</html>