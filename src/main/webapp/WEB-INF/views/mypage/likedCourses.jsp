<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
a{
	text-decoration: none;
	color: #111111;
}
.LikeLectureTable{
	width: 100%;
	border-collapse: collapse;
	border: 1px solid #EFF5FF;
}

.LikeLectureTable tr{
	height: 35px;
	font-size: 18px;
	border-bottom: 1px solid #EFF5FF;
}

.LikeLectureTable tr td{
	height: 35px;
	font-size: 18px;
	padding: 0px 20px ;
}


.LikeLectureTable tr > td:first-child , .LikeLectureTable tr > th:nth-child(1){
 width: 70%;
 border-right: 1px solid #EFF5FF;
}

.LikeLectureTable tr > td:nth-child(2) , .LikeLectureTable tr > th:nth-child(2){
 width: 15%;
 text-align: center;
 border-right: 1px solid #EFF5FF;
}

.LikeLectureTable tr > td:nth-child(3) , .LikeLectureTable tr > th:nth-child(3){
  width:10%;
  text-align: center;
   border-right: 1px solid #EFF5FF;
}
</style>
</head>
<body>
<div style="margin-bottom: 100px;">
	<table class="LikeLectureTable">
		<tr style="background-color: #2d65f2;color: #ffffff; ">
			<th>제목</th>
			<th>강사명</th>
			<th>작성일자</th>
			<th  style="width: 5%; "></th>
		</tr>
		
		<tr>
			<td><a href="#">쉽고재미있는자바</a></td>
			<td>김자바</td>
			<td>2023.03.30</td>
			<td style="width: 5%; font-size: 16px; padding: 7px;"><a>삭제</a></td>
		</tr>
	
	</table>

</div>
</body>

<script type="text/javascript">

$(document).ready(function() {
	  var trLength = $('.LikeLectureTable tr').length;
	  if (trLength < 2) {
	    var noLectureRow = '<td colspan="3" style="height: 500px; font-size: 40px; background-color: #EFF5FF20;  line-height: 500px; color: #2d65f2; text-align: center; font-weight: 900;">찜한강의가 없습니다</td>';
	    $('.LikeLectureTable').append(noLectureRow);
	  }
	});

</script>
</html>