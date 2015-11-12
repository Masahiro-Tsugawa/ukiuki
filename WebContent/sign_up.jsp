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
		<script src="jquery-1.11.3.min.js" type="text/javascript"></script>
		<script src="//jpostal.googlecode.com/svn/trunk/jquery.jpostal.js"
			type="text/javascript"></script>
		<script src="postCode.js" type="text/javascript"></script>
		<div class="create">
			<s:form action="CreateUserAction">
				<table>
					<tr>
						<th colspan="2">新規登録</th>
					</tr>

					<tr>
						<td><label for="userName1">性 ：</label></td>
						<td><s:fielderror>
								<s:param value="%{'userName1'}" />
							</s:fielderror> <s:textfield name="userName1" placeholder="記入例　加藤"
								maxlength="50" /></td>
					</tr>
					<tr>
						<td><label for="userName2">名 ：</label></td>
						<td><s:fielderror>
								<s:param value="%{'userName2'}" />
							</s:fielderror> <s:textfield name="userName2" placeholder="記入例　太郎"
								maxlength="50" /></td>
					</tr>

					<tr>
						<td><label for="userEmail">メールアドレス (ID)：</label></td>
						<td class="errorMail"><s:property value="getErrorMail()" /><br>
							<s:fielderror>
								<s:param value="%{'userEmail'}" />
							</s:fielderror> <s:textfield name="userEmail" placeholder="記入例　abcd@efg.com"
								maxlength="100" /></td>
					</tr>
					<tr>
						<td><label for="confirmUserEmail">メールアドレス（確認） ：</label></td>
						<td><s:fielderror>
								<s:param value="%{'confirmaUserEmail'}" />
							</s:fielderror> <s:textfield name="confirmUserEmail" /></td>
					</tr>


					<tr>
						<td><label for="userPassword">パスワード（半角英数8～32字） ：</label></td>
						<td><s:fielderror>
								<s:param value="%{'userPassword'}" />
							</s:fielderror> <s:password name="userPassword" maxlength="32" /></td>
					</tr>
					<tr>
						<td><label for="confirmUserEmail">パスワード（確認） ：</label></td>
						<td><s:fielderror>
								<s:param value="%{'confirmUserPassword'}" />
							</s:fielderror> <s:password name="confirmUserPassword" maxlength="16" /></td>
					</tr>

					<tr>
						<td><label for="userPostalCode">郵便番号(「-」必須) ：</label></td>
						<td><s:fielderror>
								<s:param value="%{'userPostalCode'}" />
							</s:fielderror> <s:textfield id="postcode" name="userPostalCode" maxlength="8"
								placeholder="記入例　100-0013" /></td>
					</tr>

					<tr>
						<td><label for="userAddress1">都道府県 ：</label></td>
						<td><s:fielderror>
								<s:param value="%{'userAddress1'}" />
							</s:fielderror> <s:textfield label="都道府県" id="address1" name="userAddress1"
								placeholder="記入例　東京都" /></td>
					</tr>
					<tr>
						<td><label for="userAddress2">市町村区番地 ：</label></td>
						<td><s:fielderror>
								<s:param value="%{'userAddress2'}" />
							</s:fielderror> <s:textfield label="市町村区番地" id="address2" name="userAddress2"
								placeholder="記入例　千代田区霞ヶ関3-6-15" /></td>
					</tr>
					<tr>
						<td><label for="userAddress3">マンション等 ：</label></td>
						<td><s:textfield label="マンション等" name="userAddress3"
								placeholder="記入例　霞ヶ関MH タワーズ7F" /></td>
					</tr>


					<tr>
						<td><label for="userTelNum">電話番号(「-」必須) ：</label></td>
						<td><s:fielderror>
								<s:param value="%{'userTelNum'}" />
							</s:fielderror> <s:textfield name="userTelNum" placeholder="記入例 00-0000-0000"
								maxlength="13" /></td>
					</tr>

					<tr>
						<td colspan="2" class="button"><s:submit value="確認" /></td>
					</tr>
				</table>
			</s:form>
		</div>
	</div>
	<jsp:include page="base/main_footer.jsp" flush="true" />
</body>
</html>