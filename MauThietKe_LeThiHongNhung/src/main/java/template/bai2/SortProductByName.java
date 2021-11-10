/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template.bai2;

/**
 *
 * @author HONGNHUNG
 */
public class SortProductByName extends SortCollection<Product>{

    @Override
    protected int compare(Product p1, Product p2) {
        return p1.ten.compareTo(p2.ten);
    }
    
}
