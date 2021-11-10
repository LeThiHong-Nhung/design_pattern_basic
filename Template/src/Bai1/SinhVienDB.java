/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

/**
 *
 * @author toila
 * @param <SinhVien>
 */
public class SinhVienDB extends EntityDB<SinhVien>{

    @Override
    public int getKey(SinhVien t) {
        return t.maSV;
    }
    
}
