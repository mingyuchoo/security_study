<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Missing CSRF Token Error</title>
</head>
<body>
	<h1>CSRF 토큰이 없습니다.</h1>
	<a href="<c:url value='/' />">홈페이지</a><br/>
</body>
</html>