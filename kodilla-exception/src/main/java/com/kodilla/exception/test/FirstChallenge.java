package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }


    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
       // double result = firstChallenge.divide(3, 0);

        try {
            double result = firstChallenge.divide(3, 0);
        } catch (RuntimeException e) {
            System.out.println("Error! B cannot be zero ");
        }finally {
            System.out.println("Enter another number of B");
        }
    }
}