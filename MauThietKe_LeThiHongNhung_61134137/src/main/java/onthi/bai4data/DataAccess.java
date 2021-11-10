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
public class DataAccess {
    protected static DataAccess instance;
    List<SanPham> dsSP = new ArrayList<>();

    protected DataAccess() {
    }
    public static DataAccess createInstance(){
        if(instance==null)
            instance = new DataAccess();
        return instance;
    }

    public void setDsSP(List<SanPham> dsSP) {
        this.dsSP = dsSP;
    }
    public void them(SanPham sp)
    {
        boolean ktra = false;
        for (SanPham o : dsSP) {
            if(o.maSP==sp.maSP)
                ktra=true;
        }
        if(ktra == true)
            System.out.println("San pham da ton tai!");
        else{
            dsSP.add(sp);
        }
    }
    public void xoa(SanPham sp)
    {
        boolean ktra = false;
        if(dsSP.contains(sp))
        {
            ktra = true;
            dsSP.remove(sp);
        }
        if(ktra == false)
            System.out.println("San pham khong ton tai!");
    }
    public void capNhat(SanPham sp)
    {
        boolean ktra = false;
        for (SanPham o : dsSP) {
            if(o.maSP == sp.maSP)
            {
                ktra = true;
                o.tenSP = sp.tenSP;
                o.soLuong = sp.soLuong;
                o.donGia = sp.donGia;
            }
        }
        if(ktra == false)
            System.out.println("San pham khong ton tai!");
    }
    public void printInfo()
    {
        for (SanPham o : dsSP) {
            System.out.println(o.toString());
        }
    }
}
