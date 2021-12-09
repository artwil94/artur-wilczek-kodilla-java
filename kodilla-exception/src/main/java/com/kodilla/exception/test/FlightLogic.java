package com.kodilla.exception.test;

import java.util.Map;

public class FlightLogic {

    Map<String, Boolean> availableAirports;

    public FlightLogic(Map<String, Boolean> availableAirports) {
        this.availableAirports = availableAirports;

    }

    public void findFlight(Flight flight) throws RouteNotFoundException {

        if (availableAirports.containsKey(flight.getArrivalAirport())) {
            if (availableAirports.get(flight.getArrivalAirport())) {
                System.out.println("This airport is available");
            } else
                System.out.println("This airport is not available");
            }
            else{
                throw new RouteNotFoundException("Airport not found");
            }

        }
    }


