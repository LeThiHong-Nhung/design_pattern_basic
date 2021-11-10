/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory.shape;

/**
 *
 * @author HONGNHUNG
 */
public class Circle extends Shape{
    private static Circle instance;

    
    protected Circle(String brush, String paper, String frame, ShapeFactory sf) {
        super(brush, paper, frame, sf);
    }
    
    public static Circle createInstance(){
        if(instance == null)
        {
            instance = new Circle("Brush circle", "Paper circle", "Frame circle", sf);
        }
        return instance;
    }

    

    @Override
    public String draw() {
        return "Circle";
    }
}
