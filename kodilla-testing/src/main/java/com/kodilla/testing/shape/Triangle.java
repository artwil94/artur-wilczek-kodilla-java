package com.kodilla.testing.shape;

public class Triangle implements Shape{

    int a;
    int b;

    public Triangle(int a,int b){
        this.a = a;
        this.b = b;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getField() {
        return a*b;
    }








   /* @Override
    public void getShapeName(String name) {

    }

    @Override
    public void getField(double field) {

    } */
}
