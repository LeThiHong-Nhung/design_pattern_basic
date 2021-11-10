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
//duy tri tham chieu toi quanly, thuc thi gd cap nhat observer
public class NhanVien implements INhanCongViec{
    List<String> listCV = new ArrayList<String>();
    String CV;
    QuanLy ql;
    String tenString;

    public NhanVien(String tenString) {
        this.tenString = tenString;
    }
    

    public void setQl(QuanLy ql) {
        this.ql = ql;
    }
    public void dangky()
    {
        ql.dangky(this);
        this.CV = ql.CongViec;        
    }
    public void huydangky()
    {
        ql.huydangky(this);
    }

    @Override
    public void NhanCongViec(String CongViec) {
        listCV.add(CongViec);        
    }
    public void indscv(){
        System.out.println("Nhung cong viec da lam:");
        for(String s : listCV)
        {
            System.out.println(s);
        }
    }

    
}
