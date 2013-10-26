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
${createaccountkey}
${accountcreatedfailurekey}
<spring:url value="/tsp/createaccount.do" var="path"></spring:url>
<form method="post" action="${path }">
		<table bgcolor="#990000" align="center" border="5">
			<tr>
				<td>Vertical Name :</td>
				<td><input type="text" name="verticalName" /></td>
			</tr>
			
			<tr>
				<td></td>
				<td align="center" colspan="2"><input type="submit"
					value="submit" /></td>
			</tr>
		
		</table>
		<a href="viewaccount.jsp">View Account</a>
		${accountcreatedkey}
	</form>
</body>
</html>