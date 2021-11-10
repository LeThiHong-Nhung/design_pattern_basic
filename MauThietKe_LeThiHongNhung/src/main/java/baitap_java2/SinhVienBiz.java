/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap_java2;

/**
 *
 * @author HONGNHUNG
 */
public class SinhVienBiz extends SinhVienPoLy{
    double diemMark;
    double diemSales;

    @Override
    public double getDiem() {
        return (2*diemMark + diemSales)/3;//To change body of generated methods, choose Tools | Templates.
    }

    public SinhVienBiz(double diemMark, double diemSales, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemMark = diemMark;
        this.diemSales = diemSales;
    }
    
    
    
}
