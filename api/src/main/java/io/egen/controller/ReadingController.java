package io.egen.controller;

import io.egen.entity.Reading;
import io.egen.service.ReadingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by darav on 6/24/2017.
 */
@CrossOrigin(origins = "http://mocker.egen.io",maxAge=3600)
@RestController
@RequestMapping(value="/readings")
public class ReadingController {

    @Autowired
    ReadingService readingService;

    @RequestMapping(method = RequestMethod.POST)
    public Reading create(@RequestBody Reading reading){
        //System.out.println("Reading......");
        return readingService.create(reading);
    }
}
