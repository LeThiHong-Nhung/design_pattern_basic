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
public class SingletonDemo {
    private static SingletonDemo instance;
    int count =0;

    protected SingletonDemo() {
    }
    
    public static SingletonDemo createInstance(){
        if(instance == null)
        {
            instance = new SingletonDemo();
        }
        return instance;
    }
    
    public void increase()
    {
        count++;
    }
    
    public void printInfo()
    {
        System.out.println("Count: " + count);
    }
}
