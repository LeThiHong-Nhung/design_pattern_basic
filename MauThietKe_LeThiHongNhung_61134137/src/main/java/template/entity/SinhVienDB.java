/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template.entity;

/**
 *
 * @author HONGNHUNG
 */
public class SinhVienDB extends EntityDB <SinhVien>{

    @Override
    protected int getKey(SinhVien t) {
        return t.getId();
    }
    
}
