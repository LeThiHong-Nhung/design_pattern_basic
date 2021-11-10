/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2BS;

/**
 *
 * @author toila
 */
public class Kh_KimCuong extends HoaDon{

    @Override
    public int tinhChietKhau() {
        int t = tinhTien();
        if(t > 1500000)
            return (int) (0.06 * t);
        else if(t > 1000000)
            return (int) (0.05 * t);
        else if(t > 500000)
            return (int) (0.03 * t);
        return 0;
    }
    
}
