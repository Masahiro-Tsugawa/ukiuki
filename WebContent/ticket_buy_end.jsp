
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html">
<html lang="ja">

<head>
<fmt:setLocale value="${pageContext.request.locale.language}" />
<fmt:setBundle
	basename="com.internousdev.ukiukiutopia.ticket.property.Ticket"
	var="lang" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>UkiukiUtopia</title>
<link rel="stylesheet" href="css/mypage.css" type="text/css">
<link rel="stylesheet" href="css/ticket_buy_end.css" type="text/css">
</head>
<body>
	<jsp:include page="base/main_header.jsp" flush="true" />
	<div class="container">
		<div class="form-chiket">
			<br>
			<br>
			<br> 
			<br>
			<div>
				<s:text name="Purchase.ticket_buy_end" />
			</div>
			<br>
			<br>
			<s:form action="my_page">
				<s:submit value="%{getText('Transmission.ticket_buy_end')}" />
			</s:form>
		</div>
	</div>
</body>
		<jsp:include page="base/main_footer.jsp" flush="true" />
</html>