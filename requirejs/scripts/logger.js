define(["./shirt", "./alerts"], function (shirt) {
    return {
        logTheShirt: function () {
            console.log("color: " + shirt.color + ", size: " + shirt.size);
        },
		alertv2a2 : function() {
			alert2();
		}
    };
});