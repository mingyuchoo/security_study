<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>스프링프레임워크 게시판</title>
</head>
<body>
	<h1>${message}</h1>
	<a href="<c:url value='/' />">홈페이지</a><br/>
     
    <c:url var="write_ok_url" value="/bbs/write_ok.do" />
	<form:form id="form" method="post" action="${write_ok_url }" >
		<input type="hidden" name="idx" id="idx" value="${object.idx}" />
		<div>
			<span>제목</span> <input type="text" id="subject" name="subject"	value="${object.subject}" />
		</div>
		<div>
			<span>작성자</span> <input type="text" id="username"  name="username"	value="${object.username}" />
		</div>
		<div>
			<span>내용</span>
			<textarea id="content" name="content" rows="10" cols="20">${object.content}</textarea>
		</div>

		<div>
			<input type="submit" value="저장" />
			<a href="<c:url value='/bbs/list.do'/>">목록</a><br>
		</div>
	</form:form>
</body>
</html>