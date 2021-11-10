/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap_java2;

/**
 *
 * @author HONGNHUNG
 */
public abstract class SinhVienPoLy {
    String hoTen;
    String nganh;

    public SinhVienPoLy(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }
    
    public abstract double getDiem();
    
    public String getHocLuc()
    {
        if (getDiem() < 5)
            return "Yeu";
        else if (getDiem() >= 5 && getDiem() < 6.5)
            return "Trung binh";
        else if (getDiem() >= 6.5 && getDiem() < 7.5)
            return "Kha";
        else if (getDiem() >= 7.5 && getDiem() < 9)
            return "Gioi";
        else
            return "Xuat sac";    
    }
    
    public void xuat()
    {
        System.out.println(this.hoTen + "\n" + this.nganh);
    }
    
    
}
