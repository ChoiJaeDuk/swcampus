<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/board/board.css">
</head>
<body>
	<div class="container-wapper" style="margin-bottom: 100px;">
		<div class="container">
			<section class="notice">
				<div class="page-title">
					<div class="container">
						<h3>문의게시판</h3>
					</div>
				</div>

				<!-- board seach area -->
				<div id="board-search">
					<div class="container">
						<div class="search-window">
							<form action="">
								<div class="search-wrap">
									<label for="search" class="blind">문의 사항 검색</label> <input
										id="search" type="search" name="" placeholder="검색어를 입력해주세요."
										value="">
									<button type="submit" class="btn btn-dark">검색</button>
								</div>
							</form>
							<a href="/insertForm/boardInsert"
								style="margin-right:110px; float: right; font-weight: 500; font-size: 16px; line-height: 30px; color: #ffffff; padding: 5px 10px; background-color: #2D65F2; text-decoration: none;">문의글
								작성하러가기 <i class="fa-solid fa-chevron-right fa-beat-fade"></i>
							</a>
						</div>
					</div>
				</div>

				<!-- board list area -->
				<div id="board-list">
					<div class="container">
						<table class="board-table">
							<thead>
								<tr>
									<th scope="col" class="th-num">번호</th>
									<th scope="col" class="th-title">제목</th>
									<th scope="col" class="th-date">등록일</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="l" items="${list }" varStatus="status">
								<c:set var="TextValue" value="${l.communityRegDate }"/>
									<tr>
										<td>${status.count }</td>
										<th><a href="/board/boardDetails?communityNo=${l.communityNo}">${l.communityTitle }</a>
											<p>${l.userName }</p></th>
										<td>${fn:substring(TextValue,0,10) }</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
				<div>
					<div class="pagination">
						<a href="#" class="prev">이전</a> <a href="#" class="page active">1</a>
						<a href="#" class="page">2</a> <a href="#" class="page">3</a> <a
							href="#" class="page">4</a> <a href="#" class="page">5</a> <a
							href="#" class="page">6</a> <a href="#" class="page">7</a> <a
							href="#" class="page">8</a> <a href="#" class="page">9</a> <a
							href="#" class="page">10</a> <a href="#" class="next">다음</a>
					</div>

				</div>


			</section>
		</div>
	</div>

	<script type="text/javascript">
	const prevBtn = document.querySelector('.prev');
	const nextBtn = document.querySelector('.next');
	const pages = document.querySelectorAll('.page');

	let currentPage = 1;

	prevBtn.addEventListener('click', () => {
	  if (currentPage > 1) {
	    currentPage--;
	    updatePage();
	  }
	});

	nextBtn.addEventListener('click', () => {
	  if (currentPage < pages.length) {
	    currentPage++;
	    updatePage();
	  }
	});

	pages.forEach((page, index) => {
	  page.addEventListener('click', () => {
	    currentPage = index + 1;
	    updatePage();
	  });
	});

	function updatePage() {
	  pages.forEach((page, index) => {
	    if (index === currentPage - 1) {
	      page.classList.add('active');
	    } else {
	      page.classList.remove('active');
	    }
	  });
	}
	</script>
</body>
</html>