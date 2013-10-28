<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<link rel="stylesheet" type="text/css" href="../resource/style.css">
 
</head>
<center>
	<body bgcolor="#304050" style="color: white;">


		<br>
		

		<spring:url value="/login.do" var="home"></spring:url>
		<form:form action="${home}" method="post">




			<table style="font-family: monospace;">


				<tr>
					<td></td>
					<td><c:if test="${uid ne null }">
							<div class="info">Successfully registered</div>

						</c:if> <c:if test="${error ne null }">
							<div class="error">Forgot Username or Password??</div>

						</c:if></td>
				</tr>
				
				
				
				

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
					<td><input class="fancy" type="submit"
						value="login" /> &nbsp;&nbsp;<input
						class="fancy" type="reset"
						value="reset"/></td>

					<td></td>
				</tr>
				
			</table>


		</form:form>
	</body>