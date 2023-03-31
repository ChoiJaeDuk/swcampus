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
	width: 10%;
	padding: 5px 0px;
	border-right: 1px solid #EFF5FF20;
}
</style>
</head>
<body>
	<div style="margin-bottom: 300px;">
	<h2
			style="color: #ffffff; text-align: center; padding: 5px 0px; background-color: #2d65f2;">리뷰승인요청</h2>
		<table class="reviewConfirmationForm">
			<tr>
				<th>대상</th>
				<td>재직자</td>
			</tr>
			<tr>
				<th>방법</th>
				<td>오프라인</td>
			</tr>
			<tr>
				<th>카테고리</th>
				<td>백엔드</td>
			</tr>
			<tr>
				<th>강의명</th>
				<td>신나는자바수업~</td>
			</tr>
			<tr>
				<th>작성자</th>
				<td>김코딩</td>
			</tr>
			<tr>
				<th>등록일자</th>
				<td>2023-03-31</td>
			</tr>
			<tr style="border: none;">
				<th style="vertical-align: top;">리뷰내용</th>
				<td>정말너무재밌어요정말너무재밌어요정말너무재밌어요정말너무재밌어요정말너무재밌어요정말너무재밌어요정말너무재밌어요정말너무재밌어요정말너무재밌어요정말너무재밌어요정말너무재밌어요정말너무재밌어요정말너무재밌어요정말너무재밌어요정말너무재밌어요정말너무재밌어요정말너무재밌어요정말너무재밌어요정말너무재밌어요정말너무재밌어요정말너무재밌어요정말너무재밌어요정말너무재밌어요정말너무재밌어요정말너무재밌어요정말너무재밌어요정말너무재밌어요정말너무재밌어요정말너무재밌어요정말너무재밌어요정말너무재밌어요정말너무재밌어요정말너무재밌어요정말너무재밌어요정말너무재밌어요정말너무재밌어요정말너무재밌어요정말너무재밌어요정말너무재밌어요정말너무재밌어요정말너무재밌어요정말너무재밌어요정말너무재밌어요정말너무재밌어요정말너무재밌어요정말너무재밌어요정말너무재밌어요정말너무재밌어요정말너무재밌어요정말너무재밌어요정말너무재밌어요정말너무재밌어요정말너무재밌어요정말너무재밌어요</td>
			</tr>
			<tr style="border: none;">
				<th style="  vertical-align: top;">첨부파일</th>
				<td><div>
						<img alt="" src="/IMG/logoIcon.png">
					</div></td>
			</tr>
		</table>
		<button class="formbutton" style="float: left;  margin-left:10px; background-color:#cccccc20; color: #22222250; border: none; width: 32%; font-size: 22px; padding: 5px 0px;">목록</button>
		<button class="formbutton" style="float: left;  margin-left:5px; background-color:#EFF5FF; color: #2D65F2; border: none; width: 32%; font-size: 22px; padding: 5px 0px;"">승인</button>
		<button class="formbutton" style="float: left; margin-left:5px; background-color:#2D65F2; color: #EFF5FF; border: none; width: 32%; font-size: 22px; padding: 5px 0px;"">삭제</button>
	</div>

</body>
</html>