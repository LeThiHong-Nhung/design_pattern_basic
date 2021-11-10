/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap_strategy2;

/**
 *
 * @author HONGNHUNG
 */
public abstract class ThanhToanOnline implements IThanhToan{
    @Override
    public double thanhToan(int tienHang)
    {
        if(tienHang<1000000)
        {
            tienHang = tienHang*(95/100);
        }
        else 
        {
            tienHang = tienHang*(93/100);
        }
        return tienHang;
    }
}
