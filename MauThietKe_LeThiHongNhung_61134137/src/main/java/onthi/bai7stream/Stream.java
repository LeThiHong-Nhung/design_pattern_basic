/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onthi.bai7stream;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HONGNHUNG
 */
public class Stream {
    List<String> chuois = new ArrayList<>();
    List<IObserver> observers = new ArrayList<>();

    // thay đổi thành phần
    public void add(String chuoi){
        chuois.add(chuoi);
        thongBao();
    }
    public void update(String chuoiCu, String chuoiMoi){
        if(chuois.contains(chuoiCu)){
            int index = chuois.indexOf(chuoiCu);
            chuois.set(index, chuoiMoi);
            thongBao();
        }
    }

    public void dangKy(IObserver observer){
        if(!observers.contains(observer)){
            observers.add(observer);
        }
    }
    public void huyDangKy(IObserver observer){
        observers.remove(observer);
    }
    public void thongBao(){
        for(IObserver i : observers){
            i.update(chuois);
        }
    }
}
