<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
</head>
<body>
	<h1>Hello world!</h1>

	<P>The time on the server is ${serverTime}.</P>
	
	
	<c:url var="refUrl" value="http://docs.spring.io/spring-security/site/docs/4.0.2.CI-SNAPSHOT/reference/htmlsingle/"/>
	<a href="${refUrl}">Spring Security Reference</a>
</body>
</html>
