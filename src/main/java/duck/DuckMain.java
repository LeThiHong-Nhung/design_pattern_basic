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
public class DuckMain {
    public static void main(String[] args)
    {
        Duck duck = new VitBau();
        IFlyBehavior flyBehavior = new FlyWithWings();
        IQuackBehavior quackBehavior = new Quacking();
        
        IFlyBehavior fl =new FlyNoWay();
        IQuackBehavior qu = new MuteQuack();
        HoBoi hoBoi = new HoBoi();
        hoBoi.vitTrongHoBoi(duck, flyBehavior, quackBehavior);
        
        hoBoi.vitTrongHoBoi(duck, fl, qu);
    }
}
