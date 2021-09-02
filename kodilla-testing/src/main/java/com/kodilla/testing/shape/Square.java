package com.kodilla.testing.shape;


public class Square implements Shape {

    int a;

    public Square(int a){
        this.a = a ;
    }
    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public double getField() {
        return a*a;
    }

    /* @Override
    public void getShapeName(String name) {

    }

    @Override
    public void getField(double field) {

    } */




}
