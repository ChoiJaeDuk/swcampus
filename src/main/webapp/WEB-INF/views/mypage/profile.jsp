<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <script>
	let nameValue; 
	let companyValue;
	let jobValue; 
	let passwordValue;
    document.addEventListener('DOMContentLoaded', function() {
      nameValue = document.getElementById('nameValue').value;
      companyValue = document.getElementById('companyValue').value;
      jobValue = document.getElementById('jobValue').value;
      passwordValue = document.getElementById('password-input').value;
    });
    
    
    function confirmChanges() {

  	  // 바뀐 정보
  	  const newName = document.getElementById('nameValue').value;
  	  const newCompany = document.getElementById('companyValue').value;
  	  const newJob = document.getElementById('jobValue').value;
  	  const newPassword = document.getElementById('password-input').value;

  	  const message = "*** 정보를 수정하시겠습니까? ***\n" + nameValue + " → " +newName+"\n"+
  					  companyValue+ " → "+ newCompany+"\n"+jobValue+ " → "+newJob+"\n"+passwordValue+ " → "+newPassword
  	  return confirm(message);
  	}
    
  </script>
  
  
<style type="text/css">

.form {
	position: relative;
	z-index: 1;
	background: #FFFFFF;
	width: 1200px;
	margin: 0 auto;
	padding: 45px;
	text-align: center;
	border: 0.5px solid #EFF5FF20;
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

.wapperBlur {
  filter: blur(5px); /* 블러 처리 */
  pointer-events: none; /* 마우스 이벤트 무시 */
}


.popup {
  position: fixed;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  background-color: rgba(0, 0, 0, 0.5);
  display: none;
  justify-content: center;
  align-items: center;
  z-index: 99999999;
}

.popup-content {
  background-color: #fff;
  padding: 20px;
  border-radius: 5px;
  box-shadow: 0 2px 5px rgba(0, 0, 0, 0.5);
  text-align: center;
}

#password-input {
  margin-bottom: 10px;
}
</style>

</head>
<body>
	<div class="wapper wapperBlur" id="profileWapper"
		style="min-height: 800px; background-color: #EFF5FF20; width: 100%;">

		<div class="login-page" style="margin-bottom: 200px;">
			<div class="form" style="width: 100%;">
				<form class="login-form" onsubmit="return confirmChanges()">
					<h3 
						style="color: #111111; margin: 20px 0px 10px; text-align: left;">아이디</h3>
					<input type="text" placeholder="아이디" value="asdoajsoid" disabled="disabled" />

					<h3
						style="color: #111111; padding-top: 30px; margin: 0px 0px 10px; text-align: left; clear: both;">비밀번호</h3>
					<input type="password" id="password-input" placeholder="비밀번호" value="1234"/> <input
						type="password" id="confirm-password-input" placeholder="비밀번호확인"
						style="margin-bottom: 5px;" />
					<p id="confirm-password-message"></p>
					<h3
						style="color: #111111; padding-top: 20px; margin: 20px 0px 10px; text-align: left; clear: both;">이름</h3>
					<input type="text" placeholder="이름" value="김코딩" id="nameValue"/>
					<h3
						style="color: #111111; margin: 20px 0px 10px; text-align: left;">전화번호</h3>
					<input type="text" placeholder="전화번호" value="010-0000-0000" disabled="disabled" />
					<h3
						style="color: #111111; margin: 20px 0px 10px; text-align: left;">이메일</h3>
					<input type="email" placeholder="이메일"  value="asdoajsoid@naver.com" disabled="disabled"/>

					<h3
						style="color: #111111; margin: 20px 0px 10px; text-align: left;">회사명</h3>
					<input type="text" placeholder="회사명" value="소프트웨어캠퍼스" id="companyValue" />
					<h3
						style="color: #111111; margin: 20px 0px 10px; text-align: left;">직무</h3>
					<input type="text" placeholder="직무"   value="개발자"  id="jobValue"/>

					<button style="margin-top: 50px;" type="submit">수정하기</button>
				</form>
			</div>
		</div>
	</div>
	
	<div id="popup" class="popup">
	  <div class="popup-content">
	    <p style="margin-bottom: 10px;">개인정보 보호를 위해 비밀번호를 입력해주세요</p>
	    <input type="password" id="popup-password" style="width: 200px;">
	    <button id="submit-btn">확인</button>
	  </div>
</div>


	<script>

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
	</script>

<script type="text/javascript">
const popup = document.getElementById('popup');
const submitBtn = document.getElementById('submit-btn');
const wapperBlur = document.getElementById('popup');


window.onload = function() {
  popup.style.display = 'flex';
}

submitBtn.addEventListener('click', function() {
  const popupPassword = document.getElementById('popup-password');
  const password = popupPassword.value;
  const wapperBlur = document.getElementById('profileWapper');
  
  // 비밀번호 확인 test숫자임
  if (password === '1234') {
    popup.style.display = 'none';
    wapperBlur.classList.remove("wapperBlur");
  }
  // 비밀번호가 틀릴 경우 경고 메시지를 표시합니다.
  else {
    alert('비밀번호가 틀렸습니다.');
  }
});

</script>
</body>
</html>