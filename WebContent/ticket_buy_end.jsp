<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html">
<html lang="ja">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>UkiukiUtopia</title>
     <link rel="stylesheet" href="css/mypage.css" type="text/css">
      <link rel="stylesheet" href="css/ticket_buy_end.css" type="text/css">
</head>
<body>
    <jsp:include page="base/main_header.jsp" flush="true" />
    <div class="container">
    <div class="form-chiket">
		<br></br><br></br><br></br>
		<br></br><div>購入完了しました。</div>
		<br></br>

	    <p>ご購入ありがとうございました。</p>
    <s:form action="my_page">
   		 <input type="submit" value="マイページに戻る">
    </s:form>
    <jsp:include page="base/main_footer.jsp" flush="true" />
    </div>

</body>
</html>