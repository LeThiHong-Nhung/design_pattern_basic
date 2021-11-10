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
public class ShapeFactory {
    Shape shape;

    public ShapeFactory(Shape shape) {
        this.shape = shape;
    }

    ShapeFactory() {
    }

    
    public Shape createShape(ShapeType type)
    {
        
        if(type.equals(type.rectangle))
        {
            shape = Rectangle.createInstance();
        }
        else if(type.equals(type.circle))
        {
            shape = Circle.createInstance();
        }
        else {
            shape = Triangle.createInstance();
        }
        
        return shape;
    }
}
