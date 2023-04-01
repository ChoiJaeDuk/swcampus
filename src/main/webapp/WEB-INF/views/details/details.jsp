<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Insert title here</title>
<style type="text/css">
.LectureTitle {
	font-size: 24px;
	font-weight: 700;
	line-height: 60px;
}

.LectureContentsTitle {
	font-family: 'Noto Sans KR';
	font-style: normal;
	font-weight: 500;
	font-size: 24px;
	line-height: 35px;
	margin: 0 auto;
	text-align: center;
	color: #ffffff;
}

.LectureBtn {
	width: 183px;
	height: 53px;
	background: #2D65F2;
	border: none;
	border-radius: 8px;
	font-family: 'Noto Sans KR';
	font-style: normal;
	font-weight: 400;
	font-size: 20px;
	line-height: 29px;
	color: #ffffff;
}

.tab1 {
	width: 100%;
	height: 80px;
	margin: 0 auto;
	border-bottom: 0.3px solid #2D65F220;
	background-color: #ffffff;
	margin-bottom: 20px;
}

.tab1Nav {
	padding: 20px 30px 15px;
	height: 60px;
	line-height: 100px;
	text-align: center;
	text-decoration: none;
	font-family: 'Noto Sans KR';
	font-weight: 500;
	font-size: 20px;
	color: #2D65F2;
}

.tab1contents {
	width: 1200px;
	min-height: 400px;
	overflow: hidden;
	margin: 0 auto 200px;
	position: relative;
}

.sticky-element {
	/* 스크롤되는 동안 위치가 고정될 스타일 */
	position: static; /* 초기 위치 설정 */
	width: 100%;
	top: 0;
	left: 0;
	z-index: 1;
}

.sticky-element.fixed {
	/* 고정될 때의 스타일 */
	position: fixed;
}

.tab1Nav.active {
	border-bottom: 2px solid #2D65F2;
}

.lectureInfo table {
	margin-top: 20px;
	width: 100%;
	border-spacing: 0px;
	border: 0.1px solid #2D65F250;
	width: 100%;
}

.lectureInfo tr {
	line-height: 50px;
}

.lectureInfo th {
	font-weight: 500;
	font-size: 18px;
	color: #FFFFFF;
	padding-left: 20px;
	width: 30%;
	background-color: #2D65F2;
	text-align: left;
	border-bottom: 0.1px solid #ffffff;
}

.lectureInfo td {
	font-weight: 500;
	font-size: 18px;
	color: #111111;
	padding-left: 20px;
	width: 78%;
	background-color: #ffffff;
	text-align: left;
	border-bottom: 0.1px solid #2D65F220;
}

.CategoryType {
	margin-right: 5px;
}

.reviewContnet {
	width: 387px;
	height: 395px;
	background-color: #ffffff;
	border: 0.3px solid #CCCCCC50;
	box-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);
	border-radius: 5px;
	float: left;
	margin: 5px;
	margin-bottom: 15px;
}

.reviewContnetInfo table {
	margin: 20px 32px;
	text-align: left;
}

.reviewContnetInfo th {
	font-weight: 500;
	font-size: 18px;
	line-height: 26px;
}

.reviewContnetInfo td {
	font-weight: 400;
	font-size: 16px;
	line-height: 23px;
	padding-left: 20px;
}

.reviewDetail {
	padding: 20px 32px;
	background-color: #2D65F2;
	height: 62%;
	border-radius: 0px 0px 5px 5px;
	font-weight: 400;
	font-size: 16px;
	line-height: 23px;
	color: #ffffff;
	overflow: auto;
}

.reviewStar {
	color: #FFC700;
}
</style>
</head>
<body>

	<!-- 
