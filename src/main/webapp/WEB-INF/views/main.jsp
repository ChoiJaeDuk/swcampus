<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
input[type="text"] {
	border: none;
	outline: none;
	height: 35px;
	margin-top: 10px;
	font-size: 24px;
	color: #999999;
}

button[type="submit"] {
	color: white;
	padding: 8px 16px;
	margin-left: 20px;
	cursor: pointer;
	width: 182px;
	height: 60px;
	background: #2D65F2;
	border: 4px solid #2D65F2;
	border-radius: 5px;
	font-size: 24px;
}

.search-contents {
	width: 1200px;
	margin: 0 auto;
	padding: 50px 0px;
}

.search-bar {
	width: 1000px;
	height: 60px;
	margin: 0 auto;
	float: left;
}

.search-bar>form {
	width: 795px;
	height: 60px;
	margin: 0 auto;
	float: left;
	height: 60px;
}

.select-box {
	position: relative;
	margin: 0;
	float: left;
	width: 183px;
	height: 60px;
	border: 4px solid #2D65F2;
	border-radius: 5px;
	overflow: hidden;
	margin: 0;
}

.select-box select {
	width: 100%;
	height: 100%;
	background: transparent;
	padding: 12px;
	font-family: 'Noto Sans KR';
	font-style: normal;
	font-weight: 500;
	font-size: 22px;
	line-height: 32px;
	color: #2D65F2;
	border: none;
	appearance: none;
	-webkit-appearance: none;
}

.select-box::after {
	content: '';
	position: absolute;
	right: 12px;
	top: 50%;
	transform: translateY(-50%);
	width: 0;
	height: 0;
	border-top: 7.5px solid #2D65F2;
	border-right: 7.5px solid transparent;
	border-left: 7.5px solid transparent;
}

/* Hover effect */
.select-box:hover {
	background-color: #E7EEFA;
}

.select-box:hover::after {
	border-top: 7.5px solid #5568FF;
}

.sortItem {
	background: #FFFFFF;
	border: 0.3px solid #CCCCCC;
	color: #000000;
	font-family: 'Noto Sans KR';
	font-style: normal;
	font-weight: 400;
	font-size: 20px;
	line-height: 29px;
}

</style>
</head>
<body>
	<!--contnets-->
	<div class="contnets-wapper" style="width: 100%;">
		<div
			style="height: 50px; width: 1200px; margin: 120px auto 0px; border-bottom: 3px solid #2d65f2;">
			<span
				style="font-size: 24px; font-weight: 700; color: #2d65f2; line-height: 60px;">BEST
				강의</span>
		</div>
		<div class="best-contents">
			<div class="best-lecture">
				<!-- 반복문시작 -->
				<c:forEach var="main" begin="1" end="10" items="${mainList }">
					<div class=" lecture-card" onclick="location.href='/details/details?lectureNo=${main.lectureNo}&userNo=${user}'">
						<div class="lecture">
							<p class="association">한국 소프트웨어협회</p>
							<div class="lectureTitle">${main.lectureTitle }// ${likesConfirm}</div>
							<div>
								<div class="period">
									<span>2023-02-27</span><span>~</span><span>2023-05-23</span>
								</div>
								<span class="teacher">강사명</span><br>
							</div>
							<div class="reviewRatingLine">
								<span>리뷰</span> <span>555</span> <span>개</span> <span>[평점</span>
								<span>3.5</span> <span> 점]</span>
							</div>

							<div class="categoryType">
								<span class="CategoryType">재직자</span><span class="CategoryType">온라인</span><span
									class="CategoryType">백엔드</span>
							</div>
						</div>
					</div>
				</c:forEach>
				<!-- 반복문끝 -->
			</div>
			<!-- best-lecture -->
		</div>
		<!-- best-contents -->
		<div style="height:100px; background-color: #ffffff;"></div>
		<div class="search-contents">

			<div class="select-box">
				<select onchange="sortItems(this.value)">
					<option value="recent" class="sortItem">최신등록순</option>
					<option value="reviews" class="sortItem">리뷰많은순</option>
					<option value="rating" class="sortItem">평점높은순</option>
				</select>
			</div>
			<div class="search-bar">
				<div
					style="float: left; margin: 0; width: 794px; height: 60px; border: 4px solid #2D65F2; border-radius: 5px; position: relative; left: 10px;">
					<div style="float: left; padding: 14px 20px 10px 15px;">
						<i class="fas fa-search" style="font-size: 28px; color: #2D65F2;"></i>
					</div>
					<form>
						<input type="text" placeholder="검색어를 입력해주세요"
							onfocus="this.value=''">
					</form>
				</div>
				<button type="submit">검색하기</button>
			</div>
		</div>


		<div style="height: 50px; background-color: #ffffff;"></div>


		<div class="best-contents" style="margin-bottom: 180px;">
			<div class="best-lecture">
				<!-- 반복문시작 -->
				<c:forEach var="i" begin="1" end="16">
					<div class=" lecture-card">
						<div class="lecture">
							<p class="association">한국 소프트웨어협회</p>
							<div class="lectureTitle">지멘스 지역혁신프로젝트 기업연계형 sw직무교육 1기</div>
							<div>
								<div class="period">
									<span>2023-02-27</span><span>~</span><span>2023-05-23</span>
								</div>
								<span class="teacher">강사명</span><br>
							</div>
							<div class="reviewRatingLine">
								<span>리뷰</span> <span>555</span> <span>개</span> <span>[평점</span>
								<span>3.5</span> <span> 점]</span>
							</div>

							<div class="categoryType">
								<span class="CategoryType">재직자</span><span class="CategoryType">온라인</span><span
									class="CategoryType">백엔드</span>
							</div>
						</div>
					</div>
				</c:forEach>
				<!-- 반복문끝 -->
			</div>
			<!-- best-lecture -->
		</div>
		<!-- best-contents -->

	</div>
	<script>
		
	</script>
</body>
</html>