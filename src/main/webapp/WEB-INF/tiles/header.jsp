<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel='stylesheet'
	href='https://cdn-uicons.flaticon.com/uicons-bold-rounded/css/uicons-bold-rounded.css'>
<style>
/*
Noto+Sans+KR
Noto+Sans
Roboto
  */
@import
	url('https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100;300;400;500;700;900&family=Noto+Sans:ital,wght@0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Roboto:wght@100;300;400;500;700;900&display=swap')
	;
</style>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
<title>Insert title here</title>
<style type="text/css">
* {
	margin: 0;
	font-family: NotoSans;
}

.topCategory {
	text-align: center;
	list-style-type: none;
	margin: 0;
	padding: 0;
}

.topCategory>li {
	float: left;
	width: 25%;
}

.topCategory>li>a {
	font-size: 24px;
	color: #fff;
	text-align: center;
	text-decoration: none;
	display: block;
	padding: 14px 60px;
	font-weight: 500px;
}

.topCategory>li>ul {
	margin-top: 10px;
}

.topCategory>li>ul>li {
	width: 100%;
	list-style: none;
	text-align: center;
	float: left;
}

.topCategory>li>ul>li {
	width: 100%;
	float: left;
}

.topCategory>li>ul>li>a {
	font-size: 16px;
	color: #222222;
	margin-bottom: 1px solid #2d65f2;
	background-color: #EFF5FF;
	text-align: left;
	text-decoration: none;
	display: block;
	padding: 10px 50px;
	font-weight: 500
}

.topCategory>li>ul>li>ul {
	width: 100%;
	list-style: none;
	text-align: center;
	float: left;
	background-color: #fff;
	margin-top: 0px;
	padding: 10px 0 10px 0;
}

.topCategory>li>ul>li>ul>li>a {
	font-size: 14px;
	color: #222;
	text-align: left;
	text-decoration: none;
	display: block;
	padding: 5px 50px;
	font-weight: 500px;
}

.topCategory>li>ul>li>ul>li>a:hover {
	background-color: #2d65f2;
	color: #fff;
}

.topCategory>li>ul>li>a:hover {
	background-color: #2d65f2;
	color: #fff;
}

.hide {
	display: none;
}

.ChoiceColor {
	background-color: #2d65f2;
	color: #fff
}

/*top ^*/
</style>

</head>
<body>


	<script>
		function addCategoryClass(obj) {
			$("ul").not(obj).not(".topCategory").not($(obj).next("ul")).not(
					$(obj).parent().parent()).addClass("hide");
			$("ul.categoryClass").not($(obj).next("ul")).not("ul.hide")
					.addClass("hide");
			$(obj).next("ul").toggleClass("hide");
		}
		
		
		
	</script>


	<div class="top-wrapper" style="width: 100%; height: 100px;">
		<div class="top-contaner"
			style="width: 1200px; padding: 40px 30px 0 30px; align-content: center; margin: 0 auto;">
			<div class="logoCon"
				style="align-content: center; width: 260px; position: relative; float: left;">
				<img src="IMG/logoImg.png">
			</div>
			<div
				style="width: 200px; height: 30px; position: relative; float: right; align-items: center; margin-top: 5px; font-size: 16px;">
				<div class="login"
					style="width: 49%; position: relative; float: left; border-right: 1px solid #cccccc; text-align: center">
					<a href="#" style="text-decoration: none; color: #222222">로그인</a>
				</div>
				<div class="join"
					style="width: 49%; position: relative; float: right; text-align: center;">
					<a href="#" style="text-decoration: none; color: #222222">회원가입</a>
				</div>
			</div>
		</div>
	</div>
	<div class="top-wrapper"
		style="width: 100%; height: 60px; background-color: #2D65F2">
		<div class="top-contaner"
			style="width: 1200px; align-content: center; margin: 0 auto; text-align: center;">

			<ul class="navi topCategory">
				<li><a href="javascript:;" onclick="addCategoryClass(this);">재직자</a>
					<ul class="hide middleCategoryClass">
						<li><a href="javascript:;" onclick="addCategoryClass(this);">온라인</a>
							<ul class="hide categoryClass">
								<li><a href="#">백엔드</a></li>
								<li><a href="#">풀스택</a></li>
								<li><a href="#">AI</a></li>
								<li><a href="#">보안</a></li>
								<li><a href="#">데브옵스.인프라.툴</a></li>
								<li><a href="#">프론트엔드</a></li>
								<li><a href="#">데이터</a></li>
								<li><a href="#">클라우드</a></li>
								<li><a href="#">SW공학</a></li>

							</ul></li>
						<li><a href="javascript:;" onclick="addCategoryClass(this);">오프라인</a>
							<ul class="hide categoryClass">
								<li><a href="#">백엔드</a></li>
								<li><a href="#">풀스택</a></li>
								<li><a href="#">AI</a></li>
								<li><a href="#">보안</a></li>
								<li><a href="#">데브옵스.인프라.툴</a></li>
								<li><a href="#">프론트엔드</a></li>
								<li><a href="#">데이터</a></li>
								<li><a href="#">클라우드</a></li>
								<li><a href="#">SW공학</a></li>

							</ul></li>
					</ul></li>
				<li><a href="javascript:;" onclick="addCategoryClass(this);">취업준비생</a>
					<ul class="hide middleCategoryClass">
						<li><a href="javascript:;" onclick="addCategoryClass(this);">온라인</a>
							<ul class="hide categoryClass">
								<li><a href="#">백엔드</a></li>
								<li><a href="#">풀스택</a></li>
								<li><a href="#">AI</a></li>
								<li><a href="#">보안</a></li>
								<li><a href="#">데브옵스.인프라.툴</a></li>
								<li><a href="#">프론트엔드</a></li>
								<li><a href="#">데이터</a></li>
								<li><a href="#">클라우드</a></li>
								<li><a href="#">SW공학</a></li>

							</ul></li>
						<li><a href="javascript:;" onclick="addCategoryClass(this);">오프라인</a>
							<ul class="hide categoryClass">
								<li><a href="#">백엔드</a></li>
								<li><a href="#">풀스택</a></li>
								<li><a href="#">AI</a></li>
								<li><a href="#">보안</a></li>
								<li><a href="#">데브옵스.인프라.툴</a></li>
								<li><a href="#">프론트엔드</a></li>
								<li><a href="#">데이터</a></li>
								<li><a href="#">클라우드</a></li>
								<li><a href="#">SW공학</a></li>

							</ul></li>
					</ul></li>
				<li><a href="javascript:;" onclick="addCategoryClass(this);">커뮤니티</a>
					<ul class="hide categoryClass">
						<li><a href="#">공지사항</a></li>
						<li><a href="#">문의사항</a></li>
						<li><a href="#">진로이야기</a></li>
						<li><a href="#">코딩이야기</a></li>
					</ul></li>
				<li><a href="#">마이페이지</a></li>
			</ul>
		</div>
	</div>
	<!--top-->

</body>
</html>