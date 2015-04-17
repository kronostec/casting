GLOABAL_VARS.app.controller('TitlePageCtrl', function ($scope) {
	console.log($scope);
	
});
GLOABAL_VARS.app.directive('titlePage', ['$document', function($document) {
	  return {
		    link: function(scope, element, attr) {
		      //console.log(scope),
		      //console.log(element);
		      //console.log(attr)
		    },
		    transclude: true,//pega o conteudo do elemento
			restrict: "E",
			templateUrl: "/js/core/diretivas/title-page/titlePage.html" ,
			controller : "TitlePageCtrl",
	};
}]); 