
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html">
<html lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/mypage.css" type="text/css">
<title>UkiukiUtopia</title>
</head>
<body>
	<jsp:include page="base/main_header.jsp" flush="true" />
	<div class="container">
		<div class="form-title">

			<p class="p">マイページ画面</p>
			<p>こんにちは、 <s:property value="#session.name_key"/> さん。</p>
			
			<s:property value="PersonalList" />
			
			
			<table class="table-test">
				<tr><th>購入履歴</th><th colspan="3">個人情報一覧</th></tr>
				<s:iterator value="PersonalList">
				<tr>
					<td><p></p></td>
					<td>名前:</td><td><s:property value="name" /></td>
					<td></td>
				</tr>

				</s:iterator>
				<tr>
					<td></td>
					<td></td>
					<td><p></p></td>
				</tr>
			</table>
				<!-- <td colspan="3"> -->
				<a href="chicketkounyu.html" target="_self "><input
						type="submit" value="チケット新規購入画面へ"></a><!-- </td> -->


		</div>
	</div>
	<jsp:include page="base/main_footer.jsp" flush="true" />
</body>
</html>