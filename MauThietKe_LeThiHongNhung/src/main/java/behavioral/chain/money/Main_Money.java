/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.chain.money;

/**
 *
 * @author HONGNHUNG
 */
public class Main_Money {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IMoney namTram = new Money(500, "Nam tram");
        IMoney haiTram = new Money(200, "Hai tram");
        IMoney motTram = new Money(100, "Mot tram");
        IMoney namChuc = new Money(50, "Nam chuc");
        IMoney haiChuc = new Money(20, "Hai chuc");
        IMoney muoiNgan = new Money(10, "Muoi ngan");
        IMoney namNgan = new Money(5, "Nam ngan");
        IMoney haiNgan = new Money(2, "Hai ngan");
        IMoney motNgan = new Money(1, "MotNgan");
        namTram.setSuccessor(haiTram)
                .setSuccessor(motTram)
                .setSuccessor(namChuc)
                .setSuccessor(haiChuc)
                .setSuccessor(muoiNgan)
                .setSuccessor(namNgan)
                .setSuccessor(haiNgan)
                .setSuccessor(motNgan);
//        String temp ="";
        System.out.println("1 trieu: " + namTram.chiTien(1000, ""));
        System.out.println("4 tram nam muoi ngan: " + namTram.chiTien(450, ""));
        System.out.println("Mot trieu: ");
        namTram.rutTien(1000);
    }
    
}
