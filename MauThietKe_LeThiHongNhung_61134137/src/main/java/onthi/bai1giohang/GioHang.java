/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onthi.bai1giohang;

import java.util.ArrayList;
import java.util.List;





/**
 *
 * @author HONGNHUNG
 */
public class GioHang {
    List<MatHang> dsMH = new ArrayList<>();
    IThanhToan thanhToan;
    IVanChuyen vanChuyen;
    IKhuyenMai khuyenMai;
    
    //float tong=0;

    public void setDsMH(List<MatHang> dsMH) {
        this.dsMH = dsMH;
    }

    public GioHang(IThanhToan thanhToan, IVanChuyen vanChuyen, IKhuyenMai khuyenMai) {
        this.thanhToan = thanhToan;
        this.vanChuyen = vanChuyen;
        this.khuyenMai = khuyenMai;
    }
    
    public float tinhTongTien()
    {
        float tong = 0;
        for (MatHang matHang : dsMH) {
            tong = tong + matHang.donGia*matHang.soLuong;
        }
        return tong;
    }
    public float thanhToan()
    {
        return tinhTongTien() - thanhToan.thanhToan(tinhTongTien())+ vanChuyen.tinhTienVanChuyen(tinhTongTien())
                - khuyenMai.tinhTienKhuyenMai(tinhTongTien());
    }
    public void printInfo()
    {
        System.out.println("Tong tien cua gio hang: "+tinhTongTien());
        System.out.println("Tien thanh toan duoc giam: "+thanhToan.thanhToan(tinhTongTien()));
        System.out.println("Phi van chuyen: "+vanChuyen.tinhTienVanChuyen(tinhTongTien()));
        System.out.println("Tien duoc khuyen mai: "+khuyenMai.tinhTienKhuyenMai(tinhTongTien()));
        System.out.println("Tien can thanh toan: "+thanhToan());
        System.out.println("Thoi gian du kien nhan hang: "+vanChuyen.tinhThoiGianVanChuyen());
    }
}
