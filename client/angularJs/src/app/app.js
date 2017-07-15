(function () {
    'use strict';

    angular
        .module('tracker',['ngRoute','ngResource'])
        .config(moduleConfig);

    moduleConfig.$inject=['$routeProvider'];

    function moduleConfig($routeProvider){

        $routeProvider
            .when('/vehicles',{
                templateUrl:'app/view/vehicles.tmpl.html',
                controller:'vehiclesController',
                controllerAs:'vehiclesVm'
            })
            .otherwise({
                redirectTo: '/vehicles'
            });
    }
})();