/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.decorator.vidu;

/**
 *
 * @author HONGNHUNG
 */
public class Decaf extends Beverage{

    public Decaf(String description) {
        super(description);
    }

    @Override
    public double cost() {
        return 20; //To change body of generated methods, choose Tools | Templates.
    }
    
}
