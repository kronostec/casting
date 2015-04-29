GLOABAL_VARS.app.controller('MenuCtrl', function ($scope, $rootScope) {
	var $scopePrivate = {};
	
	$scopePrivate.initVars = function() {
    	$scope.titlePage = "Home"; 
    	
    };
    
    $scopePrivate.initLayout = function() {
    	$(function(){
    		
    	});        	   
    };
    
    $scope.init = function() {
    	$scopePrivate.initVars();
    	$scopePrivate.initLayout();
    };              
});