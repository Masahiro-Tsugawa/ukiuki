$(function() {
  $("#button01").click(function() {
    $.ajax({
      url : "GoogleMap.html",
      dataType : "html",
    }).done(function(data) {
      $("#googleMap").html(data);
      var map;

      map = new GMaps({
        div : '#map',
        lat : 35.671971,
        lng : 139.745790,
        zoom : 16
      });

      map.addMarker({
        lat : 35.671971,
        lng : 139.745790,
        title : "インターノウス",
        infoWindow : {
          content : "<p>東京都千代田区霞が関３丁目６−１５</p>"
        }
      });
    });
  }).fail(function(data) {
  });
});