/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

/**
 *
 * @author toila
 */
public class SortProductByName extends SortCollection<Product>{
    @Override
    protected int compare(Product t1, Product t2) {
        if(t1.getName().compareTo(t2.getName()) == 1)
            return 1;
        else if(t1.getName().compareTo(t2.getName()) == 0)
                return 0;
        return -1;
    }
}
