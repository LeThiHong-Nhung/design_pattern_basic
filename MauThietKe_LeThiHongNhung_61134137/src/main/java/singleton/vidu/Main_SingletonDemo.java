/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton.vidu;

/**
 *
 * @author HONGNHUNG
 */
public class Main_SingletonDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SingletonDemo s1 = SingletonDemo.createInstance();
        SingletonDemo s2 = SingletonDemo.createInstance();
        
        s1.increase();//tang count
        s1.increase();
        s2.increase();
        s1.printInfo();
        s2.printInfo();
    }
    
}
