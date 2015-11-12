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
		   <s:actionerror />
		<s:fielderror>
			<s:param value="%{'adminId'}" />
		</s:fielderror>
		<s:fielderror>
			<s:param value="%{'adminPass'}" />
		</s:fielderror>
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

				<button type="submit" class="btn btn-primary">ログイン</button>
			<s:property value="#session.name_key" />
			</s:form>
			
		</div>
		    
		    
		    <a href="LogoutAction">ログアウト</a>
		  </div>
		
	
  </div>
	<div class="container">
	<p>管理者画面</p>
		<br>

		<!--情報入力のダイアログボックスを作る-->
	<div class="admin">

			<p>チケット購入情報検索</p>
			<s:form action=" ">
				<select name="year1">
					<option value="null">--</option>
					<option value="2015">2015</option>
				</select> 年 <select name="month1">
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
				</select> 月<select name="date1">
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
				</select> 日 ～<select name="year2">
					<option value="null">--</option>
					<option value="2015">2015</option>
				</select> 年 <select name="month2">
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
				</select> 月<select name="date2">
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
				</select> 日<input type="submit" value=" 検索 ">
			</s:form>

			<p>チケット検索<br>編集したいチケット名を入力して下さい</p>


			<p>ユーザー検索<br>編集したいユーザーのメールアドレスを入力して下さい</p>
			<div class="user_info">
				<s:fielderror>
					<s:param value="%{'searchGoodsName'}" />
				</s:fielderror>
				<s:form action="AdminUserSelectAction">
					<p>
						<s:textfield name="email" placeholder="ユーザーのメールアドレス" /><s:submit value=" 検索 " />
					</p>
					
				</s:form>
			</div>

			<div class="result">
			　<p>以下に検索結果が表示されます<br>チケット情報とユーザー情報の編集はここで行うことができます</p>
				<s:if
					test="%{ salesInformationList == null || salesInformationList.isEmpty()}"></s:if>
		
		          <%--チケット売り上げ --%>
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
				
				<%--ユーザー情報検索結果＆編集 --%>
				<s:form action="AdminUserSelectAction">
				<s:iterator value="userList" begin="0" end="0" step="1">

					 <table>
					   <tr>
					   <th colspan="2"><s:property value="name" />様の情報</th>
					   
					   </tr>
							<tr>
							    <td>メールアドレス</td>
								<td><s:property value="email" /></td>
						   </tr>
						   <tr>
						        <td>パスワード</td>
								<td><s:property value="password" /></td>
						   </tr>
						   <tr>
						        <td>ユーザー名</td>
								<td><s:property value="name" /></td>
						   </tr>
						   <tr>
						        <td>電話番号</td>
								<td><s:property value="telNum" /></td>
						   </tr>
						   <tr>
						        <td>郵便番号</td>
								<td><s:property value="postalCode" /></td>
						   </tr>
						   <tr>
						        <td>住所</td>
								<td><s:property value="address" /></td>
						   </tr>
						   <tr>
						        <td>更新日</td>
								<td><s:property value="renewDate" /></td>
						   </tr>
					 </table>
						</s:iterator>
				</s:form>
			</div>
			
<%-- 			<div class="update">
			 <s:form action="AdminUserUpdateAction">
			  <table>
			   <tr>
			    <th colspan="2">編集情報を入力</th>
			   </tr>
			   <tr>
			    <td colspan="2"><input id="updateemail" type="text" class="form-control" name="updateemail" placeholder="メールアドレス"></td>       
			   </tr>
			   <tr>
			    <td colspan="2"><input id="updatepassword" type="text" class="form-control" name="updatepassword" placeholder="パスワード"></td>
			   </tr>
			   <tr>
			    <td colspan="2"><input id="updatename" type="text" class="form-control" name="updatename" placeholder="ユーザー名"></td>
			   </tr>
			   <tr>
			    <td colspan="2"><input id="updatetelnum" type="text" class="form-control" name="updatetelnum" placeholder="電話番号"></td>
			   </tr>
			   <tr>
			    <td colspan="2"><input id="updatepostalcode" type="text" class="form-control" name="updatepostalcode" placeholder="郵便番号"></td>
			   </tr>
			   <tr>
			    <td colspan="2"><input id="updateaddress" type="text" class="form-control" name="updateaddress" placeholder="住所"></td>
			   </tr>
			   <tr>
			    <td colspan="2"><input id="updaterenewdate" type="text" class="form-control" name="updaterenewdate" placeholder="更新日"></td>
			   </tr>
			   <tr>
 			    <td><button type="submit"> 編集 </button></td>
			    
			   </tr>
			  </table>
			 </s:form>
			 --%>
			<s:form action="AdminUserDeleteAction">
			    <s:submit value="ユーザーを削除 "></s:submit>
		    </s:form>
            </div>
		</div>
		</div>

</body>
</html>