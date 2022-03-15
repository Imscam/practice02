<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서정보관리-도서정보</title>
</head>
<body>
<h2>도서정보관리 - 도서정보</h2>
		<table border="1">
				<tr>
					<th rowspan="5"><img src="<c:url value='/resources/uploads/${boardVO.filename }' />" width="100"/></th>
				</tr>
				<tr>
					<th>BOOK ISBN</th>
					<td>${boardVO.bookisbn}</td>
				</tr>
				<tr>
					<th>도서명</th>
					<td>${boardVO.bookname}</td>
				</tr>
				<tr>
					<th>저자</th>
					<td>${boardVO.bookmake}</td>
				</tr>
				<tr>
					<th>도서 가격</th>
					<td>${boardVO.bookprice}</td>
				</tr>
				<tr>
					<th>책 소개</th>
					<td colspan="2">${boardVO.bookintro}</td>
				</tr>
				
		</table>
		<div>
				<a href="<c:url value="/board/list"/>">목록</a>
		</div>

</body>
</html>