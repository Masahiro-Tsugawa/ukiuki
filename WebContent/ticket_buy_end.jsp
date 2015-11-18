


<!--  
 * @author  Y.kawahigashi　
 * @version 1.1　　
 * @since 1.0　
 -->
 <!-- 文字コードの指定-->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html">
<html lang="ja">

<head>
<!--プロパティを取得-->
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
			<div><!-- ご購入ありがとうございました。-->
				<s:text name="Purchase.kawahigashi" />
			</div>
			<br>
			<br>
			<!--アクションに飛ばす-->
			<s:form action="pesonal"> 
			<!-- myページに戻る -->
				<s:submit value="%{getText('Transmission.kawahigshi')}" />
			</s:form>
		</div>
	</div>
</body>
		<jsp:include page="base/main_footer.jsp" flush="true" />
</html>