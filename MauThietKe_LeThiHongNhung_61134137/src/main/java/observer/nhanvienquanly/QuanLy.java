/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer.nhanvienquanly;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HONGNHUNG
 */
public class QuanLy {
    List<INhanCongViec> listeners = new ArrayList();
    String CongViec;

   
    public void dangky(INhanCongViec o){
        if(!listeners.contains(o))
            listeners.add(o);
    }
    
    public void huydangky(INhanCongViec o){
        if(listeners.contains(o))
           listeners.remove(o);            
    }
    public void GiaoViec(String CongViec){
    for(INhanCongViec ncv : listeners){
        ncv.NhanCongViec(CongViec);
    }
}
}
