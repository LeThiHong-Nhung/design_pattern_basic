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
public class KhuyenMai2 implements IKhuyenMai{

    @Override
    public float tinhTienKhuyenMai(float gtdh) {
        float km =0;
        km = (float) 0.1 * gtdh;
        if(km > 200)
            km = 200;
        return km;
    }
    
}
