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
</style>

</head>
<body>
	<div class="wapper"
		style="min-height: 800px; background-color: #EFF5FF20;">

		<div class="login-page">
			<h3
				style="font-size: 28px; color: #2D65F2; margin-bottom: 20px; text-align: center; font-weight: 800;">아이디
				비밀번호 찾기</h3>
			<div class="form" id="id-form">
				<form class="login-form" action="/utill/findId">
					<input type="text" placeholder="이메일을 입력해주세요" />
					<button type="submit">아이디찾기</button>
					<p class="message">
						<a href="#" style="color: #767676;">아이디찾기</a>
						| <a class="show-pw-form" href="#">비밀번호찾기</a>
					</p>
				</form>
			</div>
			
			<div class="form" id="pw-form">
				<form class="login-form">
					<input type="text" placeholder="이메일을 입력해주세요" /> <input type="text"
						placeholder="아이디를 입력해주세요" />
					<button>비밀번호찾기</button>
					<p class="message">
						<a href="#" style="color: #767676;" class="show-id-form">아이디찾기</a>
						| <a href="#">비밀번호찾기</a>
					</p>
				</form>
			</div>
		</div>
	</div>
	
	<script>
    $(document).ready(function() {
        // 초기 상태에서는 아이디 찾기 폼만 보입니다.
        $("#pw-form").hide();

        // 비밀번호 찾기 폼을 보여주는 클릭 이벤트를 설정합니다.
        $(".show-pw-form").click(function() {
            $("#id-form").hide();
            $("#pw-form").show();
            return false; // a 태그의 기본 동작을 막습니다.
        });

        // 아이디 찾기 폼을 보여주는 클릭 이벤트를 설정합니다.
        $(".show-id-form").click(function() {
            $("#pw-form").hide();
            $("#id-form").show();
            return false; // a 태그의 기본 동작을 막습니다.
        });
    });
</script>
</body>
</html>