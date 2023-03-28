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
	width: 100%;
	padding: 8% 0 0;
	margin: auto;
}

.form {
	position: relative;
	z-index: 1;
	background: #FFFFFF;
	width: 1200px;
	margin: 0 auto;
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
.error {
  color: red;
}
.red-placeholder::placeholder {
  color: red;
}
</style>

</head>
<body>
<div class="wapper" style="min-height: 800px; background-color: #EFF5FF20;">
	
	<div class="login-page" style="margin-bottom: 200px;">
	    <h3 style="font-size: 40px; color: #2D65F2; margin-bottom: 20px; text-align: center; font-weight: 800;">회원가입</h3>
		<div class="form">
			<form class="login-form">
				<h3 style="color: #111111; margin: 20px 0px 10px; text-align: left;">아이디</h3>
				<input type="text" placeholder="아이디" /> 
				<h3 style="color: #111111; margin: 20px 0px 10px; text-align: left;">비밀번호</h3>
				<input type="password"  id="password-input" placeholder="비밀번호" />
				<input type="password" id="confirm-password-input" placeholder="비밀번호확인" style="width: 79%; float: left;"/>
				<button style="width: 20%; float: right;" type="button" onclick="validatePassword()">비밀번호확인</button>
				<h3 style="color: #111111; padding-top:20px; margin: 50px 0px 10px; text-align: left; clear: both;">이름</h3>
				<input type="text" placeholder="이름" />
				<h3 style="color: #111111; margin: 20px 0px 10px; text-align: left;">전화번호</h3>
				<input type="text" placeholder="전화번호" />
				<h3 style="color: #111111; margin: 20px 0px 10px; text-align: left;">이메일</h3>
				<input type="text" id="email-input" placeholder="이메일" onblur="validateEmail()" onfocus="clearValue()" />
				<h3 style="color: #111111; margin: 20px 0px 10px; text-align: left;">회사명</h3>
				<input type="text" placeholder="회사명" />
				<h3 style="color: #111111; margin: 20px 0px 10px; text-align: left;">직무</h3>
				<input type="text" placeholder="직무" />
				
				<button style="margin-top: 50px;" type="submit">JOIN</button>
			</form>
		</div>
	</div>
</div>
<script>

function validateEmail() {
  const emailInput = document.getElementById("email-input");
  const email = emailInput.value;
  if (!email.includes("@")) {
    emailInput.value = "이메일 형식이 올바르지 않습니다.";
    emailInput.classList.add("error");
  }
}

function clearValue() {
  const emailInput = document.getElementById("email-input");
  const email = emailInput.value;

  if (email === "이메일 형식이 올바르지 않습니다.") {
    emailInput.value = "";
    emailInput.classList.remove("error");
  }
  
}


function validatePassword() {
	  const passwordInput = document.getElementById("password-input");
	  const confirmPasswordInput = document.getElementById("confirm-password-input");
	  const password = passwordInput.value;
	  const confirmPassword = confirmPasswordInput.value;

	  if (password !== confirmPassword) {
	    confirmPasswordInput.value = "";
	    confirmPasswordInput.placeholder = "비밀번호가 일치하지 않습니다.";
	    confirmPasswordInput.classList.add("red-placeholder");
	  }
	}
	

</script>

</body>
</html>