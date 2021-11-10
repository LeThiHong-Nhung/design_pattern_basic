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
public class Product {
    String ten;
    int gia;
    private int quantity;

    public Product(String ten, int gia, int quantity) {
        this.ten = ten;
        this.gia = gia;
        this.quantity = quantity;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
}
