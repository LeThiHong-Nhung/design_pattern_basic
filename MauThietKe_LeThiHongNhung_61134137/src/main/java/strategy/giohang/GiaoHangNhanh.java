/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.giohang;

/**
 *
 * @author HONGNHUNG
 */
public class GiaoHangNhanh implements IGiaoHang{

    @Override
    public float tinhPhiVanChuyen(int soLuong, float gtdh) {
        //System.out.println("\nGiao hang nhanh\n");
        float p =0;
        if(soLuong > 10)
            p = (float) 0.9;
        else if(soLuong >5)
            p = (float) 0.4;
        else p = (float) 0.2;
        return p;
    }

    @Override
    public String tinhThoiGianGiaoHang() {
        return "GiaoHangNhanh - Nhan hang sau 4 ngay!";
    }
    
}
