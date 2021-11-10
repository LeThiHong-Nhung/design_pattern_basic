/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder.hoadon;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HONGNHUNG
 */
public class HoaDon {
    HoaDonHeader hoaDonHeader;
    List<CTHD> cthds = new ArrayList<>();

    public void setCthds(List<CTHD> cthds) {
        this.cthds = cthds;
    }
    
    
    public HoaDon(Builder builder)
    {
        this.hoaDonHeader=builder.hoaDonHeader;
        this.cthds = builder.cthds;
    }
    
    public static class Builder{
        HoaDonHeader hoaDonHeader;
        List<CTHD> cthds = new ArrayList<>();
        
        public Builder()
        {}
        public Builder addHoaDonHeader(String maHD, String ngayBan, String tenKH)
        {
            hoaDonHeader = new HoaDonHeader(maHD, ngayBan, tenKH);
            return this;
        }
        public Builder addCTHD(String tenSP, int soLuong, double donGia, double chietKhau)
        {
            cthds.add(new CTHD(tenSP, soLuong, donGia, chietKhau));
            return this;
        }
        public HoaDon build()
        {
            return new HoaDon(this);
        }
                
    }
    public void printInfo()
    {
        if(cthds==null)
            System.out.println("NULL");
        cthds.forEach((t) -> {
            System.out.println("  " + t.toString());
        });
        System.out.println("  " + hoaDonHeader.toString());
    }
}
