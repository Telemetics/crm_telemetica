<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<spring:url value="/tsp/viewaccountbasedonarea.do" var="path"></spring:url>
<form method="post" action="${path }">
		<table bgcolor="#990000" align="center" border="5">
			<tr>
				<td>Enter area id :</td>
				<td><input type="text" name="areaId" /></td>
			</tr>
			
			<tr>
				<td></td>
				<td align="center" colspan="2"><input type="submit"
					value="Get Accounts" /></td>
			</tr>
		
		</table>
	</form>

</body>
</html>