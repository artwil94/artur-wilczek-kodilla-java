package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args) {

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

                if(result.equals("theForumUser")) {
                    System.out.println("test OK");
                }else{
                    System.out.println("Error!");
                }

        System.out.println("Test - pierwszy test jednostkowy:");

           Calculator calculator = new Calculator();


                         int result1 = calculator.Add(5, 10);
                         System.out.println(result1);

                         int result2 = calculator.Subtract(5,10);
                         System.out.println(result2);









    }
}
