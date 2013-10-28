<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>


</head>

<c:forEach items="${errors}" var="e">
${e.defaultMessage}
</c:forEach>



<spring:url value="/test" var="home"></spring:url>
<form:form action="${home}" method="post">




	<table style="font-family: monospace;">



		<tr>
			<td><label>username:</label></td>

			<td><input class="inputq" type="text" name="userName"
				value="${uid}" /></td>
		</tr>
		<tr>
			<td><label>password:</label></td>
			<td><input class="inputq" type="password" name="password" /></td>
		</tr>


		<tr>
			<td></td>
			<td><input class="fancy" type="submit" value="login" />
				&nbsp;&nbsp;<input class="fancy" type="reset" value="reset" /></td>

			<td></td>
		</tr>

	</table>


</form:form>
</body>