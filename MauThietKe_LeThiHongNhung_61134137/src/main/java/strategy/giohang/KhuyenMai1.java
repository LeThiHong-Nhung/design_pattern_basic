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
public class KhuyenMai1 implements IKhuyenMai{

    @Override
    public float tinhTienKhuyenMai(float gtdh) {
        float km =0;
        km = (float) 0.05 * gtdh;
        if(km > 100)
            km = 100;
        return km;
    }
    
}
