/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onthi.bai6khoahoc;

/**
 *
 * @author HONGNHUNG
 */
public abstract class AbstractMonHoc {
    String ten;
    String pre ="";

    public AbstractMonHoc(String ten) {
        this.ten = ten;
    }
    
    public abstract void them(AbstractMonHoc monHoc);
    public abstract void xoa(AbstractMonHoc monHoc);
    public abstract int tinhSoTinChi();
    public abstract float tinhHocPhi();
    public abstract String lietKeMonHoc();
}
