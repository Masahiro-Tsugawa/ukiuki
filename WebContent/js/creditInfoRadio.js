$(function(){
	$("input[id='radioTest']:radio").change(function(){
		alert("成功？")
		$("#creditRadio").toggle();
	});
});