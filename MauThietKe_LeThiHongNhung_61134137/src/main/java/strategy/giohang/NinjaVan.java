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
public class NinjaVan implements IGiaoHang{

    @Override
    public float tinhPhiVanChuyen(int soLuong, float gtdh) {
        //System.out.println("\nNinjaVan\n");
        float p = 0;
        if(soLuong > 10)
            p = (float) 0.95;
        else if(soLuong >5)
            p = (float) 0.45;
        else p = (float) 0.25;
        return p;
    }

    @Override
    public String tinhThoiGianGiaoHang() {
        return "NinjaVan - Nhan hang sau 5 ngay";
    }
    
}
