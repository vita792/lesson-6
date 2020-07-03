package com.company;

public class Painter {
    private static Painter painter;
    private static int id;
    private static String firstName;
    private static String lastName;
    
    public static synchronized Painter getPainter() {
        if(painter == null){
            painter = new Painter();
        }
     return painter;
}
    private Painter(){
    }
    public void drawFigure(name,  color){
        
       System.out.println();
    }
}     
