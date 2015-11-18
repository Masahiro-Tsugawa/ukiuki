<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@page import="java.util.*" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="css/main.css" type="text/css">
    <link rel="stylesheet" href="css/ticket_buy.css" type="text/css">
    <title>UkiukiUtopia</title>
    <s:property value="#session.name_key"></s:property>
</head>

<body>
    <jsp:include page="base/main_header.jsp" flush="true" />
    <div class="container">

  <table class="table-test">
    <tr><th colspan="3"><div class="form-titel">チケット購入画面</div></th></tr>
    <tr><th colspan="3">施設利用権</th></tr>
    <tr>
     <td>
       <div class="table-bar">
       <div style="text-align:left;float:left;"><s:property value="name"/><input type="checkbox" name="2" >フルセット:</div>
         <div style="text-align:right;"><s:property value="sheets"/><select name="sheets" >
         <option value="0">0</option>
         <option value="1">1</option>
         <option value="2">2</option>
         <option value="3">3</option>
         <option value="4">4</option>
         <option value="5">5</option>
         <option value="6">6</option>
         <option value="7">7</option>
         <option value="8">8</option>
         <option value="9">9</option>
         <option value="10">10</option>
         <option value="11">15</option>
         <option value="12">20</option>
         </select>
         枚<p>単価<s:property value="price"></s:property>1600円</p></div>

         <p>説明:</p>
     </div>
     </td>

     <td>
       <div class="form-text">
        小計:<s:property value="subtotal"></s:property>円
     </div>
     </td>
   </tr>

   <tr>
     <td>
       <div class="table-bar">
       <div style="text-align:left;float:left;"><s:checkbox name="name2" value="マシン利用チケット"/>マシン利用チケット:</div>
       <div style="text-align:right;"><s:property value="sheets"/><select name="sheets" >
         <option value="0">0</option>
         <option value="1">1</option>
         <option value="2">2</option>
         <option value="3">3</option>
         <option value="4">4</option>
         <option value="5">5</option>
         <option value="6">6</option>
         <option value="7">7</option>
         <option value="8">8</option>
         <option value="9">9</option>
         <option value="10">10</option>
         <option value="11">15</option>
         <option value="12">20</option>
         </select>
       枚<p>単価700円</p></div>
       <p>説明:</p>
       </div>
     </td>
     <td>
       <div class="form-text">
       小計:円
     </div>
     </td>
   </tr>

   <tr>
     <td>
       <div class="table-bar">
       <div style="text-align:left;float:left;"><s:checkbox name="name3" value="プール利用チケット"/>プール利用チケット:</div>
       <div style="text-align:right;"><s:property value="sheets"/><select name="sheets" >
         <option value="0">0</option>
         <option value="1">1</option>
         <option value="2">2</option>
         <option value="3">3</option>
         <option value="4">4</option>
         <option value="5">5</option>
         <option value="6">6</option>
         <option value="7">7</option>
         <option value="8">8</option>
         <option value="9">9</option>
         <option value="10">10</option>
         <option value="11">15</option>
         <option value="12">20</option>
         </select>
       枚<p>単価700円</p></div>
       <p>説明:</p>
       </div>
     </td>
     <td>
       <div class="form-text">
       小計:円
     </div>
     </td>
   </tr>

   <tr>
     <td>
       <div class="table-bar">
       <div style="text-align:left;float:left;"><s:checkbox name="name4" value="風呂利用チケット"/>風呂利用チケット:</div>
       <div style="text-align:right;"><s:property value="sheets"/><select name="sheets" >
         <option value="0">0</option>
         <option value="1">1</option>
         <option value="2">2</option>
         <option value="3">3</option>
         <option value="4">4</option>
         <option value="5">5</option>
         <option value="6">6</option>
         <option value="7">7</option>
         <option value="8">8</option>
         <option value="9">9</option>
         <option value="10">10</option>
         <option value="11">15</option>
         <option value="12">20</option>
         </select>
       枚<p>単価700円</p></div>
       <p>説明:</p>
       </div>
     </td>
     <td>
       <div class="form-text">
       小計:円
     </div>
     </td>
  </tr>

  </table>

  <table class="table-add">
    <tr><th colspan="3">オプション</th></tr>
     <tr>
       <td>
         <div class="table-bar">
         <div style="text-align:left;float:left;">レンタル:</div>
         <div style="text-align:right;"><s:property value="sheets"/><select name="sheets" >
         <option value="0">0</option>
         <option value="1">1</option>
         <option value="2">2</option>
         <option value="3">3</option>
         <option value="4">4</option>
         <option value="5">5</option>
         <option value="6">6</option>
         <option value="7">7</option>
         <option value="8">8</option>
         <option value="9">9</option>
         <option value="10">10</option>
         <option value="11">15</option>
         <option value="12">20</option>
         </select>
         枚<p>単価:500円</p></div>
       <p>説明:</p>
       <form><s:checkbox name="osheets" value="1"/>使用しない</form>
       </div>
     </td>
     <td>
       <div class="form-text">
       小計:円

     </div>
     </td>
   </tr>

   <tr>
     <td>

       <div style="text-align:left;float:left;">パーソナルトレーナー:</div>
       <div style="text-align:right;"><s:property value="sheets"/><select name="sheets" >
         <option value="0">0</option>
         <option value="1">1</option>
         <option value="2">2</option>
         <option value="3">3</option>
         <option value="4">4</option>
         <option value="5">5</option>
         <option value="6">6</option>
         <option value="7">7</option>
         <option value="8">8</option>
         <option value="9">9</option>
         <option value="10">10</option>
         <option value="11">15</option>
         <option value="12">20</option>
         </select>
       枚<p>単価:5000円</p></div>

      <p>説明:</p>

      <form><s:checkbox name="nosheets" value="1"/>付けない</form>

   </td>
   <td>
     <div class="form-text">
     小計:円

   </div>
   </td>
 </tr>
   </table>

  <table class="table-acc">
    <tr><th colspan="2">合計金額</th></tr>
      <tr>

      <td colspan="2"><div class="form-text">合計:円</div></td>

   </tr>

   <tr>
   <th colspan="2">お支払い情報</th>
   </tr>

   <tr>

   <td colspan="2"><input type="radio" name="pey" value="1">店頭払い<br>
   <input type="radio" name="peycard" value="2">クレジットカード払い</td>

   </tr>
