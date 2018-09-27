<%@ page language="java" contentType="text/html; charset=UTF-8"

pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品管理画面</title>

<style type="text/css">
table {
text-align:center;
margin:0 auto;

}
</style>
</head>
<body>

<table border="1">

<tr>
<th>商品名</th>
<th>商品価格</th>
<th>商品在庫数</th>
</tr>

<s:iterator value="ProductListDTOList">
<tr>
<td><s:property value="ItemName" /></td>
<td><s:property value="itemPrice" /><span>円</span></td>
<td><s:property value="itemStock" /><span>個</span></td>

<td>
<s:form action="ProductDetailAction">
<input type="hidden" name="ItemName" value="<s:property value="ItemName" />" />
<input type="hidden" name="ItemPrice" value="<s:property value="itemPrice" />" />
<input type="hidden" name="ItemStock" value="<s:property value="itemStock" />" />

<s:submit value="商品詳細"/>

</s:form>
</td>


</tr>
</s:iterator>

</table>

</body>
</html>