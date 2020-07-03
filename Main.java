package com.company;

public class Main {

    public static void main(String[] args) {
        
        GeometricFigure circle = new Circle("Circle", "red");
        GeometricFigure triangle = new Triangle("Triangle", "green");
        GeometricFigure quadrilateral = new Quadrilateral("Quadrilateral", "blue");
        painter.draw(circle); 
        painter.draw(triangle); 
        painter.draw(quadrilateral); 
        Painter.getPainter().drawFigure();
        Painter.getPainter().drawFigure();
        Painter.getPainter().drawFigure();
 
    }
}
