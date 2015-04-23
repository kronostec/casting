
GLOABAL_VARS.app.directive('fixedTop', ['$document', function($document) {
	  return {
		    link: function(scope, element, attr) {
		        var obj = $(attr.targetFixed);
		        if(obj.length == 0){
		        	obj = element;
		        }	
		        obj.css({
			    	  position : "relative",
			    	  top : "0px",
			    	  zIndex : "10000",
			    	  
			    });
		    	$document.on("scroll", function(event) {
			    	  var top = attr.fixedTop + "px";
			    	  obj.css({
				    	  top : top				    	  
				      });
		    	});
		    },
			restrict: "A"
	};
}]); 

GLOABAL_VARS.app.directive('fixedLeft', ['$document', function($document) {
	  return {
		    link: function(scope, element, attr) {		    	
		        var obj = attr.targetScroll;
		        if(obj == undefined){
		        	obj = element;
		        }
		        obj.css({
			    	  position : "relative",
			    	  left : "0px",
			    	  zIndex : "10000",
			    	  
			    });
		    	$document.on("scroll", function(event) {
		    	  var left = attr.fixedLeft + "px";	
		    	  obj.css({
			    	  left : left
			      });
		    	});
		    },
			restrict: "A"
	};
}]); 