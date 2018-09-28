<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/inputForm.css">
<link rel="stylesheet" type="text/css" href="./css/style.css" />
<script type="text/javascript"
	src="http://code.jquery.com/jquery-3.1.0.min.js"></script>
<script src="js/fade.js"></script>
<title>ユーザ情報入力</title>
<!-- css実験用 -->
<style type="text/css">
.radio {
	color: black;
	margin: 5% 5% 5% 0;
}

.radio:hover {

}

.radio:active {
	color: #54D7BA;
}

footer {
	text-align: center;
	margin-top: 10%;
}
</style>

</head>
<body class="is-hide">
	<jsp:include page="header.jsp" />
	<div id="contents">
		<div id="main-box-none">
			<div id="form">
				<div id="errormessage-form">
					<s:if test="!#session.familyNameErrorMessageList.isEmpty()">
						<div class="error">
							<div class="error-message">
								<s:iterator value="#session.familyNameErrorMessageList">
									<s:property />
									<br>
								</s:iterator>
							</div>
						</div>
					</s:if>
					<s:if test="!#session.firstNameErrorMessageList.isEmpty()">
						<div class="error">
							<div class="error-message">
								<s:iterator value="#session.firstNameErrorMessageList">
									<s:property />
									<br>
								</s:iterator>
							</div>
						</div>
					</s:if>
					<s:if test="!#session.familyNameKanaErrorMessageList.isEmpty()">
						<div class="error">
							<div class="error-message">
								<s:iterator value="#session.familyNameKanaErrorMessageList">
									<s:property />
									<br>
								</s:iterator>
							</div>
						</div>
					</s:if>
					<s:if test="!#session.firstNameKanaErrorMessageList.isEmpty()">
						<div class="error">
							<div class="error-message">
								<s:iterator value="#session.firstNameKanaErrorMessageList">
									<s:property />
									<br>
								</s:iterator>
							</div>
						</div>
					</s:if>
					<s:if test="!#session.emailErrorMessageList.isEmpty()">
						<div class="error">
							<div class="error-message">
								<s:iterator value="#session.emailErrorMessageList">
									<s:property />
									<br>
								</s:iterator>
							</div>
						</div>
					</s:if>
					<s:if test="!session.loginIdErrorMessageList.isEmpty()">
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
					<!-- user_id重複check -->
					<s:if test="!#session.loginIdDuplicationErrorMessageList.isEmpty()">
						<div class="error">
							<div class="error-message">
								<s:iterator value="#session.loginIdDuplicationErrorMessageList">
									<s:property />
									<br>
								</s:iterator>
							</div>
						</div>
					</s:if>
				</div>

				<s:form action="CreateUserConfirmAction">
					<div id="input-form">
						<h2>新規ユーザー登録</h2>
						<table id="vertical-list-table">
							<tr>
								<th scope="row">姓</th>
								<td><s:textfield name="familyName"
										value="%{#session.familyName}" label="姓" placeholder="16文字以内"
										class="txt fade-background" size="25" autocomplete="new-password" /></td>
							</tr>
							<tr>
								<th scope="row">名</th>
								<td><s:textfield name="firstName"
										value="%{#session.firstName}" label="名" placeholder="16文字以内"
										class="txt fade-background" size="25" autocomplete="new-password" /></td>
							</tr>
							<tr>
								<th scope="row">姓ふりがな</th>
								<td><s:textfield name="familyNameKana"
										value="%{#session.familyNameKana}" label="姓ふりがな"
										placeholder="16文字以内" class="txt fade-background" size="25" autocomplete="new-password" /></td>
							</tr>
							<tr>
								<th scope="row">名ふりがな</th>
								<td><s:textfield name="firstNameKana"
										value="%{#session.firstNameKana}" label="名ふりがな"
										placeholder="16文字以内" class="txt fade-background" size="25" autocomplete="new-password" /></td>
							</tr>
							<tr>
								<th scope="row">性別</th>
								<td><s:radio name="sex" list="%{#session.sexList}"
										value="%{#session.sex}" label="性別" placeholder="性別"
										class="radio" /></td>
							</tr>
						</table>
						<br>
						<table id="vertical-list-table">
							<tr>
								<th scope="row">メールアドレス</th>
								<td><s:textfield name="email" value="%{#session.email}"
										label="メールアドレス" placeholder="14文字以上32文字以下"
										class="txt fade-background" size="25" autocomplete="new-password"/></td>
							</tr>
							<tr>
								<th scope="row">ログインID</th>
								<!-- value変更 userId→userLoginId ログイン機能と区別するため。 -->
								<td><s:textfield name="loginId"
										value="%{#session.userLoginId}" label="ログインID"
										placeholder="8文字以内" class="txt fade-background" size="25"  autocomplete="new-password"/></td>
							</tr>
							<tr>
								<th scope="row">パスワード</th>
								<td><s:password name="password" value="" label="パスワード"
										placeholder="16文字以内" class="txt fade-background" size="25" autocomplete="new-password"/></td>
							</tr>
						</table>
						<br>
						<div class="submit_btn_box">
							<div id=".contents-btn-set">
								<s:submit value="登録"
									class="submit_btn2 bttn-unite bttn-sm bttn-primary" />
							</div>
						</div>
					</div>
				</s:form>
			</div>
		</div>
	</div>
	<footer>
		<s:include value="footer.jsp" />
	</footer>
</body>
</html>