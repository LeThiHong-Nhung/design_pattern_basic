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
public class KhuyenMai2 implements IKhuyenMai{
    @Override
    public float tinhTienKhuyenMai(float tienHang) {
        float tienKM = 150000;
        if(tienHang * (float)0.009 < 150000)
            tienKM = tienHang*(float)0.009;
        return tienKM;
    }
}
