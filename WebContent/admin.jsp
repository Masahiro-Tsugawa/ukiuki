<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/main.css" type="text/css">

<title>UkiukiUtopia 管理者画面</title>
</head>
<body>
 <div id="header">
   <div id="header_left">
	  <a href="MainAction"><img align="left" src="img/logo.png" alt="うきうきUtopia"></img></a>
		<s:if test="#session.userName != null" ></s:if>
   </div>
   <div id="header_right" align="right">
		   <div class="loginName">
			<s:form id="signin" class="navbar-form navbar-right" role="form"
				action="AdminLoginAction" method="post">
				<div class="input-group">
					<span class="input-group-addon"> <i
						class="glyphicon glyphicon-user"></i>
					</span> <input id="name" type="text" class="form-control" name="name"
						placeholder="ユーザー名">
                 </div>

				<div class="input-group">
					<span class="input-group-addon"> <i
						class="glyphicon glyphicon-lock"></i>
					</span> <input id="password" type="password" class="form-control"
						name="password" placeholder="パスワード">
				</div>

				<button type="submit" class="btn btn-primary">Login</button>
			<s:property value="#session.name_key" />
			</s:form>
			
		</div>
		    
		    
		    <a href="LogoutAction">ログアウト</a>
		  </div>
		
	
  </div>
	<div class="container">

		

	

		<br>

		<!--情報入力のダイアログボックスを作る-->
	<%-- 	<div class="admin">

			<p>チケット購入情報確認</p>
			<s:form action=" ">
				<select name="year">
					<option value="null">--</option>
					<option value="2015">2015</option>
				</select> 年 <select name="month">
					<option value="null">--</option>
					<option value="01">01</option>
					<option value="02">02</option>
					<option value="03">03</option>
					<option value="04">04</option>
					<option value="05">05</option>
					<option value="06">06</option>
					<option value="07">07</option>
					<option value="08">08</option>
					<option value="09">09</option>
					<option value="10">10</option>
					<option value="11">11</option>
					<option value="12">12</option>
				</select> 月<select name="date">
					<option value="null">--</option>
					<option value="01">01</option>
					<option value="02">02</option>
					<option value="03">03</option>
					<option value="04">04</option>
					<option value="05">05</option>
					<option value="06">06</option>
					<option value="07">07</option>
					<option value="08">08</option>
					<option value="09">09</option>
					<option value="10">10</option>
					<option value="11">11</option>
					<option value="12">12</option>
					<option value="13">13</option>
					<option value="14">14</option>
					<option value="15">15</option>
					<option value="16">16</option>
					<option value="17">17</option>
					<option value="18">18</option>
					<option value="19">19</option>
					<option value="20">20</option>
					<option value="21">21</option>
					<option value="22">22</option>
					<option value="23">23</option>
					<option value="24">24</option>
					<option value="25">25</option>
					<option value="26">26</option>
					<option value="27">27</option>
					<option value="28">28</option>
					<option value="29">29</option>
					<option value="30">30</option>
					<option value="31">31</option>
				</select> 日 ～<select name="year">
					<option value="null">--</option>
					<option value="2015">2015</option>
				</select> 年 <select name="month">
					<option value="null">--</option>
					<option value="01">01</option>
					<option value="02">02</option>
					<option value="03">03</option>
					<option value="04">04</option>
					<option value="05">05</option>
					<option value="06">06</option>
					<option value="07">07</option>
					<option value="08">08</option>
					<option value="09">09</option>
					<option value="10">10</option>
					<option value="11">11</option>
					<option value="12">12</option>
				</select> 月<select name="date">
					<option value="null">--</option>
					<option value="01">01</option>
					<option value="02">02</option>
					<option value="03">03</option>
					<option value="04">04</option>
					<option value="05">05</option>
					<option value="06">06</option>
					<option value="07">07</option>
					<option value="08">08</option>
					<option value="09">09</option>
					<option value="10">10</option>
					<option value="11">11</option>
					<option value="12">12</option>
					<option value="13">13</option>
					<option value="14">14</option>
					<option value="15">15</option>
					<option value="16">16</option>
					<option value="17">17</option>
					<option value="18">18</option>
					<option value="19">19</option>
					<option value="20">20</option>
					<option value="21">21</option>
					<option value="22">22</option>
					<option value="23">23</option>
					<option value="24">24</option>
					<option value="25">25</option>
					<option value="26">26</option>
					<option value="27">27</option>
					<option value="28">28</option>
					<option value="29">29</option>
					<option value="30">30</option>
					<option value="31">31</option>
				</select> 日<input type="submit" value="検索">
			</s:form>

			<p>チケット情報編集</p>


			<p>ユーザー情報編集</p>
			<div class="user_info">
				<s:fielderror>
					<s:param value="%{'searchGoodsName'}" />
				</s:fielderror>
				<s:form action="  ">
					<p>
						<input type="text" name="searchGoodsName" value=""
							placeholder="ユーザー名" /> <input type="text" name="searchGoodsName"
							value=" placeholder=" ユーザーID" /> <input type="text"
							name="searchGoodsName" value=" placeholder=" 電話番号" /> <input
							type="submit" name="searchGoodsNameButton" value="検索" />
					</p>
				</s:form>
			</div>

			<div class="result">
				<p>結果表示スペース</p>
				<s:if
					test="%{ salesInformationList == null || salesInformationList.isEmpty()}">
		ここに検索結果が表示されます
		</s:if>
				<s:else>
					<table class="table_admin_sales">
						<tr>
							<td colspan="4">チケット購入情報</td>
						</tr>
						<tr>
							<td>注文ID</td>
							<td>チケットID</td>
							<td>枚数</td>
							<td>チケット合計金額</td>
						</tr>
						<s:iterator value="salesInformationList">
							<tr>
								<td><s:property value="order_id" /></td>
								<td><s:property value="ticket_id" /></td>
								<td><s:property value="sheets" /> 枚</td>
								<td><s:property value="total_amount" /> 円</td>
							</tr>
						</s:iterator>
					</table>

				</s:else>
			</div>

		</div>--%>

</body>
</html>