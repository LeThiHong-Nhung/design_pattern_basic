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
public class HoBoi {
    void vitTrongHoBoi (Duck d, IFlyBehavior f, IQuackBehavior q)
    {
        d.setFlyBehavior(f);
        d.setQuackBehavior(q);
        d.display();
        System.out.print(d.display());
        return;
    }
}
