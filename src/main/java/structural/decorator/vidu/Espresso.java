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
public class Espresso extends Beverage{

    public Espresso(String description) {
        super(description);
    }

    @Override
    public double cost() {
        return 16; //To change body of generated methods, choose Tools | Templates.
    }
    
}
