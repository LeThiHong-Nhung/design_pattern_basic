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
public class Main_GioHang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<MatHang> listMH = new ArrayList<>();
        listMH.add(new MatHang("But", 5, 400000));
        listMH.add(new MatHang("vo", 5, 500000));
        listMH.add(new MatHang("Thuoc", 1, 10000));
        listMH.add(new MatHang("Tay", 1, 400000));
        GioHang gioHang;
        //gioHang = new GioHangCOD();
        gioHang = new GioHangOnline();
        
        gioHang.setGioHang(listMH);
        
        gioHang.printInfo();
    }
    
}
