/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template.thanhvien;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HONGNHUNG
 */
public abstract class HoaDon {
    String ten;
    int gia;
    private int quantity;
    float tongTien;
    float tienChietKhau;
    List<HoaDon> dsHangHoa = new ArrayList<>();

    public HoaDon(String ten, int gia, int quantity, float tongTien, float tienChietKhau) {
        this.ten = ten;
        this.gia = gia;
        this.quantity = quantity;
        this.tongTien = tongTien;
        this.tienChietKhau = tienChietKhau;
    }

    public float getTongTien() {
        return tongTien;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }

    public float getTienChietKhau() {
        return tienChietKhau;
    }

    public void setTienChietKhau(float tienChietKhau) {
        this.tienChietKhau = tienChietKhau;
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
    
    public void tinhTien()
    {
        for (HoaDon i : dsHangHoa) {
            i.tongTien = i.gia*i.quantity;
        }
    }
    public abstract void tinhChietKhau();
}
