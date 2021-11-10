/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onthi.bai7stream;

import java.util.List;

/**
 *
 * @author HONGNHUNG
 */
public class Consumer implements IObserver{
    Stream stream;

    public Consumer(Stream stream) {
        this.stream = stream;
    }

    public void dangKy(){
        stream.dangKy(this);
    }
    public void huyDangKy(){
        stream.huyDangKy(this);
    }

    @Override
    public void update(List<String> data) {
        System.out.println("Chuoi vua nhap");
        for (String i : data){
            System.out.println(i);
        }
        System.out.println();
    }
}
