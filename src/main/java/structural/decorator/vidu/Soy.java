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
public class Soy extends CondimentDecorator{

    public Soy(Beverage beverage, String description) {
        super(beverage, description);
    }

    @Override
    public double cost() {
        return beverage.cost() + 2.5; //To change body of generated methods, choose Tools | Templates.
    }
    
}
