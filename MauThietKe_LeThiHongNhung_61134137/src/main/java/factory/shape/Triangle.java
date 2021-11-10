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
public class Triangle extends Shape{
    private static Triangle instance;

    protected Triangle(String brush, String paper, String frame, ShapeFactory sf) {
        super(brush, paper, frame, sf);
    }

    
    
    public static Triangle createInstance(){
        if(instance == null)
        {
            instance = new Triangle("Brush triangle", "Paper triangle", "Frame triangle", sf);
        }
        return instance;
    }
    

    @Override
    public String draw() {
        return "Triangle";
    }
}
