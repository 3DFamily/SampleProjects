package com.packt.microservices;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by sdine on 3/7/2017.
 */

@Repository
public class GeoLocationRepository {

    private List<GeoLocation> geolocations = new ArrayList<>();

    public void addGeoLocation(GeoLocation geolocation) {
        geolocations.add(geolocation);
    }

    public List<GeoLocation> getGeoLocations() {
        return Collections.unmodifiableList(geolocations);
    }

}
