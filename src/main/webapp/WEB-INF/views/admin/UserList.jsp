<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.search-window select{
 font-size: 16px;
 border: none;
 color: #767676;
}
</style>
</head>
<body>
	<div id="board-list">

		<h2
			style="color: #ffffff; text-align: center; padding: 5px 0px; background-color: #2d65f2;">회원관리</h2>
		<div class="container">

			<div id="board-search">
				<div class="container">
					<div class="search-window"  style="width: 900px; ">
						<form action="">
						<div style="padding-left: 50px; margin-bottom: 10px;">
							<select>
								<option>아이디</option>
								<option>이름</option>
							</select>
						
							</div>
							
							<div class="search-wrap" style="width:850px; padding-left: 50px; float: left;">
								<input id="search" type="search" name=""
									placeholder="검색어를 입력해주세요." value="">
								<button type="submit" class="btn btn-dark">검색</button>
							</div>
							
						</form>
					</div>
				</div>
			</div>
			<table class="board-table" style="width: 900px;">
				<thead>
					<tr>
						<th scope="col" style="width: 8%;" >번호</th>
						<th scope="col"  style="width: 15%;" >아이디</th>
						<th scope="col"  style="width: 12%;">이름</th>
						<th scope="col"  style="width: 15%;">연락처</th>
						<th scope="col"  style="width: 30%;">이메일</th>
						<th scope="col"  style="width: 20%;">등록일</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="i" begin="1" end="10">
						<tr>
							<td>${i}</td>
							<th><a href="/admin/userDetails">나코딩짱짱임</a></th>
							<td><a href="/admin/userDetails">김코딩이다</a></td>
							<td>010-01010-1010</td>
							<td>qwertyuuip@naver.com</td>
							<td>2017.07.13</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
	<div style="margin-bottom: 100px;">
		<div class="pagination">
			<a href="#" class="prev">이전</a> <a href="#" class="page active">1</a>
			<a href="#" class="page">2</a> <a href="#" class="page">3</a> <a
				href="#" class="page">4</a> <a href="#" class="page">5</a> <a
				href="#" class="page">6</a> <a href="#" class="page">7</a> <a
				href="#" class="page">8</a> <a href="#" class="page">9</a> <a
				href="#" class="page">10</a> <a href="#" class="next">다음</a>
		</div>

	</div>
</body>
</html>