<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/main.css" type="text/css">
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
<link rel="stylesheet" href="css/admin.css" type="text/css">

<title>UkiukiUtopia 管理者画面</title>
</head>
<body>
 <div id="header">
   <div id="header_left">
	  <a href="MainAction"><img align="left" src="img/logo.png" alt="うきうきUtopia"></img></a>
		
   </div>
   
   <div id="header_right" align="right">
   
 <%--  <s:if test="#session.name_key == null" >
 --%>   
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
					<s:textfield id="name" type="text" class="form-control" name="Name"
						placeholder="ユーザー名" />
                 </div>

				<div class="input-group">
					<s:textfield id="password" type="password" class="form-control"
						name="password" placeholder="パスワード" />
						
				</div>

				<s:submit class="btn btn-primary" value=" ログイン " />
			<s:property value="#session.name_key" />
		</s:form>
		  
		</div>
		
		<%-- 	 </s:if>--%>
	</div>
	
  </div>
  
 <%-- <s:else>  --%>
	<div class="container">
	 <s:a class="logout" href="%{LogoutAction}">ログアウト</s:a>
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
				
				<s:form action="AdminTicketSelectAction">
					<p>
						<s:submit value=" チケット一覧表示　 " />
					</p>
					
				</s:form>
			</div>


			<p>ユーザー編集<br>編集したいユーザーのメールアドレスを入力して下さい</p>
			 <div class="user_info">
				
				<s:form action="AdminUserSelectAction">
					<p>
						<s:textfield name="selectEmail" placeholder="ユーザーのメールアドレス" /><s:submit value=" 検索 " />
					</p>
					
				</s:form>
			 </div>

			<div class="result">
			　<p>以下に検索結果が表示されます<br>チケット情報とユーザー情報の編集はここで行うことができます</p>
				<s:if
					test="%{ boughtList == null || boughtList.isEmpty()}"></s:if>
		
		          <%--チケット売り上げ --%>
		          <s:else>
		          <s:form action="AdminBoughtAction">
					<table class="table_admin_sales">
						<tr>
							<th colspan="4">チケット購入情報</th>
						</tr>
						<tr>
						    <td>期間</td>
							<td>注文ID</td>
							<td>チケットID</td>
							<td>枚数</td>
							<td>チケット合計金額</td>
						</tr>
						<s:iterator value="boughtList">
							<tr>
							　　　  <td><s:property value="selectdate1"/>～<s:property value="selectdate2"/></td>
								<td><s:property value="order_id" /></td>
								<td><s:property value="ticket_id" /></td>
								<td><s:property value="sheets" /> 枚</td>
								<td><s:property value="total_amount" /> 円</td>
							</tr>
						</s:iterator>
					</table>
				</s:form>

				</s:else>
				
				<%--チケット情報検索結果＆編集 --%>
				<p>チケット一覧</p>
					 <table>
					   <tr>
					   <th>チケットID</th>
					   <th>チケット名</th>
					   <th>値段</th>
					   <th>チケット種類</th>
					   <th>チケット詳細</th>
					   <th>販売確認</th>
					   </tr>
					   <s:form action="AdminTicketSelectAction">
				        <s:iterator value="ticketList">
							<tr>
								<td><s:property value="id" /></td>
								<td><s:property value="name" /></td>
								<td><s:property value="price" /></td>
								<td><s:property value="ticketType" /></td>
								<td><s:property value="ticketInfo" /></td>
								<td><s:property value="isSale" /></td>
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
			    <td colspan="2"><s:textfield id="updateName" type="text" class="form-control" name="updateName" placeholder="チケット名" /></td>       
			   </tr>
			   <tr>
			    <td colspan="2"><s:textfield id="updateprice" type="text" class="form-control" name="updateprice" placeholder="値段"/></td>
			   </tr>
			   <tr>
			    <td colspan="2"><s:textfield id="updatetickettype" type="text" class="form-control" name="updatetickettype" placeholder="チケット種類" /></td>
			   </tr>
			   <tr>
			    <td colspan="2"><s:radio list="#{true:'販売継続', false:'販売終了'}" name="isSale" value="0"></s:radio></td>
			   </tr>
			    <tr>
			    <td colspan="2"><s:textfield id="updateticketinfo" type="text" class="form-control" name="updateticketinfo" placeholder="チケット種類" /></td>
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
				<s:iterator value="userList">

					 <table>
					   <tr>
					   <th colspan="2"><s:property value="name" />様の情報</th>
					   
					   </tr>
							<tr>
							    <td>メールアドレス</td>
								<td><s:property value="#session.sessionEmail" /></td>
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
			    <td colspan="2"><s:textfield id="updateEmail" type="text" class="form-control" name="updateEmail" placeholder="メールアドレス" /></td>       
			   </tr>
			   <tr>
			    <td colspan="2"><s:textfield id="updatePassword" type="text" class="form-control" name="updatePassword" placeholder="パスワード" /></td>
			   </tr>
			   <tr>
			    <td colspan="2"><s:textfield id="updateName" type="text" class="form-control" name="updateName" placeholder="ユーザー名" /></td>
			   </tr>
			   <tr>
			    <td colspan="2"><s:textfield id="updateTelNum" type="text" class="form-control" name="updateTelnum" placeholder="電話番号" /></td>
			   </tr>
			   <tr>
			    <td colspan="2"><s:textfield id="updatepostalcode" type="text" class="form-control" name="updatePostalCode" placeholder="郵便番号" /></td>
			   </tr>
			   <tr>
			    <td colspan="2"><s:textfield id="updateaddress" type="text" class="form-control" name="updateAddress" placeholder="住所" /></td>
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
         <%--   </s:else> --%>
		


</body>
</html>