$(function() {
	$("#button01").click(function() {
		$.ajax({
			url : "GoogleMap.html",
			dataType : "html",
		}).done(function(data) {
			$("#googleMap").html(data);
		}).fail(function(data) {
		});
	});
});