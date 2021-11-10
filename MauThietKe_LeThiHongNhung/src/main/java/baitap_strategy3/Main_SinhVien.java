/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap_strategy3;

/**
 *
 * @author HONGNHUNG
 */
public class Main_SinhVien {
    public static void main(String[] args)
    {
        QuanLySinhVien qlsv = new QuanLySinhVien();
//        qlsv.setSoSanh(new SoSanhTheoDiem());//sapXep();
//        qlsv.inDS();
        
        qlsv.setSoSanh(new SoSanhTheoTen());
//        qlsv.sapXep();
//        qlsv.inDS();
        
        qlsv.sapXep3();
        qlsv.inDS();
    }
}
