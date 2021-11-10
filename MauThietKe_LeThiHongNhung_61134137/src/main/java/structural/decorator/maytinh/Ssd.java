/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.decorator.maytinh;

/**
 *
 * @author HONGNHUNG
 */
public class Ssd extends CondimentDecorator{
    public Ssd(MayTinh mayTinh, String description) {
        super(mayTinh, description);
    }

    @Override
    public double cost() {
        return mayTinh.cost() + 25; //To change body of generated methods, choose Tools | Templates.
    }
}
