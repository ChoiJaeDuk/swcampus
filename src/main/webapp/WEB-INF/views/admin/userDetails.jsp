<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.js"></script>
<style type="text/css">
.reviewConfirmationForm {
	width: 100%;
	border-collapse: collapse;
	font-size: 18px;
	margin-bottom: 40px;
}
.reviewConfirmationForm tr{
 border-bottom:   1px solid #EFF5FF;
}


.reviewConfirmationForm tr th {
	width: 20%;
	padding: 10px 0px;
	border-right: 1px solid #EFF5FF20;
}
.modal .btn{
   cursor: pointer;
   border: 1px solid #999999;
   text-align: center;
   border-radius: 5px;
   outline: none;
   font-weight: 500;
}

.dimLayer{
   display: block;
   width: 100%;
   background-color: rgba(0, 0, 0, 0.3);
   position: fixed;
   left: 0;
   top: 0px;
   margin: 0;
   padding: 0;
   z-index: 9998;
}

.modal{
   width: 600px;
   height: 252px;
   border-radius: 10px;
   padding: 80px 24px;
   box-sizing: border-box;
   text-align: center;
}

.modal-section{
   background: #ffffff;
   box-sizing: border-box;
   display: none;
   position: absolute;
   top: 50%;left: 50%;
   display: none;
   z-index: 9999;
}
.pink_btn {
   width: 90px;
   background: #2d65f2;;
   color: #fff;
   height: 36px;
   line-height: 36px;
   transition: 0.5s;
   font-size: 17px;
   border: none;
}

/* .pink_btn.btn_ok:hover {
   background-color: rgb(251, 174, 51);
} */

.menu_msg{
   font-size: 21px;
   font-weight: 500;
}

.gray_btn {
   width: 90px;
   background: #ffffff;
   color: gray;
   height: 36px;
   line-height: 36px;
   transition: 0.5s;
   font-size: 17px;
}

.gray_btn.modal_close:hover {
   background: #EAEDED ;
}
</style>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.6.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#userDelete").on("click", function(){
			 action_popup.confirm("해당 모임을 거절하시겠습니까?", function (res) {
	            if (res) {
	                action_popup.alert("거절되었습니다");
	            }
	        })     
		});
		
		$(".modal_close").on("click", function () {
          	action_popup.close(this);
     	});
		
	})
	jQuery.fn.center = function () {
  	 	 this.css("top", Math.max(0, (($(window).height() - $(this).outerHeight()) / 2) + $(window).scrollTop()) + "px");
 	 	 this.css("left", Math.max(0, (($(window).width() - $(this).outerWidth()) / 2) + $(window).scrollLeft()) + "px");
   	 return this;
	}
	//팝업 창
	var action_popup = {
  		    timer: 300,
  		    confirm: function (txt, callback) {
  		        if (txt == null || txt.trim() == "") {
  		            console.warn("confirm message is empty.");
  		            return;
  		        } else if (callback == null || typeof callback != 'function') {
  		            console.warn("callback is null or not function.");
  		            return;
  		        } else {
  		            $(".type-confirm .btn_ok").on("click", function () {
  		                $(this).unbind("click");
  		                callback(true);
  		                action_popup.close(this);
  		            });
  		            this.open("type-confirm", txt);
  		        }
  		    },

  		    alert: function (txt) {
  		        if (txt == null || txt.trim() == "") {
  		            console.warn("confirm message is empty.");
  		            return;
  		        } else {
  		            this.open("type-alert", txt);
  		        }
  		    },

  		    open: function (type, txt) {
  		        var popup = $("." + type);
  		        popup.find(".menu_msg").text(txt);
  		        $("body").append("<div class='dimLayer'></div>");
  		        $(".dimLayer").css('height', $(document).height()).attr("target", type);
  		        popup.fadeIn(this.timer);
  		     	popup.center();
  		    },

  		    close: function (target) {
  		        var modal = $(target).closest(".modal-section");
  		        var dimLayer;
  		        if (modal.hasClass("type-confirm")) {
  		            dimLayer = $(".dimLayer[target=type-confirm]");
  		            $(".type-confirm .btn_ok").unbind("click");
  		        } else if (modal.hasClass("type-alert")) {
  		            dimLayer = $(".dimLayer[target=type-alert]")
  		        } else {
  		            console.warn("close unknown target.")
  		            return;
  		        }
  		        modal.fadeOut(this.timer);
  		        setTimeout(function () {
  		            dimLayer != null ? dimLayer.remove() : "";
  		        }, this.timer);
  		    }
  		}
</script>
</head>

<body>
	<div style="margin-bottom: 300px;">
	<h2
			style="color: #ffffff; text-align: center; padding: 5px 0px; background-color: #2d65f2;">회원정보</h2>
		<table class="reviewConfirmationForm">
			<tr>
				<th>아이디</th>
				<td>${user.userId}</td>
			</tr>
			<tr>
				<th>이름</th>
				<td>${user.userName}</td>
			</tr>
			<tr>
				<th>연락처</th>
				<td>${user.userPhone}</td>
			</tr>
			<tr>
				<th>이메일</th>
				<td>${user.userEmail }</td>
			</tr>
			<tr>
				<th>가입일자</th>
				<td>${fn:replace(user.userRegDate, 'T', '&nbsp&nbsp')}</td>
			</tr>
			<tr>
				<th>회사명</th>
				<td>${user.userCompany}</td>
			</tr>
			<tr>
				<th>직무</th>
				<td>${user.userJob}</td>
			</tr>
		</table>
		<button class="formbutton" onclick="location.href='${pageContext.request.contextPath}/admin/userList'" style=" float: left;  margin-left:10px; background-color:#cccccc20; color: #22222250; border: none; width: 48%; font-size: 22px; padding: 5px 0px;">목록</button>
		<button class="formbutton" id="userDelete" style="float: left; margin-left:10px; background-color:#2D65F2; color: #EFF5FF; border: none; width:48%; font-size: 22px; padding: 5px 0px;">삭제</button>
	</div>
	       <!-- confirm 모달을 쓸 페이지에 추가 start-->
        <section class="modal modal-section type-confirm">
            <div class="enroll_box">
                <p class="menu_msg"></p>
            </div>
            <div class="enroll_btn">
                <button class="btn pink_btn btn_ok">확인</button>
                <button class="btn gray_btn modal_close">취소</button>
            </div>
        </section>

        <!-- confirm 모달을 쓸 페이지에 추가 end-->

        <!-- alert 모달을 쓸 페이지에 추가 start-->
        <section class="modal modal-section type-alert">
            <div class="enroll_box">
                <p class="menu_msg"></p>
            </div>
            <div class="enroll_btn">
                <button class="btn pink_btn modal_close"  id="approve">확인</button>
            </div>
        </section>
</body>
</html>