/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.giohangonthi;

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
        List<MatHang> list = new ArrayList<>();
        list.add(new MatHang("But chi",4, 10000));
        list.add(new MatHang("Vo but cau",10,15000));
        list.add(new MatHang("Thuoc ke", 16, 12000));
        IThanhToan tt = new ThanhToanAirpay();
        IVanChuyen vch = new GiaoHangNhanh();
        IKhuyenMai km = new KhuyenMai1();
        GioHang gh = new GioHang(tt, vch, km);
        gh.setDsMH(list);
        gh.printInfo();
    }
    
}
