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
	<script>
		function del() {
			if (confirm("삭제하시겠습니까?"))
				document.form.submit();
		}
	</script>
    <a href="<c:url value='/' />">홈페이지</a><br/>

    <c:url var="delete_url" value="/bbs/delete.do" />
	<form:form id="form" name="form" method="post" action="${delete_url }">
		<input type="hidden" id="idx" name="idx" value="${object.idx}" />
	</form:form>
	<p>제목: ${object.subject}</p>

	<div>내용: ${object.content}</div>

	<div>
		<p>작성자: ${object.username}</p>
		<p>등록일: ${object.createDate}</p>
	</div>

	<div>
		<button type="button" onclick="del()">삭제</button>
		<a href="<c:url value='/bbs/write.do?idx=${object.idx }'/>">수정</a>
		<a href="<c:url value='/bbs/list.do'/>">목록</a><br>
	</div>
</body>
</html>