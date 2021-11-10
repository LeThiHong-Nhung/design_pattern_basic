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
public class GiaTriTuyetDoi extends BieuThucDecorator{
    public GiaTriTuyetDoi(BieuThuc bieuThuc, float toanHang) {
        super(bieuThuc, toanHang);
    }
    @Override
    float giaTri()
    {
        if(bieuThuc.giaTri()<0)
            return -bieuThuc.giaTri();
        return bieuThuc.giaTri();
    }

    @Override
    String bieuThuc() {
        return "|"+super.bieuThuc()+"|"; //To change body of generated methods, choose Tools | Templates.
    }
}
