package com.company;

public class GeometricFigure {
    String name;
    String color;

    public GeometricFigure(String name, String color) {
        this.name = name;
        this.color = color;
    }



    public void draw(){
        System.out.println("I'm drawing ");
    }
}
