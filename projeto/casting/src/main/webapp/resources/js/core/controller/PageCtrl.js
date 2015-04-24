GLOABAL_VARS.app.controller('PageCtrl', function ($scope, LxNotificationService, LxProgressService, $http, $rootScope) {
	
	$scope.init = function() {
		initVars();
		initLayout();    		    	
	};
	
	var initVars = function() {
		$scope.pageLoaded = false;	
		$rootScope.scrollTop = 0;
		$rootScope.layoutConfig = {};
		$rootScope.titlePage = "Título Default";
		$rootScope.Layout = new (GLOABAL_VARS.app.requireClass("Layout"));
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
	   var load = $http.get('resources/config/layoutConfig.json');
	   load.then(function(request){
		   $rootScope.layoutConfig = request.data;
		   $rootScope.Layout.init($rootScope);   
		   montaLayoutPaginaCarregada();
       });
	   load.error(function(data, status, headers, config) {
		  LxNotificationService.error("Erro ao carregar configuraões do Layout!");
		  console.log(data);
	   });		
	};
	
	var initLayout = function() {
		$(function() {	        
			loadConfiguracoesLayout();
		});    		    	
	};
	
	
	
		
	
	
	
	
	
});