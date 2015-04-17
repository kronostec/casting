
var ctrlObjFixed = function() {
	alert(1);
	
}
var LayoutClass = function() {
	
	
}



GLOABAL_VARS.app.registerClass("Layout",Class({		
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
		init : function() {
			ctrlObjFixed();		
		}, 
	})
);

