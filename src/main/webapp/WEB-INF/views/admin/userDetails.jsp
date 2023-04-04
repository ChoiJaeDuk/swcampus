<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.js"></script>
<style type="text/css">
.reviewConfirmationForm {
	width: 100%;
	border-collapse: collapse;
	font-size: 18px;
	margin-bottom: 40px;
}
.reviewConfirmationForm tr{
 border-bottom:   1px solid #EFF5FF;
}


.reviewConfirmationForm tr th {
	width: 20%;
	padding: 10px 0px;
	border-right: 1px solid #EFF5FF20;
}
</style>
</head>
<body>
	<div style="margin-bottom: 300px;">
	<h2
			style="color: #ffffff; text-align: center; padding: 5px 0px; background-color: #2d65f2;">회원정보</h2>
		<table class="reviewConfirmationForm">
			<tr>
				<th>아이디</th>
				<td>코딩짱짱</td>
			</tr>
			<tr>
				<th>이름</th>
				<td>김토리</td>
			</tr>
			<tr>
				<th>연락처</th>
				<td>010-0101-1010</td>
			</tr>
			<tr>
				<th>이메일</th>
				<td>wertyuiop@naver.com</td>
			</tr>
			<tr>
				<th>가입일자</th>
				<td>2023-03-31</td>
			</tr>
			<tr>
				<th>회사명</th>
				<td>소프트웨어캠퍼스</td>
			</tr>
			<tr>
				<th>직무</th>
				<td>개발자</td>
			</tr>
		</table>
		<button class="formbutton" style="float: left;  margin-left:10px; background-color:#cccccc20; color: #22222250; border: none; width: 48%; font-size: 22px; padding: 5px 0px;">목록</button>
		<button class="formbutton" style="float: left; margin-left:10px; background-color:#2D65F2; color: #EFF5FF; border: none; width:48%; font-size: 22px; padding: 5px 0px;"">삭제</button>
	</div>

</body>
</html>