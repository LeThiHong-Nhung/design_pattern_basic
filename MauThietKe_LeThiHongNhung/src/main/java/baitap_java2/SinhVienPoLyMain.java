/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap_java2;

/**
 *
 * @author HONGNHUNG
 */
public class SinhVienPoLyMain {
    public static void main(String[] args)
    {
        SinhVienPoLy svpl = new SinhVienPoLy("Nhung","Cong nghe thong tin") {
            @Override
            public double getDiem() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        SinhVienIT svit = new SinhVienIT(5, 5, 6, "Nhung 2", "IT");
        SinhVienBiz svbiz = new SinhVienBiz(2, 4, "Nhung 3", "Marketing");
        
        svpl.xuat();
        svit.xuat();
        svbiz.xuat();
        
    }
}
