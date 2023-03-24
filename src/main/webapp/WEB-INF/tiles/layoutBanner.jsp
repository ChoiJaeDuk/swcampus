<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

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
<script src="https://kit.fontawesome.com/0511fbc3bc.js" crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
<title>Insert title here</title>
<style type="text/css">
s
* {
	margin: 0px;
}
/*카테고리별 색상지정*/
.officeWorker {
	color: #F17D7D;
	background-color: #FFE4E450;
	padding: 1px 5px;
}

.jobSeeker {
	color: #7782E5;
	background-color: #D3D8FF50;
	padding: 1px 5px;
}

.offline {
	color: #FFC700;
	background-color: #FFFCE5;
	padding: 1px 5px;
	50
}

.online {
	color: #57AA87;
	background-color: #E8FFE050;
	padding: 1px 5px;
}

.backend {
	color: #FC549A;
	background-color: #FFD0E450;
	padding: 1px 5px;
}

.front {
	color: #00C2FF;
	background-color: #E7F8FF50;
	padding: 1px 5px;
}

.ai {
	color: #FFA722;
	background-color: #FFEDE550;
	padding: 1px 5px;
}

.DET {
	color: #FFC700;
	background-color: #FEFFE550;
	padding: 1px 5px;
}

.security {
	color: #B971D2;
	background-color: #F8E2FF50;
	padding: 1px 5px;
}

.cloud {
	color: #4B6AB7;
	background-color: #E9EBFF50;
	padding: 1px 5px;
}

.swEngineering {
	color: #88D44C;
	background-color: #F5FFD850;
	padding: 1px 5px;
}

.categoryType {
	padding-top: 8px;
}

.reviewRatingLine {
	font-weight: 500;
}

.best-contents {
	background-color: #EFF5FF;
	width: 1200px;
	margin: 0 auto;
	padding: 50px 0px;
	overflow: hidden;
}

.lecture-card {
	box-sizing: border-box;
	float: left;
	width: 275px;
	height: 177px;
	background: #FFFFFF;
	border: 1px solid #CCCCCC;
	box-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);
	border-radius: 10px;
	margin: 5px;
	padding: 0px 5px;
}

.lecture {
	width: 255px;
	height: 170px;
	overflow: hidden;
	margin: auto;
	padding: 20px 10px;
	font-size: 13px;
}

.lecture>div {
	margin-bottom: 2px;
}

.lecture>div>div {
	width: 65%;
	float: left;
}

.association {
	color: #666666;
	font-size: 11px;
	width: 235px;
	height: 14.5px;
	overflow: hidden;
	margin-bottom: 2px;
}

.lectureTitle {
	font-weight: 800;
	font-size: 16px;
	line-height: 1.2;
	margin-bottom: 8px;
	width: 235px;
	height: 38.5px;
	overflow: hidden;
}

.best-lecture {
	padding: 0px 30px;
	overflow: hidden;
}

.period {
	width: 153px;
	height: 17.8px;
	overflow: hidden;
}

.teacher {
	width: 50px;
	height: 17.8px;
	overflow: hidden;
}
.container{
	width: 1200px; 
	margin: 0px auto;
}
.container-wapper{
	width: 100%;
}
.pagination {
  width:750px;
  justify-content: center;
  align-items: center;
  margin: 50px auto 20px;
}

.pagination a {
  display: inline-block;
  padding: 8px 16px;
  margin: 0 5px;
  border-radius: 3px;
  text-decoration: none;
  color: #333;
  background-color: #EFF5FF;
}

.pagination a.active,
.pagination a:hover {
  background-color: #2d65f2;
  color: #fff;
}
</style>
</head>
<body>

	<script type="text/javascript">

$(function(){

	
	// JavaScript
	const categoryType =  document.getElementsByClassName('CategoryType'); 
	for (let i = 0; i < categoryType.length; i++) { // 배열의 각 요소에 대해 반복
		  const categoryContent = categoryType[i].textContent; // 각 요소의 내용 가져오기
		  switch (categoryContent) { // 내용에 따라 클래스 부여
		    case '재직자':
		    	categoryType[i].classList.add('officeWorker');
		      break;
		    case '취준생':
		    	categoryType[i].classList.add('jobSeeker');
		      break;
		    case '온라인':
		    	categoryType[i].classList.add('online');
		      break;
		    case '오프라인':
		    	categoryType[i].classList.add('offline');
		      break;
		    case '백엔드':
		    	categoryType[i].classList.add('backend');
		      break;
		    case '프론트':
		    	categoryType[i].classList.add('front');
		      break;
		    case 'AI':
		    	categoryType[i].classList.add('ai');
		      break;
		    case '데브옵스.인프라.툴':
		    	categoryType[i].classList.add('DET');
		      break;
		    case '보안':
		    	categoryType[i].classList.add('security');
		      break;
		    case '클라우드':
		    	categoryType[i].classList.add('cloud');
		      break;
		    case 'SW공학':
		    	categoryType[i].classList.add('swEngineering');
		      break;		      
		      
		    default:
		      break;
		  }
		}
	
	
});
</script>
	<tiles:insertAttribute name="header" />
	<tiles:insertAttribute name="banner" />
	<tiles:insertAttribute name="content" />

	<tiles:insertAttribute name="footer" />
</body>

</html>