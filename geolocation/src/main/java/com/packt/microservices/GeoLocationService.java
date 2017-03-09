package com.packt.microservices;

import java.util.List;

/**
 * Created by sdine on 3/7/2017.
 */
public interface GeoLocationService {

    public GeoLocation create(GeoLocation geolocation);
    public List<GeoLocation> findAll();
}
