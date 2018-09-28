<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- ↓これ何ぞ -->
<!-- <link rel="stylesheet" href="./css/DesInput.css"> -->
<link rel="stylesheet" href="./css/style.css">
<link rel="stylesheet" href="./css/inputForm.css">
<script type="text/javascript" src="http://code.jquery.com/jquery-3.1.0.min.js"></script>
<script src="js/fade.js"></script>
<title>パスワード再設定</title>
</head>
<body class="is-hide">
	<jsp:include page="header.jsp" />
	<div id="contents">
		<div id="main-box-none">
			<s:form action="ResetPasswordConfirmAction" id="form">
				<div id="errormessage-form">
					<s:if test="!#session.userExistsErrorMessageList.isEmpty()">
						<div class="error">
							<div class="error-message">
								<s:iterator value="#session.userExistsErrorMessageList">
									<s:property />
									<br>
								</s:iterator>
							</div>
						</div>
					</s:if>

					<s:if test="!#session.loginIdErrorMessageList.isEmpty()">
						<div class="error">
							<div class="error-message">
								<s:iterator value="#session.loginIdErrorMessageList">
									<s:property />
									<br>
								</s:iterator>
							</div>
						</div>
					</s:if>

					<s:if test="!#session.passwordErrorMessageList.isEmpty()">
						<div class="error">
							<div class="error-message">
								<s:iterator value="#session.passwordErrorMessageList">
									<s:property />
									<br>
								</s:iterator>
							</div>
						</div>
					</s:if>

					<!-- エラー：パスワードが異なります -->
					<s:if test="!#session.passwordIncorrectErrorMessageList.isEmpty()">
						<div class="error">
							<div class="error-message">
								<s:iterator value="#session.passwordIncorrectErrorMessageList">
									<s:property />
									<br>
								</s:iterator>
							</div>
						</div>
					</s:if>

					<s:if test="!#session.newPasswordErrorMessageList.isEmpty()">
						<div class="error">
							<div class="error-message">
								<s:iterator value="#session.newPasswordErrorMessageList">
									<s:property />
									<br>
								</s:iterator>
							</div>
						</div>
					</s:if>

					<s:if test="!#session.reConfirmPasswordErrorMessageList.isEmpty()">
						<div class="error">
							<div class="error-message">
								<s:iterator value="#session.reConfirmPasswordErrorMessageList">
									<s:property />
									<br>
								</s:iterator>
							</div>
						</div>
					</s:if>
					<s:if
						test="!#session.newPasswordIncorrectErrorMessageList.isEmpty()">
						<div class="error">
							<div class="error-message">
								<s:iterator
									value="#session.newPasswordIncorrectErrorMessageList">
									<s:property />
									<br>
								</s:iterator>
							</div>
						</div>
					</s:if>
				</div>



				<div id="input-form">
					<h2>パスワード再設定</h2>
					<table id="vertical-list-table">
						<tr>
							<th scope="row"><s:label value="ログインID" /></th>
							<td><s:textfield name="loginId" placeholder="ログインID"
									class="txt fade-background" size="30" autocomplete="new-password" /></td>
						</tr>
						<tr>
							<th scope="row"><s:label value="現在のパスワード" /></th>
							<td><s:password name="password" placeholder="現在のパスワード"
									class="txt fade-background" size="30" autocomplete="new-password"/></td>
						</tr>

						<tr>
							<th scope="row"><s:label value="新しいパスワード" /></th>
							<td><s:password name="newPassword" placeholder="新しいパスワード"
									class="txt fade-background" size="30" autocomplete="new-password"/></td>
						<tr>
							<th scope="row"><s:label value="（再確認）" /></th>
							<td><s:password name="reConfirmationPassword"
									placeholder="新しいパスワード（再確認用）" class="txt fade-background" size="30" autocomplete="new-password"/></td>
						</tr>
					</table>
					<br>
					<s:submit value="Reset Password" class="submit_btn2 bttn-unite bttn-sm bttn-primary"  />
					<br> <br>
				</div>
			</s:form>
		</div>
	</div>
	<footer>
		<s:include value="footer.jsp" />
	</footer>
</body>
</html>