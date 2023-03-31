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
<style type="text/css">
.reply{
	width: 100%;
	border: 0.5px solid #cccccc20; 
	border-spacing: none;
	font-size: 16px;
	font-weight: 300;
}

.reply tr:first-child{
	text-align: center;
} 
.reply tr {
  border-bottom: 0.5px solid #cccccc20; 
  line-height: 20px;
}
.reply tr > td{
	padding: 10px;
}
.reply tr > td:first-child {
 width: 75%;
}

.reply tr > td:nth-child(2) {
 width: 15%;
 text-align: center;
}

.reply tr > td:nth-child(3) {
  width:10%;
  text-align: center;
}
.board-contents{
	border: 1px solid #EFF5FF;
}
.board-contents tr > td{
	padding-bottom: 5px;
}
</style>
</head>
<body>
	<div class="container-wapper" style="margin-bottom: 100px;">
		<div class="container">
			<section class="notice">
				<!-- 게시글 -->
				<div class="container" style="margin-bottom: 20px;">
					<table class="board-contents" style="width: 100%;">
						<c:set var="TextValue" value="${community.communityRegDate }"/>
						<tr style="font-size: 24px;">
							<td colspan="8" style="padding-left: 20px; font-weight: 600; padding-top: 30px; color: #2d65f2;">${community.communityTitle}</td>
						</tr>
						<tr style="color: #767676; font-size: 14px;  border-bottom: 1px solid #EFF5FF;">
							<td style="width: 5%;"></td>
							<td style="width: 50%;"></td>
							<td style="width: 5%; ">작성자</td>
							<td style="width: 15%;">${community.userName}</td>
							<td style="width: 5%; ">조회수</td>
							<td style="width: 5%;">${community.communityCount}</td>
							<td style="width: 7%; ">등록일자</td>
							<td style="width: 8%;">${fn:substring(TextValue,0,10) }</td>
						</tr>
						<tr>
							<td colspan="8" style="padding: 20px;">
							${community.communityContent}
							</td>
						</tr>
					</table>
				</div>
				
				
					
				
				<!-- 댓글등록 -->
				<div id="board-search">
					<div class="container">
						<div class="search-window" style="width: 100%; margin-bottom: 0px;">
							<form action="/reply/insert">
								<div class="search-wrap" style="width: 100%; max-width: 990px;">
									<input type="hidden" name="communityNo" value="${community.communityNo}" >
									<input type="hidden" name="userNo" value=2 id="userNo">
									<input id="search" type="search" name="replyContent"
										placeholder="내용을 입력해주세요" value="" style="width: 100%;">
									<button type="submit" class="btn btn-dark">등록</button>
								</div>
							</form>
						</div>
					</div>
				</div>
				<!-- 댓글목록 -->
				<div class="container">
				
				<div  class="reply-container"><!-- ajax영역 -->
					<table class="reply">
						<tr>	
							<td>내용</td>
							<td>작성자</td>
							<td>작성일자</td>	
						</tr>
						
						<c:choose>
						<c:when test="${empty replyList }">
						<tr > 	
							<td style="height: 150px; font:bold; "  colspan="3" align="center" >작성된 댓글이 없어요</td>
						</tr>
						</c:when>
						<c:otherwise>
						<c:forEach items="${replyList}" var="rl" >
						<tr>	
							<td>${rl. replyContent}</td>
							<td>${rl.userName}</td>
							<td>${rl. replyRegDate}</td>	
						</tr>
						</c:forEach>
						</c:otherwise>
						</c:choose>
						
						
					</table>
				</div>
				
				
				
				</div>
			</section>
		</div>
	</div>

</body>
</html>