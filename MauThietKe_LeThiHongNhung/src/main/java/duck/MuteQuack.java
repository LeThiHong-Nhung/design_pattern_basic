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
public class MuteQuack implements IQuackBehavior {
    @Override
    public String quack()
    {
        return "Can't quack!";
    }
}
