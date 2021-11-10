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
public abstract class ThanhToanCOD implements IThanhToan{
    @Override
    public double thanhToan(int tienHang)
    {
        if(tienHang>2000000)
        {
            tienHang = tienHang*(98/100);
        }
        return tienHang;
    }
}
