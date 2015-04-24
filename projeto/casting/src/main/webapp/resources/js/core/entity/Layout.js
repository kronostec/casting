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
			$scope.initMenuResponsivo();
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
	$scopePrivate.closeMenu = function() {
		$.sidr('close', 'sidr-right');
		$.sidr('close', 'sidr-left');		
	};
	$scopePrivate.initScriptMenu = function(menu) {	
		$scopePrivate.closeMenu();
		var run = $(".flexnav").attr("run");		
		if(run == "true"){
			console.log(run);
			$(".flexnav-content").empty();
			$(".flexnav-content").append(menu);
		}
		$(".flexnav").attr("run","true");
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
		$scopePrivate.configColorMenu();		
	};
	
	
	
	$scopePrivate.configColorMenu = function() {
		if($rootScope.layoutConfig.colors != undefined) {
			$(".flexnav>li>a").addClass($rootScope.layoutConfig.colors.menu.bgColor);
			$(".flexnav>li>a").addClass($rootScope.layoutConfig.colors.menu.fontColor);
			$(".flexnav ul li a").addClass($rootScope.layoutConfig.colors.menu.item.bgColor);
			$(".flexnav ul li a, .touch-button>i").addClass($rootScope.layoutConfig.colors.menu.item.fontColor);
			$(".touch-button").css({"background":"none"});
		}
	};
	
	$scope.initMenuResponsivo = function() {				
		$scopePrivate.initScriptMenu();
		var menu = $('.flexnav-content').html();
		$(window).resize(function() {
			$scopePrivate.closeMenu();
			setTimeout(function(){
				$scopePrivate.initScriptMenu(menu);	
			},500);					
		});
		
		$('.btnMenuMobile-left').sidr({
		      name: 'sidr-left',
		      source : '#content-left',
		      side: 'left',
		});	
		$('.btnMenuMobile-right').sidr({
		      name: 'sidr-right',
		      source : '#content-right',
		      side: 'right', 
		});	
		
		$(document).delegate(".content", "click", function(){
			$scopePrivate.closeMenu();
		});
	};
	
	$scopePrivate.initLayoutMenuSmall = function() {
		
		$(".headderSmall").css("display","block");
		$(".headderLarge").css("display","none");
		$('.flexnav').attr("data-menu-status", "closed");
		$('.flexnav').attr("style","overflow:hidden!important;opacity:1!important");
	};
	
	$scopePrivate.initLayoutMenuLarge = function() {
		
		$(".headderSmall").css("display","none");
		$(".headderLarge").css("display","block");
		$('.flexnav').attr("style","overflow:inherit!important;opacity:1!important");
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

