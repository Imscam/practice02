<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서정보관리-도서추가</title>
</head>
<body>
<h2>도서정보관리 - 도서추가</h2>
<article>
	<form:form action="write" commandName="submitForm" enctype="multipart/form-data">
		<table border="1">
				<tr>
					<th id="thumbnailContainer" rowspan="6">
					<img src="" id="thumbnailImg" width="100"></th>
				</tr>
				<tr>
					<th>BOOK ISBN</th>
					<td><form:input path="bookisbn"/>
					<form:errors path="bookisbn"/></td>
				</tr>
				<tr>
					<th>도서명</th>
					<td><form:input path="bookname"/>
					<form:errors path="bookname"/></td>
				</tr>
				<tr>
					<th>저자</th>
					<td><form:input path="bookmake"/>
					<form:errors path="bookmake"/></td>
				</tr>
				<tr>
					<th>출판사</th>
					<td><form:input path="bookfrom"/>
					<form:errors path="bookfrom"/></td>
				</tr>
				<tr>
					<th>도서 가격</th>
					<td><form:input path="bookprice"/>
					<form:errors path="bookprice"/></td>
				</tr>
				<tr>
					<th>이미지</th>
					<td><input type="file" id="image" name="image" value="${submitForm.image }"
					onChange="setTumbnail()"/>
					<form:errors path="image"/></td>
				</tr>
				<tr>
					<th>책 소개</th>
					<td colspan="2"><form:input path="bookintro"/>
					<form:errors path="bookintro"/></td>
				</tr>
				
		</table>
		<div>
				<input type="submit" value="도서정보 추가">
				<a href="<c:url value="/board/list"/>">도서 정보목록</a>
		</div>
	</form:form>
	</article>
</body>
<script type="text/javascript">
function setTumbnail(){
	let fileInfo = document.getElementById("image").files[0];
	let reader = new FileReader();
	
	reader.onload = function(){
		document.getElementById("thumbnailImg").src = reader.result;
	}
	if(fileInfo){
		reader.readAsDataURL(fileInfo);
	}
}
</script>
</html>