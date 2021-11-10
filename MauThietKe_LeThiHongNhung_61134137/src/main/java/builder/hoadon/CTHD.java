/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder.hoadon;

/**
 *
 * @author HONGNHUNG
 */
public class CTHD {
    String tenSP;
    int soLuong;
    double donGia;
    double chietKhau;

    public CTHD(String tenSP, int soLuong, double donGia, double chietKhau) {
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
    }

    @Override
    public String toString() {
        return "CTHD{" + "tenSP=" + tenSP + ", soLuong=" + soLuong + ", donGia=" + donGia + ", chietKhau=" + chietKhau + '}';
    }
    
}
