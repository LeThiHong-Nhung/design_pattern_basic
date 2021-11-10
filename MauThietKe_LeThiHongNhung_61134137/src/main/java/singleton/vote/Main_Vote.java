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
public class Main_Vote {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Election e = Election.createInstance();
//        Election e1 = Election.createInstance();
//        e1.vote(Candidate.DonaldTrump);
//        //e1.check();
//        e1.vote(Candidate.DonaldTrump);
//        //e1.check();
//        e.vote(Candidate.JoeBiden);
//        //e.check();
//        e.vote(Candidate.JoeBiden);
//        //e.check();
//        
////        e.printResult();
////        e1.printResult();

        User user1 = new User("Tom", false);//false: chua vote lan nao
        System.out.println(" " + user1.toString());
        user1.vote(Candidate.JoeBiden);
        user1.vote(Candidate.JoeBiden);
        user1.vote(Candidate.DonaldTrump);
        User user2 = new User("Jack", false);
        System.out.println("  "+ user2.toString());
        user2.vote(Candidate.JoeBiden);
    }
    
}
