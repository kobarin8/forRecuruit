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
<title>宛先情報入力</title>
<style>
.submit_btn2 {
	margin-top: 30px;
}
</style>
</head>
<body>
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
					<s:if test="!#session.telNumberErrorMessageList.isEmpty()">
						<div class="error">
							<div class="error-message">
								<s:iterator value="#session.telNumberErrorMessageList">
									<s:property />
									<br>
								</s:iterator>
							</div>
						</div>
					</s:if>
					<s:if test="!#session.userAddressErrorMessageList.isEmpty()">
						<div class="error">
							<div class="error-message">
								<s:iterator value="#session.userAddressErrorMessageList">
									<s:property />
									<br>
								</s:iterator>
							</div>
						</div>
					</s:if>
				</div>

				<s:form action="CreateDestinationConfirmAction">
					<div id="input-form">
						<h2>宛先情報入力画面</h2>
						<table id="vertical-list-table">
							<tr>
								<th scope="row"><s:label value="姓" /></th>
								<td><s:textfield name="familyName"
										class="txt fade-background" placeholder="姓"
										autocomplete="new-password" /></td>
							</tr>

							<tr>
								<th scope="row"><s:label value="名" /></th>
								<td><s:textfield name="firstName"
										class="txt fade-background" placeholder="名"
										autocomplete="new-password" /></td>
							</tr>

							<tr>
								<th scope="row"><s:label value="姓ふりがな" /></th>
								<td><s:textfield name="familyNameKana"
										class="txt fade-background" placeholder="姓ふりがな"
										autocomplete="new-password" /></td>
							</tr>

							<tr>
								<th scope="row"><s:label value="名ふりがな" /></th>
								<td><s:textfield name="firstNameKana"
										class="txt fade-background" placeholder="名ふりがな"
										autocomplete="new-password" /></td>
							</tr>

							<tr>
								<th scope="row"><s:label value="性別" /></th>
								<td><s:radio name="sex" list="sexList"
										value="defaultSexValue" label="性別" placeholder="性別" /></td>
							</tr>

							<tr>
								<th scope="row"><s:label value="住所" /></th>
								<td><s:textfield name="userAddress"
										class="txt fade-background" placeholder="住所"
										autocomplete="new-password" /></td>
							</tr>

							<tr>
								<th scope="row"><s:label value="電話番号"
										autocomplete="new-password" /></th>
								<td><s:textfield name="telNumber"
										class="txt fade-background" placeholder="電話番号" /></td>
							</tr>

							<tr>
								<th scope="row"><s:label value="メールアドレス" /></th>
								<td><s:textfield name="email" class="txt fade-background"
										placeholder="メールアドレス" autocomplete="new-password" /></td>
							</tr>
						</table>

						<div class="submit_btn_box">
							<div id=".contents-btn-set">
								<s:submit value="宛先情報確認"
									class="submit_btn2 bttn-unite bttn-sm bttn-primary" />
							</div>
						</div>
					</div>
				</s:form>
			</div>
		</div>
	</div>
	<s:include value="footer.jsp" />
</body>
</html>