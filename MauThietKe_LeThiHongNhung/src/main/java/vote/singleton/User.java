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
public class User {
    String name;
    
    
    public void vote(Candidate c)
    {
        Election e = Election.createInstance();
        e.vote(c);
    }
}
