package com.company;

class Painter {
    String id;
    String FirstName;
    String LastName;

    void drawFigure(Class<GeometricFigure> drawClass){
    }
 private static final Painter instance = new Painter();
   public static Painter getInstance() {
     return instance;
}
