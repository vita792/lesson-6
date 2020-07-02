package com.company;

public class Сircle extends GeometricFigure{
    public Сircle(String name, String color) {
        super(name, color);
    }
    @Override
    public void draw(){
        System.out.println("This is a Сircle");
    }
}
