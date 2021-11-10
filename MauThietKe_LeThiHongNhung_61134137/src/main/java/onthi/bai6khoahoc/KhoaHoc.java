/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onthi.bai6khoahoc;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HONGNHUNG
 */
public class KhoaHoc extends AbstractMonHoc{
    List<AbstractMonHoc> dsMonHoc = new ArrayList<>();

    public KhoaHoc(String ten) {
        super(ten);
    }
    

    @Override
    public void them(AbstractMonHoc monHoc) {
        if(!dsMonHoc.contains(monHoc))
            dsMonHoc.add(monHoc);
    }

    @Override
    public void xoa(AbstractMonHoc monHoc) {
        dsMonHoc.remove(monHoc);
    }

    @Override
    public int tinhSoTinChi() {
        int tong = 0;
        for (AbstractMonHoc o : dsMonHoc) {
            tong = tong + o.tinhSoTinChi();
        }
        return tong;
    }

    @Override
    public float tinhHocPhi() {
        float tong = 0;
        for (AbstractMonHoc o : dsMonHoc) {
            tong  = tong + o.tinhHocPhi();
        }
        return tong;
    }

    @Override
    public String lietKeMonHoc() {
        StringBuilder str = new StringBuilder();
        str.append(pre)
                .append(ten);
        for (AbstractMonHoc o : dsMonHoc) {
            o.pre = this.pre + "\t";
            str.append("\n")
                    .append(o.lietKeMonHoc());
            o.pre = "";
        }
        return str.toString();
    }
    
}
