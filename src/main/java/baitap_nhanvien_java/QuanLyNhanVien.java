/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap_nhanvien_java;

/**
 *
 * @author HONGNHUNG
 */
public class QuanLyNhanVien implements IQuanLy{

    NhanVien nhanVien[] = null;
    int sl =0;

    public QuanLyNhanVien()
    {
        nhanVien = new NhanVien[1];
    }

    @Override
    public void them(NhanVien nv)
    {
        
            NhanVien tam[] = new NhanVien[++sl];
            for (int i = 0; i < nhanVien.length; i++) {
                tam[i] = nhanVien[i];
            }
            tam[sl - 1] = nv;
            nhanVien = tam;
    }

    @Override
    public void inDS()
    {
        for (int i = 0; i < nhanVien.length; i++) {
            System.out.println(nhanVien[i].getThongTin());
        }
    }

}
