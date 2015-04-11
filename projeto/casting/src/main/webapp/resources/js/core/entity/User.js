define(['jsClass','./Pessoa.js','../app.js'], function (jsClass, Pessoa, app) {
	var User = Pessoa.extend({
	    speakHello : function(person) {
	    	return "Ola " + person + " - " + Pessoa.SEXO_MASCULINO;
	    }
	});
	return app.registerClass("User", User);
});

