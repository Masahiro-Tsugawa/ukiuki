<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
<link rel="stylesheet" href="css/admin.css" type="text/css">
<script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>

<title>UkiukiUtopia 管理者画面</title>
</head>
<body>
 <div id="header">
   <div id="header_left">
	  <h2 class="title">うきうきUtopia 管理者画面</h2>
		
   </div>
   
   <div id="header_right" align="right">
   
   <s:if test="#session.name_key == null" > 
		   <div class="loginName">
		   <s:actionerror />
		<s:fielderror>
			<s:param value="id" />
		</s:fielderror>
		<s:fielderror>
			<s:param value="password" />
		</s:fielderror>

		<s:form id="signin" class="navbar-form navbar-right" role="form"
				action="AdminLoginAction" method="post">
				<div class="input-group">
				 <s:actionerror />
					<s:textfield id="name" type="text" class="form-control" name="Name"
						placeholder="ユーザー名" />
                 </div>

				<div class="input-group">
					<s:textfield id="password" type="password" class="form-control"
						name="password" placeholder="パスワード" />
				</div>

			  <s:submit class="btn btn-primary" value=" ログイン " />
			
		</s:form>
		  
		</div>
		
	  </s:if>
	</div>
	
  </div>
<s:div class="container">  
<s:else>
    <s:div class="logout">
    <p>管理者：
     <s:property value="#session.name_key" /><br>
	 </p>
	 <s:a href="AdminLogoutAction">ログアウト</s:a>
	 </s:div>

		<!--情報入力のダイアログボックスを作る-->
	<s:div class="well well-lg">
		  <h4>チケット購入情報検索</h4>

			<s:form action="AdminBoughtAction">
			　<s:select list="#{0:'--',2015:'2015',2016:'2016'}" name="yearS"></s:select>年
			
			 <s:select list="#{0:'--',1:'1',2:'2',3:'3',4:'4',5:'5',6:'6',7:'7',8:'8',9:'9',10:'10',11:'11',12:'12'}" name="monthS"></s:select>月
			
			　<s:select list="#{0:'--',1:'1',2:'2',3:'3',4:'4',5:'5',6:'6',7:'7',8:'8',9:'9',10:'10',11:'11',12:'12',13:'13',14:'14',15:'15',16:'16',17:'17',18:'18',19:'19',20:'20',21:'21',22:'22',23:'23',24:'24',25:'25',26:'26',27:'27',28:'28',29:'29',30:'30',31:'31'}" name="dateS"></s:select>日  ～ 
				
			 <s:select list="#{0:'--',2015:'2015',2016:'2016'}" name="yearE"></s:select>年
			
			 <s:select list="#{0:'--',1:'1',2:'2',3:'3',4:'4',5:'5',6:'6',7:'7',8:'8',9:'9',10:'10',11:'11',12:'12'}" name="monthE"></s:select>月
			
			　<s:select list="#{0:'--',1:'1',2:'2',3:'3',4:'4',5:'5',6:'6',7:'7',8:'8',9:'9',10:'10',11:'11',12:'12',13:'13',14:'14',15:'15',16:'16',17:'17',18:'18',19:'19',20:'20',21:'21',22:'22',23:'23',24:'24',25:'25',26:'26',27:'27',28:'28',29:'29',30:'30',31:'31'}" name="dateE"></s:select>日
			<s:submit value=" 検索 " />
			</s:form>
		</s:div>
		
		<s:div class="well well-lg">  
		  <h4>販売チケット一覧表示</h4>
		  　　<p>まずボタンを押して下のスペースに表示される一覧を確認してください<br>チケットの一覧の下部に入力フォームも表示されます</p>
			 <div class="ticket_info">
				
				<s:form action="AdminTicketSelectAction">
					<p>
						<s:submit value=" 一覧表示　 " />
					</p>
					
				</s:form>
			</div>
		</s:div>

        <s:div class="well well-lg"> 
			<h4>ユーザー検索</h4>
			<p>編集したいユーザーのメールアドレスを入力して下さい</p>
			 <div class="user_info">
				 
				<s:form action="AdminUserSelectAction">
					<p>
						<s:textfield name="selectEmail" placeholder="ユーザーのメールアドレス" /><s:submit value=" 検索 " />
					</p>
					
				  <s:fielderror>
			       <s:param value="%{boughtList}" />
		         </s:fielderror>
				</s:form>
				
			 </div>
		</s:div>

 <%--以下、結果表示 --%>

			　<p>以下に検索結果が表示されます<br>チケット情報とユーザー情報の編集はこちらで行うことができます</p>
				<s:if
					test="%{ boughtList == null || boughtList.isEmpty()}"></s:if>
		
		          <%--チケット売り上げ --%>
		          <s:else>
		          <s:form action="AdminBoughtAction">
		          <div class="table-responsive">
					 <table class="table table-striped">
					  <thead>
						<tr>
							<th colspan="4">チケット購入情報</th>
						</tr>
					  </thead>
	                  <tbody>
						<tr>
						    <td>期間</td>
							<td>注文ID</td>
							<td>チケットID</td>
							<td>枚数</td>
							<td>合計金額</td>
						</tr>
						<s:iterator value="boughtList">
							<tr>
							　　　  <td><s:property value="#session.selectDate1"/>～<s:property value="#session.selectDate2"/></td>
								<td><s:property value="orderId" /></td>
								<td><s:property value="ticketId" /></td>
								<td><s:property value="sheets" /> 枚</td>
								<td><s:property value="totalAmount" /> 円</td>
							</tr>
						</s:iterator>
						</tbody>
					</table>
					</div>
					
				</s:form>

				</s:else>
				
				<%--チケット情報検索結果＆編集 --%>
			<s:if test="ticketList == null" > </s:if>
			<s:else>
				<h4>チケット一覧</h4>
				 <div class="table-responsive">
					 <table class="table table-striped">
					  <thead>
					   <tr>
					   <th>チケットID</th>
					   <th>チケット名</th>
					   <th>値段</th>
					   <th>チケット種類</th>
					   <th>チケット詳細</th>
					   <th>販売確認</th>
					   <th>更新日</th>
					   </tr>
					  </thead>
	                  <tbody>
					   <s:form action="AdminTicketSelectAction">
				        <s:iterator value="ticketList">
							<tr>
								<th><s:property value="id" /></th>
								<td><s:property value="name" /></td>
								<td><s:property value="price" /></td>
								<td><s:property value="ticketType" /></td>
								<td><s:property value="ticketInfo" /></td>
								<td><s:if test="isSale==true">販売中</s:if>
								 <s:else>停止中</s:else></td>
								<td><s:property value="renewDate" /></td>
							</tr>
						</s:iterator>
				       </s:form>
				      </tbody>
					 </table>
					</div>
			
		<s:div class="container-fluid">
	      <s:div class="row">
		    <s:div class="col-md-6">　
			 <s:form action="AdminTicketUpdateAction">
			  <table>
			   <tr>
			    <th colspan="2">チケット情報の編集</th>
			   </tr>
			   <tr>
			    <td><s:textfield id="updateid" type="text" class="form-control" name="updateId" placeholder="変更したいIDを入力して下さい" /></td>
			   </tr>
			   <tr>
			    <td colspan="2"><s:textfield id="updateName" type="text" class="form-control" name="updateName" placeholder="チケット名" /></td>       
			   </tr>
			   <tr>
			    <td colspan="2"><s:textfield id="updateprice" type="text" class="form-control" name="updatePrice" placeholder="値段"/></td>
			   </tr>
			   <tr>
			    <td colspan="2"><s:textfield id="updatetickettype" type="text" class="form-control" name="updateTicketType" placeholder="チケット種類" /></td>
			   </tr>
			   <tr>
			    <td colspan="2"><s:radio list="#{true:'販売継続', false:'販売終了'}" name="updateIsSale" value="0"></s:radio></td>
			   </tr>
			    <tr>
			    <td colspan="2"><s:textfield id="updateticketinfo" type="text" class="form-control" name="updateTicketInfo" placeholder="チケット詳細" style="width:400px;height:200px;" /></td>
			   </tr>
			   <tr>
 			    <td><s:submit value="編集 "></s:submit></td>
			    
			   </tr>
			  </table>
			 </s:form>
			</s:div>
			
		<s:div class="col-md-6"> 
			<s:form action="AdminTicketDeleteAction">
			　　　　<h4>削除したいチケットのIDを入力してください</h4>
			    <s:textfield id="deleteId" type="text" class="form-control" name="deleteId" placeholder="チケットID" />
			    <s:submit value=" 削除  "></s:submit>
		    </s:form>
		   </s:div>
		   </s:div>
	      </s:div>
      </s:else>
		



			
				
				<%--ユーザー情報検索結果＆編集 --%>
			<s:if test="userList == null" > </s:if>
			<s:else>
			 <s:div class="container-fluid">
	          <s:div class="row">
		       <s:div class="col-md-4">
				<s:form action="AdminUserSelectAction">
				<s:iterator value="userList">
					 <table class="table table-striped">
					  <thead>
					   <tr>
					   <th colspan="2"><s:property value="name" />様の情報</th>
					   </tr>
					  </thead>
	                  <tbody>
						<tr class="userresult">
						  <td>メールアドレス</td>
						  <td><s:property value="#session.sessionEmail" /></td>
					     </tr>
						<tr class="userresult">
						  <td>パスワード</td>
					      <td><s:property value="password" /></td>
						 </tr>
						 <tr class="userresult">
						   <td>ユーザー名</td>
						   <td><s:property value="name" /></td>
						 </tr>
						 <tr class="userresult">
						   <td>電話番号</td>
						   <td><s:property value="telNum" /></td>
						 </tr>
						 <tr class="userresult">
						   <td>郵便番号</td>
						   <td><s:property value="postalCode" /></td>
						 </tr>
						 <tr class="userresult">
						   <td>住所</td>
						   <td><s:property value="address" /></td>
						 </tr>
						 <tr class="userresult">
						   <td>更新日</td>
						   <td><s:property value="renewDate" /></td>
						 </tr>
					 </table>
						</s:iterator>
				</s:form>
					
		    <s:div class="userdelete">
		    <h5 class="userdeletebutton">ユーザーの削除</h5>
			<s:form action="AdminUserDeleteAction">
			    <s:submit value="ユーザーを削除 "></s:submit>
		    </s:form>
		    </s:div>
		    
			</s:div>
				
            <s:div class="col-md-8">
			 <s:form action="AdminUserUpdateAction">
			  <table class="table">
			   <thead>
			   <tr>
			    <th>こちらに編集情報を入力してください</th>
			   </tr>
			   <tr>
			    <td><s:textfield id="updateEmail" type="text" class="form-control" name="updateEmail" placeholder="メールアドレス" /></td>       
			   </tr>
			   <tr>
			    <td><s:textfield id="updatePassword" type="text" class="form-control" name="updatePassword" placeholder="パスワード" /></td>
			   </tr>
			   <tr>
			    <td><s:textfield id="updateName" type="text" class="form-control" name="updateName" placeholder="ユーザー名" /></td>
			   </tr>
			   <tr>
			    <td><s:textfield id="updateTelNum" type="text" class="form-control" name="updateTelnum" placeholder="電話番号" /></td>
			   </tr>
			   <tr>
			    <td><s:textfield id="updatepostalcode" type="text" class="form-control" name="updatePostalCode" placeholder="郵便番号" /></td>
			   </tr>
			   <tr>
			    <td><s:textfield id="updateaddress" type="text" class="form-control" name="updateAddress" placeholder="住所" /></td>
			   </tr>
			   <tr>
 			    <td><s:submit value="編集 "></s:submit></td>
			   </tr>
			   </tbody>
			  </table>
			 </s:form>
			</s:div>
		  
		   
		   </s:div>
		  </s:div>
		  
      </s:else>
     </s:else>


</s:div>


</body>
</html>