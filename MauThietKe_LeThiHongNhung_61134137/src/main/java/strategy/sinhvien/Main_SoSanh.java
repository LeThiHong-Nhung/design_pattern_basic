/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.sinhvien;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author HONGNHUNG
 */
public class Main_SoSanh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<SinhVien> dsSV = new ArrayList<>();
        dsSV.add(new SinhVien("Nhung", new Date(2001, 04, 04), (float)7.0));
        dsSV.add(new SinhVien("Tham", new Date(2001, 27, 04), (float)7.5));
        dsSV.add(new SinhVien("Dung", new Date(2000, 04, 04), (float)8.0));
        dsSV.add(new SinhVien("Hien Nhi", new Date(2001, 20, 04), (float)8.5));
        ISoSanh<SinhVien> sstd = new SoSanhTheoDiem();
        ISoSanh<SinhVien> sstt = new SoSanhTheoTen();
        QLSV qlsv = new QLSV(sstt);
        qlsv.setDsSV(dsSV);
        qlsv.sapXep();
        qlsv.inDS();
    }
    
}
