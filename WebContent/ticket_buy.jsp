<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html">
<html lang="ja">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>TicketBuy</title>
	
	<script src="js/jquery-1.11.3.min.js" type="text/javascript"></script>
	
	<script type="text/javascript">
	$(function() {
		$("#ticket").change(function(e){
			var subTotal = $(e.target).parent().prev().children().text() * $(e.target).val();
			$(e.target).parent().next().children().text(subTotal);
			totalAmount();
		});
		
		function totalAmount() {
			var total = 0;
			if($("#subTotal0").text()) total = total + parseInt($("#subTotal0").text());
			if($("#subTotal1").text()) total = total + parseInt($("#subTotal1").text());
			if($("#subTotal2").text()) total = total + parseInt($("#subTotal2").text());
			if($("#subTotal3").text()) total = total + parseInt($("#subTotal3").text());
			if($("#subTotal4").text()) total = total + parseInt($("#subTotal4").text());
			if($("#subTotal5").text()) total = total + parseInt($("#subTotal5").text());
			if($("#subTotal6").text()) total = total + parseInt($("#subTotal6").text());
			if($("#subTotal7").text()) total = total + parseInt($("#subTotal7").text());
			if($("#subTotal8").text()) total = total + parseInt($("#subTotal8").text());
			if($("#subTotal9").text()) total = total + parseInt($("#subTotal9").text());
			$("#total").text(total);
		}
	});
	</script>
</head>

<body>
<s:form action="create_order">
<s:if test="%{#session.errorMessege!=null}">
	<s:property value="#session.errorMessege"/>
</s:if>
<div id="ticket">
<%! int i = 0; %>
<h3>施設利用券</h3>
<table>
	<tr>
		<th>id</th>
		<th>name</th>
		<th>info</th>
		<th>price</th>
		<th>sheets</th>
		<th>total</th>
	</tr>
<s:iterator value="useList">
	<tr>
       	<td><s:property value="id"/><s:hidden value="%{id}" name="useId"></s:hidden></td>
       	<td><s:property value="name" /></td>
        <td><s:property value="info" /></td>
        <td><span id="price<%= i %>"><s:property value="price"/></span>円</td>
        <td><s:select id="sheets<%= i %>" list="sheetsList" name="useSheets"/></td>
        <td><span id="subTotal<%= i++ %>">0</span>円</td>	
	</tr>
</s:iterator>
</table>
<br>
<h3>オプション利用券</h3>
<table>
	<tr>
		
		<th>id</th>
		<th>name</th>
		<th>info</th>
		<th>price</th>
		<th>sheets</th>
		<th>total</th>
	</tr>
<s:iterator value="optionList">
	<tr>
       	<td><s:property value="id"/><s:hidden value="%{id}" name="optionId"></s:hidden></td>
       	<td><s:property value="name" /></td>
        <td><s:property value="info" /></td>
        <td><span id="price<%= i %>"><s:property value="price"/></span>円</td>
        <td><s:select id="sheets<%= i %>" list="sheetsList" name="optionSheets"/></td>
        <td><span id="subTotal<%= i++ %>">0</span>円</td>
	</tr>
</s:iterator>
</table>
</div>
<br>
<h3>合計：<span id="total">0</span>円</h3>
<br>
<h3>お支払い情報</h3>
<label><s:radio name="payInfo" list="payInfoList" value="radio"/></label>
<div>
<p>クレジットカード番号（「-」は除く）：<s:textfield name="creditNum"/></p>
<p>有効期限（月/年）：
	(月)
	<s:select id="month" list="monthList" name="creditMonth"/>
    (年)
    <s:select id="year" list="yearList" name="creditYear"/>
</p>
<p>セキュリティコード：<s:textfield name="secureCode"/></p>
</div>

<br>
<s:submit value="購入確認へ" />
</s:form>
<input type="button" value="戻る" onClick="history.back()">
</body>
</html>