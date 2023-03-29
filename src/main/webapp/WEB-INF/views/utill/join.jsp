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
	box-shadow: 0 0 20px 0 #2D65F220, 0 5px 5px 0 #2D65F220;
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

#confirm-password-message, #confirm-email-message {
	color: red;
	font-size: 12px;
	text-align: left;
}
#confirm-ID-message{
	font-size: 12px;
	text-align: left;
	clear: both;
}
</style>

</head>
<body>
	<div class="wapper"
		style="min-height: 800px; background-color: #EFF5FF20;">

		<div class="login-page" style="margin-bottom: 200px;">
			<h3
				style="font-size: 40px; color: #2D65F2; margin-bottom: 20px; text-align: center; font-weight: 800;">회원가입</h3>
			<div class="form">
				<form class="login-form">
					<h3
						style="color: #111111; margin: 20px 0px 10px; text-align: left;">아이디</h3>
					<input type="text" placeholder="아이디"
						style="width: 79%; float: left; margin-bottom: 5px;" id="id-input" />
					<button style="width: 20%; float: right;" type="button"
						id="check-id-button">아이디 중복확인</button>
					<p id="confirm-ID-message"></p>

					<h3
						style="color: #111111; padding-top: 30px; margin: 0px 0px 10px; text-align: left; clear: both;">비밀번호</h3>
					<input type="password" id="password-input" placeholder="비밀번호" /> <input
						type="password" id="confirm-password-input" placeholder="비밀번호확인"
						style="margin-bottom: 5px;" />
					<p id="confirm-password-message"></p>
					<h3
						style="color: #111111; padding-top: 20px; margin: 20px 0px 10px; text-align: left; clear: both;">이름</h3>
					<input type="text" placeholder="이름" />
					<h3
						style="color: #111111; margin: 20px 0px 10px; text-align: left;">전화번호</h3>
					<input type="text" placeholder="전화번호" />
					<h3
						style="color: #111111; margin: 20px 0px 10px; text-align: left;">이메일</h3>
					<input type="email" id="emailInput" placeholder="이메일"
						style="margin-bottom: 5px;" />
					<p id="confirm-email-message"></p>

					<h3
						style="color: #111111; margin: 20px 0px 10px; text-align: left;">회사명</h3>
					<input type="text" placeholder="회사명" />
					<h3
						style="color: #111111; margin: 20px 0px 10px; text-align: left;">직무</h3>
					<input type="text" placeholder="직무" />

					<button style="margin-top: 50px;" type="submit">JOIN</button>
				</form>
			</div>
		</div>
	</div>
	<script>
		function validateEmail() {
			const emailInput = document.getElementById("emailInput");
			const email = emailInput.value;
			const message = document.getElementById("confirm-email-message");

			if (!email.includes("@")) {
				message.textContent = "이메일형식이 올바르지 않습니다.";
			} else {
				message.textContent = "";
			}
		}
		emailInput.addEventListener("input", validateEmail);

		function validatePassword() {
			const passwordInput = document.getElementById("password-input");
			const confirmPasswordInput = document
					.getElementById("confirm-password-input");
			const password = passwordInput.value;
			const confirmPassword = confirmPasswordInput.value;
			const message = document.getElementById("confirm-password-message");

			if (password !== confirmPassword) {
				message.textContent = "비밀번호가 일치하지 않습니다.";
			} else {
				message.textContent = "";
			}
		}
		const confirmPasswordInput = document
				.getElementById("confirm-password-input");
		confirmPasswordInput.addEventListener("input", validatePassword);
		
		
		  const idInput = document.getElementById("id-input");
		  const checkIdButton = document.getElementById("check-id-button");
		  const confirmIdMessage = document.getElementById("confirm-ID-message");

		  checkIdButton.addEventListener("click", function() {
		    //아이디 중복확인 기능
		    const inputId = idInput.value.toUpperCase(); //입력받은아이디 대문자로 바꾸기
		    const isDuplicated = (inputId === "USER"); // user라는 예시아이디가 중복된 것으로 처리

		    if (isDuplicated) {
		      confirmIdMessage.textContent = "아이디 중복입니다.";
		      confirmIdMessage.style.color = "red";
		    } else {
		      confirmIdMessage.textContent = "사용할 수 있는 아이디입니다.";
		      confirmIdMessage.style.color = "green";
		    }
		  });
	</script>

</body>
</html>