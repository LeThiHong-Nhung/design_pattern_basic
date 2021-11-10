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
public class Main_ThanhToan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<MatHang> list = new ArrayList<>();
        list.add(new MatHang("But", 8, 90));
        list.add(new MatHang("Vo", 9, 100));
        list.add(new MatHang("But xoa", 8, 90));
        list.add(new MatHang("Sach giao khoa", 8, 90));
        IThanhToan ttol = new ThanhToanOnline();
        GioHang gioHang = new GioHang(ttol);
        gioHang.setList(list);
        gioHang.printInfo();
    }
    
}
