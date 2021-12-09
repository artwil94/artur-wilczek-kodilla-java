package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

class FlightRunner {

    public static void main(String[] args) throws RouteNotFoundException {

        Map<String, Boolean> availableAiports = new HashMap<>();

        availableAiports.put("Airport1", true);
        availableAiports.put("Airport2", true);
        availableAiports.put("Airport3", false);
        availableAiports.put("Airport4", true);
        availableAiports.put("Airport5", false);


        FlightLogic flightLogic = new FlightLogic(availableAiports);

        try{
            flightLogic.findFlight(new Flight("name1","Airport1"));
        }catch (RouteNotFoundException e){

        }

    }
}