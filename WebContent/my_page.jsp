
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html">
<html lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/mypage.css" type="text/css">
<title>UkiukiUtopia</title>
</head>
<body>
	<jsp:include page="base/main_header.jsp" flush="true" />
	<div class="container">
		<div class="form-title">

			<p class="p"><s:text name="MyPage.mayPage" /></p>
			<p>
				<s:text name="MyPage.hello" />
				<s:property value="#session.loginName" />
				<s:text name="MyPage.san" />
			</p>
			<table class="table-test">
				<tr>
					<th colspan="2"><div class="form-title"><s:text name="MyPage.yourInformation" /></div></th>
				</tr>
				
				<tr>
					<td align="center"><s:text name="signUpCheck.name" /></td>
					<td class="data"><s:property value="name" /></td>
				</tr>

				<tr>
					<td align="center"><s:text name="signUpCheck.phoneNumber" /></td>
					<td class="data"><s:property value="telNum" /></td>
				</tr>

				<tr>
					<td align="center"><s:text name="signUpCheck.email" /></td>
					<td class="data"><s:property value="email" /></td>
				</tr>

				<tr>
					<td align="center"><s:text name="signUpCheck.posCode" /></td>
					<td class="data"><s:property value="postalCode" /></td>
				</tr>

				<tr>
					<td align="center"><s:text name="signUpCheck.address" /></td>
					<td class="data"><s:property value="address" /></td>
				</tr>
			</table>
			
			<table class="table-test">
			    <tr>
				<th colspan="4"><div class="form-title"><s:text name="MyPage.ticketPurchaseHistory" /></div></th>
				</tr>
				
				<tr>
				    <td align="center"><s:text name="MyPage.ticketName" /></td>
				    <td align="center"><s:text name="MyPage.number" /></td>
				    <td align="center"><s:text name="MyPage.price" /></td>
				    <td align="center"><s:text name="MyPage.totalAmount" /></td>
				    
				</tr>
					<s:if test="%{historylList.get(0).sheets !=0}">

					<s:iterator value="historylList">
				<tr>
					    <td align="center"><s:property value="name" /></td>
					    <td align="center"><s:property value="sheets" /><s:text name="MyPage.number" /></td>
					    <td align="center"><s:property value="price" /><s:text name="MyPage.yen" /></td>
					    <td align="center"><s:property value="totalAmount" /><s:text name="MyPage.yen" /></td>
					</s:iterator>
				</s:if>
				<s:else>
				    <td align="center" colspan="4"><s:text name="MyPage.noHistory" /></td>
				</s:else>
				</tr>
				    
				
			</table>
			　　　　<s:form action="ticket_buy">
					<td colspan="2"><s:submit value="%{getText('MyPage.newPurchaseScreen')}" /></td>
				</s:form>
		</div>
	</div>
</body>
<jsp:include page="base/main_footer.jsp" flush="true" />
</html>