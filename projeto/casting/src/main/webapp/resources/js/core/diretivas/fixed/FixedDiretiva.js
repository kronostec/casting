
GLOABAL_VARS.app.directive('fixedTop', ['$document', function($document) {
	  return {
		    link: function(scope, element, attr) {
		        var obj = $(attr.targetFixed);
		        if(obj.length == 0){
		        	obj = element;
		        }		        
		    	$document.on("scroll", function(event) {
			    	  var top = attr.fixedTop + "px";
			    	  obj.css({
				    	  position : "relative",
				    	  top : top,
				    	  zIndex : "10000",
				    	  
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
		    	$document.on("scroll", function(event) {
		    	  var left = attr.fixedLeft + "px";	
		    	  obj.css({
			    	  position : "relative",
			    	  zIndex : "10000",
			    	  left : left
			      });
		    	});
		    },
			restrict: "A"
	};
}]); 