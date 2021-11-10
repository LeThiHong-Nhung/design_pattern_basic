/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder.maytinh;

/**
 *
 * @author HONGNHUNG
 */
public class Main_Computer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Computer.Builder builder = new Computer.Builder();
        Computer computer = builder.addCPU("Intel Core i9 12900")
            .addMemory("32GB DDR5 3200 MHz")
            .addHD("2TB SSD Samsung Evo Plus")
            .addHD("Man hinh cong")
            .addScreen("14 Inches LG 4K")
            .build();
        System.out.println(computer.toString());
    }
    
}