별점
0점 <i class="fa fa-star-o"></i>
0.5점 <i class="fa fa-star-half-o"></i>
1점 <i class="fa fa-star"></i>
 -->
	<div class="container-wapper">
		<div class="container" style="margin-bottom: 20px; margin-top: 120px;">
			<span class="LectureTitle">${lecture.lectureTitle}</span>
		</div>

		<div
			style="width: 100%; height: 300px; background-image: url('/IMG/backgroundIMG.png'); background-size: cover;">

			<div style="width: 1200px; margin: 0 auto;">
				<div style="position: relative; top: 70px;">
					<div class="LectureContentsTitle">
						<span>Kosta Spring Cloud 246기</span>
					</div>
					<div class="LectureContentsTitle">
						<span>2023.06</span><span> ~ </span><span>2023.11</span>
					</div>

					<div style="width: 1200px; margin: 0 auto; text-align: center; margin-top: 20px;">
						<button class="LectureBtn">홈페이지바로가기</button>
						<button class="LectureBtn" id="like-button" >
							찜하기 <i class="fa fa-star-o" id="like"></i>
						</button>
					</div>
				</div>

			</div>
		</div>
		<div class="contentsContainer">
			<div class="container tab1 sticky-element" id="tab1">
				<div class="container">
					<a class="tab1Nav active" href="#lectureInfo">기본정보</a> <a
						class="tab1Nav" href="#curriculum">커리큘럼</a> <a class="tab1Nav"
						href="#review">리뷰모음</a>
				</div>
			</div>

			<div>
				<div class="lectureInfo tab1contents" id="lectureInfo">
					<div style="width: 100%; margin: 0 auto; height: 70px;">
						<div
							style="font-weight: 700; font-size: 24px; line-height: 35px; color: #2D65F2; margin-top: 20px;">과정분류</div>
						<div
							style="font-weight: 400; font-size: 16px; line-height: 23px; color: #CCCCCC;">대략의
							분류로, 정확한 정보는 커리큘럼을 참고해주세요.</div>
					</div>
					<div>
						<table>
							<tr>
								<th>교육기관</th>
								<td>KOSTA</td>
							</tr>
							<tr>
								<th>과정명</th>
								<td>블록체인</td>
							</tr>
							<tr>
								<th>교육기간</th>
								<td>2023.03.10 ~ 2023.07.10</td>
							</tr>
							<tr>
								<th>강사명</th>
								<td>김코딩</td>
							</tr>
							<tr>
								<th>키워드</th>
								<td><span class="CategoryType">재직자</span><span
									class="CategoryType">온라인</span><span class="CategoryType">백엔드</span>
								</td>
							</tr>
						</table>
					</div>

				</div>


				<div class="curriculum tab1contents" id="curriculum">
					<div style="width: 100%; margin: 0 auto; height: 60px;">
						<div
							style="font-weight: 700; font-size: 24px; line-height: 35px; color: #2D65F2;">커리큘럼</div>
					</div>

					<div
						style="background: #EFF5FF; border-radius: 10px; font-weight: 400; font-size: 16px; line-height: 23px; color: #222222; padding: 20px; min-height: 400px; margin-bottom: 50px;">
						가. 프로젝트관리 개요<br /> - SW 공학개요<br /> - PM베스트 프랙티스<br /> - PMBOK
						6.0 개요- PM 동향 및 참조 모델<br /> <br /> 나. PMBOK 6.0 PM 프로세스<br /> -
						개요<br /> - 프로젝트 계획<br /> - 프로젝트 실행<br /> - 프로젝트 감시 및 통제<br />
						- 프로젝트 종료<br /> <br /> 다. ISO21502:2020 실무기반 PM<br /> - 프로젝트관리
						개요<br /> - 통합 프로젝트관리 실무<br /> - 프로젝트관리 실무<br /> <br /> 라.
						PMBOK7.0 원칙기반 PM<br /> - 개요<br /> - 12개 프로젝트관리(PM) 원칙<br /> -
						8개 프로젝트관리(PM) 성과영역<br /> - 모델, 방법, 인공물<br />
					</div>
				</div>


				<div class="review tab1contents" id="review">
					<div style="width: 100%; margin: 0 auto; height: 60px;">
						<div
							style="font-weight: 700; font-size: 24px; line-height: 35px; color: #2D65F2;">
							리뷰모음 <span style="font-size: 20px;">[평균별점: </span><span
								class="reviewStar" style="font-size: 20px;">5.0</span><span
								style="font-size: 20px;">점]</span> <a href="#"
								style="float: right; font-weight: 500; font-size: 16px; line-height: 29px; color: #ffffff; padding: 2px 10px; background-color: #2D65F2; text-decoration: none; border-radius: 20px;">리뷰작성하러가기
								<i class="fa-solid fa-chevron-right fa-beat-fade"></i>
							</a>
						</div>
					</div>

					<div style="width: 1200px; margin: 0 auto;">

						<c:forEach var="i" begin="1" end="6">
							<div class="reviewContnet">
								<div class="reviewContnetInfo">
									<table>
										<tr>
											<th>과정명</th>
											<td>Kosta Spring Cloud 246기</td>
										</tr>
										<tr>
											<th>닉네임</th>
											<td>코딩천재</td>
										</tr>
										<tr>
											<th>별점</th>
											<td><span class="reviewStar">5.0</span><span> (</span>5.0
												<span>점)</span></td>
										</tr>
										<tr>
											<th>날짜</th>
											<td>2023.03.09 ~ 2023.03.09</td>
										</tr>
									</table>
								</div>

								<div class="reviewDetail">
									정말너무좋았어요정말너무좋았어요정말너무좋았어요정말너무좋았어요정말너무좋았어요정말너무좋았어요정말너무좋았어요정말너무좋았어요정말너무좋았어요정말너무좋았어요정말너무좋았어요정말너무좋았어요
									정말너무좋았어요정말너무좋았어요정말너무좋았어</div>
							</div>
						</c:forEach>


					</div>
				</div>



				<!-- 비회원 -->
				<div class="review tab1contents" id="review" style=" filter: blur(10px);  pointer-events: none;">
					<div style="width: 100%; margin: 0 auto; height: 60px;">
						<div
							style="font-weight: 700; font-size: 24px; line-height: 35px; color: #2D65F2;">
							리뷰모음 <span style="font-size: 20px;">[평균별점: </span><span
								class="reviewStar" style="font-size: 20px; color: #ffffff;">5.0</span><span
								style="font-size: 20px;">점]</span> <a href="#"
								style="float: right; font-weight: 500; font-size: 16px; line-height: 29px; color: #ffffff; padding: 2px 10px; background-color: #2D65F2; text-decoration: none; border-radius: 20px;">리뷰작성하러가기
								<i class="fa-solid fa-chevron-right fa-beat-fade"></i>
							</a>
						</div>
					</div>

					<div style="width: 1200px; margin: 0 auto;">

						<c:forEach var="i" begin="1" end="6">
							<div class="reviewContnet">
								<div class="reviewContnetInfo">
									<table>
										<tr>
											<th>과정명</th>
											<td>Kosta Spring Cloud 246기</td>
										</tr>
										<tr>
											<th>닉네임</th>
											<td>코딩천재</td>
										</tr>
										<tr>
											<th>별점</th>
											<td><span class="reviewStar" style="color: #ffffff;">5.0</span><span> (</span>5.0
												<span>점)</span></td>
										</tr>
										<tr>
											<th>날짜</th>
											<td>2023.03.09 ~ 2023.03.09</td>
										</tr>
									</table>
								</div>

								<div class="reviewDetail">
									정말너무좋았어요정말너무좋았어요정말너무좋았어요정말너무좋았어요정말너무좋았어요정말너무좋았어요정말너무좋았어요정말너무좋았어요정말너무좋았어요정말너무좋았어요정말너무좋았어요정말너무좋았어요
									정말너무좋았어요정말너무좋았어요정말너무좋았어</div>
							</div>
						</c:forEach>


					</div>
				</div>

				<!--  -->
			</div>
		</div>
	</div>
	
	<script type="text/javascript">
	const button = document.getElementById("like-button");
	const icon = document.getElementById("like");
	
	$(document).ready(function(){
		if("${confirm}"==1){
			icon.classList.remove("fa-star-o");
			icon.classList.add("fa-star");
			
		} // 처음 상태 조회 끝 
		
		$("#like-button").click(function(){
			let status = {"lectureNo": "${lecture.lectureNo}", "userNo":"${lecture.userNo}"}
			if (icon.classList.contains("fa-star-o")) {
				
				$.ajax({
		            type: 'post',
		            url: '${pageContext.request.contextPath}/like/insert',
		            data :JSON.stringify(status),
		            contentType: 'application/json; charset=utf-8',
		            success:function(result){
                    	alert("해당 강의를 찜하였습니다.")
                    	icon.classList.remove("fa-star-o");
        				icon.classList.add("fa-star");
                    },
                    error:function(err){
                    	alert("찜하기 오류")
                         }
                      });//추가끝
                   } //비었을때 이프문 조건끝
                   if(icon.classList.contains("fa-star")) {
       				icon.classList.remove("fa-star");
       				icon.classList.add("fa-star-o");
       				$.ajax({
       		            type: 'post',
       		            url: '${pageContext.request.contextPath}/like/delete',
       		            data :JSON.stringify(status),
       		            contentType: 'application/json; charset=utf-8',
       		            success:function(result){
                           	alert("해당 강의 찜하기를 취소하였습니다.")
                           },
                           error:function(err){
                           	alert("찜하기 취소 오류")
                                }
                             });//삭제아작끝
                          } //비었을때 이프문 조건끝 
				
		})//버튼 누를때 끝
	})	
	</script>
	
	


	<script type="text/javascript">
	
	  const tabs = document.querySelectorAll('.tab1contents');
	  const navLinks = document.querySelectorAll('.tab1Nav');

	  navLinks.forEach(link => {
	    link.addEventListener('click', e => {
	      e.preventDefault();

	      const targetId = link.getAttribute('href');
	      const target = document.querySelector(targetId);

	      if (target) {
	        const topPos = target.offsetTop - 300;
	        window.scrollTo({
	          top: topPos,
	          behavior: 'smooth'
	        });
	      }
	    });
	  });

	  function activateTab(index) {
	    // 모든 탭에 active 클래스 제거
	    tabs.forEach(tab => {
	      tab.classList.remove('active');
	    });
	    // 클릭한 탭에 active 클래스 추가
	    tabs[index].classList.add('active');

	    // 모든 링크에 active 클래스 제거
	    navLinks.forEach(link => {
	      link.classList.remove('active');
	    });
	    // 클릭한 링크에 active 클래스 추가
	    navLinks[index].classList.add('active');
	  }

	  window.addEventListener('scroll', function () {
	    const scrollPosition = window.scrollY;
	    tabs.forEach((tab, index) => {
	      const top = tab.offsetTop -400;
	      const bottom = top + tab.offsetHeight;
	      if (scrollPosition >= top && scrollPosition < bottom) {
	        activateTab(index);
	      }
	    });
	  });
	
	
	</script>

	<script type="text/javascript">
