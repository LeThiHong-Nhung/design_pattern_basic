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
public class Kh_ThanThiet extends HoaDon{

    @Override
    public int tinhChietKhau() {
        if(tinhTien() > 500000)
            return (int) (0.02 * tinhTien());
        return 0;
    }
}
