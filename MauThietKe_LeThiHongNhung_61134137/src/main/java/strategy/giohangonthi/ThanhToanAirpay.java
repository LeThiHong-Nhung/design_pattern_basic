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
public class ThanhToanAirpay implements IThanhToan{

    @Override
    public float thanhToan(float tienHang) {
        float tongGiam=0;
        if(tienHang>1000000)
            tongGiam = tienHang* (float)0.01;
        return tongGiam;
    }
    
}
