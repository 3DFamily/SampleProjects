package com.packt.microservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by sdine on 3/6/2017.
 */

@RestController
@RequestMapping("/geolocation")
public class GeoLocationController {

    @Autowired
    private GeoLocationService service;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public List<GeoLocation> getGeoLocationss(){
        return service.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    public GeoLocation create(@RequestBody GeoLocation  geoLocation){
        return service.create(geoLocation);

    }


}
