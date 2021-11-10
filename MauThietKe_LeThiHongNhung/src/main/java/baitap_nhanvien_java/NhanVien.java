/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap_nhanvien_java;

/**
 *
 * @author HONGNHUNG
 */

public class NhanVien {
    private String ten;
    private int tuoi;
    private String diaChi;
    private double tienLuong;
    private int tongGioLam;

    public NhanVien() {
        ten = "";
        tuoi = 0;
        diaChi = "";
        tienLuong = 0;
        tongGioLam = 0;
    }

    public NhanVien(String ten, int tuoi, String diaChi, double tienLuong, int tongGioLam) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.tienLuong = tienLuong;
        this.tongGioLam = tongGioLam;
    }


    // Các getter setter
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getTienLuong() {
        return tienLuong;
    }

    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }

    public int getTongGioLam() {
        return tongGioLam;
    }

    public void setTongGioLam(int tongGioLam) {
        this.tongGioLam = tongGioLam;
    }

    public String getThongTin()
    {
        return "\nTen: " + ten +"Tuoi: " + tuoi +"Tien luong: " + tienLuong+
                "Tong gio lam: " + tongGioLam;
    }

    public double tinhThuong()
    {
        double tienThuong = 0;
        if(tongGioLam >= 200)
            tienThuong = tienLuong * 0.2;
        else
        if(tongGioLam >= 100)
            tienThuong = tienLuong * 0.1;
        return tienThuong;
    }
}