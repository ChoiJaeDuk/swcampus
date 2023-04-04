<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.search-window select {
	font-size: 16px;
	border: none;
	color: #767676;
}
</style>
</head>
<body>
	<div id="board-list">

		<h2
			style="color: #ffffff; text-align: center; padding: 5px 0px; background-color: #2d65f2;">승인리뷰관리</h2>
		<div class="container">

			<div id="board-search">
				<div class="container">
					<div class="search-window" style="width: 900px;">
						<form action="">
							<div style="padding-left: 50px; margin-bottom: 10px;">
								<select>
									<option>대상</option>
									<option>취업자</option>
									<option>재직자</option>
								</select> <select>
									<option>방법</option>
									<option>온라인</option>
									<option>오프라인</option>
								</select> <select>
									<option>카테고리</option>
									<option>백엔드</option>
									<option>프론트엔드</option>
									<option>풀스텍</option>
									<option>AI</option>
									<option>보안</option>
									<option>데브옵스.인프라.툴</option>
									<option>데이터</option>
									<option>클라우드</option>
									<option>SW공학</option>

								</select>
							</div>

							<div class="search-wrap"
								style="width: 800px; padding-left: 50px; float: left;">
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
					<tr style=" text-align: left;">
						<th scope="col" width="8%;" >번호</th>
						<th scope="col" width="10%;">대상</th>
						<th scope="col" width="12%;">방법</th>
						<th scope="col" width="10%;">카테고리</th>
						<th scope="col" width="40%;">강의명</th>
						<th scope="col" width="20%;">등록일</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="i" begin="1" end="10">
						<tr>
							<td>${i}</td>
							<th scope="col" >취준생</th>
							<th scope="col" >오프라인</th>
							<th scope="col">백엔드</th>
							<th><a href="/admin/ReviewDetails">신나는다바수업</a></th>
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