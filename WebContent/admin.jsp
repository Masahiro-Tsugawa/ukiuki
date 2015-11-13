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
					</span> <s:textfield id="name" type="text" class="form-control" name="name"
						placeholder="ユーザー名" />
                 </div>

				<div class="input-group">
					<span class="input-group-addon"> <i
						class="glyphicon glyphicon-lock"></i>
					</span> <s:textfield id="password" type="password" class="form-control"
						name="password" placeholder="パスワード" />
						
				</div>

				<s:submit class="btn btn-primary" value=" ログイン " />
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
			<s:form action="AdminBoughtAction">
			　<s:select list="#{0:'--',2015:'2015',2016:'2016'}" name="year1"></s:select>年
			
			 <s:select list="#{0:'--',1:'1',2:'2',3:'3',4:'4',5:'5',6:'6',7:'7',8:'8',9:'9',10:'10',11:'11',12:'12'}" name="month1"></s:select>月
			
			　<s:select list="#{0:'--',1:'1',2:'2',3:'3',4:'4',5:'5',6:'6',7:'7',8:'8',9:'9',10:'10',11:'11',12:'12',13:'13',14:'14',15:'15',16:'16',17:'17',18:'18',19:'19',20:'20',21:'21',22:'22',23:'23',24:'24',25:'25',26:'26',27:'27',28:'28',29:'29',30:'30',31:'31'}" name="date1"></s:select>日  ～ 
				
			 <s:select list="#{0:'--',2015:'2015',2016:'2016'}" name="year2"></s:select>年
			
			 <s:select list="#{0:'--',1:'1',2:'2',3:'3',4:'4',5:'5',6:'6',7:'7',8:'8',9:'9',10:'10',11:'11',12:'12'}" name="month2"></s:select>月
			
			　<s:select list="#{0:'--',1:'1',2:'2',3:'3',4:'4',5:'5',6:'6',7:'7',8:'8',9:'9',10:'10',11:'11',12:'12',13:'13',14:'14',15:'15',16:'16',17:'17',18:'18',19:'19',20:'20',21:'21',22:'22',23:'23',24:'24',25:'25',26:'26',27:'27',28:'28',29:'29',30:'30',31:'31'}" name="date2"></s:select>日
			<s:submit value=" 検索 " />
			</s:form>

			<p>チケット編集<br>まずボタンを押して下のスペースに表示される一覧を確認してください</p>
			 <div class="ticket_info">
				<s:fielderror>
					<s:param value="%{''}" />
				</s:fielderror>
				<s:form action="AdminTicketSelectAction">
					<p>
						<s:submit value=" チケット一覧表示　 " />
					</p>
					
				</s:form>
			</div>


			<p>ユーザー編集<br>編集したいユーザーのメールアドレスを入力して下さい</p>
			 <div class="user_info">
				<s:fielderror>
					<s:param value="%{''}" />
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
				
				<%--チケット情報検索結果＆編集 --%>
				<p>チケット一覧</p>
					 <table>
					   <tr>
					   <th>チケットID</th>
					   <th>チケット名</th>
					   <th>値段</th>
					   <th>チケット種類</th>
					   <th>販売確認</th>
					   <th>更新日</th>
					   </tr>
					   <s:form action="AdminTicketSelectAction">
				        <s:iterator value="ticketList" begin="0" end="0" step="1">
							<tr>
								<td><s:property value="id" /></td>
								<td><s:property value="name" /></td>
								<td><s:property value="price" /></td>
								<td><s:property value="tickettype" /></td>
								<td><s:property value="issale" /></td>
								<td><s:property value="renewdate" /></td>
							</tr>
						</s:iterator>
				       </s:form>
				       
				       <tr>
				        
				       </tr>
				       
					 </table>
			　</div>
			
 			<div class="updateticket">
			 <s:form action="AdminTicketUpdateAction">
			  <table>
			   <tr>
			    <th colspan="2">チケット情報の編集</th>
			   </tr>
			   <tr>
			    <td><s:textfield id="updateid" type="text" class="form-control" name="updateid" placeholder="変更したいIDを入力して下さい" /></td>
			   </tr>
			   <tr>
			    <td colspan="2"><s:textfield id="updatename" type="text" class="form-control" name="updatename" placeholder="チケット名" /></td>       
			   </tr>
			   <tr>
			    <td colspan="2"><s:textfield id="updateprice" type="text" class="form-control" name="updateprice" placeholder="値段"/></td>
			   </tr>
			   <tr>
			    <td colspan="2"><s:textfield id="updatetickettype" type="text" class="form-control" name="updatetickettype" placeholder="チケット種類" /></td>
			   </tr>
			   <tr>
			    <td colspan="2"><s:textfield id="updateissale" type="text" class="form-control" name="updateissale" placeholder="販売確認" /></td>
			   </tr>
			   <tr>
			    <td colspan="2"><s:textfield id="updaterenewdate" type="text" class="form-control" name="updaterenewdate" placeholder="更新日" /></td>
			   </tr>
			   <tr>
 			    <td><s:submit value="編集 "></s:submit></td>
			    
			   </tr>
			  </table>
			 </s:form>
			 
			<s:form action="AdminTicketDeleteAction">
			    <s:submit value="チケットを削除 "></s:submit>
		    </s:form>
            </div>
				
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
			
 			<div class="update">
			 <s:form action="AdminUserUpdateAction">
			  <table>
			   <tr>
			    <th colspan="2">編集情報を入力</th>
			   </tr>
			   <tr>
			    <td colspan="2"><s:textfield id="updateemail" type="text" class="form-control" name="updateemail" placeholder="メールアドレス" /></td>       
			   </tr>
			   <tr>
			    <td colspan="2"><s:textfield id="updatepassword" type="text" class="form-control" name="updatepassword" placeholder="パスワード" /></td>
			   </tr>
			   <tr>
			    <td colspan="2"><s:textfield id="updatename" type="text" class="form-control" name="updatename" placeholder="ユーザー名" /></td>
			   </tr>
			   <tr>
			    <td colspan="2"><s:textfield id="updatetelnum" type="text" class="form-control" name="updatetelnum" placeholder="電話番号" /></td>
			   </tr>
			   <tr>
			    <td colspan="2"><s:textfield id="updatepostalcode" type="text" class="form-control" name="updatepostalcode" placeholder="郵便番号" /></td>
			   </tr>
			   <tr>
			    <td colspan="2"><s:textfield id="updateaddress" type="text" class="form-control" name="updateaddress" placeholder="住所" /></td>
			   </tr>
			   <tr>
			    <td colspan="2"><s:textfield id="updaterenewdate" type="text" class="form-control" name="updaterenewdate" placeholder="更新日" /></td>
			   </tr>
			   <tr>
 			    <td><s:submit value="編集 "></s:submit></td>
			    
			   </tr>
			  </table>
			 </s:form>
			 
			<s:form action="AdminUserDeleteAction">
			    <s:submit value="ユーザーを削除 "></s:submit>
		    </s:form>
            </div>
		</div>


</body>
</html>