/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1BS;

/**
 *
 * @author toila
 */
public class GioHangOnline extends GioHang{

    @Override
    public int tinhChietKhau() {
        if(tinhTien() >= 1000000)
            return (int) (0.05 * tinhTien());
        return (int) (0.03 * tinhTien());
    }
    
}
