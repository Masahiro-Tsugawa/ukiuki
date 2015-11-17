
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html">
<html lang="ja">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="css/main.css" type="text/css">
    <link rel="stylesheet" href="css/signUpEnd.css" type="text/css">
    <title>UkiukiUtopia</title>
</head>
<body>
    <jsp:include page="base/main_header.jsp" flush="true" />
    <div class="container">
		<div class="create">
  		<h1><s:text name="signUpEnd.registeredCompleted" /></h1>
  		<s:form action="my_page">
  			<s:submit value="%{getText('signUpEnd.toMyPage')}" />
		</s:form>
		</div>
	</div>
</body>
	<jsp:include page="base/main_footer.jsp" flush="true" />
</html>