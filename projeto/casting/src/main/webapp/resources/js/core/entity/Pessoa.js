define(['jsClass','../app.js'], function (jsClass, app) {
	var Pessoa = Class({		
	    get : {
	    	nome : function() {
	    		return nome;
	    	}
	    },
	    set: {
	        nome : function(value) {
	            nome = value + "---" + Pessoa.SEXO_MASCULINO + "---";
	        },
	    }
	}).static({
		SEXO_FEMININO : 0,
	    SEXO_MASCULINO : 1,	   
	});
	
	return app.registerClass("Pessoa", Pessoa);
});

