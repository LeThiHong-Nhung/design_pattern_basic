/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap_strategy3;

/**
 *
 * @author HONGNHUNG
 */
public class SoSanhTheoDiem implements ISoSanh<SinhVien>{
    @Override
    public int soSanh(SinhVien o1, SinhVien o2)
    {
        if(o1.diem>o2.diem)
        {
            return 1;
        }
        else if(o1.diem<o2.diem)
        {
            return -1;
        }
        else return 0;
    }
    
}
