<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/board/board.css">
<style type="text/css">
.admin_sider{
	list-style: none;
	margin-right: 20px;
}

.admin_sider li a{
	font-size: 24px;
	font-weight: 600;
	text-decoration: none;
	padding: 10px 20px;
	background-color: aqua;
	display: block;
	color: #ffffff;
	background-color: #2d65f2;
	text-align: center;
	list-style: none;
}

.admin_sider li ul li a{
	font-size: 22px;
	text-decoration: none;
	padding: 12px 20px;
	background-color: #ffffff;
	color:#2d65f2;
	display: block;
	border: 0.2px solid #2d65f220;
	list-style: none;
	text-align: left;
}

.admin_sider li ul{
	list-style: none;
}
</style>
</head>
<body>		
			
			<ul class="admin_sider">
				<li><a href="javascript:;" onclick="addAdminCategoryClass(this);">강의관리</a>
					<ul class="hide admin_sider_Class">
						<li><a href="/admin/LecturesList">강의목록</a></li>
					</ul>
				</li>
				<li><a href="javascript:;" onclick="addAdminCategoryClass(this);">리뷰관리</a>
					<ul class="hide admin_sider_Class">
						<li><a href="/admin/ApprovalReview">승인리뷰</a></li>
						<li><a href="/admin/UnapprovedReview">미승인리뷰</a></li>
					</ul></li>
					
					<li><a href="javascript:;" onclick="addAdminCategoryClass(this);">회원관리</a>
					<ul class="hide admin_sider_Class">
						<li><a href="/admin/UserList">회원목록</a></li>
					</ul></li>
			</ul>

	
	<script type="text/javascript">
	function addAdminCategoryClass(obj) {
	
		$("ul.admin_sider_Class").not($(obj).next("ul")).not("ul.hide")
				.addClass("hide");
		$(obj).next("ul").toggleClass("hide");
	}
	
	</script>
</body>
</html>