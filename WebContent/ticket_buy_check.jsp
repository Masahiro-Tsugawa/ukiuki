
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
<title>UkiukiUtopia</title>
</head>
<body>
	<jsp:include page="base/main_header.jsp" flush="true" />
	<div class="container">
		<p>チケット購入確認画面</p>

		<s:if test="true">
			<div class="box1">
				<table class="table-test">
					<tr>
						<th colspan="4"><div class="form-titel">施設利用券</div></th>
					</tr>
					<tr>
						<td>チケット名</td>
						<td>枚数</td>
						<td>単価</td>
						<td>小計</td>
					</tr>
					<s:iterator value="useList">
						<tr>
							<td><s:property value="ticketName" /></td>
							<td><s:property value="sheets" /></td>
							<td><s:property value="price" /></td>
							<td><s:property value="subtotal" /></td>
						</tr>
					</s:iterator>
				</table>
			</div>
		</s:if>

		<s:if test="true">
			<div class="box1">
				<table class="table-test">
					<tr>
						<th colspan="4"><div class="form-titel">オプション</div></th>
					</tr>
					<tr>
						<td>チケット名</td>
						<td>枚数</td>
						<td>単価</td>
						<td>小計</td>
					</tr>
					<s:iterator value="optionList">
						<tr>
							<td><s:property value="ticketName" /></td>
							<td><s:property value="sheets" /></td>
							<td><s:property value="price" /></td>
							<td><s:property value="subtotal" /></td>
						</tr>
					</s:iterator>
				</table>
			</div>
		</s:if>

		<div class="box1">
			<table class="table-test2">
				<tr>
					<th colspan="4"><div class="form-titel">合計</div></th>
				</tr>
				<tr>
					<td><s:property value="#session.buyTotal" />円</td>
				</tr>
			</table>
		</div>

		<div class="box1">
			<table class="table-test2">
				<tr>
					<th colspan="4"><div class="form-titel">お支払い情報</div></th>
				</tr>
				<tr><s:property value="#session.buyCardNumber" />
					<s:if test="%{#session.buyCardNumber!=null}">
						<td>クレジットカード</td>
						<td>下四桁<s:property value="#session.buyCordToken"/></td>
					</s:if>
					<s:else>
					 <td colspan="4">げんちな</td>
					</s:else>
				</tr>
			</table>
		</div>
		<s:form action="test">
		  <s:submit value="てｓｔ" />
		</s:form>
		<div align="center">
			<input type="button" value="キャンセル " onClick="history.back()">
			<s:form action="ticket_buy_check">
				<s:submit value="完了" />
			</s:form>
		</div>
	</div>
	<jsp:include page="base/main_footer.jsp" flush="true" />
</body>
</html>