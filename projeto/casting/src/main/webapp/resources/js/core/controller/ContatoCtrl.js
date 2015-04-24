define(['../app.js'], function (app) {
    app.controller('ContatoCtrl', function ($scope) {

        var initVars = function() {
        	$scope.titlePage = "Pagina Contato"; 
        	
        };
        
        var initLayout = function() {
        	$(function(){
  
        	});        	   
        };
        
        $scope.init = function() {
        	initVars();
        	initLayout();
        };
    });
}); 