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
public class User {
    String name;
    boolean voted;//kiem tra user da vote hay chua

    public User(String name, boolean voted) {
        this.name = name;
        this.voted = voted;
    }

    public void vote(Candidate c)
    {
        Election e = Election.createInstance();
        if(!voted)
        {
            e.vote(c);
            voted = true;
        }
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + '}';
    }
    
}
