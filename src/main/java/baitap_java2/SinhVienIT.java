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
public class SinhVienIT extends SinhVienPoLy{
    double diemJava;
    double diemHTML;
    double diemCSS;

    @Override
    public double getDiem() {
        return (2*diemJava + diemCSS + diemHTML); //To change body of generated methods, choose Tools | Templates.
    }

    public SinhVienIT(double diemJava, double diemHTML, double diemCSS, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemHTML = diemHTML;
        this.diemCSS = diemCSS;
    }
    
    
    
}
