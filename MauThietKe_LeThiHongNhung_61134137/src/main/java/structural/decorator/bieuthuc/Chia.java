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
public class Chia extends BieuThucDecorator{
    public Chia(BieuThuc bieuThuc, float toanHang) {
        super(bieuThuc, toanHang);
    }
    @Override
    float giaTri()
    {
        if(toanHang!=0)
            return bieuThuc.giaTri()/toanHang;
        return -1;
    }

    @Override
    String bieuThuc() {
        return super.bieuThuc()+"/" + Float.toString(toanHang); //To change body of generated methods, choose Tools | Templates.
    }
}
