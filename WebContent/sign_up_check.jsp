
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
					<th colspan="2"><s:text name="signUpCheck.registrationContents" /></th>
				</tr>
				<tr>
					<td><s:text name="signUpCheck.name" />：</td>
					<td>
						<s:property value="#session.signUpName"/>
					</td>
				</tr>
				<tr>
					<td><s:text name="signUpCheck.email" />：</td>
					<td>
						<s:property value="#session.signUpEmail"/>
					</td>
				</tr>
				<tr>
					<td><s:text name="signUpCheck.password" />：</td>
					<td>
						<s:property value="#session.signUpPassword"/>
					</td>
				</tr>
				<tr>
					<td><s:text name="signUpCheck.posCode" />：</td>
					<td>
						<s:property value="#session.signUpPostalCode"/>
					</td>
				</tr>
				<tr>
					<td><s:text name="signUpCheck.address" />：</td>
					<td>
						<s:property value="#session.signUpAddress"/>
					</td>
				</tr>
				<tr>
					<td><s:text name="signUpCheck.phoneNumber" />：</td>
					<td>
						<s:property value="#session.signUpTelNum"/>
					</td>
				</tr>

				<tr class="button">
					<td colspan="2"><input type="button" value=<s:text name="signUpCheck.correction" />
						onClick="history.back()"> 
						<s:form action="register_user">
  							<s:submit value="%{getText('signUpCheck.completion')}" />
						</s:form>
					</td>
				</tr>
			</table>
		</div>
	</div>
</body>
	<jsp:include page="base/main_footer.jsp" flush="true" />
</html>