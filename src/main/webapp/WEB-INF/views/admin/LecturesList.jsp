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
			style="color: #ffffff; text-align: center; padding: 5px 0px; background-color: #2d65f2;">강의관리</h2>
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
								style="width: 680px; padding-left: 50px; float: left;">
								<input id="search" type="search" name=""
									placeholder="검색어를 입력해주세요." value="">
								<button type="submit" class="btn btn-dark">검색</button>
							</div>

						</form>
						<a href="/admin/LecturesInsertForm"
							style="margin-right: 50px; float: right; font-weight: 500; font-size: 16px; line-height: 30px; color: #ffffff; padding: 5px 10px; background-color: #2D65F2; text-decoration: none;">강의등록하러가기<i
							class="fa-solid fa-chevron-right fa-beat-fade"></i>
						</a>
					</div>
				</div>
			</div>
			<table class="board-table" style="width: 900px;">
				<thead>
					<tr>
						<th scope="col" class="th-num">번호</th>
						<th scope="col" class="th-title">강의명</th>
						<th scope="col" class="th-num">기관</th>
						<th scope="col" class="th-date">등록일</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="i" begin="1" end="10">
						<tr>
							<td>${i}</td>
							<th><a href="/admin/LecturesDetailForm">신나는다바수업</a></th>
							<td>KOSTA</td>
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


	<div
		style="clear: both; padding: 1px 0px 20px; width: 99%; margin: 5px auto 0px;">
		<textarea id="summernote" name="editordata"></textarea>
	</div>
</body>
</html>