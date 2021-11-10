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
public class SortProductByPrice extends SortCollection<Product>{

    @Override
    protected int compare(Product p1, Product p2) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(p1.getGia()>p2.getGia())
        {
            return 1;
        }
        else if(p1.getGia()<p2.getGia())
        {
            return -1;
        }
        else return 0;
    }
    
}
