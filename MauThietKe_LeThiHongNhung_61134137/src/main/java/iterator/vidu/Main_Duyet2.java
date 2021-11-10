/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator.vidu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author HONGNHUNG
 */
public class Main_Duyet2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        Iterator<String> ite = list.iterator();
        while(ite.hasNext())
            {
                System.out.println(ite.next());
            }
    }
    
}
