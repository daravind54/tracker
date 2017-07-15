/**
 * Created by darav on 7/14/2017.
 */
(function () {
    angular
        .module('tracker')
        .controller('vehiclesController',vehiclesController);
    vehiclesController.$inject=['vehiclesService'];
    function vehiclesController(vehiclesService){
        var vehiclesVm = this;
        vehiclesService
            .getVehicles()
            .then(function (vehicles) {
                vehiclesVm.vehicles = vehicles;
                console.log(vehiclesVm.vehicles);
            }, function (error) {
                console.log(error);
            });
    }
})();