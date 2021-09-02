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
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        List<Integer> emptyList = new ArrayList<>();

        // When
        List<Integer> result = exterminator.exterminate(emptyList);

        //Then
        Assertions.assertEquals(emptyList,result);
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
 // Given
        Integer a[] = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        List<Integer> list = Arrays.asList(a);

        //System.out.println("All numbers:" + numbers);
        //System.out.println();

        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(2);
        expectedList.add(4);
        expectedList.add(6);
        expectedList.add(8);
        expectedList.add(10);
        expectedList.add(12);
        expectedList.add(14);



        //When
        List<Integer> result1 = exterminator.exterminate(list);
        System.out.println("Testing" + " " + expectedList);

        //Then
        Assertions.assertEquals(expectedList, result1);
        Assertions.assertEquals(expectedList.size(), result1.size());
        Assertions.assertEquals(7, result1.size());


        //Assertions.assertTrue(evenNumbers.size()==7," Test ok");









        }
    }