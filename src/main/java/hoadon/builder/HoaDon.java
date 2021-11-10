/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoadon.builder;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HONGNHUNG
 */
public class HoaDon {
    HoaDonHeader hoaDonHeader;
    List<CTHD> cthds = new ArrayList<>();
    
    public HoaDon(Builder builder)
    {
        this.hoaDonHeader=hoaDonHeader;
        this.cthds = cthds;
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

    
}
