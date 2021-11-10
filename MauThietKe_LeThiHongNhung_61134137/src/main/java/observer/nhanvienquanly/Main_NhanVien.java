/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer.nhanvienquanly;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HONGNHUNG
 */
public class Main_NhanVien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        QuanLy ql = new QuanLy();
        NhanVien nva = new NhanVien("Nhung");
        
        nva.setQl(ql);
        nva.dangky();
        ql.GiaoViec("Cong viec 1");
        ql.GiaoViec("Cong viec 2");
        ql.GiaoViec("Cong viec 3");
        nva.indscv();
        
    }
    
}