<%
%>
<!-- クレジットカード払い時に見せる -->
   <tr>
     <td colspan="2">クレジットカード情報の入力をお願いします</td>
   </tr>

   <tr>
     <td>カード番号：</td>

     <td><div class="form-text"><s:textfield name="card" placeholder="1234-1234-1234"/></div></td>

   </tr>

   <tr>
   <td>カード名義:</td>

   <td><s:textfield name="name" placeholder="TARO YAMADA"/></td>

   </tr>
   <tr>

     <td>有効期限:(月/年)</td>
     <td>
     (月)
      <select name="cardMo">
        <option value="0">--</option>
        <option value="1">1月</option>
        <option value="2">2月</option>
        <option value="3">3月</option>
        <option value="4">4月</option>
        <option value="5">5月</option>
        <option value="6">6月</option>
        <option value="7">7月</option>
        <option value="8">8月</option>
        <option value="9">9月</option>
        <option value="10">10月</option>
        <option value="11">11月</option>
        <option value="12">12月</option>
      </select>
      (年)
    <select name="cardYe">
      <option value="0000">--</option>
      <option value="2015">15年</option>
      <option value="2016">16年</option>
      <option value="2017">17年</option>
      <option value="2018">18年</option>
      <option value="2019">19年</option>
      <option value="2020">20年</option>
      <option value="2021">21年</option>
      <option value="2022">22年</option>
    </select>
  </td>

</tr>

<tr>
  <td>セキュリティコード：</td>

<td><div class="form-text"><s:password name="cardCo" size="15" maxlength="4" placeholder="****"/></div></td>
</tr>
<tr>
<th colspan="2">購入</th>
</tr>
<tr>
<td colspan="2">
   <div class="table-kingaku">
   <s:form action="test_buy_check">
     <input type="submit" value="購入"></s:form>
     <input type="submit" value="キャンセル" onclick="history.back()">
    </div>
    </td>
    </tr>
   </table>

   </div>
    <jsp:include page="base/main_footer.jsp" flush="true" />
</body>
</html>