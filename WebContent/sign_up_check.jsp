
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html">
<html lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/main.css" type="text/css">
<link rel="stylesheet" href="css/createUser.css" type="text/css">
<title>UkiukiUtopia</title>
</head>
<body>
	<jsp:include page="base/main_header.jsp" flush="true" />
	<div class="container">

		<div class="create">

			<table>
				<tr>
					<th colspan="2">登録確認</th>
				</tr>
				<tr>
					<td>氏名：</td>
					<td>
						<!--Actionで返ってきた値を表示させる-->
					</td>
				</tr>
				<tr>
					<td>郵便番号：</td>
					<td></td>
				</tr>
				<tr>
					<td>都道府県：</td>
					<td></td>
				</tr>
				<tr>
					<td>市町村区：</td>
					<td></td>
				</tr>
				<tr>
					<td>番地：</td>
					<td></td>
				</tr>
				<tr>
					<td>建物名：</td>
					<td></td>
				</tr>
				<tr>
					<td>電話番号：</td>
					<td></td>
				</tr>
				<tr>
					<td>メールアドレス：</td>
					<td></td>
				</tr>
				<tr>
					<td>パスワード：</td>
					<td></td>
				</tr>

				<tr class="button">
					<td colspan="2"><input type="button" value=" 内容訂正 "
						onClick="history.back()"> 
						<a href="createUserComplete.html" target="_self">
							<input type=submit value=" 登録完了 ">
						</a>
					</td>
				</tr>
			</table>
		</div>
	</div>
	<jsp:include page="base/main_footer.jsp" flush="true" />
</body>
</html>