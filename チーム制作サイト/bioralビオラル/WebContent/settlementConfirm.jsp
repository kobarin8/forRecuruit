<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<link rel="stylesheet" href="./css/table.css">
<link rel="stylesheet" href="./css/inputForm.css">
<link rel="stylesheet" href="./css/confirm.css">
<style type="text/css">
.submit_btn_box {
	text-align: center;
	margin-top: 20px;
}
</style>
<title>決済確認</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<div id="contents">
		<h1>決済確認画面</h1>
		<s:if test="#session.destinationInfoDtoList == null">
			<div id="info">送り先情報を登録してください</div>
		</s:if>
		<s:else>
			<div class="info">送り先情報を選択してください</div>
			<s:form id="form" action="SettlementCompleteAction">
				<table class="horizontal-list-table">
					<thead>
						<tr>
							<th><s:label value="#" /></th>
							<th><s:label value="姓" /></th>
							<th><s:label value="名" /></th>
							<th><s:label value="ふりがな" /></th>
							<th><s:label value="住所" /></th>
							<th><s:label value="電話番号" /></th>
							<th><s:label value="メールアドレス" /></th>
						</tr>
					</thead>
					<tbody>
						<s:iterator value="#session.destinationInfoDtoList" status="st">
							<tr>
								<td><s:if test="#st.index == 0">
										<input type="radio" name="id" checked="checked"
											value="<s:property value='id'/>" />
									</s:if> <s:else>
										<input type="radio" name="id" value="<s:property value='id'/>" />
									</s:else></td>
								<td><s:property value="familyName" /><br></td>
								<td><s:property value="firstName" /><br></td>
								<td><s:property value="familyNameKana" /><span> </span> <s:property
										value="firstNameKana" /><br></td>
								<td><s:property value="userAddress" /></td>
								<td><s:property value="telNumber" /></td>
								<td><s:property value="email" /></td>
						</s:iterator>
					</tbody>
				</table>

				<div class="submit_btn_box">
					<div id=".contents-btn-set">
						<s:submit value="決済" class="bttn-unite bttn-sm bttn-primary" />
					</div>
				</div>
				<s:token />
			</s:form>
		</s:else>

		<div class="submit_btn_box">
			<div id=".contents-btn-set">
				<s:form action="CreateDestinationAction">
					<s:submit value="新規登録" class="bttn-unite bttn-sm bttn-primary" />
				</s:form>
			</div>
		</div>
	</div>
	<s:include value="footer.jsp" />
</body>
</html>