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
public abstract class GioHang {
    List<MatHang> gioHang = new ArrayList<>();

    public void setGioHang(List<MatHang> gioHang) {
        this.gioHang = gioHang;
    }
    
    public int tinhTien(){
        int tongTien = 0;
        for(MatHang t:gioHang){
            tongTien = tongTien + (t.soLuong * t.donGia);
        }
        return tongTien;
    }
    public abstract int tinhChietKhau();
    public int tienThanhToan(){
        return tinhTien() - tinhChietKhau();
    }
    public void printInfo(){
        System.out.println("Danh sach mat hang: ");
        gioHang.forEach(t -> {
            System.out.println("  " + t.toString());
        });
        System.out.println("Tong tien mua hang: "+ tinhTien());
        System.out.println("Tien chiet khau: " + tinhChietKhau());
        System.out.println("Tien khach hang can thanh toan: " + tienThanhToan());
    }
    
}
