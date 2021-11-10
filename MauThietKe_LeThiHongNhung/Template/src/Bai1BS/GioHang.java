/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1BS;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author toila
 */
public abstract class GioHang{
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
        System.out.println("Danh sách mặt hàng: ");
        gioHang.forEach(t -> {
            System.out.println("  " + t.toString());
        });
        System.out.println("Tổng tiền mua hàng: "+ tinhTien());
        System.out.println("Tiền chiết khấu: " + tinhChietKhau());
        System.out.println("Tiền khách hàng cần thanh toán: " + tienThanhToan());
    }
    
}
