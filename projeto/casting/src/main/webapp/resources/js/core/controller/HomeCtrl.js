define(['../app.js',"../entity/User.js"], function (app,User, Layout) {
    app.controller('HomeCtrl', function ($scope,LxNotificationService, LxDialogService, $rootScope) {
    	var user = new User();
    	console.log(user.typeOf(app.requireClass("Pessoa")));
    	user.nome = "Jose";
        $scope.message = user.nome + "- Message from HomeCtrl ->" + user.speakHello("JavaScript") + " SEXO - "; 
        
        var initVars = function() {
        	$scope.titlePage = "Home"; 
        	
        };
        
        var initLayout = function() {
        	$(function(){
  
        	});        	   
        };
        
        $scope.init = function() {
        	initVars();
        	initLayout();
        };
        
        
        $scope.opendDialog = function(dialogId){
            LxDialogService.open(dialogId);
        };

        $scope.closingDialog = function(){
            LxNotificationService.info('Dialog closed!');
        };
    });
}); 