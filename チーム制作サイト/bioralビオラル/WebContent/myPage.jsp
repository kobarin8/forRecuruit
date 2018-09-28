<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<link rel="stylesheet" href="./css/mypage.css">
<link rel="stylesheet" href="./css/inputForm.css">


<title>マイページ</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<div id="contents">
		<h1>マイページ画面</h1>
		<!-- <div id="main-box"> -->
		<s:form action="PurchaseHistoryAction">

			<table class="vertical-list-table">
				<tr>
					<th scope="row"><s:label value="姓" /></th>
					<td><s:property value="#session.familyName" /></td>
				</tr>

				<tr>
					<th scope="row"><s:label value="名" /></th>
					<td><s:property value="#session.firstName" /></td>
				</tr>


				<tr>
					<th scope="row"><s:label value="ふりがな" /></th>
					<td><s:property value="#session.familyNameKana" /><span>
					</span>
					<s:property value="#session.firstNameKana" /></td>
				</tr>


				<tr>
					<th scope="row"><s:label value="性別" /></th>
					<td><s:if test="#session.sex==0">男性</s:if>
						<s:if test="#session.sex==1">女性</s:if></td>
				</tr>

				<tr>
					<th scope="row"><s:label value="メールアドレス" /></th>
					<td><s:property value="#session.email" /></td>
				</tr>
			</table>

			<div class="submit_btn_box">
				<s:submit value="購入履歴" class="bttn-unite bttn-sm bttn-primary" />
			</div>
		</s:form>
		 <ul class="bg-bubbles">
        <li></li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
    </ul>
		</div>
	<!-- </div> -->



	<s:include value="footer.jsp" />

</body>
</html>