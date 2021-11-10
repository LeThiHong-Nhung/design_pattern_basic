/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template.bai2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HONGNHUNG
 */
public class Product_Main {
    public static void main(String[] args)
    {
        List<Product> list = new ArrayList<>();
        list.add(new Product("SP1", 8, 0));
        list.add(new Product("AP2", 0, 0));
        list.add(new Product("BP3", 9, 0));
        list.add(new Product("YP4", 10, 0));
        
        SortCollection<Product> s = new SortProductByName();
        SortCollection<Product> s1 = new SortProductByPrice();
       // s.sort(list);
        s1.sort(list);
        list.forEach((t) -> {
            System.out.println(t.getTen() + " " +
                    t.getGia() + " " + 
                    t.getQuantity() + "\n");
        });
    }
}
