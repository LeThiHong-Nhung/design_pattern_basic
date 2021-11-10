/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duck;

/**
 *
 * @author HONGNHUNG
 */
public abstract class Duck {
    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;
    
    public void setFlyBehavior  (IFlyBehavior flyBehavior)
    {
        this.flyBehavior = flyBehavior;
    }
    
    public void setQuackBehavior (IQuackBehavior quackBehavior)
    {
        this.quackBehavior = quackBehavior;
    }
    
    public abstract String display();
    
    String swim()
    {
        return "Boi";
    }
    
    String performFly()
    {
        return flyBehavior.fly();
    }
    
    String performQuack()
    {
        return quackBehavior.quack();
    }
    
    @Override
    public String toString()
    {
        return swim() + "\n" +
            performFly() + "\n" +
            performQuack() + "\n";
    }
}
