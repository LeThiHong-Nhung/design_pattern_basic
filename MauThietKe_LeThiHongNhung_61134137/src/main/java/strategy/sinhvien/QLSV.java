/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.sinhvien;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author HONGNHUNG
 */
public class QLSV {
    List<SinhVien> dsSV = new ArrayList<>();
    ISoSanh<SinhVien> soSanh;

    public void setDsSV(List<SinhVien> dsSV) {
        this.dsSV = dsSV;
    }

    public QLSV(ISoSanh<SinhVien> soSanh) {
        this.soSanh = soSanh;
    }
    
    public void sapXep()
    {
        for(int i =0; i<dsSV.size()-1; i++)
        {
            for(int j=i+1; j<dsSV.size(); j++)
            {
                if(soSanh.soSanh(dsSV.get(i), dsSV.get(j))>0)//sap xep nguoc *-1
                {
                    SinhVien s1 = dsSV.get(i);
                    dsSV.set(i, dsSV.get(j));
                    dsSV.set(j, s1);
                    //Collection.swap(dsSV, i, j);
                }
            }
        }
    }
    public void sapXep2()
    {
        dsSV.sort(new Comparator<SinhVien>(){
            @Override
            public int compare (SinhVien s1, SinhVien s2)
            {
                return 0;
            }
        });
    }
    public void sapXep3()
    {
        dsSV.sort(new SoSanhTheoDiem2());
    }
    public void inDS()
    {
        dsSV.forEach((t) -> {
            System.out.println("  " + t.toString());
        });
    }
}
