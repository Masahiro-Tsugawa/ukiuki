<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<link rel="stylesheet" href="css/main.css" />
<div class="header">
	<a href="MainAction"><img src="img/ukiukilogo.png" alt="うきうきUtopia"></a>
	<s:if test="#session.userName != null">
		<div align="right">
			<span><s:property value="#session.userName" />様 </span> 
			<s:url id="home" action="home" />
			<s:a href="%{home}">[ログアウト]</s:a>
		</div>
	</s:if>
</div>