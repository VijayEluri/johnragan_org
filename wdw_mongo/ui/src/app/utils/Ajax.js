define( [], function() {
	
	return {
		URL: 'api/attractions',
		URL_WITH_ID: 'api/attractions?id=',
		MONGO_ID: '_id',
		
		resetFormFields: function() {	  
  	  $(".new_attraction_title").val('');
  	  $(".new_attraction_summary").val('');
  	  $(".new_attraction_photo_url").val('');
  	  $(".id_attraction_height").val('');
  	  $(".new_attraction_rating").val('5');
  	  $(".new_attraction_intensity").val('5');

  	  $('.new_attraction_options1').find(':checked').each(function() {
         $(this).removeAttr('checked');
      });
      $('.new_attraction_options2').find(':checked').each(function() {
         $(this).removeAttr('checked');
      });

      $('#new_attraction_wait').val( $('#new_attraction_wait').prop('defaultSelected') );
  	}
	}	
});
