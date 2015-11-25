<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<link rel="stylesheet" href="css/main.css" />
<div class="header">
	<s:url id="home" action="home" />
	<s:a href="%{home}"><img src="img/ukiukilogo.png" alt="ukiukiUTOPIA"></s:a>
	<s:if test="#session.loginName != null">
		<div align="right">
			<span class = "loginName" ><s:property value="#session.loginName" />様 </span>
			<s:url id="home" action="home" />
			<s:a class = "logout" href="%{home}">ログアウト>></s:a>
		</div>
	</s:if>
</div>