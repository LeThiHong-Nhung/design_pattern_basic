/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.giohang;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HONGNHUNG
 */
public class GioHang{
    List<MatHang> gioHang = new ArrayList<>();
    IChietKhau ck;
    IGiaoHang gh;
    IKhuyenMai km;
    
    float tongTien = 0;

    public GioHang(IChietKhau ck, IGiaoHang gh, IKhuyenMai km) {
        this.ck = ck;
        this.gh = gh;
        this.km = km;
    }
    

    
    public void setGioHang(List<MatHang> gioHang) {
        this.gioHang = gioHang;
    }

    public void setCk(IChietKhau ck) {
        this.ck = ck;
    }

    public void setGh(IGiaoHang gh) {
        this.gh = gh;
    }

    public void setKm(IKhuyenMai km) {
        this.km = km;
    }
    
    public float tinhTien(){
        for(MatHang t:gioHang){
            tongTien = tongTien + (t.soLuong * t.donGia);
        }
        return tongTien;
    }

    public float tienThanhToan(){
        tongTien = tongTien - ck.tinhChietKhau(tongTien) +gh.tinhPhiVanChuyen(gioHang.size(), tongTien)
                + km.tinhTienKhuyenMai(tongTien);
        return tongTien;
    }
    public void printInfo(){
        System.out.println("Danh sach mat hang: ");
        gioHang.forEach(t -> {
            System.out.println("  " + t.toString());
        });
        System.out.println("Tong tien mua hang: "+ tinhTien());
        System.out.println("Tien chiet khau: " + ck.tinhChietKhau(tongTien));
        System.out.println("Phi van chuyen: " + gh.tinhPhiVanChuyen(gioHang.size(), tongTien));
        System.out.println("Tien khuyen mai: "+ km.tinhTienKhuyenMai(tongTien));
        System.out.println("Tien khach hang can thanh toan: " + tienThanhToan());
        System.out.println("Thoi gian du kien nhan hang: "+ gh.tinhThoiGianGiaoHang());
    }
}
