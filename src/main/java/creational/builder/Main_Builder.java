/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.builder;

/**
 *
 * @author HONGNHUNG
 */
public class Main_Builder {
    public static void main(String[] args)
    {
        Computer.Builder builder = new Computer.Builder();
        Computer computer = builder.addCPU("Intel Core i9 12900")
            .addMemory("32GB DDR5 3200 MHz")
            .addHD("2TB SSD Samsung Evo Plus")
            .addScreen("14 Inches LG 4K")
            .build();
        System.out.println(computer.toString());
    }
}
