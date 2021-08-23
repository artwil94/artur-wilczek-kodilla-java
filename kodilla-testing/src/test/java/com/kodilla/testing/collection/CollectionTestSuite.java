package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;

import com.kodilla.testing.user.SimpleUser;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Start test");
    }

    @AfterEach
    public void after() {
        System.out.println("End test");
    }




    @DisplayName("Exterminate numbers testing when list is empty ")
    @Test
   void  testOddNumbersExterminatorEmptyList(){
        List<Integer> numbers = new ArrayList<>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        exterminator.exterminate(numbers);
    }



    @DisplayName( "Exterminate Odd Numbers from normal list"

    )
    @Test
    void testOddNumbersExterminatorNormalList() {


        List<Integer> numbers = new ArrayList<>();
        Random theGenerator = new Random();
        for (int n = 0; n < 100; n++) {
            numbers.add(theGenerator.nextInt(100));
        }

        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        exterminator.exterminate(numbers);



    }
}