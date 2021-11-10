/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.decorator.bieuthuc;

/**
 *
 * @author HONGNHUNG
 */
public class BieuThucDonGian extends BieuThuc{
    float toanHang;

    public BieuThucDonGian(float toanHang) {
        this.toanHang = toanHang;
    }
    

    @Override
    float giaTri() {
        return toanHang;
    }

    @Override
    String bieuThuc() {
        return Float.toString(toanHang);
    }
    
}
