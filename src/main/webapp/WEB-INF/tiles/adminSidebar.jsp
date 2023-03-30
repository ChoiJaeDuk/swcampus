<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.sidebar {
  background-color: #f0f0f0;
  width: 200px;
  height: 100%;
  position: fixed;
}

.sidebar ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
}

.sidebar ul li {
  padding: 10px;
  border-bottom: 1px solid #ccc;
}

.sidebar ul li:hover {
  cursor: pointer;
  background-color: #e6e6e6;
}

.dropdown-menu {
  display: none;
  position: absolute;
  left: 100%;
  top: 0;
  margin-top: -10px;
}

.dropdown:hover .dropdown-menu {
  display: block;
}

.dropdown-menu li a {
  display: block;
  padding: 5px 10px;
}

.dropdown-menu li a:hover {
  background-color: #e6e6e6;
}
</style>
</head>
<body>
<div class="sidebar">
  <ul>
    <li class="dropdown">
      강의관리
      <ul class="dropdown-menu">
        <li><a href="#">강의목록</a></li>
      </ul>
    </li>
    <li class="dropdown">
      리뷰관리
      <ul class="dropdown-menu">
        <li><a href="#">승인리뷰</a></li>
        <li><a href="#">미승인리뷰</a></li>
      </ul>
    </li>
    <li class="dropdown">
      회원관리
      <ul class="dropdown-menu">
        <li><a href="#">회원목록</a></li>
      </ul>
    </li>
  </ul>
</div>

</body>
</html>