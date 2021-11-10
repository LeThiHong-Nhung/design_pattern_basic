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
public class GiaoHangNhanh implements IVanChuyen{
    @Override
    public String tinhThoiGianVanChuyen() {
        return "4 ngay";
    }

    @Override
    public float tinhTienVanChuyen(float tienHang) {
        return tienHang * (float)0.001;
    }
}
