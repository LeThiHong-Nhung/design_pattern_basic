/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author toila
 */
public class MainBai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Product> listPd = new ArrayList<>();
        listPd.add(new Product("Oi", 6000, 10));
        listPd.add(new Product("Tao", 10000, 10));
        listPd.add(new Product("Dao", 8000, 10));
        listPd.add(new Product("Nho", 2000, 10));
//        SortCollection<Product> productName = new SortProductByName();
//        productName.sort(listPd);
        SortCollection<Product> productPrice = new SortProductByPrice();
        productPrice.sort(listPd);
        listPd.forEach((t) -> {
            System.out.println(t.getName() + " - " + t.getPrice() + " - " + t.getQuantity());
        });
    }
    
}
