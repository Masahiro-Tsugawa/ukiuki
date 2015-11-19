<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html">
<html lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/main.css" type="text/css">
<link rel="stylesheet" href="css/ticket_buy.css" type="text/css">
<title>TicketBuy</title>

<script src="js/jquery-1.11.3.min.js" type="text/javascript"></script>

<script type="text/javascript">
	$(function() {
		$("#ticket").change(
				function(e) {
					var subTotal = $(e.target).parent().prev().children()
							.text()
							* $(e.target).val();
					$(e.target).parent().next().children().text(subTotal);
					totalAmount();
				});

		function totalAmount() {
			var total = 0;
			if ($("#subTotal0").text())
				total = total + parseInt($("#subTotal0").text());
			if ($("#subTotal1").text())
				total = total + parseInt($("#subTotal1").text());
			if ($("#subTotal2").text())
				total = total + parseInt($("#subTotal2").text());
			if ($("#subTotal3").text())
				total = total + parseInt($("#subTotal3").text());
			if ($("#subTotal4").text())
				total = total + parseInt($("#subTotal4").text());
			if ($("#subTotal5").text())
				total = total + parseInt($("#subTotal5").text());
			if ($("#subTotal6").text())
				total = total + parseInt($("#subTotal6").text());
			if ($("#subTotal7").text())
				total = total + parseInt($("#subTotal7").text());
			if ($("#subTotal8").text())
				total = total + parseInt($("#subTotal8").text());
			if ($("#subTotal9").text())
				total = total + parseInt($("#subTotal9").text());
			$("#total").text(total);
		}
	});
</script>
</head>

<body>
	<jsp:include page="base/main_header.jsp" flush="true" />

	<div class="container">
		<s:form action="create_order">
			<s:if test="%{#session.errorMessege!=null}">
				<s:property value="#session.errorMessege" />
			</s:if>
			<div id="ticket">
				<%!int i = 0;%>
				<table class="table-test">
					<tr>
						<th colspan="7"><div class="form-titel">施設利用券</div></th>
					</tr>
					<tr>
						<td colspan="1" align="center">id</td>
						<td colspan="2" align="center">name</td>
						<td colspan="1" align="center">info</td>
						<td colspan="1" align="center">price</td>
						<td colspan="1" align="center">sheets</td>
						<td colspan="1" align="center">total</td>
					</tr>
					<s:iterator value="useList">
						<tr>
							<td colspan="1" align="center"><s:property value="id" />
								<s:hidden value="%{id}" name="useId"></s:hidden></td>
							<td colspan="2" align="center"><s:property value="name" /></td>
							<td colspan="1" align="left"><s:property value="info" /></td>
							<td colspan="1" align="right"><span id="price<%=i%>"><s:property
										value="price" /></span>円</td>
							<td colspan="1" align="right"><s:select id="sheets<%=i%>"
									list="sheetsList" name="useSheets" /></td>
							<td colspan="1" align="right"><span id="subTotal<%=i++%>">0</span>円</td>
						</tr>
					</s:iterator>
				</table>
				<br>
				<table class="table-test">
					<tr>
						<th colspan="7"><div class="form-titel">オプション</div></th>
					</tr>
					<tr>
						<td colspan="1" align="center">id</td>
						<td colspan="2" align="center">name</td>
						<td colspan="1" align="center">info</td>
						<td colspan="1" align="center">price</td>
						<td colspan="1" align="center">sheets</td>
						<td colspan="1" align="center">total</td>
					</tr>
					<s:iterator value="optionList">
						<tr>
							<td colspan="1" align="center"><s:property value="id" />
								<s:hidden value="%{id}" name="optionId"></s:hidden></td>
							<td colspan="2" align="center"><s:property value="name" /></td>
							<td colspan="1" align="left"><s:property value="info" /></td>
							<td colspan="1" align="right"><span id="price<%=i%>"><s:property
										value="price" /></span>円</td>
							<td colspan="1" align="right"><s:select id="sheets<%=i%>"
									list="sheetsList" name="optionSheets" /></td>
							<td colspan="1" align="right"><span id="subTotal<%=i++%>">0</span>円</td>
						</tr>
					</s:iterator>
				</table>
			</div>

			<br>
			<table align="right" class="table-test3">
				<tr>
					<th><div class="form-titel">合計</div></th>
				</tr>
				<tr>
					<td><span id="total">0</span>円</td>
				</tr>

			</table>
            <br>
            <table class=box1>
            </table>
			<table align="right" class="table-test3">
				<tr>
					<th colspan="2"><div class="form-titel">お支払い情報</div></th>
				</tr>
				
				<tr>
					<td colspan="2"><label><s:radio name="payInfo" list="payInfoList"
								value="radio" /></label></td>
				</tr>
				
                <tr>
					<td colspan="1">クレジットカード番号（「-」は除く）：</td>
					<td class="data"><s:textfield name="creditNum" /></td>
				</tr>
				
				<tr>
					<td colspan="1">有効期限（月/年）：</td>
					<td class="data">
					 (月)<s:select id="month" list="monthList" name="creditMonth" />
				     (年)<s:select id="year" list="yearList" name="creditYear" />
					</td>
				</tr>
				
				<tr>
					<td colspan="1">セキュリティコード：</td>
					<td class="data"><s:textfield name="secureCode" /></td>
				</tr>
			</table>
			
			<div class="form-titel"><s:submit value="購入確認へ" /></div>
		</s:form>
		<div class="form-titel"><input type="button" value="戻る" onClick="history.back()"></div>
	</div>
</body>
<jsp:include page="base/main_footer.jsp" flush="true" />
</html>