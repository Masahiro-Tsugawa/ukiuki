
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html">
<html lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/main.css" type="text/css">
<link rel="stylesheet" href="css/signUpCheck.css" type="text/css">
<title>UkiukiUtopia</title>
</head>
<body>
	<jsp:include page="base/main_header.jsp" flush="true" />
	<div class="container">

		<div class="create">

			<table>
				<tr>
					<th colspan="2">登録情報確認</th>
				</tr>
				<tr>
					<td>氏名：</td>
					<td>
						<s:property value="#session.signUpName"/>
					</td>
				</tr>
				<tr>
					<td>郵便番号：</td>
					<td>
						<s:property value="#session.signUpPostalCode"/>
					</td>
				</tr>
				<tr>
					<td>住所：</td>
					<td>
						<s:property value="#session.signUpAddress"/>
					</td>
				</tr>
				<tr>
					<td>電話番号：</td>
					<td>
						<s:property value="#session.signUpTelNum"/>
					</td>
				</tr>
				<tr>
					<td>メールアドレス：</td>
					<td>
						<s:property value="#session.signUpEmail"/>
					</td>
				</tr>
				<tr>
					<td>パスワード：</td>
					<td>
						<s:property value="#session.signUpPassword"/>
					</td>
				</tr>

				<tr class="button">
					<td colspan="2"><input type="button" value=" 内容訂正 "
						onClick="history.back()"> 
						<s:form action="register_user">
  							<s:submit value="確認" />
						</s:form>
					</td>
				</tr>
			</table>
		</div>
	</div>
	<jsp:include page="base/main_footer.jsp" flush="true" />
</body>
</html>