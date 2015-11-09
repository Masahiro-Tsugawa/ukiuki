
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
			<div class="create">
			<s:form action="CreateUserAction">
				<table>
					<tr>
						<th colspan="3">新規登録</th>
					</tr>
					<tr>
						<td colspan="2"><s:textfield label="氏名" name="userName"
								placeholder="記入例　加藤　太郎" /></td>
					</tr>
					<tr>
						<td colspan="3">住所の入力をお願いします</td>
					</tr>

					<tr>
						<td colspan="2"><s:textfield label="メールアドレス" name="userEmail"
								placeholder="記入例　abcd@efg.com" /></td>
					</tr>


					<tr>
						<td colspan="2"><s:textfield label="パスワード"
								name="userPassword" /></td>
					</tr>




					<tr>
						<td colspan="2"><s:textfield label="郵便番号"
								name="userPostalCode" placeholder="記入例 1234567" /></td>
					</tr>


					<tr>
						<td colspan="2"><s:textfield label="都道府県" name="userAdress1"
								placeholder="記入例　東京都" /></td>
					</tr>
					<tr>

						<td colspan="2"><s:textfield label="市町村区番地"
								name="userAdress2" placeholder="記入例　千代田区霞ヶ関3-6-15" /></td>
					</tr>
					<tr>
						<td colspan="2"><s:textfield label="マンション等"
								name="userAdress3" placeholder="記入例　なんとかビル" /></td>
					</tr>

					<tr>
						<td colspan="2"><s:textfield label="電話番号" name="userTelNum"
								placeholder="記入例 00-0000-0000" /></td>
					</tr>


					<tr>
						<td colspan="3"><s:submit value="確認" /></td>
					</tr>
				</table>

			</s:form>
		</div>
	</div>
    <jsp:include page="base/main_footer.jsp" flush="true" />
</body>
</html>