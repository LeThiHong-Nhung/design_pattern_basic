/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.giohangcod;

/**
 *
 * @author HONGNHUNG
 */
public class ThanhToanOnline implements IThanhToan{

    @Override
    public double thanhToan(int tienHang) {
        if(tienHang < 1000)
            return tienHang*(float)0.95;
        else return tienHang*(float)0.93;
    }
    
}
