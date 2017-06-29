package io.egen.controller;

import io.egen.entity.Vehicle;
import io.egen.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

/**
 * Created by darav on 6/24/2017.
 */

@CrossOrigin(origins = "http://mocker.egen.io", maxAge=3600)
@RestController
@RequestMapping(value="/vehicles")
public class VehicleController {

    @Autowired
    VehicleService vehicleService;

    @RequestMapping(method = RequestMethod.PUT  )
    public List<Vehicle> create(@RequestBody Vehicle vehicles[]){
        //System.out.println("Vehicles..........");
        return vehicleService.create(vehicles);
    }
}
