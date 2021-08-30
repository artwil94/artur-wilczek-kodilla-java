package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;

import com.kodilla.testing.user.SimpleUser;
import org.junit.jupiter.api.*;

import java.util.*;


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

/*
        List<Integer> numbers = new ArrayList<>();
        Random theGenerator = new Random();
        for (int n = 0; n < 10; n++) {
            numbers.add(theGenerator.nextInt(100));
        }



*/

        Integer a[] = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        List<Integer> numbers = Arrays.asList(a);

        System.out.println("All numbers:" + numbers);
        System.out.println();

        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        exterminator.exterminate(numbers);

        Assertions.assertTrue(evenNumbers.size()==7," Test ok");









        }
    }