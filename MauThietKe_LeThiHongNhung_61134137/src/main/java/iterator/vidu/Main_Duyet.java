/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator.vidu;

/**
 *
 * @author HONGNHUNG
 */
public class Main_Duyet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConcreteAggregate abc = new ConcreteAggregate();
        Iterator ite = abc.CreateIterator();
        System.out.println(ite.First());
        while(ite.isDone() == false)
        {
            System.out.println(ite.Next());
        }
    }
    
}
