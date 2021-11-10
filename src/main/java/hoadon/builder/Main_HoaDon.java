/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoadon.builder;

/**
 *
 * @author HONGNHUNG
 */
public class Main_HoaDon {
    public static void main(String[] args)
    {
        HoaDon.Builder builder = new HoaDon.Builder();
        HoaDon hd = builder.addHoaDonHeader("122", "12", "Nhung")
                .addCTHD("tendd", 3, (double)2.3, (double)3.4)
                .build();
        System.out.println(hd.toString());
    }
}
