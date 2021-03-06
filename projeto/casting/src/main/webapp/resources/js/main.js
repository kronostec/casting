var JSCLASS_PATH = 'js/lib/jsclass/JS.Class 4.0.5/min/';
var GLOABAL_VARS = {};
require.config({
    baseUrl: "",
    paths: {
        angular: 'resources/js/lib/bower_components/angular/angular',
        angularRoute: 'resources/js/lib/angular/angular-route.min',
        angularAMD: 'resources/js/lib/angularAMD/angularAMD.min',        	
        jsClass : 'resources/js/lib/js_class/dist/browser/js.class.min',
        underscore : 'resources/js/lib/underscore/underscore',
        phaser : 'resources/js/lib/phaser/phaser.min',
        jquery : 'resources/js/lib/bower_components/jquery/dist/jquery',
        lumx : 'resources/js/lib/bower_components/lumx/dist/lumx',
        velocity : 'resources/js/lib/bower_components/velocity/velocity',
        moment : 'resources/js/lib/bower_components/moment/min/moment-with-locales',
        PageCtrl : 'resources/js/core/controller/PageCtrl',
        app : 'resources/js/core/app',
    },    
    shim: {//indica dependencias do modulo
        'angularAMD': ['angular'],
        'angularRoute': ['angular'],
        'lumx' : ['angular','angularAMD', 'angularRoute','jquery','velocity','moment','jsClass'],
    },    
    deps: ['lumx','resources/js/core/app.js']
});
