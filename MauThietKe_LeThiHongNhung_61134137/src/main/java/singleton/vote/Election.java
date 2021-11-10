/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton.vote;

/**
 *
 * @author HONGNHUNG
 */
public class Election {
    private static Election instance;
    int dT=0;//so phieu cho Trump
    int dJ=0;//so phieu cho Biden

    
    protected Election()
    {}
    public static Election createInstance(){
        if(instance == null)
        {
            instance = new Election();
        }
        return instance;
    }
    
    //public check: kiem tra 1 user vote cho 1 doi tuong
    
    
    public void vote(Candidate c)
    {
            if(c ==c.DonaldTrump)
                dT= dT+1;
            else dJ = dJ+1;
        printResult();
        
    }
    public void printResult()
    {
        System.out.println("Donald Trump: "+dT +"vote\n"+"Joe Biden: "+ dJ+"vote");
    }
}
