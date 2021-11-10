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
public class MonHoc extends AbstractMonHoc{
    int soTinChi;
    float hocPhi;

    public MonHoc(int soTinChi, float hocPhi, String ten) {
        super(ten);
        this.soTinChi = soTinChi;
        this.hocPhi = hocPhi;
    }
    

    @Override
    public void them(AbstractMonHoc monHoc) {
        return;
    }

    @Override
    public void xoa(AbstractMonHoc monHoc) {
        return;
    }

    @Override
    public int tinhSoTinChi() {
        return soTinChi;
    }

    @Override
    public float tinhHocPhi() {
        return hocPhi * soTinChi;
    }

    @Override
    public String lietKeMonHoc() {
        return pre + ten;
    }
    
}
