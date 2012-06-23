define([
	'Backbone', 'Attractions', 'Attraction', 'AttractionView', 'AttractionsListView', 'modal', 'transition', 'Templates'
], function( 
	Backbone, Attractions, Attraction, AttractionView, AttractionsListView, modal, transition, Templates
) {	
	var setupAttractionMarkup = function() {
		this.$('#attractionActionsModal').html(Templates.attractionActionsModal());
	}
	
	var AppView = Backbone.View.extend({
		
		el: '#app-container',
		
		events: {
			'click #remove-attractions' : 'removeAttractions',
			//'click #add-attraction' : 'addAttraction'
		},

        initialize: function() {
			this.attractions = new Attractions();
			this.attractionsListView = new AttractionsListView( { 
				'collection' : this.attractions,
				'el' : '#attractions_list_container'
			} );
			this.attractions.fetch();
			
			setupAttractionMarkup();
			
			/*this.attraction = new Attraction({
			  list_item_photo_url: "data/images/mk/attractions/space-mountain-240.jpeg"
			  , name : "Space Mountain Old Title"
			  , summary: "Launch past the flashing lights of your space station into the soaring darkness of space! This classic Dark Ride dips and swerves as it rockets through the blackest reaches of the galaxy. Check the monitors as you exit for a glimpse of yourself in flight!"
			  , rating : 9
			  , wait : "Busy"
			  , intensity : 8
			  , height : "44"
			  , FP : "FP"
			  , pal_mickey : "Pal Mickey"
			  , rider_swap : "Rider Swap"
			  , wheelchair : "Wheelchair"
			})
			this.attractionView = new AttractionView({model: this.attraction, el: '#attraction_container'}).render();
			this.attraction.fetch();*/
        },

		removeAttractions: function() {
			this.attractions.removeAttractions();
			
        	return false;
        },

		addAttraction : function() {
			console.log("this is me, adding an attraction");
			
			return false;
		}
	});
	return AppView;
});