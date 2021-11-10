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
public class BieuThucDecorator extends BieuThuc{
    BieuThuc bieuThuc;
    float toanHang;

    public BieuThucDecorator(BieuThuc bieuThuc, float toanHang) {
        this.bieuThuc = bieuThuc;
        this.toanHang = toanHang;
    }

    @Override
    float giaTri() {
       return bieuThuc.giaTri();
    }

    @Override
    String bieuThuc() {
        return bieuThuc.bieuThuc();
    }
}
