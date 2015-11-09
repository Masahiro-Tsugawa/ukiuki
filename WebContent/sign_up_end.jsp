
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
  		<h1>登録完了しました。</h1>
  		<s:form action="my_page">
  			<s:submit value="マイページへ" />
		</s:form>
		</div>
	</div>
    <jsp:include page="base/main_footer.jsp" flush="true" />
</body>
</html>