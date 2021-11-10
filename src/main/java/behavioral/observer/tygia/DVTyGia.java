/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.observer.tygia;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HONGNHUNG
 */
public class DVTyGia {
    List<CapNhatTyGia> listeners = new ArrayList<>(); //observers
    float tyGia;

    public DVTyGia(float tyGia) {
        this.tyGia = tyGia;
    }
    
    
    public void dangKy(CapNhatTyGia o)
    {
        if(!listeners.contains(o))
            listeners.add(o);
    }
    public void huyDangKy(CapNhatTyGia o)
    {
        if(listeners.contains(o))
            listeners.remove(o);
    }
    public void thongBaoCapNhat(float tyGiaMoi)
    {
        this.tyGia = tyGiaMoi;
        for(CapNhatTyGia o : listeners)
            o.capNhatTyGia(tyGia);
    }
    public interface CapNhatTyGia{
        void capNhatTyGia(float tyGiaMoi);
    }
}
