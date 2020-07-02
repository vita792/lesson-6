package com.company;

public class Triangle extends GeometricFigure {
    public Triangle(String name, String color) {
        super(name, color);
    }
    @Override
    public void draw(){
        System.out.println("This is a Triangle");
    }
}
