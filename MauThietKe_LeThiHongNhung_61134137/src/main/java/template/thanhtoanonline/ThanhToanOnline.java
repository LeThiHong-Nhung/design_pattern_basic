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
public class ThanhToanOnline implements IThanhToan{

    @Override
    public float tinhChietKhau(int tienHang) {
        float ck = tienHang * (float)0.03;
        if(tienHang > 1000)
            ck = tienHang * (float)0.05;
        return ck;
    }
    
}
