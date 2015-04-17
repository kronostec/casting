GLOABAL_VARS.app.controller('PageCtrl', function ($scope, LxNotificationService, LxProgressService, $http, $rootScope) {
	
	$scope.init = function() {
		initVars();
		initLayout();    		    	
	};
	
	var initVars = function() {
		$scope.pageLoaded = false;		
		$rootScope.layoutConfig = {};
		$rootScope.titlePage = "Título Default";
		$rootScope.Layout = GLOABAL_VARS.app.requireClass("Layout");
	};
	
	var montaLayoutPaginaCarregando = function() {
		$scope.pageLoaded = false;	
		LxProgressService.circular.show('#5fa2db', 'body');
	};
	
	var montaLayoutPaginaCarregada = function() {
		$scope.pageLoaded = true;	
		LxProgressService.circular.hide();
	};
	
	var loadConfiguracoesLayout = function() {
	   montaLayoutPaginaCarregando();
	   var load = $http.get('/config/layoutConfig.json');
	   load.then(function(request){
		   $rootScope.layoutConfig = request.data;
		   montaLayoutPaginaCarregada();
       });
	   load.error(function(data, status, headers, config) {
		  LxNotificationService.error("Erro ao carregar configuraões do Layout!");
		  console.log(data);
	   });		
	};
	
	var initLayout = function() {
		$(function() {
	        $rootScope.Layout.init();   
			loadConfiguracoesLayout();
		})    		    	
	};
	
	
	var geradorCssDefault = function() {		
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
	}
	
	
	
	
});