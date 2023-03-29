<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.js"></script>

</head>
<body>



	<div class="container-wapper">
		<div class="container">
			<form method="post">
				<textarea id="summernote" name="editordata"></textarea>
			</form>
		</div>
	</div>
	
	

<script type="text/javascript">


	$(function() {
		$('#summernote').summernote({
			height : 500,
			focus : true,
			lang : "ko-KR",
			
			callbacks:{
			onImageUpload : function(files) {
				sendFile(files[0],this);
					}
				}
			
		});
	});
	function sendFile(file,editor) {
	    var data = new FormData();
	    data.append("file", file);
	    $.ajax({
	        data: data,
	        type: "POST",
	        url: "${pageContext.request.contextPath}/ajax/saveimage",
	        cache: false,
	        contentType: false,
	        enctype:"multipart/data",
	        processData: false,
	        success: function(img) {
	        	console.log(img.url)
	        	$(editor).summernote("insertImage", img.url);
	        }
	    });
	};
</script>
</body>
</html>