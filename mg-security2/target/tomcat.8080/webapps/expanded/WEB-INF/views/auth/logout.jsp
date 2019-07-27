<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>스프링 시큐리티 예제</title>
</head>
<body>
	<h2>로그아웃 되었습니다.</h2>

	<a href="<c:url value='/login.do' />">로그인</a>
	<br>
</body>
</html>