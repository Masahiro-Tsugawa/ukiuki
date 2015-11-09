
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html">
<html lang="ja">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="css/main.css" type="text/css">
    <title>UkiukiUtopia</title>
</head>
<body>
    <jsp:include page="base/main_header.jsp" flush="true" />
    <div class="container">
     <div class="form-title">

			<p class="p">マイページ画面</p>
			<p>こんにちは、<s:property value="#session.name_key"/>さん。</p>
			<table class="table-test">
				<tr>
					<th>購入履歴</th>
					<th colspan="3">個人情報一覧</th>
				</tr>

				<tr>
					<td>
						<p></p>
					</td>
					<td>名前:<s:property value="#session.name_key"/></td>
					<td></td>
				</tr>

				<tr>
					<td></td>
					<td>電話番号:<s:property value="#session.telnumber_key"/></td>
					<td></td>
				</tr>

				<tr>
					<td></td>
					<td>メールアドレス:<s:property value="#session.email_key"/></td>
					<td></td>
				</tr>

				<tr>
					<td></td>
					<td>郵便番号:<s:property value="#session.postal_key"/></td>
					<td></td>
				</tr>

				<tr>
					<td></td>
					<td>住所:<s:property value="#session.address_key"/></td>
					<td></td>
				</tr>

				<tr>
					<td></td>
					<td></td>
					<td>
						<p></p>
					</td>
				</tr>
            
				<td colspan="3"><a href="chicketkounyu.html" target="_self "><input
						type="submit" value="チケット新規購入画面へ"></a></td>
			</table>
            </div>
	</div>
    <jsp:include page="base/main_footer.jsp" flush="true" />
</body>
</html>