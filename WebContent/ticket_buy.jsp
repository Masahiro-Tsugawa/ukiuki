
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html">
<html lang="ja">
<head>
 <title>TAG index Webサイト</title>

<style type="text/css">
<!--

table {
border-collapse: collapse;
}

table, th, td {
border: 1px #808080 solid;
}

th, td {
padding: 3px 10px;
}

th {
background-color: #d3e9fa;
}

td {
background-color: #ffffff;
}

td strong {
color: #ff0000;
}

-->
</style>

<script type="text/javascript">
<!--

function keisan(){

	// 設定開始

	// 商品1
	var price1 = document.form1.goods1.selectedIndex * 500; // 単価を設定
	document.form1.field1.value = price1; // 小計を表示

	// 商品2
	var price2 = document.form1.goods2.selectedIndex * 1000; // 単価を設定
	document.form1.field2.value = price2; // 小計を表示

	// 商品3
	var price3 = document.form1.goods3.selectedIndex * 3000; // 単価を設定
	document.form1.field3.value = price3; // 小計を表示

	// 合計を計算
	var total = price1 + price2 + price3;

	// 設定終了


	document.form1.field_total.value = total; // 合計を表示

}

// --> 
</script> 

</head>
<body>

<form action="#" name="form1">

<table>
<tr>
<th>商品名</th>
<th>単価</th>
<th>数量</th>
<th>金額</th>
</tr>
<tr>
<tr><th colspan="4"><div class="form-titel">チケット購入画面</div></th></tr>
<td>商品サンプル1</td>
<td align="right">500円</td>
<td><select name="goods1" onChange="keisan()">
<option>0</option>
<option>1</option>
<option>2</option>
<option>3</option>
<option>4</option>
<option>5</option>
</select></td>
<td><input type="text" name="field1" size="8" value="0"> 円</td>
</tr>
<tr>
<td>商品サンプル2</td>
<td align="right">1,000円</td>
<td><select name="goods2" onChange="keisan()">
<option>0</option>
<option>1</option>
<option>2</option>
<option>3</option>
<option>4</option>
<option>5</option>
</select></td>
<td><input type="text" name="field2" size="8" value="0"> 円</td>
</tr>
<tr>
<td>商品サンプル3</td>
<td align="right">3,000円</td>
<td><select name="goods3" onChange="keisan()">
<option>0</option>
<option>1</option>
<option>2</option>
<option>3</option>
<option>4</option>
<option>5</option>
</select></td>
<td><input type="text" name="field3" size="8" value="0"> 円</td>
</tr>
<tr>
<td align="right" colspan="3"><strong>合計</strong></td>
<td><input type="text" name="field_total" size="8" value="0"> 円</td>
</tr>
</table>

</form>
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
   <p>購入完了しました。</p>
    <s:form action="ticket_buy_check.jsp">
     <div class="table-kingaku"><input type="submit" value="購入"></a>
    </s:form>
    <s:form action="my_page.jsp">
       <a href="mypage.html"><input type="submit" value="キャンセル"></a></div>
      </s:form>
     </td>
     </tr>
   </table>
</div>
    <jsp:include page="base/main_footer.jsp" flush="true" />
</body>
</html>