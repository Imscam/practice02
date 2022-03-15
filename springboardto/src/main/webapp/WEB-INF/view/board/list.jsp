<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서정보관리-리스트</title>
</head>
<body>
	<h2>도서정보관리 - 리스트</h2>

<article>
	<form:form commandName="search" action="search" method="get">
	<div id="searchForm">
		검색 키워드 입력 : 
		<form:select path="searchType">
			<form:option value="bookname">책이름</form:option>
		</form:select>
		<form:input path="searchValue" placeholder="책이름 "/>
		<input type="submit" value="검색">
	</div>
	</form:form>
	
		<table border="1">
			<tr>
					<th>등록번호</th>
					<th>도서 표지</th>
					<th>도서 ISBN</th>
					<th>도서제목</th>
					<th>저자</th>
					<th>출판사</th>
					<th>가격</th>
			</tr>
			<c:forEach var="board" items="${boardList}" varStatus="loop">
				<tr>
					<td>${board.num}</td>
					<td><img src="<c:url value='/image/${board.filename }' />" width="100"/></td>
					<td>${board.bookisbn}</td>
					<td><a href="<c:url value="/board/read/${board.num}"/>">
							${board.bookname}</a></td>
					<td>${board.bookmake}</td>
					<td>${board.bookfrom}</td>
					<td>${board.bookprice}</td>
				</tr>
			</c:forEach>
		</table>
		
		<a href="<c:url value="/board/write" />">도서 정보 추가</a>

</article>
</body>
</html>