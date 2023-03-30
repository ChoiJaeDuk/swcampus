<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
.titleBox {
	outline: 0;
	color: #2D65F2;
	width: 100%;
	margin: 50px 0px 0px;
	padding: 15px;
	box-sizing: border-box;
	font-size: 22px;
	text-align: left;
	font-weight: 800;
}

.inputBox {
	background: #ffffff;
	border: 1px solid #EFF5FF50;
	border-right: none;
	border-left: none;
	width: 89.9%;
	margin: 0;
	padding: 10px;
	box-sizing: border-box;
	font-size: 14px;
	float: right;
}

.note-toolbar {
	background: #cccccc50;
}

.inputlabel {
	color: #22222290;
	width: 10%;
	border: 1px solid #EFF5FF50;
	border-right: none;
	border-left: none;
	margin: 0;
	padding: 10px 20px;
	box-sizing: border-box;
	font-size: 14px;
	float: left;
	font-weight: 700;
	letter-spacing: 10px;
}

.formbutton {
	text-transform: uppercase;
	outline: 0;
	background: #2D65F2;
	width: 49.5%;
	margin: 0px;
	border: 0;
	padding: 15px;
	color: #FFFFFF;
	font-size: 20px;
	-webkit-transition: all 0.3 ease;
	transition: all 0.3 ease;
	cursor: pointer;
	border: 0;
	font-weight: 900;
}

.formbutton:hover, .formbutton:active, .formbutton:focus {
	background: #2D65F2;
}

/* input file type */
.input-file {
  display: block;
  margin-bottom: 50px;
}

.input-file [type="file"] {
  position: absolute;
  width: 1px;
  height: 1px;
  padding: 0;
  margin: -1px;
  overflow: hidden;
  clip: rect(0, 0, 0, 0);
  border: 0 none;
}
.input-file .file-label {
  display: inline-block;
  width:20%;
  height: 35px;
  line-height: 35px;
  padding: 0 10px;
  font-size: 20px;
  background-color: #2D65F2;
  color: #fff;
  text-align: center;
}
.input-file .file-name {
  width: 79%;
  height: 35px;
  line-height: 35px;
  text-indent: 5px;
  position:relative;
  top: -3px;
  border: 1px solid #EFF5FF;
}

/* 접근성 탭 포커스 스타일 */
.file-focus {
  outline: 1px dotted #2D65F2;
}

.dl_source > * {
  display:inline-block;
  margin:0;
  padding:0;
  vertical-align:middle;
}
</style>
</head>
<body>



	<div class="container-wapper">
		<div class="container" style="margin: 100px auto 150px;">
			<div class="titleBox">후기 작성하기</div>
			<form method="post">
				<span class="inputlabel">강의명</span> <input type="text"
					class="inputBox" value="엄청난 자바 강의" disabled="disabled"> <span
					class="inputlabel">작성자</span> <input type="text"
					disabled="disabled" value="작성자ID" class="inputBox"> <span
					class="inputlabel">평점</span>
				<div class="makeStar" style="width:100%;">
					<div class="rating" style=" float: left; color: #ebebeb; line-height: 40px; ">
						<i class="fas fa-star" style="color: #FFC700"></i> <i class="fas fa-star"></i> <i
							class="fas fa-star"></i> <i class="fas fa-star"></i> <i
							class="fas fa-star"></i>
					</div>
					
					<select class="inputBox" id="makeStar"
						style="width: 5%; float: left;">
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
					</select>
					
				</div>
				<div style="width: 100%; clear: both;">
				<textarea rows="10" cols="183"  style="border: 0.5px solid #EFF5FF; padding: 20px; resize: none;"  placeholder="내용을 입력해주세요 (255글자내)" ></textarea>
				</div>
				
				
				<div class="input-file">
				  <input type="text" readonly="readonly" class="file-name" />
				  <label for="upload01" class="file-label">파일 업로드</label>
				  <input type="file" name="" id="upload01" class="file-upload" />
				</div>
				<div>
					<button class="formbutton"
						style="float: left; background-color: #EFF5FF; color: #2D65F2;">목록</button>
					<button class="formbutton" style="float: right;">작성</button>
				</div>
			</form>
		</div>
	</div>
<script type="text/javascript">
let rating = document.querySelectorAll('.makeStar .rating i');
document.getElementById('makeStar').addEventListener('change', function(){
    let selectedNum = this.value;
    console.log(selectedNum);
    rating.forEach(function(item, index){
        if (index < selectedNum) {
            item.style.color = '#FFC700';
        } else {
            item.style.color = '#ebebeb';
        }
    });
});
</script>
<script type="text/javascript">
const textarea = document.querySelector('textarea');

textarea.addEventListener('input', function() {
  const maxLength = 255;
  const currentLength = this.value.length;
  const counter = document.querySelector('#counter');

  if (currentLength > maxLength) {
    this.value = this.value.substring(0, maxLength);
    counter.textContent = maxLength;
  } else {
    counter.textContent = currentLength;
  }
});

</script>

<script type="text/javascript">
let $fileBox = null;

$(document).ready(function() {
  init();
});

function init() {
  $fileBox = $('.input-file');
  fileLoad();
}

function fileLoad() {
  $fileBox.each(function(idx) {
    let $this = $fileBox.eq(idx);
    let $btnUpload = $this.find('[type="file"]');
    let $label = $this.find('.file-label');

    $btnUpload.on('change', function() {
      let $target = $(this);
      let fileName = $target.val();
      let $fileText = $target.siblings('.file-name');
      $fileText.val(fileName);
    });

    $btnUpload.on('focusin focusout', function(e) {
      e.type == 'focusin' ?
        $label.addClass('file-focus') : $label.removeClass('file-focus');
    });
  });
}
</script>
</body>
</html>