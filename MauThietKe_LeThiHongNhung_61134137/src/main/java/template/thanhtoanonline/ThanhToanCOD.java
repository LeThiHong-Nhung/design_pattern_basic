/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template.thanhtoanonline;

/**
 *
 * @author HONGNHUNG
 */
public class ThanhToanCOD implements IThanhToan{

    @Override
    public float tinhChietKhau(int tienHang) {
        float ck =0;
        if(tienHang>1000)
            ck = tienHang * (float) 0.05;
        return ck;
    }
    
}
