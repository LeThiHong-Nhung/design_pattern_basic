/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template.thanhtoanonline;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HONGNHUNG
 */
public class GioHang {
    List<MatHang> list = new ArrayList<>();
    IThanhToan thanhToan;

    public GioHang(IThanhToan thanhToan) {
        this.thanhToan = thanhToan;
    }

    public void setList(List<MatHang> list) {
        this.list = list;
    }
    public int tinhTien()
    {
        int tienHang =0;
        for (MatHang o : list) {
            tienHang = tienHang + o.donGia * o.soLuong;
        }
        return tienHang;
    }
    public float tinhChietKhau()
    {
        return thanhToan.tinhChietKhau(tinhTien());
    }
    public float tienThanhToan()
    {
        return tinhTien() - thanhToan.tinhChietKhau(tinhTien());
    }
    public void printInfo()
    {
        System.out.println("Danh sach mat hang: ");
        list.forEach((t) -> {
            System.out.println("  " + t.toString());
        });
        System.out.println("Tong tien: "+tinhTien());
        System.out.println("Tien chiet khau: "+tinhChietKhau());
        System.out.println("Tien khach hang phai tra: "+ tienThanhToan());
    }
}
