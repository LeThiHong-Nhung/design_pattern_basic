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
public abstract class Shape {
    private String  brush;
    private String paper;
    private String frame;
    static ShapeFactory sf;

    public Shape(String brush, String paper, String frame, ShapeFactory sf) {
        this.brush = brush;
        this.paper = paper;
        this.frame = frame;
        this.sf = sf;
    }
    

    public abstract String draw();

    @Override
    public String toString() {
        return "Shape{" + "brush=" + brush + ", paper=" + paper + ", frame=" + frame + '}';
    }
    
}
