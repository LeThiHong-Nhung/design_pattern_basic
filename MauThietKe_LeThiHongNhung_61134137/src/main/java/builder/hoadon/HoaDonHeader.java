/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder.hoadon;

/**
 *
 * @author HONGNHUNG
 */
public class HoaDonHeader {
    String maHD;
    String ngayBan;
    String tenKH;

    public HoaDonHeader(String maHD, String ngayBan, String tenKH) {
        this.maHD = maHD;
        this.ngayBan = ngayBan;
        this.tenKH = tenKH;
    }

    @Override
    public String toString() {
        return "HoaDonHeader{" + "maHD=" + maHD + ", ngayBan=" + ngayBan + ", tenKH=" + tenKH + '}';
    }
    
}
