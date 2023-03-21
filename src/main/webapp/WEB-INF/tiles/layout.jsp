<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	*{
		margin: 0px;
	}
	 /*카테고리별 색상지정*/
        .officeWorker {
            color: #F17D7D;
            background-color: #FFE4E450;
            padding: 1px 5px;
        }

        .jobSeeker {
            color: #7782E5;
            background-color: #D3D8FF50;
            padding: 1px 5px;
        }

        .offline {
            color: #FFC700;
            background-color: #FFFCE5;
            padding: 1px 5px;
            50
        }

        .online {
            color: #57AA87;
            background-color: #E8FFE050;
            padding: 1px 5px;
        }

        .backend {
            color: #FC549A;
            background-color: #FFD0E450;
            padding: 1px 5px;
        }

        .front {
            color: #00C2FF;
            background-color: #E7F8FF50;
            padding: 1px 5px;
        }

        .ai {
            color: #FFA722;
            background-color: #FFEDE550;
            padding: 1px 5px;
        }

        .DET {
            color: #FFC700;
            background-color: #FEFFE550;
            padding: 1px 5px;
        }

        .security {
            color: #B971D2;
            background-color: #F8E2FF50;
            padding: 1px 5px;
        }

        .cloud {
            color: #4B6AB7;
            background-color: #E9EBFF50;
            padding: 1px 5px;
        }

        .swEngineering {
            color: #88D44C;
            background-color: #F5FFD850;
            padding: 1px 5px;
        }

        .categoryType {
            padding-top: 8px;
        }
	  .reviewRatingLine {
            font-weight: 500;
        }

        .best-contents {
            background-color: #EFF5FF;
            width: 1200px; 
            margin: 0 auto; 
            padding: 50px 0px;
            overflow: hidden;
        }

        .lecture-card {
            box-sizing: border-box;
            float: left;
            width: 275px;
            height: 177px;
            background: #FFFFFF;
            border: 1px solid #CCCCCC;
            box-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);
            border-radius: 10px;
            margin: 5px;
            padding: 0px 5px;
        }

        .lecture {
            width: 255px;
            height: 140px;
            margin: auto;
            padding: 20px 10px;
            font-size: 13px;
        }

        .lecture>div {
            margin-bottom: 2px;
        }

        .lecture>div>div {
            width: 65%;

            float: left;
        }

        .association {
            color: #666666;
            font-size: 11px;
            margin-bottom: 2px;
        }

        .lectureTitle {
            font-weight: 800;
            font-size: 17px;
            line-height: 1.2;
            margin-bottom: 8px;
            width: 90%;
        }
        .best-lecture{
            padding: 0px 30px;
            overflow: hidden;
        }
 
</style>
</head>
<body>

		<tiles:insertAttribute name="header"/>
	
		<tiles:insertAttribute name="content"/>
	
		<tiles:insertAttribute name="footer"/>
</body>

</html>