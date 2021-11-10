/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2BS;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author toila
 */
public abstract class HoaDon {
    List<HangHoa> listHH = new ArrayList<>();

    public void setListHH(List<HangHoa> listHH) {
        this.listHH = listHH;
    }
    public int tinhTien(){
        int tongtien = 0;
        for(HangHoa t:listHH){
            tongtien += t.thanhTien;
        }
        return tongtien;
    }
    public abstract int tinhChietKhau();
    public int tienThanhToan(){
        return tinhTien() - tinhChietKhau();
    }
    
    public void printHoaDon(){
        System.out.println("Danh sách mặt hàng: ");
        listHH.forEach(t -> {
            System.out.println(t.toString());
        });
        System.out.println("Tổng tiền mua hàng: "+ tinhTien());
        System.out.println("Tiền chiết khấu: " + tinhChietKhau());
        System.out.println("Tiền khách hàng cần thanh toán: " + tienThanhToan());
    }
}