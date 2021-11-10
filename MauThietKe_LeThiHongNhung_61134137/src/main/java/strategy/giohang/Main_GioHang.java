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
public class Main_GioHang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<MatHang> listMH = new ArrayList<>();
        listMH.add(new MatHang("But", 5, 300000));
        listMH.add(new MatHang("Vo", 5, 500000));
        listMH.add(new MatHang("Thuoc", 1, 1000000));
        listMH.add(new MatHang("Tay", 1, 400000));
        IChietKhau ck = new KhachHangKimCuong();
        IGiaoHang gh = new GiaoHangNhanh();
        IKhuyenMai km = new KhuyenMai1();
        GioHang gioHang = new GioHang(ck, gh, km);       
        gioHang.setGioHang(listMH);       
        gioHang.printInfo();
    }
    
}
