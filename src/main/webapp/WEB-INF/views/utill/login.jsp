<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">
.login-page {
	width: 360px;
	padding: 8% 0 0;
	margin: auto;
}

.form {
	position: relative;
	z-index: 1;
	background: #FFFFFF;
	max-width: 360px;
	margin: 0 auto 100px;
	padding: 45px;
	text-align: center;
	box-shadow: 0 0 20px 0 #2D65F220, 0 5px 5px 0
		#2D65F220;
}

.form input {
	outline: 0;
	background: #f2f2f2;
	width: 100%;
	border: 0;
	margin: 0 0 15px;
	padding: 15px;
	box-sizing: border-box;
	font-size: 14px;
}

.form button {
	text-transform: uppercase;
	outline: 0;
	background: #2D65F2;
	width: 100%;
	border: 0;
	padding: 15px;
	color: #FFFFFF;
	font-size: 14px;
	-webkit-transition: all 0.3 ease;
	transition: all 0.3 ease;
	cursor: pointer;
}

.form button:hover, .form button:active, .form button:focus {
	background: #2D65F2;
}

.form .message {
	margin: 15px 0 0;
	color: #b3b3b3;
	font-size: 12px;
}

.form .message a {
	color: #2D65F2;
	text-decoration: none;
}

.form .register-form {
	display: none;
}

.container {
	position: relative;
	z-index: 1;
	max-width: 300px;
	margin: 0 auto;
}

.container:before, .container:after {
	content: "";
	display: block;
	clear: both;
}

.container .info {
	margin: 50px auto;
	text-align: center;
}

.container .info h1 {
	margin: 0 0 15px;
	padding: 0;
	font-size: 36px;
	font-weight: 300;
	color: #1a1a1a;
}

.container .info span {
	color: #4d4d4d;
	font-size: 12px;
}

.container .info span a {
	color: #000000;
	text-decoration: none;
}

.container .info span .fa {
	color: #EF3B3A;
}

</style>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.6.1.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("#login").on("click", function(){

			// 로그인 폼에서 데이터를 가져옴
			var username = $('input[name="username"]').val();
			var password = $('input[name="password"]').val();

			// 로그인 데이터를 JSON 형식으로 만듦
			var loginData = {
			  "username": username,
			  "password": password
			};
			
			// AJAX 요청을 보냄
			$.ajax({
				  type: "POST",
				  url: "${pageContext.request.contextPath}/login",
				  data: JSON.stringify(loginData),
				  contentType: "application/json",
				  success: function(response,status,xhr) {
					  var jwtToken = xhr.getResponseHeader("Authorization");
					  localStorage.setItem('jwtToken', jwtToken);
				      alert("로그인이 완료되었습니다.");
				  },
				  error: function(xhr, status, error) {
					  alert("로그인에 실패하였습니다.");
				  }
			}); 
		});
		
		$("#pwdSearch").on("click", function(){
			alert(localStorage.getItem("jwtToken"))
			$.ajax({
				  type: "GET",
				  url: "${pageContext.request.contextPath}/api/v1/user/123",
				  beforeSend: function(xhr) {
					    xhr.setRequestHeader("Authorization", localStorage.getItem("jwtToken"));
					  },
				  success: function(response,status,xhr) {
					  console.log(data);
				  },
				  error: function(xhr, status, error) {
					  alert("에러발생");
				  }
			}); 
		});
		
	});
</script>
</head>
<body>
<div class="wapper" style="min-height: 800px; background-color: #EFF5FF20;">
	
	<div class="login-page">
	    <h3 style="font-size: 40px; color: #2D65F2; margin-bottom: 20px; text-align: center; font-weight: 800;">LONIN</h3>
		<div class="form">
			<form class="login-form" >
				<input type="text" placeholder="아이디" name="username"/> 
				<input type="password" placeholder="비밀번호" name="password"/>
				<button id="login">login</button>
				<p class="message">
					  <a href="#" id="pwdSearch" style="color: #767676;" >비밀번호 찾으러가기</a>  |  <a href="#">회원가입하러가기</a>
				</p>
			</form>
		</div>
	</div>
</div>
</body>
</html>