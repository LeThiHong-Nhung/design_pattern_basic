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
public class Computer {
    String cpu;
    String memory;
    String screen;
    String hd;

    protected Computer(Builder builder) {
        //private,..lop noi truy cap duoc
        this.cpu = builder.cpu;
        this.memory = builder.memory;
        this.hd = builder.hd;
        this.screen = builder.screen;
    }

    @Override
    public String toString() {
        return "Computer{" + "cpu=" + cpu + ", memory=" + memory + ", screen=" + screen + ", hd=" + hd + '}';
    }
    
    
    
    public static class Builder{
        String cpu,memory,screen,hd;

        public Builder() {
        }
        
        public Builder addCPU(String cpu)
        {
            this.cpu = cpu;
            return this;  //doi tuong builder
        }
        public Builder addMemory(String memory)
        {
            this.memory = memory;
            return this;  //doi tuong builder
        }
        public Builder addHD(String hd)
        {
            this.hd = hd;
            return this;  //doi tuong builder
        }
        public Builder addScreen(String screen)
        {
            this.screen = screen;
            return this;  //doi tuong builder
        }
        
        public Computer build()
        {
            return new Computer(this); 
        }
    }
}
