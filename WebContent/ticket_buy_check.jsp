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
		<p align="center"><s:text name="ticketBuyCheckScr" />
</p>
		<s:if test="%{#session.buyUseTicket!=null}">
			<div class="box1">
			<table class="table-test">
				<tr>
				<th colspan="4"><div class="form-titel"><s:text name="facilitiesUseTicket" /></div></th>
				</tr>
				<tr>
					<td align="center"><s:text name="ticketName" /></td>
					<td align="center"><s:text name="number" /></td>
					<td align="center"><s:text name="unitPrice" /></td>
					<td align="center"><s:text name="subtotal" /></td>
				</tr>
			<s:iterator value="%{#session.buyUseTicket}">
				<tr>
					<td align="center"><s:property value="name" /></td>
					<td align="right"><s:property value="sheets" /><s:text name="sheets" /></td>
					<td align="right"><s:property value="price" /><s:text name="yen" /></td>
					<td align="right"><s:property value="subTotal" /><s:text name="yen" /></td>
				</tr>
			</s:iterator>
			</table>
			</div>
		</s:if>

		<s:if test="%{#session.buyOptionTicket!=null}">
			<div class="box1">
			<table class="table-test">
				<tr>
				<th colspan="4"><div class="form-titel"><s:text name="optionTicket" /></div></th>
				</tr>
				<tr>
					<td align="center"><s:text name="ticketName" /></td>
					<td align="center"><s:text name="number" /></td>
					<td align="center"><s:text name="unitPrice" /></td>
					<td align="center"><s:text name="subtotal" /></td>
				</tr>
			<s:iterator value="%{#session.buyOptionTicket}">
				<tr>
					<td align="center"><s:property value="name" /></td>
					<td align="right"><s:property value="sheets" /><s:text name="sheets" /></td>
					<td align="right"><s:property value="price" /><s:text name="yen" /></td>
					<td align="right"><s:property value="subTotal" /><s:text name="yen" /></td>				
				</tr>
			</s:iterator>
			</table>
			</div>
		</s:if>

		<div class="box1">
			<table class="table-test2">
				<tr>
				<th colspan="4"><div class="form-titel"><s:text name="total" /></div></th>
				</tr>
				<tr>
					<td><s:property value="#session.buyTotal" /><s:text name="yen" /></td>
				</tr>
			</table>
		</div>

		<div class="box1">
			<table class="table-test">
				<tr>
				<th colspan="4"><div class="form-titel"><s:text name="payInfo" /></div></th>
				</tr>
				<tr>
				<s:if test="%{#session.buyCardNumber!=null}">
					<td colspan="2"><s:text name="cordMessage" /></td>
		　			<td colspan="2"><s:text name="underFourDigits" /> <s:property value="#session.buyCardNumber" /></td>
				</s:if>
				<s:else>
					 <td colspan="４"><s:text name="cashMessage" /></td>
				</s:else>
				</tr>
			</table>
		</div>
	
		 <div align="center">
		 	<s:form action="ticket_buy">
				<s:submit value="%{getText('cancel')}" />
			</s:form>
			<s:form action="check_end">
				<s:submit value="%{getText('completion')}" />
			</s:form>
		</div>
	</div>
</body>
	<jsp:include page="base/main_footer.jsp" flush="true" />
</html>
		