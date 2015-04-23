define(['angularAMD', 'angularRoute','lumx','jquery'], function (angularAMD) { 	
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
		        templateUrl: 'home', 
		        controller: 'HomeCtrl', 
		        controllerUrl: 'resources/js/core/controller/HomeCtrl.js'
		    }))
		    .when("/contato", angularAMD.route({
		        templateUrl: 'contato', 
		        controller: 'ContatoCtrl', 
		        controllerUrl: 'resources/js/core/controller/ContatoCtrl.js'
		    }))
		    .otherwise({redirectTo: "/home"});
	 });

	GLOABAL_VARS.app.includeScript('Menu','resources/js/lib/flexnav-master/js/jquery.flexnav', 'head');
	GLOABAL_VARS.app.includeScript('Layout','resources/js/core/entity/Layout', 'head');
	GLOABAL_VARS.app.includeScript('PageCtrl','resources/js/core/controller/PageCtrl', 'head');
	GLOABAL_VARS.app.includeScript('MenuCtrl','resources/js/core/controller/MenuCtrl', 'head');
	GLOABAL_VARS.app.includeScript('TitlePageDiretiva','resources/js/core/diretivas/title-page/TitlePageDiretiva', 'head');
	GLOABAL_VARS.app.includeScript('FixedDiretiva','resources/js/core/diretivas/fixed/FixedDiretiva', 'head');
	
	return angularAMD.bootstrap(GLOABAL_VARS.app);	
});
