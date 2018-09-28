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




<title>カート</title>

<style type="text/css">

/* h1{
	 height:25% 25%;
	 width:75%;
}
h2{
   height:25%  80%;
   width:75%;
}
#contents{
	text-align:center;
	vertical-align:center;
	width:90%;
	height:auto;
	padding:10%;
	margin:15% 15%;

}
table.horizontal-list-table, th, td {
	margin : 3%;
	width : 90%;
	border-collapse: collapse;
	border: 1px solid #ccc;
	line-height: 1.5;
}

table.horizontal-list-table th {
	width: 150px;
	padding: 10px;
	font-weight: bold;
	font-size: 0.8em;
	text-align: center;
	vertical-align: top;
	background: #005392;
	color: #ffffff;
}
table.horizontal-list-table td {
	width: 350px;
	padding: 10px;
	font-size: 0.8em;
	text-align: center;
	vertical-align: top;
}
#submit_btn{
text-align:center;
margin:30%;
} */
.info {
	text-align: center;
	vertical-align: center;
}

#submit_btn_box3 {
	text-align: center;
}
</style>


<script type="text/javascript">
	function goDeleteCartAction() {
		document.getElementById("form").action = 'DeleteCartAction';
	}
</script>
</head>
<body>
	<jsp:include page="header.jsp" />
	<div id="contents">
		<h1>カート画面</h1>

		<s:if test="#session.checkListErrorMessageList!=null">
			<div class="error">
				<div class="error-message">
					<s:iterator value="#session.checkListErrorMessageList">
						<s:property />
					</s:iterator>
				</div>
			</div>
		</s:if>

		<s:if test="#session.cartInfoDtoList.size()>0">
			<s:form id="form" action="SettlementConfirmAction">
				<table class="horizontal-list-table">
					<thead>
						<tr>
							<th><s:label value="#" /></th>
							<th><s:label value="商品名" /></th>
							<th><s:label value="ふりがな" /></th>
							<th><s:label value="商品画像" /></th>
							<th><s:label value="値段" /></th>
							<th><s:label value="発売会社名" /></th>
							<th><s:label value="発売年月日" /></th>
							<th><s:label value="購入個数" /></th>
							<th><s:label value="合計金額" /></th>
						</tr>
					</thead>
					<tbody>
						<s:iterator value="#session.cartInfoDtoList">
							<tr>
								<td><s:checkbox name="checkList" value="checked"
										fieldValue="%{productId}" /></td>
								<s:hidden name="productId" value="%{productId}" />
								<td><s:property value="productName" /></td>
								<td><s:property value="productNameKana" /></td>
								<td><img
									src='<s:property value="imageFilePath"/>/<s:property value="imageFileName"/>'
									class="item-image-box" /></td>
								<td><s:property value="price" />円</td>
								<td><s:property value="releaseCompany" /></td>
								<td><s:property value="releaseDate" /></td>
								<td><s:property value="productCount" /></td>
								<td><s:property value="subtotal" />円</td>
							</tr>

							<!-- ブラウザ上に表示されない非表示データを送信 -->
							<s:hidden name="productName" value="%{productName}" />
							<s:hidden name="productNameKana" value="%{productNameKana}" />
							<s:hidden name="imageFilePath" value="%{imageFilePath}" />
							<s:hidden name="imageFileName" value="%{imageFileName}" />
							<s:hidden name="price" value="%{price}" />
							<s:hidden name="releaseCompany" value="%{releaseCompany}" />
							<s:hidden name="releaseDate" value="%{releaseDate}" />
							<s:hidden name="productCount" value="%{productCount}" />
							<s:hidden name="subtotal" value="%{subtotal}" />
						</s:iterator>
					</tbody>
				</table>
				<h2>
					<s:label value="カート合計金額 :" />
					<s:property value="#session.totalPrice" />
					円
				</h2>
				<br>
				<div id="submit_btn_box3">
					<div id=".contents-btn-set">
						<s:submit value="決済" class="bttn-unite bttn-sm bttn-primary" />
					</div>
				</div>

				<div id="submit_btn_box3">
					<div id=".contents-btn-set">
						<s:submit value="削除" class="bttn-unite bttn-sm bttn-primary"
							onclick="this.form.action='DeleteCartAction';" />
					</div>
				</div>

			</s:form>
		</s:if>
		<s:else>
			<div class="info">カートの情報はありません。</div>
		</s:else>
	</div>
	<div id="footer">
		<s:include value="footer.jsp" />
	</div>
</body>
</html>