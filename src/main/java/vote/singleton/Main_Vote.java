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
public class Main_Vote {
    public static void main(String[] args)
    {
        //
        Election e = Election.createInstance();
        e.vote(Candidate.JoeBiden);
        e.vote(Candidate.DonaldTrump);
        e.printResult();
    }
}