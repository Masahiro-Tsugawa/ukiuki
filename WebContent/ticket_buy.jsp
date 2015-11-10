<!-- 川東 --> 
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html">
<html lang="ja">
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
       <div style="text-align:left;float:left;"><input type="checkbox" value="1">フルセット:</div>
         <div style="text-align:right;"><input type="number" value="0" min="0" max="99">枚<p>単価1600円</p></div>
     </div>
       <p>説明:</p>
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
       <div style="text-align:left;float:left;"><input type="checkbox" value="2">マシン利用チケット:</div>
       <div style="text-align:right;"><input type="number" value="0" min="0" max="99">枚<p>単価700円</p></div>
       <p>説明:</p>
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
       <div style="text-align:left;float:left;"><input type="checkbox" value="3">プール利用チケット:</div>
       <div style="text-align:right;"><input type="number" value="0" min="0" max="99">枚<p>単価700円</p></div>
       <p>説明:</p>
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
       <div style="text-align:left;float:left;"><input type="checkbox" value="4">風呂利用チケット:</div>
       <div style="text-align:right;"><input type="number" value="0" min="0" max="99">枚<p>単価700円</p></div>
       <p>説明:</p>
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
         <div style="text-align:right;"><input type="number" value="0" min="0" max="99">枚<p>単価:500円</p></div>
       <p>説明:</p>
       <form><input type="checkbox" value="1">使用しない</form>
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
       <div style="text-align:right;"><input type="number" value="0" min="0" max="99">枚<p>単価:5000円</p></div>
      <p>説明:</p>
      <form><input type="checkbox" value="1">付けない</form>
   </td>
   <td>
     <div class="form-text">
     小計:円
   </div>
   </td>
 </tr>
   </table>

  <table class="table-acc">
    <tr><th colspan="3">合計金額</th></tr>
     <tr>
      <tr>
       <td><input type="radio" name="card" value="1" checked>店頭払い<br>
         <input type="radio" name="card" value="2" >クレジットカード払い</td>
      <td><div class="form-text">合計:円</div></td>
   </tr>

   <tr>
     <td colspan="3">クレジットカード情報の入力をお願いします</td>
   </tr>

   <tr>
     <td>カード番号：</td>
     <td><div class="form-text"><input type="text" name="name" placeholder="1234-1234-1234"></div></td>
   </tr>

   <tr>
   <td>カード名義:</td>
   <td><input class="billing-address-name form-control"type="text" name="name" placeholder="TARO YAMADA">
   </tr>

   <tr>
     <td>有効期限:(月/年)</td>
     <td colspan="2">
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

<td><div class="form-text"><input type=password name="cardCo" size="15" maxlength="4" placeholder="****"></div></td>
      
<tr>
  <td>セキュリティコード：</td>
  <td><div class="form-text"><input type=text name="cardCo"></div></td>
</tr>
<tr>
   <td colspan="2">
     <div class="table-kingaku"><a href="chicketkanryou.html"><input type="submit" value="購入"></a>
       <a href="mypage.html"><input type="submit" value="キャンセル"></a></div>
     </td>
     </tr>
   </table>

    <jsp:include page="base/main_footer.jsp" flush="true" />
</body>
</html>