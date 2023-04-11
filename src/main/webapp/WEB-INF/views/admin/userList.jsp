<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
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
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.6.1.min.js"></script>
<script type="text/javascript"></script>
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
					<c:forEach items= "${userList.dtoList}" var="user" varStatus="status">
						<tr>
							<td>${user.userNo}</td>
							<th><a href="/admin/userDetails/${user.userNo}">${user.userId}</a></th>
							<td><a href="/admin/userDetails/${user.userNo}">${user.userName}</a></td>
							<td>${user.userPhone}</td>
							<td>${user.userEmail}</td>
							<td>${fn:replace(user.userRegDate, 'T', '<br>')}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			
		</div>
	</div>
	<div style="margin-bottom: 100px;">
		<!-- <div class="pagination">
			<a href="#" class="prev">이전</a> <a href="#" class="page active">1</a>
			<a href="#" class="page">2</a> <a href="#" class="page">3</a> <a
				href="#" class="page">4</a> <a href="#" class="page">5</a> <a
				href="#" class="page">6</a> <a href="#" class="page">7</a> <a
				href="#" class="page">8</a> <a href="#" class="page">9</a> <a
				href="#" class="page">10</a> <a href="#" class="next">다음</a>
		</div> -->
		<nav class="pagination-container">
				<div class="pagination">
				<c:set var="doneLoop" value="false"/>
					
					 <c:if test="${(userList.start-userList.size) > 0}"> <!-- (-2) > 0  -->
					      <a class="prev" href="${pageContext.request.contextPath}/admin/userList?nowPage=${userList.start-1}">PREV</a>
					  </c:if> 
					  
					<span class="pagination-inner"> 
					 <c:forEach var='i' begin='${userList.start}' end='${(userList.start-1)+userList.size}'> 
					  
						    <c:if test="${(i-1)>=userList.totalPage}">
						       <c:set var="doneLoop" value="true"/>
						    </c:if> 
					    
					  <c:if test="${not doneLoop}" >
					         <a class="${i==nowPage?'page active':page}" href="${pageContext.request.contextPath}/admin/userList?nowPage=${i}">${i}</a> 
					  </c:if>
					   
					</c:forEach>
					</span> 
							
					 <c:if test="${(userList.start+userList.size)<=userList.totalPage}">
					     <a class="next" href="${pageContext.request.contextPath}/admin/userList?nowPage=${userList.start+userList.size}">NEXT</a>
					 </c:if>
				</div>
		</nav>  
	</div>
</body>
</html>