
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

			<p class="p">マイページ画面</p>
			<p>
				こんにちは、
				<s:property value="loginName" />
				さん。
			</p>
			<table class="table-test">
				<tr>
					<th colspan="2"><div class="form-title">個人情報一覧</div></th>
				</tr>
				
				<tr>
					<td align="center">名前</td>
					<td class="data"><s:property value="name" /></td>
				</tr>

				<tr>
					<td align="center">電話番号</td>
					<td class="data"><s:property value="telNum" /></td>
				</tr>

				<tr>
					<td align="center">メールアドレス</td>
					<td class="data"><s:property value="email" /></td>
				</tr>

				<tr>
					<td align="center">郵便番号</td>
					<td class="data"><s:property value="postalCode" /></td>
				</tr>

				<tr>
					<td align="center">住所</td>
					<td class="data"><s:property value="address" /></td>
				</tr>

				<s:form action="ticket_buy">
					<td colspan="2"><s:submit value="チケット新規購入画面へ" /></td>
				</s:form>

			</table>
			
			<table class="table-test">
			    <tr>
				<th colspan="4"><div class="form-title">購入履歴</div></th>
				</tr>
				
				<tr>
				    <td align="center">チケット名</td>
				    <td align="center">枚数</td>
				    <td align="center">単価</td>
				    <td align="center">合計金額</td>
				    
				</tr>
				<s:if test="%{historylList!=null}">
					<s:iterator value="historylList">
					<tr>
					    <td align="center"><s:property value="name" /></td>
					    <td align="center"><s:property value="sheets" />枚</td>
					    <td align="center"><s:property value="price" />円</td>
					    <td align="center"><s:property value="totalAmount" />円</td>
					</s:iterator>
				</s:if>
				<s:else>
				    <td align="center" colspan="4">購入履歴はありません。</td>
				</s:else>
				</tr>   
				
				
				
			</table>
		</div>
	</div>
</body>
<jsp:include page="base/main_footer.jsp" flush="true" />
</html>