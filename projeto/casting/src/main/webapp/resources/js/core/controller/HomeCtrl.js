define(['../app.js',"../entity/User.js"], function (app,User) {
    app.controller('HomeCtrl', function ($scope) {
    	var user = new User();
    	console.log(user.typeOf(app.requireClass("Pessoa")));
    	user.nome = "Jose";
        $scope.message = user.nome + "- Message from HomeCtrl ->" + user.speakHello("JavaScript") + " SEXO - "; 
    });
}); 