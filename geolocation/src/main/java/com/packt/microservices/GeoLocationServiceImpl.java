package com.packt.microservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sdine on 3/7/2017.
 */
@Service
public class GeoLocationServiceImpl  implements  GeoLocationService{

    @Autowired
    GeoLocationRepository geoLocationRepository;

    @Override
    public GeoLocation create(GeoLocation geolocation) {
        geoLocationRepository.addGeoLocation(geolocation);
        return geolocation;
    }

    @Override
    public List<GeoLocation> findAll() {

        return geoLocationRepository.getGeoLocations();
    }
}
