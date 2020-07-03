package com.company;

class Painter {
    private static Painter id;
    private static Painter firstName;
    private static Painter lastName;

    void drawFigure(Class<GeometricFigure> drawClass){
    }
    
 private static final Painter instance = new Painter();
   public static Painter getInstance() {
     return instance;
}
}
