/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onthi.bai8tokenize;

/**
 *
 * @author HONGNHUNG
 */
public class Chuoi implements IString{
    String chuoi;

    public Chuoi(String chuoi) {
        this.chuoi = chuoi;
    }

    

    @Override
    public String[] tachChuoi() {
        return chuoi.split(" ");
    }
    public void inTu(){
        for (String i : tachChuoi()){
            System.out.println(i);
        }
    }
}
