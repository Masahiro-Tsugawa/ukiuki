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
						<th colspan="2"><s:text name="signUp" /></th>
					</tr>

					<tr>
						<td><label for="userName1"><s:text name="surName" /> ：</label></td>
						<td><s:fielderror>
								<s:param value="%{'userName1'}" />
							</s:fielderror> <s:textfield name="userName1" placeholder="%{getText('surNamePH')}"
								maxlength="50" /></td>
					</tr>
					<tr>
						<td><label for="userName2"><s:text name="firstName" /> ：</label></td>
						<td><s:fielderror>
								<s:param value="%{'userName2'}" />
							</s:fielderror> <s:textfield name="userName2" placeholder="%{getText('firstNamePH')}"
								maxlength="50" /></td>
					</tr>

					<tr>
						<td><label for="userEmail"><s:text name="email" />：</label></td>
						<td class="errorMail"><s:property value="getErrorMail()" /><br>
							<s:fielderror>
								<s:param value="%{'userEmail'}" />
							</s:fielderror> <s:textfield name="userEmail" placeholder="%{getText('emailPH')}"
								maxlength="100" /></td>
					</tr>
					<tr>
						<td><label for="confirmUserEmail"><s:text name="confirmEmail" /> ：</label></td>
						<td><s:fielderror>
								<s:param value="%{'confirmaUserEmail'}" />
							</s:fielderror> <s:textfield name="confirmUserEmail" /></td>
					</tr>


					<tr>
						<td class="userPass"><label for="userPassword"><s:text name="password" /> ：</label></td>
						<td rowspan="2"><s:fielderror>
								<s:param value="%{'userPassword'}" />
							</s:fielderror> <s:password name="userPassword" maxlength="32" /></td>
					</tr>
					<tr>
					<td class="expPass"><s:text name="explorePassword"/></td>
					</tr>
					
					<tr>
						<td><label for="confirmUserEmail"><s:text name="confirmPassword" /> ：</label></td>
						<td><s:fielderror>
								<s:param value="%{'confirmUserPassword'}" />
							</s:fielderror> <s:password name="confirmUserPassword" maxlength="16" /></td>
					</tr>

					<tr>
						<td><label for="userPostalCode"><s:text name="postalCode" /> ：</label></td>
						<td><s:fielderror>
								<s:param value="%{'userPostalCode'}" />
							</s:fielderror> <s:textfield id="postcode" name="userPostalCode" maxlength="8"
								placeholder="%{getText('postalCodePH')}" /></td>
					</tr>

					<tr>
						<td><label for="userAddress1"><s:text name="prefecture" /> ：</label></td>
						<td><s:fielderror>
								<s:param value="%{'userAddress1'}" />
							</s:fielderror> <s:textfield label="都道府県" id="address1" name="userAddress1"
								placeholder="%{getText('prefecturePH')}" /></td>
					</tr>
					<tr>
						<td><label for="userAddress2"><s:text name="city" /> ：</label></td>
						<td><s:fielderror>
								<s:param value="%{'userAddress2'}" />
							</s:fielderror> <s:textfield label="市町村区番地" id="address2" name="userAddress2"
								placeholder="%{getText('cityPH')}" /></td>
					</tr>
					<tr>
						<td><label for="userAddress3"><s:text name="addressLine" /> ：</label></td>
						<td><s:textfield label="マンション等" name="userAddress3"
								placeholder="%{getText('addressLinePH')}" /></td>
					</tr>


					<tr>
						<td><label for="userTelNum"><s:text name="phoneNumber" /> ：</label></td>
						<td><s:fielderror>
								<s:param value="%{'userTelNum'}" />
							</s:fielderror> <s:textfield name="userTelNum" placeholder="%{getText('phoneNumberPH')}"
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