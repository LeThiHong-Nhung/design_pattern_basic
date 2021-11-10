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
public class Main_MayTinh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MayTinh m = new Laptop("Asus");
        m = new Ram(m, "Ram 4GB");
        MayTinh m2 = new PersonalComputer("PC");
        m2 = new NetworkCard(m2, "Network Card");
        System.out.println(m.getDescription());
        System.out.println(m.cost());
        System.out.println(m2.getDescription());
        System.out.println(m2.cost());
    }
    
}
