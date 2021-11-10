/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onthi.bai8tokenize;

import java.util.Arrays;

/**
 *
 * @author HONGNHUNG
 */
public class StopWord extends Decorator{
    String kiTuDung;

    public StopWord(IString str, String kiTuDung) {
        super(str);
        this.kiTuDung = kiTuDung;
    }

    @Override
    public String[] tachChuoi() {
        String[] kq = new String[str.tachChuoi().length];
        String[] nguon = str.tachChuoi();
        int j = 0;
        for(int i = 0; i < nguon.length; i++){
            if(nguon[i] == null){
                return Arrays.copyOf(nguon, i);//rut ngan chuoi thành chuoi co do dai i
            }
            else if(nguon[i].equalsIgnoreCase(kiTuDung)){
                continue;//neu la ki tu dung thi bo qua
            }else{
                kq[j] = nguon[i];
                j++;
            }
        }
        return kq;
    }
}
