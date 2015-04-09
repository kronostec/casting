define(['angularAMD', 'angularRoute', 'jquery', 'kube'], function (angularAMD) {  
	var app = angular.module("webapp", ['ngRoute']);
	app.Class = {};
	app.registerClass = function(name, obj) {
		app.Class[name] = obj;
		return obj;
	};
	app.requireClass = function(className) {
		return app.Class[className];
	};
	var PATH = "resources/js/core/controller/";
	app.config(function ($routeProvider) {
	    $routeProvider
		    .when("/home", angularAMD.route({
		        templateUrl: 'Salci_Fufu', 
		        controller: 'HomeCtrl', 
		        controllerUrl: PATH + 'HomeCtrl.js'
		    }))
		    .when("/contato", angularAMD.route({
		        templateUrl: 'Salci_Fufu2', 
		        controller: 'ContatoCtrl', 
		        controllerUrl: PATH + 'ContatoCtrl.js'
		    }))
		    .otherwise({redirectTo: "/home"});
	 });	
	return angularAMD.bootstrap(app);
});