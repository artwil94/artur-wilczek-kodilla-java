package com.kodilla.testing.weather.stub;

import java.util.*;


public class WeatherForecast {

    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {

        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {

            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;

    }

    public double getAverage() {

        double sum = 0;
        for (Map.Entry<String, Double> temperature1 : temperatures.getTemperatures().entrySet()) {
            sum += temperature1.getValue();
        }
        return sum / temperatures.getTemperatures().size();
    }

    public double getMedian(){
        List<Double> temperaturesMedian = new ArrayList<>();

        for(Map.Entry<String,Double> temperature2 : temperatures.getTemperatures().entrySet()){

            temperaturesMedian.add(temperature2.getValue());

        }
        Double[] objects =  new Double[temperaturesMedian.size()];
        objects = temperaturesMedian.toArray(objects);

       Arrays.sort(objects);
       double median;
       int totalElements = objects.length;
       if(totalElements % 2 == 0) {
           double sumOfMiddleElements = objects[totalElements/2] + objects[totalElements/2-1] ;
           median = ((double) sumOfMiddleElements)/2;
       } else {
           median = (double) objects[objects.length/2];
       }

       return median;
    }

}
