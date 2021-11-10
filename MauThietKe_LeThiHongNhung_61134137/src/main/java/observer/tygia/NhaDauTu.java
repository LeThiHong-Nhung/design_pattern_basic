/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer.tygia;

/**
 *
 * @author HONGNHUNG
 */
public abstract class NhaDauTu implements DVTyGia.CapNhatTyGia{
    float tyGia;
    DVTyGia dvTyGia;
    

    public void setDvTyGia(DVTyGia dvTyGia) {//co the khong can phuong thuc nay!Nhung trong console thi can thiet
        this.dvTyGia = dvTyGia;
    }
    
    public void dangKy()//co the khong can phuong thuc nay! Nhung trong console thi can thiet!
    {
        dvTyGia.dangKy(this);
        this.tyGia = dvTyGia.tyGia;
    }
    public void huyDangKy()
    {
        dvTyGia.huyDangKy(this);
    }
    public abstract void capNhatTyGia(float tyGiaMoi);
}
