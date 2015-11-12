
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="css/main.css" type="text/css">
    <link rel="stylesheet" href="css/home.css" type="text/css">
    <link rel="stylesheet" href="css/main.css" type="text/css"> 
    <script type="text/javascript"
	src="http://maps.google.com/maps/api/js?sensor=true"></script>
<script type="text/javascript" src="jquery-1.11.3.min.js"></script>
<script type="text/javascript" src="gmaps.js"></script>
<script type="text/javascript">
	var map;
	$(document).ready(function() {
		map = new GMaps({
			div : '#map',
			lat : 35.703750,
			lng : 139.767145,
			zoom : 19
		});
	});
</script> 
<style type="text/css">
<!--
.errorMessage {
	color: red;
}
-->
</style>

</head>
<header class="header">

   <!--  	<link href="css/bootstrap.min.css" rel="stylesheet"> -->
	<fmt:setLocale value="${pageContext.request.locale.language}" />
	<fmt:setBundle basename="com.internousdev.ukiukiutopia.properties.LoginAction" var="lang" />
	<!-- <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  -->
	<!-- CSSファイルを読み込ませて色や配置を指定する -->
	<!-- (CSSであることを示す)" --><!-- （読み込ませたいCSSファイルの指定） --><!-- MIMEタイプというWeb界の拡張子のようなもの　今回はCSSを指定している -->
	<!-- <link rel="stylesheet" href="css/main.css" type="text/css">
	<link rel="stylesheet" href="css/home.css" type="text/css">  -->
	<!--タイトルを付けている　タブに表示され、検索エンジンで重要なキーワードと認識される+国際化-->  
	<!-- <title><fmt:message key="title" bundle="${lang}" /></title>
	<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
	<script type="text/javascript" src="./footerFixed.js"></script> -->
</header>
<body>
    <jsp:include page="base/main_header.jsp" flush="true" />
    <div class="container">
	<div class="row">
  	<div class="link">
   	<div class="col-md-4">
   	<div class="createUser">
   		<h3><fmt:message key="newSign" bundle="${lang}" /></h3>
 		<a class="new" href="http://localhost:8080/ukiukiutopia/sign_up.jsp"><fmt:message key="sign" bundle="${lang}" /></a>
 		<p class="new-comment"><h4><fmt:message key="free" bundle="${lang}" /></h4>
   	</div>
  	</div>

	<div class="col-md-4">
 	<div class="loginUser">
 		<h3><fmt:message key="login" bundle="${lang}" /></h3>
	<s:form action="HomeAction">
	<s:property value = "getIdError()"/><br>
		<s:textfield label="ユーザー名" name="id" />
		
        <s:password label="パスワード" name="password"/>
        <s:submit value="ログイン"></s:submit>
    </s:form>
        <p class="login-comment"><h4><fmt:message key="mouMember" bundle="${lang}" /></h4><br></p>
　	
	</div>
	</div>
 
 	<div class="col-md-4">
	<div class="oauthUser">
	 	<h3><fmt:message key="snsAcount" bundle="${lang}" /></h3>
 		<a href="TwitterLogin" target="_self "><img src="img/Twitter.png" alt="twitterアカウントでログイン" class="tw"></a>
 		<a href="FacebookLogin" target="_self "><img src="img/FB.png" alt="facebookアカウントでログイン" class="fb"></a>
 		<a href="GoGoogleAction" target="_self "><img src="img/Google.png" alt="Google+アカウントでログイン" class="gg"></a>
 		<p  class="-comment"><h4><fmt:message key="aikon" bundle="${lang}" /></h4><br></p>
 	</div>
	</div>
 
 	<div class="clear">
 	</div>
	</div>

	<div id="howto">
  		<h3><fmt:message key="howTo" bundle="${lang}" /></h3>
  		<h4><p><fmt:message key="howToUse" bundle="${lang}" /></p></h4>
	</div>


	<div id="access">
		<h3><fmt:message key="jyusyo" bundle="${lang}" /></h3>
  		<h4><p><fmt:message key="jyusyoS" bundle="${lang}" /><br></p></h4>
	
	<iframe
	    <fmt:message key="map" bundle="${lang}" />
		src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3239.9132982562437!2d139.76492981508756!3d35.70375113634421!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x60188c18b82a5b79%3A0xf4b11fd9c5add54c!2z44CSMTEzLTAwMzQg5p2x5Lqs6YO95paH5Lqs5Yy65rmv5bO277yT5LiB55uu77yS4oiS77yR77ySIOW-oeiMtuODjuawtOWkqeelnuODk-ODqw!5e0!3m2!1sja!2sjp!4v1446693417087"
		width="400" height="300" style="border: 0"><!--frameborder="0" 属性 allowfullscreen -->
    </iframe>
	
	</div>
	
	
	
	
	
	
	
	</div>
    <jsp:include page="base/main_footer.jsp" flush="true" />
</body>
</html>