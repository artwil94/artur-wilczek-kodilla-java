package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

class FlightRunner {

    public static void main(String[] args) throws RouteNotFoundException {

        Map<String, Boolean> availableAirports = new HashMap<>();

        availableAirports.put("Airport1", true);
        availableAirports.put("Airport2", true);
        availableAirports.put("Airport3", false);
        availableAirports.put("Airport4", true);
        availableAirports.put("Airport5", false);


        FlightLogic flightLogic = new FlightLogic(availableAirports);

        try{
            flightLogic.findFlight(new Flight("name1","Airport1"));
        }catch (RouteNotFoundException e){

        }

    }
}