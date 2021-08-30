package com.kodilla.testing.collection;


import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

   public List<Integer > exterminate(List<Integer> numbers){

       List<Integer>  evenNumbers = new ArrayList<>();

       int value = 0;
       for (int i=0; i<numbers.size(); i++){

           value=numbers.get(i);

           if(value%2==0){
               evenNumbers.add(value);
             // System.out.println(value);
           }


       }

       return evenNumbers;



   }

}


