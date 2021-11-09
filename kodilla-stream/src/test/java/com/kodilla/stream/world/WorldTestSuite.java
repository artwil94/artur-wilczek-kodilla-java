package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {

        //Given
        World world = new World();

        Country country1 = new Country("Poland", new BigDecimal("40000000"));
        Country country2 = new Country("Norway", new BigDecimal("6000000"));
        Country country3 = new Country("China", new BigDecimal("1420000000"));
        Country country4 = new Country("India", new BigDecimal("1296000000"));
        Country country5 = new Country("Kenya", new BigDecimal("48000000"));
        Country country6 = new Country("SouthAfrica", new BigDecimal("60000000"));

        Continent europe = new Continent();
        europe.addCountry(country1);
        europe.addCountry(country2);
        Continent asia = new Continent();
        asia.addCountry(country3);
        asia.addCountry(country4);
        Continent africa = new Continent();
        africa.addCountry(country5);
        africa.addCountry(country6);

        world.addContinents(europe);
        world.addContinents(asia);
        world.addContinents(africa);

        //When
        BigDecimal exceptedQuantity = new BigDecimal("2870000000");

        //Then
        assertEquals(exceptedQuantity, world.getPeopleQuantity());
    }
}