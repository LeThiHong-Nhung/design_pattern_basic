/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap_strategy3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/**
 *
 * @author HONGNHUNG
 */
public class QuanLySinhVien {
    //SinhVien[] dsSV;
    ISoSanh<SinhVien> soSanh;
    List<SinhVien> listSV = new ArrayList<>();

    public ISoSanh<SinhVien> getSoSanh() {
        return soSanh;
    }

    public void setSoSanh(ISoSanh<SinhVien> soSanh) {
        this.soSanh = soSanh;
    }
    
    
    
    public QuanLySinhVien()
    {
        listSV.add(new SinhVien("Nh",new Date(2001-1900,4,4), (float) 8.1));//8.1F
        listSV.add(new SinhVien("Ah2",new Date(2001-1900,5,4), (float) 8.2));//8.1F
        listSV.add(new SinhVien("Ch3",new Date(2001-1900,6,4), (float) 8.3));//8.1F
        listSV.add(new SinhVien("Bh4",new Date(2001,7,4), (float) 8.4));//8.1F
        listSV.add(new SinhVien("Dh5",new Date(2001,8,4), (float) 8.5));//8.1F
    }
    
    public void sapXep()
    {
        for(int i=0;i<listSV.size()-1;i++)
        {
            for(int j=i+1;j<listSV.size();j++)
            {
                if((-1)*soSanh.soSanh(listSV.get(i),listSV.get(j))>0)//sap xep nguoc
                {
                    SinhVien sv = listSV.get(i);
                    listSV.set(i, listSV.get(j));
                    listSV.set(j,sv);
                    //Collections.swap(listSV, i,j);
                }
            }
        }
    }
    
    public void sapXep2()
    {
        listSV.sort(new Comparator<SinhVien>(){
        @Override
        public int compare(SinhVien o1, SinhVien o2)
        {
            return 0;
        }
    });
    }
    
    public void sapXep3()
    {
        listSV.sort(new SoSanhTheoDiem2());
    }
    
    
    public void inDS()
    {
        listSV.forEach((t) -> {
            System.out.println(t.hoTen +"\t"+ t.ngaySinh +"\t" +t.diem);
        });
    }
    
}
