var JSCLASS_PATH = 'js/lib/jsclass/JS.Class 4.0.5/min/';
var GLOABAL_VARS = {};
require.config({
    baseUrl: "",
    paths: {
        angular: '/resources/js/lib/bower_components/angular/angular',
        angularRoute: '//ajax.googleapis.com/ajax/libs/angularjs/1.2.16/angular-route.min',
        angularAMD: '//cdn.jsdelivr.net/angular.amd/0.2.0/angularAMD.min',        	
        jsClass : '/resources/js/lib/js_class/dist/browser/js.class.min',
        underscore : '/resources/js/lib/underscore/underscore',
        phaser : '/resources/js/lib/phaser/phaser.min',
        jquery : '/resources/js/lib/bower_components/jquery/dist/jquery',
        lumx : '/resources/js/lib/bower_components/lumx/dist/lumx',
        velocity : '/resources/js/lib/bower_components/velocity/velocity',
        moment : '/resources/js/lib/bower_components/moment/min/moment-with-locales',
        PageCtrl : '/resources/js/core/controller/PageCtrl',
    },    
    shim: {//indica dependencias do modulo
        'angularAMD': ['angular'],
        'angularRoute': ['angular'],
        'lumx' : ['angular'],
    },    
    deps: ['angularAMD', 'angularRoute','jquery','velocity','moment','jsClass', '/resources/js/core/app.js']
});
