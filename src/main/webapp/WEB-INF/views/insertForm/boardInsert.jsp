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
.titleBox {
	outline: 0;
	color: #2D65F2;
	width: 100%;
	margin: 50px 0px 0px;
	padding: 15px;
	box-sizing: border-box;
	font-size: 22px;
	text-align: left;
	font-weight: 800;
}

.inputBox {
	background: #ffffff;
	border: 1px solid #EFF5FF50;
	border-right: none;
	border-left: none;
	width: 89.9%;
	margin: 0;
	padding: 10px;
	box-sizing: border-box;
	font-size: 14px;
	float: right;
}

.note-toolbar {
	background: #cccccc50;
}

.inputlabel {
	color: #22222290;
	width: 10%;
	border: 1px solid #EFF5FF50;
	border-right: none;
	border-left: none;
	margin: 0;
	padding: 10px 20px;
	box-sizing: border-box;
	font-size: 14px;
	float: left;
	font-weight: 700;
	letter-spacing: 10px;
}

.formbutton {
	text-transform: uppercase;
	outline: 0;
	background: #2D65F2;
	width: 49.5%;
	margin: 0px; border : 0;
	padding: 15px;
	color: #FFFFFF;
	font-size: 20px;
	-webkit-transition: all 0.3 ease;
	transition: all 0.3 ease;
	cursor: pointer;
	border: 0;
	font-weight: 900;
}

.formbutton:hover, .formbutton:active, .formbutton:focus {
	background: #2D65F2;
}
</style>
</head>
<body>



	<div class="container-wapper">
		<div class="container" style="margin: 100px auto 150px;">
			<div class="titleBox">게시글 작성하기</div>
			<form method="post">
				<label class="inputlabel">제목</label> <input type="text"
					class="inputBox" placeholder="제목을 입력해주세요"> <label class="inputlabel">게시판</label> 
					<select  class="inputBox" id="boardType">
						<option value="code">코드게시판</option>
						<option value="free">자유게시판</option>
						<option value="QA">문의게시판</option>
						<option value="notice">공지게시판</option>
					</select>
				<label class="inputlabel">작성자</label> <input type="text"
					disabled="disabled" value="작성자ID" class="inputBox">
				<div style="clear: both; padding: 1px 0px 20px; width: 99%; margin:5px auto 0px;">
					<textarea id="summernote" name="editordata"></textarea>
				</div>
				<button class="formbutton" style="float: left; background-color:#EFF5FF; color: #2D65F2; ">목록</button>
				<button class="formbutton" style="float: right;">작성</button>
			</form>
		</div>
	</div>

<script>
  // 현재 URL에서 boardType 값을 가져와서 select 태그에서 해당 값을 선택된 상태로 설정
  var urlParams = new URLSearchParams(window.location.search);
  var boardType = urlParams.get('boardType');
  var selectBox = document.querySelector('#boardType');
  selectBox.value = boardType;
</script>

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