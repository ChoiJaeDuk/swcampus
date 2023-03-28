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
</head>
<body>
	<div class="container-wapper" style="margin-bottom: 100px;">
		<div class="container">
			<section class="notice">
				<div class="page-title">
					<div class="container">
						<h3>공지사항</h3>
					</div>
				</div>

				<!-- board admin -->
				<div id="board-search">
					<div class="container">
						<div class="search-window">
							<form action="">
								<div class="search-wrap">
									<label for="search" class="blind">공지사항 검색</label> <input
										id="search" type="search" name="" placeholder="검색어를 입력해주세요."
										value="">
									<button type="submit" class="btn btn-dark">검색</button>
								</div>
							</form>
							<a href="#"
								style="margin-right:110px; float: right; font-weight: 500; font-size: 15px; line-height: 30px; color: #ffffff; padding: 5px 10px; background-color: #2D65F2; text-decoration: none;">공지사항작성하러가기 <i class="fa-solid fa-chevron-right fa-beat-fade"></i>
							</a>
						</div>
					</div>
				</div>
				
				
				<!--  -->
				<div id="board-search">
					<div class="container">
						<div class="search-window">
							<form action="">
								<div class="search-wrap" style="padding-left: 200px; max-width:900px;">
									<label for="search" class="blind">공지사항 검색</label> <input
										id="search" type="search" name="" placeholder="검색어를 입력해주세요."
										value="">
									<button type="submit" class="btn btn-dark">검색</button>
								</div>
							</form>
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
								<c:forEach var="i" begin="1" end="10">
									<tr>
										<td>3</td>
										<th><a href="#!">쉽고 빠르게 코딩하기~ 그 방법은?</a>
											<p>테스트</p></th>
										<td>2017.07.13</td>
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