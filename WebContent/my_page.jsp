
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
					<th colspan="2">個人情報一覧</th>
				</tr>
				
				<tr>
					<td>名前：</td>
					<td class="data"><s:property value="name" /></td>
				</tr>

				<tr>
					<td>電話番号:</td>
					<td class="data"><s:property value="tel_num" /></td>
				</tr>

				<tr>
					<td>メールアドレス:</td>
					<td class="data"><s:property value="email" /></td>
				</tr>

				<tr>
					<td>郵便番号:</td>
					<td class="data"><s:property value="postal_code" /></td>
				</tr>

				<tr>
					<td>住所:</td>
					<td class="data"><s:property value="address" /></td>
				</tr>

				<s:form action="ticket_buy">
					<td colspan="2"><s:submit value="チケット新規購入画面へ" /></td>
				</s:form>

			</table>
			
	    <div>
			<table>
			    <tr>
				<th>購入履歴</th>
				</tr>
				
				<tr>
				    <td>チケット名</td>
				    <td>枚数</td>
				    <td>単価</td>
				    <td>合計金額</td>
				</tr>
				
			</table>
		</div>
		</div>
	</div>
	<jsp:include page="base/main_footer.jsp" flush="true" />
</body>
</html>