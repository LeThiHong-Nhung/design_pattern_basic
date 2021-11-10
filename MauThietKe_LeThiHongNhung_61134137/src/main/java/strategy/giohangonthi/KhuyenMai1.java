/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.giohangonthi;

/**
 *
 * @author HONGNHUNG
 */
public class KhuyenMai1 implements IKhuyenMai{

    @Override
    public float tinhTienKhuyenMai(float tienHang) {
        float  tienKM = 200000;
        if(tienHang * (float)0.01 < 200000)
            tienKM = tienHang * (float)0.01;
        return tienKM;
    }
    
}
