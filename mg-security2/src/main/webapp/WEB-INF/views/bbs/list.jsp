<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>스프링프레임워크 게시판</title>
</head>
<body>
	<h1>${message}</h1>

	<a href="<c:url value='/' />">홈페이지</a>
	<br />

	<table border="1">
		<colgroup>
			<col width="60">
			<col>
			<col width="115">
			<col width="85">
		</colgroup>
		<thead>
			<tr>
				<th scope="col">번호</th>
				<th scope="col">제목</th>
				<th scope="col">작성자</th>
				<th scope="col">등록일</th>
			</tr>
		</thead>

		<tbody>
			<!-- 목록이 반복될 영역 -->
			<c:forEach var="item" items="${list}" varStatus="status">
				<tr>
					<td width="10%">${item.idx}</td>
					<td width="30%"><a href="./${item.idx}">${item.subject}</a></td>
					<td width="20%">${item.username}</td>
					<td width="40%">${item.createDate}</td>
				</tr>
			</c:forEach>

		</tbody>

	</table>
	<div>
	   <a href="<c:url value='/bbs/write.do'/>">쓰기</a>
	</div>
</body>
</html>