const tab1 = document.getElementById('tab1');
const tab1OffsetTop = tab1.offsetTop; // tab1 요소의 상단 위치

window.addEventListener('scroll', function() {
  const currentScroll = window.pageYOffset; // 현재 스크롤 위치

  if (currentScroll >= tab1OffsetTop) {
    // 스크롤 위치가 tab1 요소의 상단 위치보다 아래일 때
    tab1.classList.add('fixed');
  } else {
    // 스크롤 위치가 tab1 요소의 상단 위치보다 위에 있을 때
    tab1.classList.remove('fixed');
  }
});
</script>
	<script type="text/javascript">
//reviewStar 태그를 찾아서 반복합니다.
$('.reviewStar').each(function() {
  // 현재 태그의 값을 읽어옵니다.
  const reviewStar = parseFloat($(this).text());

  // 1점 당 별 아이콘과 0.5점 당 반 별 아이콘을 변수에 할당합니다.
  const fullStarIcon = '<i class="fa-solid fa-star"></i>';
  const halfStarIcon = '<i class="fa-solid fa-star-half"></i>';

  // 점수를 1점과 0.5점으로 분리합니다.
  const fullStars = Math.floor(reviewStar);
  const halfStars = Math.round(reviewStar - fullStars);

  // 점수에 따라 별 아이콘을 생성합니다.
  let starIcons = '';
  for (let i = 0; i < fullStars; i++) {
    starIcons += fullStarIcon;
  }
  if (halfStars > 0) {
    starIcons += halfStarIcon;
  }

  // 생성된 별 아이콘을 태그 안에 넣어줍니다.
  $(this).html(starIcons);
});
</script>
</body>
</html>