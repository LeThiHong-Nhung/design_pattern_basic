/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.util.Date;

/**
 *
 * @author toila
 */
public class SinhVien {
    int maSV;
    String tenSV;
    String queQuan;

    public SinhVien(int maSV, String tenSV, String queQuan) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.queQuan = queQuan;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }


    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    @Override
    public String toString() {
        return "maSV=" + maSV + ", tenSV=" + tenSV + ", queQuan=" + queQuan;
    }
    
}
