package com.company;

public class Quadrilateral extends GeometricFigure {
    public Quadrilateral(String name, String color) {
        super(name, color);
    }
    @Override
    public void draw(){
        System.out.println("This is a Quadrilateral");
    }
}
