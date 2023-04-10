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

.reviewConfirmationForm tr {
	border-bottom: 1px solid #EFF5FF;
}

.reviewConfirmationForm tr th {
	width: 12%;
	padding: 5px 0px;
	border-right: 1px solid #EFF5FF20;
}
input , select{
	font-size: 16px;
	border: none;
	padding: 5px;
	width: 100%;
}
</style>
</head>
<body>
	<div style="margin-bottom: 300px;">
		<h2
			style="color: #ffffff; text-align: center; padding: 5px 0px; background-color: #2d65f2;">강의 등록하기</h2>
		<form  method="post" action="${pageContext.request.contextPath}/lecture/insert">
			<table class="reviewConfirmationForm">
				<tr>
					<th>대상</th>
					<td><select>
							<option>재직자</option>
							<option>취업준비생</option>
					</select></td>
				</tr>
				<tr>
					<th>방법</th>
					<td><select>
							<option>온라인</option>
							<option>오프라인</option>
					</select></td>
				</tr>
				<tr>
					<th>카테고리</th>
					<td><select>
							<option>카테고리</option>
							<option>백엔드</option>
							<option>프론트엔드</option>
							<option>풀스텍</option>
							<option>AI</option>
							<option>보안</option>
							<option>데브옵스.인프라.툴</option>
							<option>데이터</option>
							<option>클라우드</option>
							<option>SW공학</option>
					</select></td>
				</tr>
				<tr>
					<th>강의명</th>
					<td><input type="text" placeholder="강의명을 입력해주세요"/> </td>
				</tr>
				<tr>
					<th>시작일</th>
					<td><input type="date" placeholder="강의시작일을 입력해주세요"/></td>
				</tr>
				<tr>
					<th>종료일</th>
					<td><input type="date" placeholder="강의종료일을 입력해주세요"/></td>
				</tr>
				<tr>
					<th>기관</th>
					<td><input type="text" placeholder="담당기관을 입력해주세요"/></td>
				</tr>
				<tr>
					<th>강사명</th>
					<td><input type="text" placeholder="담당 강사명을 입력해주세요"/></td>
				</tr>
				<tr style="border: none;">
					<th style="vertical-align: top;">설명</th>
					<td>
					<div style="clear: both; padding: 1px 0px 20px; width: 99%; margin:5px auto 0px;">
						<textarea id="summernote" name="editordata"></textarea>
					</div>
					
					</td>
					
					
					
				</tr>
			</table>
			<button class="formbutton"
				style="float: left; margin-left: 10px; background-color: #cccccc20; color: #22222250; border: none; width: 48%; font-size: 22px; padding: 5px 0px;">목록</button>
			<button type="submit" class="formbutton"
				style="float: left; margin-left: 15px; background-color: #2D65F2; color: #EFF5FF; border: none; width: 49%; font-size: 22px; padding: 5px 0px;">등록</button>
		</form>

	</div>
	<script type="text/javascript">
		$(function() {
			$('#summernote').summernote({
				height : 500,
				focus : true,
				lang : "ko-KR",

				callbacks : {
					onImageUpload : function(files) {
						sendFile(files[0], this);
					}
				}

			});
		});
		function sendFile(file, editor) {
			var data = new FormData();
			data.append("file", file);
			$.ajax({
				data : data,
				type : "POST",
				url : "${pageContext.request.contextPath}/ajax/saveimage",
				cache : false,
				contentType : false,
				enctype : "multipart/data",
				processData : false,
				success : function(img) {
					console.log(img.url)
					$(editor).summernote("insertImage", img.url);
				}
			});
		};
	</script>
</body>
</html>