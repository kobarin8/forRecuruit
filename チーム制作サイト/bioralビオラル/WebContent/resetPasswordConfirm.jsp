<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<link rel="stylesheet" href="./css/confirm.css">
<link rel="stylesheet" href="./css/inputForm.css">
<title>パスワード再設定確認</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<div id="contents">
		<div id="main-box">
			<h1 id="reset-h1">パスワード再設定確認画面</h1>
			<s:form action="ResetPasswordCompleteAction">
				<div id="reset-box">
					<h4>ログインID</h4>
					<s:property value="#session.loginId" />
					<br>
					<h4>新しいパスワード</h4>
					<s:property value="#session.concealedPassword" />
					<br><br>
					<s:submit value="再設定" class="bttn-unite bttn-sm bttn-primary" />
				</div>
				<s:token />
			</s:form>
		</div>
	</div>
	<s:include value="footer.jsp" />
</body>
</html>