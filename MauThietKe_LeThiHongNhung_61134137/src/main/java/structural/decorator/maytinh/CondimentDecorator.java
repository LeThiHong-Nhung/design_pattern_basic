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
public abstract class CondimentDecorator extends MayTinh{
    MayTinh mayTinh;

    public CondimentDecorator(MayTinh mayTinh, String description) {
        super(description);
        this.mayTinh = mayTinh;
    }

    @Override
    public String getDescription() {
        return mayTinh.getDescription() + " " + this.description; //To change body of generated methods, choose Tools | Templates.
    }
}
