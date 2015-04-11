var JSCLASS_PATH = 'js/lib/jsclass/JS.Class 4.0.5/min/';
require.config({
    baseUrl: "",
    paths: {
        angular: '//ajax.googleapis.com/ajax/libs/angularjs/1.2.16/angular.min',
        angularRoute: '//ajax.googleapis.com/ajax/libs/angularjs/1.2.16/angular-route.min',
        angularAMD: '//cdn.jsdelivr.net/angular.amd/0.2.0/angularAMD.min',        	
        jsClass : 'resources/js/lib/js_class/dist/browser/js.class.min',
        underscore : 'resources/js/lib/underscore/underscore',
        phaser : 'resources/js/lib/phaser/phaser.min',
        jquery : 'resources/js/lib/jquery/jquery2.1.1',
        kube : 'resources/js/lib/kube/js/kube.min'
    },    
    shim: {
        'angularAMD': ['angular'],
        'angularRoute': ['angular']
    },    
    deps: ['resources/js/core/app.js']
});
