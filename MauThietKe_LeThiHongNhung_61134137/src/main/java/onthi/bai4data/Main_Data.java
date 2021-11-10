/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onthi.bai4data;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HONGNHUNG
 */
public class Main_Data {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<SanPham> list = new ArrayList<>();
        list.add(new SanPham("SP01", "But chi", 12, 12000));
        list.add(new SanPham("SP02", "Vo but cau", 19, 15000));
        list.add(new SanPham("SP03", "Sach giao khoa lich su", 2, 13000));
        list.add(new SanPham("SP04", "Sach giao khoa dia ly", 3, 14000));
        SanPham sp = new SanPham("SP05", "Sach giao khoa dia ly", 3, 14000);
        SanPham sp1 = new SanPham("SP05", "Vo creative", 3, 14000);
        
        DataAccess da = UI1.createInstance();
        DataAccess da2 = UI2.createInstance();
        da.setDsSP(list);
        da.them(sp);
        da.capNhat(sp1);
        da.xoa(sp);
        da.printInfo();
        da2.setDsSP(list);
//        da2.xoa(sp);
        System.out.println("Data access 2: ");
        da2.printInfo();
    }
    
}
