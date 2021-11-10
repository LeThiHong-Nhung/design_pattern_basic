/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HONGNHUNG
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HONGNHUNG
 */
public abstract class CaffeineBeverageWithHook extends CaffeineBeverage{
    final void repairRecipeHook(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments())
        {
            addCondiments();
        }
    }
    abstract void brew();
    abstract void addCondiments();
    
    void  boilWater()
    {
        System.out.println("Boiling water");
    }
    void pourInCup()
    {
        System.out.println("Pouring in cup");
    }
    boolean customerWantsCondiments()
    {
        return true;
    }
}


