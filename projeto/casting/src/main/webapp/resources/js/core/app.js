define(['angularAMD', 'angularRoute','lumx'], function (angularAMD) { 		
	GLOABAL_VARS.app = angular.module("webapp", ['ngRoute','lumx']);
	GLOABAL_VARS.app.Class = {};
	GLOABAL_VARS.app.registerClass = function(name, obj) {
		GLOABAL_VARS.app.Class[name] = obj;
		return obj;
	};
	
	GLOABAL_VARS.app.requireClass = function(className) {
		return GLOABAL_VARS.app.Class[className];
	};	
	
	GLOABAL_VARS.app.includeScript = function(id, url , parent) {
		var alreadyAdd = ($('[src="' + url + '.js"]').length);
		if(alreadyAdd == 0){
			if(parent == undefined){
				$('body').append('<script charset="utf-8" async="" data-requirecontext="_" data-id="' + id + '" src="' + url + '.js"></script>');
			}else{
				$(parent).append('<script charset="utf-8" async="" data-requirecontext="_" data-id="' + id + '" src="' + url + '.js"></script>');
			}
		}
	};
	
	GLOABAL_VARS.app.config(function ($routeProvider) {
	    $routeProvider
		    .when("/home", angularAMD.route({
		        templateUrl: '/view/home/home.html', 
		        controller: 'HomeCtrl', 
		        controllerUrl: '/js/core/controller/HomeCtrl.js'
		    }))
		    .when("/contato", angularAMD.route({
		        templateUrl: '/view/contato/contato.html', 
		        controller: 'ContatoCtrl', 
		        controllerUrl: '/js/core/controller/ContatoCtrl.js'
		    }))
		    .otherwise({redirectTo: "/home"});
	 });

	GLOABAL_VARS.app.includeScript('Layout','/js/core/entity/Layout', 'head');
	GLOABAL_VARS.app.includeScript('PageCtrl','/js/core/controller/PageCtrl', 'head');
	GLOABAL_VARS.app.includeScript('TitlePageDiretiva','/js/core/diretivas/title-page/TitlePageDiretiva', 'head');
	
	return angularAMD.bootstrap(GLOABAL_VARS.app);	
});
