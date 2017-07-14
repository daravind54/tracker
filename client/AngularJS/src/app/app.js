/**
 * Created by darav on 7/14/2017.
 */
(function () {
    "use Strict";
    angular
        .module("CarTracker",["ngRoute"])
        .config(configModule);
    configModule.injector=["$routeProvide"];
    
    function configModule($routeProvide) {
        $routeProvide
            .when("/vehicles",{
                templateUrl:"/app/view/vehicles.tmpl.html",
                /*Controller:"VehiclesController",
                ControllerAs:"vehiclesVm"*/

            })
            .otherwise({
                redirectTo: '/vehicles'
            })
    }
})();