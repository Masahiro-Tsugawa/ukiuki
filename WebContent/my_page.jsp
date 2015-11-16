
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
			<p>こんにちは、 <s:property value="#session_loginName"/> さん。</p>
			<table class="table-test">
				<tr>
					<th colspan="2">個人情報一覧</th>
				</tr>
				<s:iterator value="PersonalList">
				<tr>
					<td>名前：</td>
					<td><s:property value="name" /></td>
				</tr>

				<tr>
					<td></td>
					<td>電話番号:</td><td><s:property value="tel_num" /></td>
					<td></td>
				</tr>

				<tr>
					<td></td>
					<td>メールアドレス:</td>
					<td><s:property value="email" /></td>
					<td></td>
				</tr>

				<tr>
					<td></td>
					<td>郵便番号:</td>
					<td><s:property value="postal_code" /></td>
					<td></td>
				</tr>

				<tr>
					<td></td>
					<td>住所:</td>
					<td><s:property value="address" /></td>
					<td></td>
				</tr>
				</s:iterator>
				<tr>
					<td></td>
					<td></td>
					<td></td>
				</tr>

				<s:form action = "ticket_buy"><td colspan="3">
						 <s:submit value="チケット新規購入画面へ"/></td></s:form>

			</table>
			<table>
			    <th>購入履歴</th>
			</table>
		</div>
	</div>
	<jsp:include page="base/main_footer.jsp" flush="true" />
</body>
</html>