<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Goal</title>
</head>
<body>

<form:form commandName="goal"> <!-- object that binds to this view, object fields set in controller. -->
<table>
	<tr>
		<td><spring:message code="goal.text" /> </td>
		<td><form:input path="minutes"/> </td> <!--  minutes has getter and setter names in the "goal" command object, mentioned in form tag commandName attribute. -->
		<td><form:errors path="minutes" />
	</tr>
	<tr>
		<td colspan="2"><input type="submit" value="Enter goal minutes"></td>
	</tr>

</table>

</form:form>

</body>
</html>