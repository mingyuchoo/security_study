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
	<h2>홈페이지</h2>
	<a href="<c:url value='/admin/admin.do' />">관리자페이지</a>
	<br />
	<a href="<c:url value='/bbs/list.do' />">게시판</a>
	<br />
	<c:url var="logoutUrl" value="/logout" />
	<form action="${logoutUrl}" method="post">
		<input type="submit" value="로그아웃" /> <input type="hidden"
			name="${_csrf.parameterName}" value="${_csrf.token}" />
	</form>
</body>
</html>