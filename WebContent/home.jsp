
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
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
<script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>
<script type="text/javascript" src="js/gmaps.js"></script>
<script>window.jQuery|| document.write('<script src="js/jquery-1.11.3.min.js"><\/script>')</script>
<script type="text/javascript" src="js/googleMapButton.js"></script>


</head>
<body>
	<jsp:include page="base/main_header.jsp" flush="true" />
	<div class="container">
		<div class="row">
			<div class="link">
				<div class="col-md-4">
					<div class="createUser">
						<h3>
							<s:text name="home.newSign" />
						</h3>
						<s:form action="GoCreateUser">
						<s:submit  class= "signUpButton"   value="%{getText('home.sign')}" />
						</s:form>
						<p class="new-comment">
						<h4>
							<s:text name="home.free" />
						</h4>
					</div>
				</div>
				<div class="col-md-4">
					<div class="loginUser">
						<h3>
							<s:text name="home.login" />
						</h3>
						<s:form action="HomeAction">
							<s:property value="getIdError()" />
							<br>
							<table>
								<tr>
									<td><label for="email">ID：</label><br><s:textfield label="ID" name="email" placeholder="%{getText('home.id')}" /></td>
								</tr>
								<tr>
									
									<td><label for="password">PASSWORD：</label><br><s:password label="パスワード" name="password" placeholder="%{getText('home.pass')}" /></td>
								</tr>
								<tr>
									<td>
										<s:submit class = "loginButton" value="%{getText('home.login')}" />
									</td>
								</tr>
								
							</table>
						</s:form>
						<p class="login-comment">
						<h4>
							<s:text name="home.already.member" />
						</h4>
						<br>
						

					</div>
				</div>
				<div class="col-md-4">
					<div class="oauthUser">
						<h3>
							<s:text name="home.snsAcount" />
						</h3>
						<!-- <a href="TwitterLogin" target="_self "><img src="img/Twitter.png" alt="twitterアカウントでログイン" class="tw"></a> -->
						<a href="FacebookLogin" target="_self "><img src="img/FB.png"
							alt="facebookアカウントでログイン" class="fb"></a> <a
							href="GoGoogleAction" target="_self "><img
							src="img/Google.png" alt="Google+アカウントでログイン" class="gg"></a>
						<p class="-comment">
						<h4>
							<s:text name="home.aikon" />
						</h4>
						<s:form action="HomeAction">
								<s:if test = "#session.OAuthName != null" > 
								 <tr>
									<td><label for="emailInput">メールアドレスを入力してください</label><br><s:textfield label="email" name="OAuthEmail" /></td>
									<s:submit value="%{getText('home.login')}" />
								</tr>
								</s:if>
								</s:form>
						<br>
					</div>
				</div>
				<div class="clear"></div>
			</div>

			<div id="howto">
				<h3>
					<s:text name="home.howTo" />
				</h3>
				<h4>
					<p>
						<s:text name="home.howToUse" />
					</p>
				</h4>
			</div>


			<div id="access">
				<h3>
					<s:text name="home.address" />
				</h3>
				<h4>
					<p>
						<s:text name="home.adress.description" />
						<br>
					</p>
				</h4>
				<input class = "googleMapButton" id="button01" type="button" value="MAP" />
				<div id="googleMap"></div>

			</div>
		</div>
</body>
<jsp:include page="base/main_footer.jsp" flush="true" />
</html>