<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.LectureTitle {
	font-size: 24px;
	font-weight: 700;
	line-height: 60px;
}

.LectureContentsTitle {
	font-family: 'Noto Sans KR';
	font-style: normal;
	font-weight: 500;
	font-size: 24px;
	line-height: 35px;
	margin: 0 auto;
	text-align: center;
	color: #ffffff;
}

.LectureBtn {
	width: 183px;
	height: 53px;
	background: #2D65F2;
	border: none;
	border-radius: 8px;
	font-family: 'Noto Sans KR';
	font-style: normal;
	font-weight: 400;
	font-size: 20px;
	line-height: 29px;
	color: #ffffff;
}
</style>
</head>
<body>

	<!-- 
별점
0점 <i class="fa fa-star-o"></i>
0.5점 <i class="fa fa-star-half-o"></i>
1점 <i class="fa fa-star"></i>
 -->
	<div class="container-wapper">
		<div class="container" style="margin-bottom: 20px;">
			<span class="LectureTitle">Kosta Spring Cloud 246기</span>
		</div>

		<div style="width: 1920px; height: 300px; background-color: #EFF5FF">
			<div style="width: 1200px; margin: 0 auto;">
				<div style="position: relative; top: 70px;">
					<div class="LectureContentsTitle">
						<span>Kosta Spring Cloud 246기</span>
					</div>
					<div class="LectureContentsTitle">
						<span>2023.06</span><span> ~ </span><span>2023.11</span>
					</div>

					<div style="width: 1200px; margin: 0 auto; text-align: center; margin-top: 20px;">
						<button class="LectureBtn">홈페이지바로가기</button>
						<button class="LectureBtn" id="like-button">
							찜하기 <i class="fa fa-star-o" id="like"></i>
						</button>
					</div>
				</div>

			</div>
		</div>


		<div class="container"></div>
	</div>

	<script type="text/javascript">
		const button = document.getElementById("like-button");
		const icon = document.getElementById("like");

		button.addEventListener("click", function() {
			if (icon.classList.contains("fa-star-o")) {
				icon.classList.remove("fa-star-o");
				icon.classList.add("fa-star");
			} else {
				icon.classList.remove("fa-star");
				icon.classList.add("fa-star-o");
			}
		});
	</script>
</body>
</html>