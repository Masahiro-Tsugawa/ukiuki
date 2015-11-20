$(function() {
	$('#postcode').jpostal({
		postcode : [ '#postcode' ],
		address : {
			'#addressPrefecture' : '%3',
			'#addressCity' : '%4%5'
		}
	});
});