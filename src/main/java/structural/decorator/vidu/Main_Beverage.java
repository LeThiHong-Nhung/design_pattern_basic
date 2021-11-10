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
public class Main_Beverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Beverage b = new DarkRoast("Americano");
        b = new Mocha(b, "Mocha");
        Beverage b2 = new HouseBlend("HouseBlend");
        b2 = new Whip(b2, "Whip");
        System.out.println(b.getDescription());
        System.out.println(b.cost());
        System.out.println(b2.getDescription());
        System.out.println(b2.cost());
    }
    
}
