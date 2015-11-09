<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="ja">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="css/main.css" type="text/css">
    
    <title>UkiukiUtopia 管理者画面</title>
</head>
<body>
    <jsp:include page="base/main_header.jsp" flush="true" />
    <div class="container">
    
		<div class="loginName">
			<s:form id="signin" class="navbar-form navbar-right" role="form" action="AdminLoginAction" method="post">
				<div class="input-group">
					<span class="input-group-addon">
					<i class="glyphicon glyphicon-user"></i>
					</span>
					<input id="id" type="text" class="form-control" name="id" value="" placeholder="id">
				</div>

				<div class="input-group">
					<span class="input-group-addon">
					<i class="glyphicon glyphicon-lock"></i>
					</span>
					<input id="password" type="password" class="form-control" name="password" value="" placeholder="Password">
				</div>

				<button type="submit" class="btn btn-primary">Login</button>
			</s:form>
			   <s:property value="admin_name"/>
		</div>
	
	

<br>

<!--情報入力のダイアログボックスを作る-->
<div class="admin">
  <s:form method="POST" action="">
   チケット購入情報確認

   
     チケット情報編集
     
       ユーザー情報編集
       
 結果表示スペース
   </s:form>
	</div>
	<div class="container">
    <jsp:include page="base/main_footer.jsp" flush="true" />
</body>
</html>