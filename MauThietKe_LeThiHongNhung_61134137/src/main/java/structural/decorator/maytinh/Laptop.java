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
public class Laptop extends MayTinh{
    public Laptop(String description) {
        super(description);
    }

    @Override
    public double cost() {
        return 10; //To change body of generated methods, choose Tools | Templates.
    }
}
