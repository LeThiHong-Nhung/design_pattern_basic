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
public abstract class MayTinh {
    String description;

    public MayTinh(String description) {
        this.description = description;
    }


    public String getDescription() {
        return description;
    }
    public abstract double cost();
}
