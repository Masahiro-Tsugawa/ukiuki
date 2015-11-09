<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<head>
 <link rel="stylesheet" href="css/main.css" type="text/css">
  <link href="css/bootstrap.min.css" rel="stylesheet">
 
  <title>うきうきUtopia HOME</title>
  
  <script type="text/javascript" src="js/bootstrap.min.js"></script>
  
  </head>
<body>

  
   <div id="header">
    <div id="header_left">
	  <a href="MainAction"><img align="left" src="img/logo.png" alt="うきうきUtopia"></img></a>
		<s:if test="#session.userName != null" >
		  <div id="header_right" align="right">
		    <span><s:property value="#session.userName"/>様　　</span>
		    <a href="LogoutAction">ログアウト</a>
		  </div>
		</s:if>
	</div>
  </div>