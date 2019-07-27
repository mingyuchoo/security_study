<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>스프링 시큐리티 예제</title>
</head>
<body onload='document.f.username.focus();'>
	<h2>로그인하세요.</h2>
	<form name='login_form' action="<c:url value='login' />" method='POST'>
		<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
		<table>
			<tr>
				<td>사용자명:</td>
				<td><input type='text' name='username' value=''></td>
			</tr>
			<tr>
				<td>패스워드:</td>
				<td><input type='password' name='password' /></td>
			</tr>
			<tr>
				<td colspan='2'><input name="submit" type="submit"	value="제출" /></td>
			</tr>
			<tr>
				<td colspan='2'><input name="reset" type="submit" value="초기화" /></td>
			</tr>
		</table>
	</form>

</body>
</html>