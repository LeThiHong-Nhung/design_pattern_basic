/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author toila
 */
public class MainBai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<SinhVien> listSV = new ArrayList<>();
        listSV.add(new SinhVien(100, "Kim Thoa", "Nha Trang"));
        listSV.add(new SinhVien(200, "Thanh Hiếu", "Nha Trang"));
        listSV.add(new SinhVien(300, "Việt Hoàng", "Nha Trang"));
        EntityDB<SinhVien> sv = new SinhVienDB();
        for(SinhVien t:listSV){
            sv.add(t);
        }
        SinhVien newSV = (new SinhVien(400, "Quốc Dũng", "Nha Trang"));
        sv.add(newSV);
        SinhVien deleteSV = listSV.get(1);
        sv.delete(deleteSV);
        sv.deleteByKey(100);
        sv.printInfo();
    }
    
}
