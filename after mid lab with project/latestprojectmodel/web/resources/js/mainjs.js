"use strict"

$(function(){
    $('#address').change(function(){
        //alert("event started")
        var file='resources/Address/' + $('#address').val();

        $.ajax({
            'url':file,
            'type': 'POST',
            'success':ajaxSuccess,
            'error':ajaxFailure
        });
    });
});

      function ajaxSuccess(data){
          //alert("sucess");
          //var myObj = JSON.parse(data);
          //console.log(data);

          //alert(myObj)
          $('#output').val(data);
      }
      function ajaxFailure(xhr,status,exception){
             console.log(xhr,status,exception);
          alert("NO sucess");
          console.log(xhr,status,exception);
      }

$.get('https://www.google.com/images/branding/product/ico/googleg_lodp.ico');

