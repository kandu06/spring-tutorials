<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Minutes page.</title>
</head>
<body>
<form:form commandName="exercise">

Language : <a href="?language=en">English</a> | <a href="?language=es">Spanish</a>
<table>
	<tr>
		<td><spring:message code="goal.text" /></td>
		<td><form:input path="minutes"/></td> <!--  minutes filed in exercise object. Specified in form tag commandName attribute.-->
	</tr>
	<tr>
		<td colspan="2">
		<input type="submit" value="Enter Minutes Exercised"/>
		</td>
	</tr>
</table>
Goal minutes:${goal.minutes} <!-- goal object will be set by the controller before redirecting. -->
</form:form>

</body>
</html>