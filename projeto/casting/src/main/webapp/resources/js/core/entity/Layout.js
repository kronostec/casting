GLOABAL_VARS.app.registerClass("Layout",function() {
	var $scope = this;
	var $scopePrivate = {};
	var $rootScope = null; 
	
	$scope.init = function(scope) {
		$scopePrivate.initVars(scope); 
		$scope.initLayout();
	};
	
	$scopePrivate.initVars = function(scope) {
		$rootScope = scope;	
	};
	
	
	$scope.initLayout = function() {
		$(function(){
			$scopePrivate.listenScrolPosition();
		});
	};
	
	$scopePrivate.listenScrolPosition = function() {
		angular.element(document).on("scroll", function(event) {
			 $rootScope.$apply(function () {               // 3
				$rootScope.scrollTop = ($(document).scrollTop());
				$rootScope.scrollLeft = ($(document).scrollLeft());
			 });
		});
	};
	
	$scope.initMenuResponsivo = function() {		
		$(".flexnav").flexNav({
			"onSmallMenu" : function() {
				$scopePrivate.initLayoutMenuSmall();
			},
			"onLargeMenu" : function() {
				$scopePrivate.initLayoutMenuLarge();
			},
			'animationSpeed':     10,            // default for drop down animation speed
			'buttonSelector':     '.menu-button', // default menu button class name
			'hover':              true            // would you like hover support?      
		});
		
		$("#btnMenuPrincipal").click(function() {
			var statusMenu = $('.flexnav').attr("data-menu-status");
			if(statusMenu == "opened"){
				$scopePrivate.hideMenuSmall();				
			}else{
				$scopePrivate.showMenuSmall();
			}			
		});
		
	};
	
	$scopePrivate.initLayoutMenuSmall = function() {
		$(".headderSmall").css("display","block");
		$(".headderLarge").css("display","none");
		$('.flexnav').attr("data-menu-status", "closed");
		$('.flexnav').attr("style","overflow:hidden!important;opacity:1!important");		
		$scopePrivate.resetMenu(true);
	};
	
	$scopePrivate.initLayoutMenuLarge = function() {
		$(".headderSmall").css("display","none");
		$(".headderLarge").css("display","block");
		$('.flexnav').attr("style","overflow:inherit!important;opacity:1!important");
		$scopePrivate.resetMenu(true);
	};
	
	$scopePrivate.resetMenu = function(callTrigger) {
		
		$('.item-with-ul').find('>ul').each(function(){	
			var height = $(this).height();
			var exec = $('.item-with-ul').attr("data-exec");
			console.log($(this).hasClass("flexnav-show"));
			if(height > 0 && exec == "true"){
				$(this).removeClass('flexnav-show');
				$(this).stop(true, true).animate({
		            height: ["toggle", "swing"]
		        }, 1);
			}
			$(this).addClass('flexnav-show');
		});
		$('.item-with-ul').attr("data-exec", "true");
	};
	
	
	
	$scopePrivate.showMenuSmall = function() {
		$('.flexnav').attr("style","overflow:inherit!important;opacity:1!important");	
		$('.flexnav').attr("data-menu-status", "opened");
	};
	
	$scopePrivate.hideMenuSmall = function() {
		$('.flexnav').attr("style","overflow:hidden!important;opacity:1!important");
		$('.flexnav').attr("data-menu-status", "closed");
	};
	
	$scopePrivate.geradorCssDefault = function() {		
		var listItens = ["padding", "margin"];
    	for(var i = 0; i < listItens.length ; i++) {
    		var item = listItens[i];
    		var subItens = ["", "top", "left", "bottom" , "right"];
    		for(var j = 0; j < subItens.length; j++){
    			subIten = subItens[j];
    			for(var k = 5; k <= 500; k+= 5){
    				var sub = "-" + subIten;
    				if(sub == "-"){
    					sub = "";
    				}
    				var str = "." + item + sub + "-" + k + " {" + (item + sub)  + " : " + k + "px}";
    				var str2 = "." + item + sub + "-" + k + "-neg {" + (item + sub)  + " : -" + k + "px}";
    				console.log(str);
    				console.log(str2);
    			}
    		}
    	}
	};
	return $scope;
});

