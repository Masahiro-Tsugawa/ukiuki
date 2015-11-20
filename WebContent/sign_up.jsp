<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html">
<html lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
<link rel="stylesheet" href="css/main.css" type="text/css">
<link rel="stylesheet" href="css/createUser.css" type="text/css">
<title>UkiukiUtopia</title>
</head>
<body>
	<jsp:include page="base/main_header.jsp" flush="true" />
	<div class="container">
		<script src="js/jquery-1.11.3.min.js" type="text/javascript"></script>
		<script src="//jpostal.googlecode.com/svn/trunk/jquery.jpostal.js"
			type="text/javascript"></script>
		<script src="js/postCode.js" type="text/javascript"></script>
		<div class="create">
			<s:form action="CreateUserAction">
				<table class="table table-striped">
					<thead>
						<tr>
							<th class="signUp" colspan="2"><s:text name="signUp.signUp" /></th>
						</tr>
					</thead>

					<tbody>
						<tr>
							<td><label for="userNameSurName"><s:text
										name="signUp.surName" /> ：</label></td>
							<td><s:fielderror>
									<s:param value="%{'userNameSurName'}" />
								</s:fielderror> <s:textfield name="userNameSurName"
									placeholder="%{getText('signUp.surNamePH')}" maxlength="50" /></td>
						</tr>
						<tr>
							<td><label for="userNameFirstName"><s:text
										name="signUp.firstName" /> ：</label></td>
							<td><s:fielderror>
									<s:param value="%{'userNameFirstName'}" />
								</s:fielderror> <s:textfield name="userNameFirstName"
									placeholder="%{getText('signUp.firstNamePH')}" maxlength="50" /></td>
						</tr>

						<tr>
							<td><label for="userEmail"><s:text
										name="signUp.email" />：</label></td>
							<td class=><div class="errorMail"><s:property value="getErrorMail()" /></div><br>
								<s:fielderror>
									<s:param value="%{'userEmail'}" />
								</s:fielderror> <s:textfield name="userEmail"
									placeholder="%{getText('signUp.emailPH')}" maxlength="100" /></td>
						</tr>
						<tr>
							<td><label for="confirmUserEmail"><s:text
										name="signUp.confirmEmail" /> ：</label></td>
							<td><s:fielderror>
									<s:param value="%{'confirmaUserEmail'}" />
								</s:fielderror> <s:textfield name="confirmUserEmail" /></td>
						</tr>


						<tr>
							<td><label for="userPassword"><s:text
										name="signUp.password" /> ：</label><br>
								<div class="expPass">
									<s:text name="signUp.explorePassword" />
								</div></td>
							<td><s:fielderror>
									<s:param value="%{'userPassword'}" />
								</s:fielderror> <s:password name="userPassword" maxlength="32" /></td>
						</tr>


						<tr>
							<td><label for="confirmUserEmail"><s:text
										name="signUp.confirmPassword" /> ：</label></td>
							<td><s:fielderror>
									<s:param value="%{'confirmUserPassword'}" />
								</s:fielderror> <s:password name="confirmUserPassword" maxlength="16" /></td>
						</tr>

						<tr>
							<td><label for="userPostalCode"><s:text
										name="signUp.postalCode" /> ：</label></td>
							<td><s:fielderror>
									<s:param value="%{'userPostalCode'}" />
								</s:fielderror> <s:textfield id="postcode" name="userPostalCode" maxlength="8"
									placeholder="%{getText('signUp.postalCodePH')}" /></td>
						</tr>

						<tr>
							<td><label for="userAddressPrefecture"><s:text
										name="signUp.prefecture" /> ：</label></td>
							<td><s:fielderror>
									<s:param value="%{'userAddressPrefecture'}" />
								</s:fielderror> <s:textfield id="addressPrefecture" name="userAddressPrefecture"
									placeholder="%{getText('signUp.prefecturePH')}" /></td>
						</tr>
						<tr>
							<td><label for="userAddressCity"><s:text
										name="signUp.city" /> ：</label></td>
							<td><s:fielderror>
									<s:param value="%{'userAddressCity'}" />
								</s:fielderror> <s:textfield id="addressCity" name="userAddressCity"
									placeholder="%{getText('signUp.cityPH')}" /></td>
						</tr>
						<tr>
							<td><label for="userAddressOther"><s:text
										name="signUp.addressLine" /> ：</label></td>
							<td><s:textfield label="マンション等" name="userAddressOther"
									placeholder="%{getText('signUp.addressLinePH')}" /></td>
						</tr>


						<tr>
							<td><label for="userTelNum"><s:text
										name="signUp.phoneNumber" /> ：</label></td>
							<td><s:fielderror>
									<s:param value="%{'userTelNum'}" />
								</s:fielderror> <s:textfield name="userTelNum"
									placeholder="%{getText('signUp.phoneNumberPH')}" maxlength="13" /></td>
						</tr>

						<tr>
							<td colspan="2" class="button"><s:submit
									value="%{getText('signUp.checkButton')}" /></td>
						</tr>
					</tbody>
				</table>
			</s:form>
		</div>
	</div>
</body>
<jsp:include page="base/main_footer.jsp" flush="true" />
</html>