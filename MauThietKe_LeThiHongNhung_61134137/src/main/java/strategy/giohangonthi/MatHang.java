/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.giohangonthi;

/**
 *
 * @author HONGNHUNG
 */
public class MatHang {
    String ten;
    int soLuong;
    float donGia;

    public MatHang(String ten, int soLuong, float donGia) {
        this.ten = ten;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }
    

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "MatHang{" + "ten=" + ten + ", soLuong=" + soLuong + ", donGia=" + donGia + '}';
    }
    
}
