/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vote.singleton;

/**
 *
 * @author HONGNHUNG
 */
public class Election {
    private static Election instance;
    int dT=0;
    int dJ=0;
    
    public Election()
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
        if(c == c.DonaldTrump)
            dT++;
        else dJ++;
    }
    public void printResult()
    {
        System.out.println("Donald Trump: "+dT +"vote\n"+"Joe Biden: "+ dJ+"vote");
    }
}
