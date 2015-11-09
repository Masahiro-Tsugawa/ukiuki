
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html">
<html lang="ja">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="css/main.css" type="text/css">
    <link rel="stylesheet" href="css/ticket_buy_end.css" type="text/css" media="all">
    <title>UkiukiUtopia</title>
</head>
<body>
    <jsp:include page="base/main_header.jsp" flush="true" />
	<div class="container">
	<div class="form-name">
    会員名:<s:property value="#session.name_key"></s:property><a href="" target="_self">[ログアウト]</a>
   </div>
    <div class="form-chiket">チケット購入完了画面
    <p>購入完了しました。</p>
    <a href="mypage.html"><input type="submit" value="マイページに戻る"></a>
  </div>
	</div>
    <jsp:include page="base/main_footer.jsp" flush="true" />
</body>
</html>