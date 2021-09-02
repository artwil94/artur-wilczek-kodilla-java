package com.kodilla.testing.shape;

public class Circle implements Shape{

    double r;                                                 // radius

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public double getField() {
        return (Math.PI*r*r);
    }






    /*  @Override
    public void getShapeName(String name) {

    }

    @Override
    public void getField(double field) {

    } */
 }
