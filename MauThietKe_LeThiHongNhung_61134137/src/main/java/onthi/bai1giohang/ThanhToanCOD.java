/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onthi.bai1giohang;

/**
 *
 * @author HONGNHUNG
 */
public class ThanhToanCOD implements IThanhToan{
    @Override
    public float thanhToan(float tienHang) {
        float tongGiam =0;
        if(tienHang>2000000)
            tongGiam = tienHang * (float)0.02;
        return tongGiam;
    }
}
