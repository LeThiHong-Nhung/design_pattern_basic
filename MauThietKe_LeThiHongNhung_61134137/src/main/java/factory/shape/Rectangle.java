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
public class Rectangle extends Shape{
    private static Rectangle instance;

    protected Rectangle(String brush, String paper, String frame, ShapeFactory sf) {
        super(brush, paper, frame, sf);
    }

    
    
    public static Rectangle createInstance(){
        if(instance == null)
        {
            instance = new Rectangle("Brush rectangle", "Paper rectangle", "Frame rectangle", sf);
        }
        return instance;
    }
    

    @Override
    public String draw() {
        return "Rectangle";
    }
}
