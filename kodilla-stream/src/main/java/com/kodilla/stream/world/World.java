package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

    private final List<Continent> continents = new ArrayList<>();

    public void addContinents (Continent continent){
        continents.add(continent);

    }
    public boolean removeContinent(Continent continent) {
        return continents.remove(continent);
    }

    public BigDecimal getPeopleQuantity(){
        BigDecimal peopleOfWorldQuantity = continents.stream()
                .flatMap(continent -> continent.countries.stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum,current)->sum=sum.add(current));
        return peopleOfWorldQuantity;

    }
}
