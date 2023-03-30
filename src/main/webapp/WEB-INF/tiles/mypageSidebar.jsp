<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">

.sidebar ul li a {
 text-decoration: none;
 font-size: 22px;
 line-height: 60px;
 border: 1px solid #ffffff;
 display: block;
 text-align: center;
 color: #2d65f2;
 font-weight: 600;
 border: 0.5px solid #2d65f220;
 background-color: #EFF5FF30;
 
}
.sidebar ul li {
 list-style: none;
 height: 60px;
}
</style>
</head>
<body>

			  <ul>
			    <!-- <li><a href="#home">my 홈</a></li> -->
			    <li><a href="/mypage/likedCourses">찜한강의</a></li>
			    <li><a href="/mypage/profile">회원정보수정</a></li>
			    <li><a href="/mypage/myReviews">내가쓴리뷰</a></li>
			    <li><a href="/mypage/myPosts">내가쓴게시물</a></li>
			  </ul>
<script type="text/javascript">
//현재 URL에서 페이지 경로 추출
const path = window.location.pathname;

// 메뉴 아이템에 대한 NodeList 가져오기
const menuItems = document.querySelectorAll("ul li a");

// 메뉴 아이템 반복하여 현재 페이지와 매칭되는 항목 찾기
menuItems.forEach((item) => {
  // href 속성에서 페이지 경로 추출
  const href = item.getAttribute("href");
  if (href === path) {
    // 현재 페이지와 매칭되는 메뉴 아이템의 스타일 변경
    item.style.backgroundColor = "#2d65f2";
    item.style.color = "#ffffff";
  }
});
</script>
</body>
</html>