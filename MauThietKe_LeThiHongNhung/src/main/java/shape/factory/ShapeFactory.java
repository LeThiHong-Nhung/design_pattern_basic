/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape.factory;

/**
 *
 * @author HONGNHUNG
 */
public class ShapeFactory {
    
    public Shape createShape(String type)
    {
        Shape shape = null;
        if(type.equals("rectangle"))
        {
            shape = Rectangle.createInstance();
        }
        else if(type.equals("circle"))
        {
            shape = Circle.createInstance();
        }
        else {
            shape = Triangle.createInstance();
        }
        
        return shape;
    }
}
