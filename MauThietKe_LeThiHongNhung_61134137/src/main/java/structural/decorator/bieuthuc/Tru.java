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
public class Tru extends BieuThucDecorator{
    public Tru(BieuThuc bieuThuc, float toanHang) {
        super(bieuThuc, toanHang);
    }

    @Override
    float giaTri()
    {
        return bieuThuc.giaTri()- toanHang;
    }

    @Override
    String bieuThuc() {
        return super.bieuThuc()+"-"+Float.toString(toanHang);
    }
}
