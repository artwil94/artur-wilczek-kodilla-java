package com.kodilla.exception.test;

import com.kodilla.exception.test.SecondChallenge;

public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(2, 1.5);
        } catch (Exception e) {
            System.out.println("Problem!");
        }
    }
}