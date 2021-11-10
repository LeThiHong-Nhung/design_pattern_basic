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
public class Main_Shape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Shape shape;
        ShapeType rt = ShapeType.rectangle;
        ShapeType ci = ShapeType.circle;
        ShapeType tr = ShapeType.rectangle;
        ShapeFactory factory = new ShapeFactory();
        shape = factory.createShape(rt);
        System.out.println("  " + shape.toString());
        shape = factory.createShape(ci);
        System.out.println("  " + shape.toString());
        shape = factory.createShape(tr);
        System.out.println("  " + shape.toString());
    }
    
}
